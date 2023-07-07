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
DROP PROCEDURE IF EXISTS get_admin_entries;
DROP PROCEDURE IF EXISTS add_admin_entry;
DROP PROCEDURE IF EXISTS update_admin_entry;
DROP PROCEDURE IF EXISTS delete_admin_entry;
DROP PROCEDURE IF EXISTS get_manages_entries;
DROP PROCEDURE IF EXISTS add_manages_entry;
DROP PROCEDURE IF EXISTS update_manages_entry;
DROP PROCEDURE IF EXISTS delete_manages_entry;
DROP PROCEDURE IF EXISTS get_driver_entries;
DROP PROCEDURE IF EXISTS add_driver_entry;
DROP PROCEDURE IF EXISTS update_driver_entry;
DROP PROCEDURE IF EXISTS delete_driver_entry;
DROP PROCEDURE IF EXISTS get_guide_entries;
DROP PROCEDURE IF EXISTS add_guide_entry;
DROP PROCEDURE IF EXISTS update_guide_entry;
DROP PROCEDURE IF EXISTS delete_guide_entry;
DROP PROCEDURE IF EXISTS get_languages_entries;
DROP PROCEDURE IF EXISTS add_languages_entry;
DROP PROCEDURE IF EXISTS update_languages_entry;
DROP PROCEDURE IF EXISTS delete_languages_entry;
DROP PROCEDURE IF EXISTS get_trip_entries;
DROP PROCEDURE IF EXISTS add_trip_entry;
DROP PROCEDURE IF EXISTS update_trip_entry;
DROP PROCEDURE IF EXISTS delete_trip_entry;
DROP PROCEDURE IF EXISTS get_event_entries;
DROP PROCEDURE IF EXISTS add_event_entry;
DROP PROCEDURE IF EXISTS update_event_entry;
DROP PROCEDURE IF EXISTS delete_event_entry;
DROP PROCEDURE IF EXISTS get_reservation_entries;
DROP PROCEDURE IF EXISTS add_reservation_entry;
DROP PROCEDURE IF EXISTS update_reservation_entry;
DROP PROCEDURE IF EXISTS delete_reservation_entry;
DROP PROCEDURE IF EXISTS get_destination_entries;
DROP PROCEDURE IF EXISTS add_destination_entry;
DROP PROCEDURE IF EXISTS update_destination_entry;
DROP PROCEDURE IF EXISTS delete_destination_entry;
DROP PROCEDURE IF EXISTS get_travel_to_entries;
DROP PROCEDURE IF EXISTS add_travel_to_entry;
DROP PROCEDURE IF EXISTS update_travel_to_entry;
DROP PROCEDURE IF EXISTS delete_travel_to_entry;
DROP PROCEDURE IF EXISTS get_it_manager_entries;
DROP PROCEDURE IF EXISTS add_it_manager_entry;
DROP PROCEDURE IF EXISTS update_it_manager_entry;
DROP PROCEDURE IF EXISTS delete_it_manager_entry;
DROP PROCEDURE IF EXISTS get_offers_entries;
DROP PROCEDURE IF EXISTS add_offers_entry;
DROP PROCEDURE IF EXISTS update_offers_entry;
DROP PROCEDURE IF EXISTS delete_offers_entry;
DROP PROCEDURE IF EXISTS get_reservation_offers_entries;
DROP PROCEDURE IF EXISTS add_reservation_offers_entry;
DROP PROCEDURE IF EXISTS update_reservation_offers_entry;
DROP PROCEDURE IF EXISTS delete_reservation_offers_entry;



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



/* Procedure that returns all the admin entries. */
DELIMITER $
CREATE PROCEDURE get_admin_entries()
BEGIN
	SELECT * FROM admin;
END$
DELIMITER ;



/* Procedure that adds an entry to the admin table. */ 
DELIMITER $
CREATE PROCEDURE add_admin_entry(IN adm_AT CHAR(10), IN adm_type ENUM('LOGISTICS', 'ADMINISTRATIVE', 'ACCOUNTING'), IN adm_diploma VARCHAR(200))
BEGIN
	INSERT INTO admin VALUES
	(adm_AT, adm_type, adm_diploma);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the admin table. */
DELIMITER $
CREATE PROCEDURE update_admin_entry(IN adm_AT CHAR(10), IN adm_type ENUM('LOGISTICS', 'ADMINISTRATIVE', 'ACCOUNTING'), IN adm_diploma VARCHAR(200))
BEGIN
	UPDATE admin
    SET admin.adm_AT=adm_AT, admin.adm_type=adm_type, admin.adm_diploma=adm_diploma
    WHERE admin.adm_AT = adm_AT;
