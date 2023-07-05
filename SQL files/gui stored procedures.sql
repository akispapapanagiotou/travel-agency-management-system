/* 
This SQL file contains some additional stored procedures for the 'travel_agency' 
database management system.
*/

DROP PROCEDURE IF EXISTS get_IT_manager;
DROP PROCEDURE IF EXISTS set_IT_manager_active;
DROP PROCEDURE IF EXISTS get_active_IT_manager;
DROP PROCEDURE IF EXISTS set_IT_managers_inactive;
DROP PROCEDURE IF EXISTS get_branch_expenses;
DROP PROCEDURE IF EXISTS get_trip_reservations;
DROP PROCEDURE IF EXISTS get_total_income;
DROP PROCEDURE IF EXISTS get_No_of_branches;
DROP PROCEDURE IF EXISTS get_No_of_workers;
DROP PROCEDURE IF EXISTS get_No_of_drivers;
DROP PROCEDURE IF EXISTS get_No_of_guides;
DROP PROCEDURE IF EXISTS get_No_of_IT_managers;
DROP PROCEDURE IF EXISTS get_No_of_admins;
DROP PROCEDURE IF EXISTS get_branch_entries;
DROP PROCEDURE IF EXISTS add_branch_entry;
DROP PROCEDURE IF EXISTS update_branch_entry;
DROP PROCEDURE IF EXISTS delete_branch_entry; 
DROP PROCEDURE IF EXISTS get_phone_entries;
DROP PROCEDURE IF EXISTS add_phone_entry;
DROP PROCEDURE IF EXISTS update_phone_entry;
DROP PROCEDURE IF EXISTS delete_phone_entry;
DROP PROCEDURE IF EXISTS get_worker_entries;
DROP PROCEDURE IF EXISTS add_worker_entry;
DROP PROCEDURE IF EXISTS update_worker_entry;
DROP PROCEDURE IF EXISTS delete_worker_entry;



/* Procedure that returns all the IT manager's data based on the given username 
and password. */
DELIMITER $
CREATE PROCEDURE get_IT_manager(IN username VARCHAR(20), IN password CHAR(10))
BEGIN
	SELECT * FROM worker 
	INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT 
	WHERE wrk_lname=username AND it_password=password;
END$
DELIMITER ;



/* Procedure that sets an IT manager as active based on the given username. */ 
DELIMITER $
CREATE PROCEDURE set_IT_manager_active(IN username VARCHAR(20))
BEGIN
	UPDATE it_manager 
    INNER JOIN worker ON worker.wrk_AT=it_manager.it_AT
    SET it_is_active=TRUE WHERE wrk_lname=username;
END$
DELIMITER ;



/* Procedure that retrieves the active IT manager. */
DELIMITER $
CREATE PROCEDURE get_active_IT_manager()
BEGIN
	SELECT worker.wrk_lname AS "Username" FROM it_manager
    INNER JOIN worker ON worker.wrk_AT=it_manager.it_AT
    WHERE it_manager.it_is_active = TRUE;
END$
DELIMITER ;



/* Procedure that sets all IT managers as inactive. */
DELIMITER $
CREATE PROCEDURE set_IT_managers_inactive()
BEGIN
	UPDATE it_manager 
    INNER JOIN worker ON worker.wrk_AT=it_manager.it_AT
    SET it_is_active=FALSE;
END$
DELIMITER ;



/* Procedure that gets the expenses for every branch. */
DELIMITER $
CREATE PROCEDURE get_branch_expenses()
BEGIN
	SELECT br_code AS "Branch ID", ROUND(SUM(wrk_salary), 2) AS "Expenses" FROM branch 
    LEFT JOIN worker ON branch.br_code = worker.wrk_br_code
    GROUP BY br_code;
END$
DELIMITER ;



/* Procedure that gets the number of reservations for every trip. */
DELIMITER $
CREATE PROCEDURE get_trip_reservations()
BEGIN
	SELECT tr_id AS "Trip ID", COUNT(res_tr_id) AS "Number of Reservations" FROM trip 
	LEFT JOIN reservation ON trip.tr_id = reservation.res_tr_id
	GROUP BY tr_id;
END$
DELIMITER ;  



/* Procedure that returns the total income from trips. */ 
DELIMITER $
CREATE PROCEDURE get_total_income()
BEGIN
	SELECT SUM(tr_cost) AS "Total Income" FROM trip 
    RIGHT JOIN reservation ON trip.tr_id=reservation.res_tr_id;
END$
DELIMITER ;



/* Procedure that returns the number of branches. */ 
DELIMITER $
CREATE PROCEDURE get_No_of_branches()
BEGIN
	SELECT COUNT(*) AS "No of branches" FROM branch;
END$
DELIMITER ;



/* Procedure that returns the number of workers. */ 
DELIMITER $
CREATE PROCEDURE get_No_of_workers()
BEGIN
	SELECT COUNT(*) AS "No of workers" FROM worker;
