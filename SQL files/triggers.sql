/* 
This SQL file contains the triggers for the 'travel_agency' database 
management system.
*/ 

DROP TRIGGER IF EXISTS log_trip_insert;
DROP TRIGGER IF EXISTS log_trip_update;
DROP TRIGGER IF EXISTS log_trip_delete;
DROP TRIGGER IF EXISTS log_reservation_insert;
DROP TRIGGER IF EXISTS log_reservation_update;
DROP TRIGGER IF EXISTS log_reservation_delete;
DROP TRIGGER IF EXISTS log_event_insert;
DROP TRIGGER IF EXISTS log_event_update;
DROP TRIGGER IF EXISTS log_event_delete;
DROP TRIGGER IF EXISTS log_travel_to_insert;
DROP TRIGGER IF EXISTS log_travel_to_update;
DROP TRIGGER IF EXISTS log_travel_to_delete;
DROP TRIGGER IF EXISTS log_destination_insert;
DROP TRIGGER IF EXISTS log_destination_update;
DROP TRIGGER IF EXISTS log_destination_delete;
DROP TRIGGER IF EXISTS prevent_trip_changes;
DROP TRIGGER IF EXISTS prevent_salary_decrease;



/* Trigger that logs an insert operation on trip by inserting the lastname of the it_manager, 
the operation type and some other data on the trip table. */
DELIMITER $
CREATE TRIGGER log_trip_insert
AFTER INSERT ON trip
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'trip', 'INSERT', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an update operation on trip by inserting the lastname of the it_manager, 
the operation type and some other data on the trip table. */
DELIMITER $
CREATE TRIGGER log_trip_update
AFTER UPDATE ON trip
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'trip', 'UPDATE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs a delete operation on trip by inserting the lastname of the it_manager, 
the operation type and some other data on the trip table. */
DELIMITER $
CREATE TRIGGER log_trip_delete
AFTER DELETE ON trip
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'trip', 'DELETE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an insert operation on reservation by inserting the lastname of the it_manager, 
the operation type and some other data on the reservation table. */
DELIMITER $
CREATE TRIGGER log_reservation_insert
AFTER INSERT ON reservation
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'reservation', 'INSERT', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an update operation on reservation by inserting the lastname of the it_manager, 
the operation type and some other data on the reservation table. */
DELIMITER $
CREATE TRIGGER log_reservation_update
AFTER UPDATE ON reservation
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'reservation', 'UPDATE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs a delete operation on reservation by inserting the lastname of the it_manager, 
the operation type and some other data on the reservation table. */
DELIMITER $
CREATE TRIGGER log_reservation_delete
AFTER DELETE ON reservation
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'reservation', 'DELETE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an insert operation on event by inserting the lastname of the it_manager, 
the operation type and some other data on the event table. */
DELIMITER $
CREATE TRIGGER log_event_insert
AFTER INSERT ON event
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'event', 'INSERT', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an update operation on event by inserting the lastname of the it_manager, 
the operation type and some other data on the event table. */
DELIMITER $
CREATE TRIGGER log_event_update
AFTER UPDATE ON event
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'event', 'UPDATE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs a delete operation on event by inserting the lastname of the it_manager, 
the operation type and some other data on the event table. */
DELIMITER $
CREATE TRIGGER log_event_delete
AFTER DELETE ON event
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'event', 'DELETE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an insert operation on travel_to by inserting the lastname of the it_manager, 
the operation type and some other data on the travel_to table. */
DELIMITER $
CREATE TRIGGER log_travel_to_insert
AFTER INSERT ON travel_to
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'travel_to', 'INSERT', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an update operation on travel_to by inserting the lastname of the it_manager, 
the operation type and some other data on the event table. */
DELIMITER $
CREATE TRIGGER log_travel_to_update
AFTER UPDATE ON travel_to
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'travel_to', 'UPDATE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs a delete operation on travel_to by inserting the lastname of the it_manager, 
the operation type and some other data on the travel_to table. */
DELIMITER $
CREATE TRIGGER log_travel_to_delete
AFTER DELETE ON travel_to 
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'travel_to', 'DELETE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an insert operation on destination by inserting the lastname of the it_manager, 
the operation type and some other data on the destination table. */
DELIMITER $
CREATE TRIGGER log_destination_insert
AFTER INSERT ON destination
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'destination', 'INSERT', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs an update operation on destination by inserting the lastname of the it_manager, 
the operation type and some other data on the destination table. */
DELIMITER $
CREATE TRIGGER log_destination_update
AFTER UPDATE ON destination
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'destination', 'UPDATE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that logs a delete operation on destination by inserting the lastname of the it_manager, 
the operation type and some other data on the destination table. */
DELIMITER $
CREATE TRIGGER log_destination_delete
AFTER DELETE ON destination
FOR EACH ROW
BEGIN
	DECLARE lastname VARCHAR(20);
    
	SELECT wrk_lname INTO lastname FROM worker 
    INNER JOIN it_manager ON worker.wrk_AT=it_manager.it_AT
    WHERE it_is_active=TRUE;
    
	INSERT INTO log VALUES
    (NULL, 'destination', 'DELETE', lastname, DEFAULT);
END$
DELIMITER ;



/* Trigger that prevents updates to a trip table if there are any reservations
associated with that trip, and one of the departure date, return date, or cost 
being updated. */
DELIMITER $
CREATE TRIGGER prevent_trip_changes
BEFORE UPDATE ON trip
FOR EACH ROW
BEGIN
	DECLARE num_of_reservations TINYINT;
    
    SELECT COUNT(*) INTO num_of_reservations
	FROM reservation WHERE res_tr_id = OLD.tr_id;
    
    /* This will check if there are any reservations for the trip being updated, 
    and if the departure date, return date, or cost are being changed. 
    If both conditions are true, the trigger will raise an error.*/
    IF num_of_reservations > 0 AND (OLD.tr_departure <> NEW.tr_departure OR 
    OLD.tr_return <> NEW.tr_return OR OLD.tr_cost <> NEW.tr_cost) THEN
		SIGNAL SQLSTATE VALUE '45000'
		SET MESSAGE_TEXT = 'Cannot update this trip because it already has reservations!';
    END IF;
END$
DELIMITER ;



/* Trigger that prevents the decrease of the salary of a worker when updating 
by raising an error with a message if the new salary is less than the old salary.*/ 
DELIMITER $
CREATE TRIGGER prevent_salary_decrease
BEFORE UPDATE ON worker
FOR EACH ROW
BEGIN
	IF OLD.wrk_salary > NEW.wrk_salary THEN
		SIGNAL SQLSTATE VALUE '45000'
		SET MESSAGE_TEXT = 'Cannot decrease a worker\'s salary!';
    END IF;
END$
DELIMITER ;