END$
DELIMITER ;



/* Procedure that deletes an entry from the admin table. */
DELIMITER $
CREATE PROCEDURE delete_admin_entry(IN adm_AT CHAR(10))
BEGIN
	DELETE FROM admin
    WHERE admin.adm_AT = adm_AT;
END$
DELIMITER ;



/* Procedure that returns all the manages entries. */
DELIMITER $
CREATE PROCEDURE get_manages_entries()
BEGIN
	SELECT * FROM manages;
END$
DELIMITER ;



/* Procedure that adds an entry to the manages table. */ 
DELIMITER $
CREATE PROCEDURE add_manages_entry(IN mng_adm_AT CHAR(10), IN mng_br_code INT)
BEGIN
	INSERT INTO manages VALUES
	(mng_adm_AT, mng_br_code);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the manages table. */
DELIMITER $
CREATE PROCEDURE update_manages_entry(IN mng_adm_AT CHAR(10), IN mng_br_code INT)
BEGIN
	UPDATE manages
    SET manages.mng_adm_AT=mng_adm_AT, manages.mng_br_code=mng_br_code
    WHERE manages.mng_adm_AT=mng_adm_AT;
END$
DELIMITER ;



/* Procedure that deletes an entry from the manages table. */
DELIMITER $
CREATE PROCEDURE delete_manages_entry(IN mng_adm_AT CHAR(10), IN mng_br_code INT)
BEGIN
	DELETE FROM manages
    WHERE manages.mng_adm_AT = mng_adm_AT AND manages.mng_br_code=mng_br_code;
END$
DELIMITER ;



/* Procedure that returns all the driver entries. */
DELIMITER $
CREATE PROCEDURE get_driver_entries()
BEGIN
	SELECT * FROM driver;
END$
DELIMITER ;



/* Procedure that adds an entry to the driver table. */ 
DELIMITER $
CREATE PROCEDURE add_driver_entry(IN drv_AT CHAR(10), IN drv_license ENUM('A', 'B', 'C', 'D'), IN drv_route ENUM('LOCAL', 'ABROAD'), IN drv_experience TINYINT)
BEGIN
	INSERT INTO driver VALUES
	(drv_AT, drv_license, drv_route, drv_experience);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the driver table. */
DELIMITER $
CREATE PROCEDURE update_driver_entry(IN drv_AT CHAR(10), IN drv_license ENUM('A', 'B', 'C', 'D'), IN drv_route ENUM('LOCAL', 'ABROAD'), IN drv_experience TINYINT)
BEGIN
	UPDATE driver
    SET driver.drv_AT=drv_AT, driver.drv_license=drv_license, driver.drv_route=drv_route, driver.drv_experience=drv_experience
    WHERE driver.drv_AT=drv_AT;
END$
DELIMITER ;



/* Procedure that deletes an entry from the driver table. */
DELIMITER $
CREATE PROCEDURE delete_driver_entry(IN drv_AT CHAR(10))
BEGIN
	DELETE FROM driver
    WHERE driver.drv_AT = drv_AT;
END$
DELIMITER ;



/* Procedure that returns all the guide entries. */
DELIMITER $
CREATE PROCEDURE get_guide_entries()
BEGIN
	SELECT * FROM guide;
END$
DELIMITER ;



/* Procedure that adds an entry to the guide table. */ 
DELIMITER $
CREATE PROCEDURE add_guide_entry(IN gui_AT CHAR(10), IN gui_CV TEXT)
BEGIN
	INSERT INTO guide VALUES
	(gui_AT, gui_CV);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the guide table. */
DELIMITER $
CREATE PROCEDURE update_guide_entry(IN gui_AT CHAR(10), IN gui_CV TEXT)
BEGIN
	UPDATE guide
    SET guide.gui_AT=gui_AT, guide.gui_CV=gui_CV
    WHERE guide.gui_AT=gui_AT;
END$
DELIMITER ;



/* Procedure that deletes an entry from the guide table. */
DELIMITER $
CREATE PROCEDURE delete_guide_entry(IN gui_AT CHAR(10))
BEGIN
	DELETE FROM guide
    WHERE guide.gui_AT = gui_AT;
END$
DELIMITER ;



/* Procedure that returns all the languages entries. */
DELIMITER $
CREATE PROCEDURE get_languages_entries()
BEGIN
	SELECT * FROM languages;
END$
DELIMITER ;



