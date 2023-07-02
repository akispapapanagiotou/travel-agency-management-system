/* 
This SQL file contains all the table creations that were needed to meet all 
the database requirements for the travel agency management system.
*/ 

/* the following line of code drops the database 'travel_agency' if it already exists */ 
DROP DATABASE IF EXISTS travel_agency;

/* creates and uses the database 'travel_agency' */  
CREATE DATABASE travel_agency;
USE travel_agency;

/* table creations of our database */
CREATE TABLE branch(
	br_code INT NOT NULL AUTO_INCREMENT,
    br_street VARCHAR(30) DEFAULT 'unknown street' NOT NULL,
    br_num INT DEFAULT '1' NOT NULL,
    br_city VARCHAR(30) DEFAULT 'unknown city' NOT NULL,
    PRIMARY KEY(br_code)
);

CREATE TABLE phones(
	ph_br_code INT NOT NULL,
    ph_number CHAR(10) NOT NULL,
    PRIMARY KEY(ph_br_code, ph_number),
    CONSTRAINT BRANCHPHONES
    FOREIGN KEY(ph_br_code) REFERENCES branch(br_code)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE worker(
	wrk_AT CHAR(10) NOT NULL,
    wrk_name VARCHAR(20) DEFAULT 'unknown name' NOT NULL,
    wrk_lname VARCHAR(20) DEFAULT 'unknown last name' NOT NULL,
    wrk_salary FLOAT DEFAULT '0' NOT NULL,
    wrk_br_code INT NOT NULL,
    PRIMARY KEY(wrk_AT),
    CONSTRAINT BRANCHWORKER
    FOREIGN KEY(wrk_br_code) REFERENCES branch(br_code)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE admin(
	adm_AT CHAR(10) NOT NULL,
    adm_type ENUM('LOGISTICS', 'ADMINISTRATIVE', 'ACCOUNTING') NOT NULL,
    adm_diploma VARCHAR(200) DEFAULT 'unknown diploma' NOT NULL,
    PRIMARY KEY(adm_AT),
    CONSTRAINT WORKERADMIN
    FOREIGN KEY(adm_AT) REFERENCES worker(wrk_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE manages(
	mng_adm_AT CHAR(10) NOT NULL,
    mng_br_code INT NOT NULL,
    PRIMARY KEY(mng_adm_AT, mng_br_code),
    CONSTRAINT ADMINMANAGES
    FOREIGN KEY(mng_adm_AT) REFERENCES admin(adm_AT)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT BRANCHMANAGES
    FOREIGN KEY(mng_br_code) REFERENCES branch(br_code)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE driver(
	drv_AT CHAR(10) NOT NULL,
    drv_license ENUM('A', 'B', 'C', 'D') NOT NULL,
    drv_route ENUM('LOCAL', 'ABROAD') NOT NULL,
    drv_experience TINYINT DEFAULT '0' NOT NULL,
	PRIMARY KEY(drv_AT),
    CONSTRAINT WORKERDRIVER
    FOREIGN KEY(drv_AT) REFERENCES worker(wrk_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE guide(
	gui_AT CHAR(10) NOT NULL,
    gui_CV TEXT NOT NULL,
    PRIMARY KEY(gui_AT),
    CONSTRAINT WORKERGUIDE 
    FOREIGN KEY(gui_AT) REFERENCES worker(wrk_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE languages(
	lng_gui_AT CHAR(10) NOT NULL,
    lng_language VARCHAR(30) NOT NULL,
    PRIMARY KEY(lng_gui_AT, lng_language),
    CONSTRAINT GUIDELANGUAGES
    FOREIGN KEY(lng_gui_AT) REFERENCES guide(gui_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE trip(
	tr_id INT NOT NULL AUTO_INCREMENT,
    tr_departure DATETIME NOT NULL,
    tr_return DATETIME NOT NULL,
    tr_maxseats TINYINT DEFAULT '0' NOT NULL,
    tr_cost FLOAT DEFAULT '0' NOT NULL,
    tr_br_code INT NOT NULL,
    tr_gui_AT CHAR(10) NOT NULL,
    tr_drv_AT CHAR(10) NOT NULL,
    PRIMARY KEY(tr_id),
    CONSTRAINT BRANCHTRIP
    FOREIGN KEY(tr_br_code) REFERENCES branch(br_code)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT GUIDETRIP
    FOREIGN KEY(tr_gui_AT) REFERENCES guide(gui_AT)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT DRIVERTRIP
    FOREIGN KEY(tr_drv_AT) REFERENCES driver(drv_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE event(
	ev_tr_id INT NOT NULL AUTO_INCREMENT,
    ev_start DATETIME NOT NULL,
    ev_end DATETIME NOT NULL,
    ev_descr TEXT NOT NULL,
    PRIMARY KEY(ev_tr_id, ev_start),
	CONSTRAINT TRIPEVENT 
    FOREIGN KEY(ev_tr_id) REFERENCES trip(tr_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE reservation(
	res_tr_id INT NOT NULL,
    res_seatnum TINYINT DEFAULT '1' NOT NULL,
    res_name VARCHAR(20) DEFAULT 'unknown name' NOT NULL,
    res_lname VARCHAR(20) DEFAULT 'unknown last name' NOT NULL,
    res_isadult ENUM('ADULT', 'MINOR') NOT NULL,
    PRIMARY KEY(res_tr_id, res_seatnum),
    CONSTRAINT TRIPRESERVATION
    FOREIGN KEY(res_tr_id) REFERENCES trip(tr_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE destination(
	dst_id INT NOT NULL AUTO_INCREMENT,
    dst_name VARCHAR(50) DEFAULT 'unknown name' NOT NULL,
    dst_descr TEXT NOT NULL,
    dst_rtype ENUM('LOCAL', 'ABROAD') NOT NULL,
    dst_language VARCHAR(30) DEFAULT 'unknown language' NOT NULL,
    dst_location INT,
    PRIMARY KEY(dst_id),
    CONSTRAINT DESTLOCATION
    FOREIGN KEY(dst_location) REFERENCES destination(dst_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE travel_to(
	to_tr_id INT NOT NULL,
    to_dst_id INT NOT NULL,
    to_arrival DATETIME NOT NULL,
    to_departure DATETIME NOT NULL,
    PRIMARY KEY(to_tr_id, to_dst_id),
    CONSTRAINT TRIPTRAVELTO
    FOREIGN KEY(to_tr_id) REFERENCES trip(tr_id)
    ON DELETE CASCADE ON UPDATE CASCADE,
    CONSTRAINT DESTTRAVELTO
    FOREIGN KEY(to_dst_id) REFERENCES destination(dst_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE it_manager(
	it_AT CHAR(10) NOT NULL,
	it_password CHAR(10) DEFAULT 'password' NOT NULL,
    it_start_date DATE NOT NULL,
    it_end_date DATE,
    it_is_active BOOLEAN NOT NULL,
    PRIMARY KEY(it_AT),
    CONSTRAINT WORKERIT
    FOREIGN KEY(it_AT) REFERENCES worker(wrk_AT)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE log(
	log_id INT NOT NULL AUTO_INCREMENT,
    log_table VARCHAR(20) NOT NULL,
    log_action VARCHAR(20) NOT NULL,
    log_lname VARCHAR(20) NOT NULL,
    log_timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY(log_id)
);

CREATE TABLE offers(
	of_id INT NOT NULL AUTO_INCREMENT,
    of_start_date DATE NOT NULL,
    of_end_date DATE NOT NULL,
    of_cost FLOAT DEFAULT '0' NOT NULL,
    of_dst_id INT NOT NULL,
    PRIMARY KEY(of_id),
    CONSTRAINT DESTOFFERS
    FOREIGN KEY(of_dst_id) REFERENCES destination(dst_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE reservation_offers(
	res_of_id INT NOT NULL AUTO_INCREMENT,
    res_of_lname VARCHAR(20) DEFAULT 'unknown last name' NOT NULL,
    res_of_name VARCHAR(20) DEFAULT 'unknown name' NOT NULL,
    res_of_trip_id INT NOT NULL,
    res_payment FLOAT DEFAULT '0' NOT NULL,
    PRIMARY KEY(res_of_id),
    CONSTRAINT OFFERSRESERV
    FOREIGN KEY(res_of_trip_id) REFERENCES offers(of_id)
    ON DELETE CASCADE ON UPDATE CASCADE
);