END$
DELIMITER ;



/* Procedure that returns the number of drivers. */ 
DELIMITER $
CREATE PROCEDURE get_No_of_drivers()
BEGIN
	SELECT COUNT(*) AS "No of drivers" FROM driver;
END$
DELIMITER ;



/* Procedure that returns the number of guides. */ 
DELIMITER $
CREATE PROCEDURE get_No_of_guides()
BEGIN
	SELECT COUNT(*) AS "No of guides" FROM guide;
END$
DELIMITER ;



/* Procedure that returns the number of IT Managers. */ 
DELIMITER $
CREATE PROCEDURE get_No_of_IT_managers()
BEGIN
	SELECT COUNT(*) AS "No of IT Managers" FROM it_manager;
END$
DELIMITER ;



/* Procedure that returns the number of admins. */ 
DELIMITER $
CREATE PROCEDURE get_No_of_admins()
BEGIN
	SELECT COUNT(*) AS "No of admins" FROM admin;
END$
DELIMITER ;



/* Procedure that returns all the branch entries. */ 
DELIMITER $
CREATE PROCEDURE get_branch_entries()
BEGIN
	SELECT * FROM branch;
END$
DELIMITER ;



/* Procedure that adds an entry to the branch table. */ 
DELIMITER $
CREATE PROCEDURE add_branch_entry(IN br_code INT, IN br_street VARCHAR(30), IN br_num INT, IN br_city VARCHAR(30))
BEGIN
	INSERT INTO branch VALUES
	(br_code, br_street, br_num, br_city);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the branch table. */
DELIMITER $
CREATE PROCEDURE update_branch_entry(IN br_code INT, IN br_street VARCHAR(30), IN br_num INT, IN br_city VARCHAR(30))
BEGIN
	UPDATE branch
    SET branch.br_code=br_code, branch.br_street=br_street, branch.br_num=br_num, branch.br_city=br_city
    WHERE branch.br_code = br_code;
END$
DELIMITER ;



/* Procedure that deletes an entry from the branch table. */
DELIMITER $
CREATE PROCEDURE delete_branch_entry(IN br_code INT)
BEGIN
	DELETE FROM branch
    WHERE branch.br_code = br_code;
END$
DELIMITER ;



/* Procedure that returns all the phone entries. */ 
DELIMITER $
CREATE PROCEDURE get_phone_entries()
BEGIN
	SELECT * FROM phones;
END$
DELIMITER ;



/* Procedure that adds an entry to the phones table. */ 
DELIMITER $
CREATE PROCEDURE add_phone_entry(IN ph_br_code INT, IN ph_number CHAR(10))
BEGIN
	INSERT INTO phones VALUES
	(ph_br_code, ph_number);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the phones table. */
DELIMITER $
CREATE PROCEDURE update_phone_entry(IN ph_br_code INT, IN ph_number CHAR(10))
BEGIN
	UPDATE phones
    SET phones.ph_br_code=ph_br_code, phones.ph_number=ph_number
    WHERE phones.ph_number = ph_number;
END$
DELIMITER ;



/* Procedure that deletes an entry from the phones table. */
DELIMITER $
CREATE PROCEDURE delete_phone_entry(IN ph_br_code INT, IN ph_number CHAR(10))
BEGIN
	DELETE FROM phones
    WHERE phones.ph_br_code = ph_br_code AND phones.ph_number = ph_number;
END$
DELIMITER ;



/* Procedure that returns all the worker entries. */
DELIMITER $
CREATE PROCEDURE get_worker_entries()
BEGIN
	SELECT * FROM worker;
END$
DELIMITER ;



/* Procedure that adds an entry to the worker table. */ 
DELIMITER $
CREATE PROCEDURE add_worker_entry(IN wrk_AT CHAR(10), IN wrk_name VARCHAR(20), IN wrk_lname VARCHAR(20), IN wrk_salary FLOAT, IN wrk_br_code INT)
BEGIN
	INSERT INTO worker VALUES
	(wrk_AT, wrk_name, wrk_lname, wrk_salary, wrk_br_code);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the worker table. */
DELIMITER $
CREATE PROCEDURE update_worker_entry(IN wrk_AT CHAR(10), IN wrk_name VARCHAR(20), IN wrk_lname VARCHAR(20), IN wrk_salary FLOAT, IN wrk_br_code INT)
BEGIN
	UPDATE worker
    SET worker.wrk_AT=wrk_AT, worker.wrk_name=wrk_name, worker.wrk_lname=wrk_lname, worker.wrk_salary=wrk_salary, worker.wrk_br_code=wrk_br_code
    WHERE worker.wrk_AT = wrk_AT;
END$
DELIMITER ;



/* Procedure that deletes an entry from the worker table. */
DELIMITER $
CREATE PROCEDURE delete_worker_entry(IN wrk_AT CHAR(10))
BEGIN
	DELETE FROM worker
    WHERE worker.wrk_AT = wrk_AT;
END$
DELIMITER ;