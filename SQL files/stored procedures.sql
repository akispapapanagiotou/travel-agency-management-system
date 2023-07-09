/* 
This SQL file contains the stored procedures for the 'travel_agency' 
database management system.
*/ 

DROP PROCEDURE IF EXISTS insert_driver;
DROP PROCEDURE IF EXISTS get_trip_info;
DROP PROCEDURE IF EXISTS delete_admin;
DROP PROCEDURE IF EXISTS get_customers_who_paid;
DROP PROCEDURE IF EXISTS get_customers_names;



/* Procedure that inserts a new driver in our database and places him in the branch 
with the fewest drivers. */ 
DELIMITER $
CREATE PROCEDURE insert_driver(
	IN AT CHAR(10), 
	IN name VARCHAR(20), 
	IN lname VARCHAR(20), 
	IN salary FLOAT, 
	IN license ENUM('A', 'B', 'C', 'D'), 
	IN route ENUM('LOCAL', 'ABROAD'), 
	IN experience TINYINT
)
BEGIN
	DECLARE branch_min_drivers INT;

	SELECT br_code INTO branch_min_drivers FROM branch
	LEFT JOIN worker ON branch.br_code = worker.wrk_br_code
	LEFT JOIN driver ON worker.wrk_AT=driver.drv_AT 
	GROUP BY br_code
	ORDER BY COUNT(drv_AT) ASC LIMIT 1;
    
    INSERT INTO worker VALUES
    (AT, name, lname, salary, branch_min_drivers);
    
    INSERT INTO driver VALUES
    (AT, license, route, experience);
END$
DELIMITER ;



/* Procedure that gets information about trips which are organized by a specific branch, 
and whose departure is within the given time period. */
DELIMITER $
CREATE PROCEDURE get_trip_info(IN branch_code INT, IN date_start DATE, IN date_end DATE)
BEGIN
	DECLARE trip_id INT;
    
    DECLARE trip_cost FLOAT;
    DECLARE trip_maxseats TINYINT;
    DECLARE num_of_reservations TINYINT;
    DECLARE num_of_empty_seats TINYINT;
    DECLARE lname_driver VARCHAR(20);
	DECLARE name_driver VARCHAR(20);
	DECLARE lname_guide VARCHAR(20);
	DECLARE name_guide VARCHAR(20);
	DECLARE trip_departure DATETIME;
	DECLARE trip_return DATETIME;
    
    DECLARE not_found INT;
    DECLARE trip_cursor CURSOR FOR
		SELECT tr_id FROM trip
		INNER JOIN branch ON trip.tr_br_code=branch.br_code
		WHERE br_code=branch_code AND tr_departure BETWEEN date_start AND date_end;
	DECLARE CONTINUE HANDLER FOR NOT FOUND SET not_found=1;
     
	SET not_found=0;
	OPEN trip_cursor;
    
	REPEAT
		FETCH trip_cursor INTO trip_id;
		IF(not_found=0)
		THEN
			SELECT tr_cost, tr_maxseats INTO trip_cost, trip_maxseats FROM trip WHERE tr_id=trip_id; 
            
			SELECT COUNT(*) INTO num_of_reservations FROM trip
			INNER JOIN reservation ON trip.tr_id=reservation.res_tr_id
			WHERE trip_id=tr_id;
            
			SET num_of_empty_seats = trip_maxseats - num_of_reservations;
            
			SELECT wrk_name, wrk_lname INTO name_driver, lname_driver FROM worker
            INNER JOIN driver ON worker.wrk_AT=driver.drv_AT
            INNER JOIN trip ON driver.drv_AT=trip.tr_drv_AT
            WHERE trip_id=tr_id;
            
            SELECT wrk_name, wrk_lname INTO name_guide, lname_guide FROM worker
			INNER JOIN guide ON worker.wrk_AT=guide.gui_AT
            INNER JOIN trip ON guide.gui_AT=trip.tr_gui_AT
            WHERE trip_id=tr_id;
            
            SELECT tr_departure, tr_return INTO trip_departure, trip_return FROM trip
            WHERE trip_id=tr_id;
            
            SELECT trip_cost, trip_maxseats, num_of_reservations, 
            num_of_empty_seats, lname_driver, name_driver, 
            lname_guide, name_guide, trip_departure, trip_return;
		END IF;
	UNTIL(not_found=1)
	END REPEAT;
	
	CLOSE trip_cursor;
END$
DELIMITER ;



/* Procedure that deletes an administrator from our database but only in case he is 
not an administrative. */
DELIMITER $
CREATE PROCEDURE delete_admin(IN name VARCHAR(20), IN lastname VARCHAR(20))
BEGIN
	DECLARE worker_AT CHAR(10);

	SELECT COUNT(*) INTO worker_AT FROM manages 
    INNER JOIN admin ON manages.mng_adm_AT=admin.adm_AT
    INNER JOIN worker ON admin.adm_AT=worker.wrk_AT
	WHERE wrk_name=name AND wrk_lname=lastname AND admin.adm_type='ADMINISTRATIVE';

	IF worker_AT=0 THEN
		DELETE worker, admin FROM worker
        INNER JOIN admin ON worker.wrk_AT=admin.adm_AT
		WHERE wrk_name=name AND wrk_lname=lastname;
	ELSE
		SELECT 'This worker cannot be deleted because he is an 
        administrative and manages a branch.' AS Message;
	END IF;
END$
DELIMITER ;



-- CREATE INDEX index_payments ON reservation_offers (res_payment);

/* Procedure that returns all the customers who made reservations and paid in 
advance an amount between a specific price range. */
DELIMITER $
CREATE PROCEDURE get_customers_who_paid(IN min_amount FLOAT, IN max_amount FLOAT)
BEGIN
	SELECT res_of_lname AS Lastname, res_of_name AS Name FROM reservation_offers 
    WHERE res_payment BETWEEN min_amount AND max_amount;
END$
DELIMITER ;



-- CREATE INDEX index_lastnames ON reservation_offers (res_of_lname);

/* Procedure that returns the first and last name of customers with the travel offer 
that they subscribed to. */
DELIMITER $
CREATE PROCEDURE get_customers_names(IN lastname VARCHAR(20))
BEGIN
	DECLARE number_of_customers TINYINT;
    
    SELECT COUNT(*) INTO number_of_customers 
    FROM reservation_offers WHERE res_of_lname=lastname;
    
    IF number_of_customers>1 THEN
		SELECT res_of_lname AS 'Last Name', res_of_trip_id AS 'Trip Offer', COUNT(*) AS 'Number of Customers'
		FROM reservation_offers WHERE res_of_lname=lastname
		GROUP BY res_of_trip_id;
    ELSE
		SELECT res_of_lname AS 'Last Name', res_of_name AS Name, res_of_trip_id AS 'Trip Offer'
        FROM reservation_offers WHERE res_of_lname=lastname;
	END IF;
END$
DELIMITER ;