/* Procedure that adds an entry to the languages table. */ 
DELIMITER $
CREATE PROCEDURE add_languages_entry(IN lng_gui_AT CHAR(10), IN lng_language VARCHAR(30))
BEGIN
	INSERT INTO languages VALUES
	(lng_gui_AT, lng_language);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the languages table. */
DELIMITER $
CREATE PROCEDURE update_languages_entry(IN lng_gui_AT CHAR(10), IN lng_language VARCHAR(30))
BEGIN
	UPDATE languages
    SET languages.lng_gui_AT=lng_gui_AT, languages.lng_language=lng_language
    WHERE languages.lng_gui_AT=lng_gui_AT AND languages.lng_language=lng_language;
END$
DELIMITER ;



/* Procedure that deletes an entry from the languages table. */
DELIMITER $
CREATE PROCEDURE delete_languages_entry(IN lng_gui_AT CHAR(10), IN lng_language VARCHAR(30))
BEGIN
	DELETE FROM languages
    WHERE languages.lng_gui_AT=lng_gui_AT AND languages.lng_language=lng_language;
END$
DELIMITER ;



/* Procedure that returns all the trip entries. */
DELIMITER $
CREATE PROCEDURE get_trip_entries()
BEGIN
	SELECT * FROM trip;
END$
DELIMITER ;



/* Procedure that adds an entry to the trip table. */ 
DELIMITER $
CREATE PROCEDURE add_trip_entry(IN tr_id INT, IN tr_departure DATETIME, IN tr_return DATETIME, IN tr_maxseats TINYINT, IN tr_cost FLOAT, IN tr_br_code INT, IN tr_gui_AT CHAR(10), IN tr_drv_AT CHAR(10))
BEGIN
	INSERT INTO trip VALUES
	(tr_id, tr_departure, tr_return, tr_maxseats, tr_cost, tr_br_code, tr_gui_AT, tr_drv_AT);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the trip table. */
DELIMITER $
CREATE PROCEDURE update_trip_entry(IN tr_id INT, IN tr_departure DATETIME, IN tr_return DATETIME, IN tr_maxseats TINYINT, IN tr_cost FLOAT, IN tr_br_code INT, IN tr_gui_AT CHAR(10), IN tr_drv_AT CHAR(10))
BEGIN
	UPDATE trip
    SET trip.tr_id=tr_id, trip.tr_departure=tr_departure, trip.tr_return=tr_return, trip.tr_maxseats=tr_maxseats, trip.tr_cost=tr_cost, trip.tr_br_code=tr_br_code, trip.tr_gui_AT=tr_gui_AT, trip.tr_drv_AT=tr_drv_AT
    WHERE trip.tr_id=tr_id;
END$
DELIMITER ;



/* Procedure that deletes an entry from the trip table. */
DELIMITER $
CREATE PROCEDURE delete_trip_entry(IN tr_id INT)
BEGIN
	DELETE FROM trip
    WHERE trip.tr_id=tr_id;
END$
DELIMITER ;



/* Procedure that returns all the event entries. */
DELIMITER $
CREATE PROCEDURE get_event_entries()
BEGIN
	SELECT * FROM event;
END$
DELIMITER ;



/* Procedure that adds an entry to the event table. */ 
DELIMITER $
CREATE PROCEDURE add_event_entry(IN ev_tr_id INT, IN ev_start DATETIME, IN ev_end DATETIME, IN ev_descr TEXT)
BEGIN
	INSERT INTO event VALUES
	(ev_tr_id, ev_start, ev_end, ev_descr);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the event table. */
DELIMITER $
CREATE PROCEDURE update_event_entry(IN ev_tr_id INT, IN ev_start DATETIME, IN ev_end DATETIME, IN ev_descr TEXT)
BEGIN
	UPDATE event
    SET event.ev_tr_id=ev_tr_id, event.ev_start=ev_start, event.ev_end=ev_end, event.ev_descr=ev_descr
    WHERE event.ev_tr_id=ev_tr_id AND event.ev_start=ev_start;
END$
DELIMITER ;



/* Procedure that deletes an entry from the event table. */
DELIMITER $
CREATE PROCEDURE delete_event_entry(IN ev_tr_id INT)
BEGIN
	DELETE FROM event
    WHERE event.ev_tr_id=ev_tr_id;
END$
DELIMITER ;



/* Procedure that returns all the reservation entries. */
DELIMITER $
CREATE PROCEDURE get_reservation_entries()
BEGIN
	SELECT * FROM reservation;
END$
DELIMITER ;



/* Procedure that adds an entry to the reservation table. */ 
DELIMITER $
CREATE PROCEDURE add_reservation_entry(IN res_tr_id INT, IN res_seatnum TINYINT, IN res_name VARCHAR(20), IN res_lname VARCHAR(20), IN res_isadult ENUM('ADULT', 'MINOR'))
BEGIN
	INSERT INTO reservation VALUES
	(res_tr_id, res_seatnum, res_name, res_lname, res_isadult);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the reservation table. */
DELIMITER $
CREATE PROCEDURE update_reservation_entry(IN res_tr_id INT, IN res_seatnum TINYINT, IN res_name VARCHAR(20), IN res_lname VARCHAR(20), IN res_isadult ENUM('ADULT', 'MINOR'))
BEGIN
	UPDATE reservation
    SET reservation.res_tr_id=res_tr_id, reservation.res_seatnum=res_seatnum, reservation.res_name=res_name, reservation.res_lname=res_lname, reservation.res_isadult=res_isadult
    WHERE reservation.res_tr_id=res_tr_id AND reservation.res_seatnum=res_seatnum;
END$
DELIMITER ;



/* Procedure that deletes an entry from the reservation table. */
DELIMITER $
CREATE PROCEDURE delete_reservation_entry(IN res_tr_id INT, IN res_seatnum TINYINT)
BEGIN
	DELETE FROM reservation
    WHERE reservation.res_tr_id=res_tr_id AND reservation.res_seatnum=res_seatnum;
END$
DELIMITER ;



/* Procedure that returns all the destination entries. */
DELIMITER $
CREATE PROCEDURE get_destination_entries()
BEGIN
	SELECT * FROM destination;
END$
DELIMITER ;



/* Procedure that adds an entry to the destination table. */ 
DELIMITER $
CREATE PROCEDURE add_destination_entry(IN dst_id INT, IN dst_name VARCHAR(50), IN dst_descr TEXT, IN dst_rtype ENUM('LOCAL', 'ABROAD'), IN dst_language VARCHAR(30), IN dst_location INT)
BEGIN
	INSERT INTO destination VALUES
	(dst_id, dst_name, dst_descr, dst_rtype, dst_language, dst_location);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the destination table. */
DELIMITER $
CREATE PROCEDURE update_destination_entry(IN dst_id INT, IN dst_name VARCHAR(50), IN dst_descr TEXT, IN dst_rtype ENUM('LOCAL', 'ABROAD'), IN dst_language VARCHAR(30), IN dst_location INT)
BEGIN
	UPDATE destination
    SET destination.dst_id=dst_id, destination.dst_name=dst_name, destination.dst_descr=dst_descr, destination.dst_rtype=dst_rtype, destination.dst_language=dst_language, destination.dst_location=dst_location
    WHERE destination.dst_id=dst_id;
END$
DELIMITER ;



/* Procedure that deletes an entry from the destination table. */
DELIMITER $
CREATE PROCEDURE delete_destination_entry(IN dst_id INT)
BEGIN
	DELETE FROM destination
    WHERE destination.dst_id=dst_id;
END$
DELIMITER ;



/* Procedure that returns all the travel_to entries. */
DELIMITER $
CREATE PROCEDURE get_travel_to_entries()
BEGIN
	SELECT * FROM travel_to;
END$
DELIMITER ;



/* Procedure that adds an entry to the travel_to table. */ 
DELIMITER $
CREATE PROCEDURE add_travel_to_entry(IN to_tr_id INT, IN to_dst_id INT, IN to_arrival DATETIME, IN to_departure DATETIME)
BEGIN
	INSERT INTO travel_to VALUES
	(to_tr_id, to_dst_id, to_arrival, to_departure);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the travel_to table. */
DELIMITER $
CREATE PROCEDURE update_travel_to_entry(IN to_tr_id INT, IN to_dst_id INT, IN to_arrival DATETIME, IN to_departure DATETIME)
BEGIN
	UPDATE travel_to
    SET travel_to.to_tr_id=to_tr_id, travel_to.to_dst_id=to_dst_id, travel_to.to_arrival=to_arrival, travel_to.to_departure=to_departure
    WHERE travel_to.to_tr_id=to_tr_id AND travel_to.to_dst_id=to_dst_id;
END$
DELIMITER ;



/* Procedure that deletes an entry from the travel_to table. */
DELIMITER $
CREATE PROCEDURE delete_travel_to_entry(IN to_tr_id INT, IN to_dst_id INT)
BEGIN
	DELETE FROM travel_to
    WHERE travel_to.to_tr_id=to_tr_id AND travel_to.to_dst_id=to_dst_id;
END$
DELIMITER ;



/* Procedure that returns all the it_manager entries. */
DELIMITER $
CREATE PROCEDURE get_it_manager_entries()
BEGIN
	SELECT * FROM it_manager;
END$
DELIMITER ;



/* Procedure that adds an entry to the it_manager table. */ 
DELIMITER $
CREATE PROCEDURE add_it_manager_entry(IN it_AT CHAR(10), IN it_password CHAR(10), IN it_start_date DATE, IN it_end_date DATE, IN it_is_active BOOLEAN)
BEGIN
	INSERT INTO it_manager VALUES
	(it_AT, it_password, it_start_date, it_end_date, it_is_active);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the it_manager table. */
DELIMITER $
CREATE PROCEDURE update_it_manager_entry(IN it_AT CHAR(10), IN it_password CHAR(10), IN it_start_date DATE, IN it_end_date DATE, IN it_is_active BOOLEAN)
BEGIN
	UPDATE it_manager
    SET it_manager.it_AT=it_AT, it_manager.it_password=it_password, it_manager.it_start_date=it_start_date, it_manager.it_end_date=it_end_date, it_manager.it_is_active=it_is_active
    WHERE it_manager.it_AT=it_AT;
END$
DELIMITER ;



/* Procedure that deletes an entry from the it_manager table. */
DELIMITER $
CREATE PROCEDURE delete_it_manager_entry(IN it_AT CHAR(10))
BEGIN
	DELETE FROM it_manager
    WHERE it_manager.it_AT=it_AT;
END$
DELIMITER ;



/* Procedure that returns all the offers entries. */
DELIMITER $
CREATE PROCEDURE get_offers_entries()
BEGIN
	SELECT * FROM offers;
END$
DELIMITER ;



/* Procedure that adds an entry to the offers table. */ 
DELIMITER $
CREATE PROCEDURE add_offers_entry(IN of_id INT, IN of_start_date DATE, IN of_end_date DATE, IN of_cost FLOAT, IN of_dst_id INT)
BEGIN
	INSERT INTO offers VALUES
	(of_id, of_start_date, of_end_date, of_cost, of_dst_id);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the offers table. */
DELIMITER $
CREATE PROCEDURE update_offers_entry(IN of_id INT, IN of_start_date DATE, IN of_end_date DATE, IN of_cost FLOAT, IN of_dst_id INT)
BEGIN
	UPDATE offers
    SET offers.of_id=of_id, offers.of_start_date=of_start_date, offers.of_end_date=of_end_date, offers.of_cost=of_cost, offers.of_dst_id=of_dst_id
    WHERE offers.of_id=of_id;
END$
DELIMITER ;



/* Procedure that deletes an entry from the offers table. */
DELIMITER $
CREATE PROCEDURE delete_offers_entry(IN of_id INT)
BEGIN
	DELETE FROM offers
    WHERE offers.of_id=of_id;
END$
DELIMITER ;



/* Procedure that returns all the reservation_offers entries. */
DELIMITER $
CREATE PROCEDURE get_reservation_offers_entries()
BEGIN
	SELECT * FROM reservation_offers;
END$
DELIMITER ;



/* Procedure that adds an entry to the reservation_offers table. */ 
DELIMITER $
CREATE PROCEDURE add_reservation_offers_entry(IN res_of_id INT, IN res_of_lname VARCHAR(20), IN res_of_name VARCHAR(20), IN res_of_trip_id INT, IN res_payment FLOAT)
BEGIN
	INSERT INTO reservation_offers VALUES
	(res_of_id, res_of_lname, res_of_name, res_of_trip_id, res_payment);
END$
DELIMITER ;



/* Procedure that updates an existing entry of the reservation_offers table. */
DELIMITER $
CREATE PROCEDURE update_reservation_offers_entry(IN res_of_id INT, IN res_of_lname VARCHAR(20), IN res_of_name VARCHAR(20), IN res_of_trip_id INT, IN res_payment FLOAT)
BEGIN
	UPDATE reservation_offers
    SET reservation_offers.res_of_id=res_of_id, reservation_offers.res_of_lname=res_of_lname, reservation_offers.res_of_name=res_of_name, reservation_offers.res_of_trip_id=res_of_trip_id, reservation_offers.res_payment=res_payment
    WHERE reservation_offers.res_of_id=res_of_id;
END$
DELIMITER ;



/* Procedure that deletes an entry from the reservation_offers table. */
DELIMITER $
CREATE PROCEDURE delete_reservation_offers_entry(IN res_of_id INT)
BEGIN
	DELETE FROM reservation_offers
    WHERE reservation_offers.res_of_id=res_of_id;
END$
DELIMITER ;