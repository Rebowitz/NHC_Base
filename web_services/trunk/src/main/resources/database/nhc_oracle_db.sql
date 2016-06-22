-- Oracle DB
-- Create by Backend WebServices Team
-- Database: nhcsys
-- 


-- Dropping server_runtime_config related stuff

DROP TABLE server_runtime_config PURGE;
DROP TABLE installed_software PURGE;
DROP TABLE ws_sessions PURGE;
DROP TABLE machines PURGE;
DROP TABLE messages PURGE;
DROP TABLE networkinfo PURGE;
DROP TABLE clqinfo PURGE;
DROP TABLE wmiqinfo PURGE;
DROP TABLE wnqinfo PURGE;
DROP TABLE snmpqinfo PURGE;
DROP TABLE update_status PURGE;
DROP TABLE modified_data PURGE;

-- Creating table

CREATE TABLE server_runtime_config (
  config_id NUMBER(20,0) NOT NULL, --Auto Increment this value
  config_key varchar(80) NOT NULL,
  config_value varchar(40) NOT NULL,
  PRIMARY KEY  (config_key),
  CONSTRAINT config_id UNIQUE (config_id)
);

--
-- Dumping data for table server_runtime_config
--

-- 
-- Table structure for table machines
-- 

CREATE TABLE machines (
  machine_id NUMBER(20,0) NOT NULL, -- Needs auto_increment,
  customer_id NUMBER(20,0) NOT NULL,
  vive_id varchar(99)  NOT NULL,
  cpu_serial_no varchar(70)  NOT NULL,
  key_data varchar(255)  NOT NULL,
  key_timestamp NUMBER(20,0) NOT NULL,
  stolen_flag NUMBER(4,0) default '0',
  terminate_flag NUMBER(4,0) default '0',
  registered_flag NUMBER(4,0) default '0',
  PRIMARY KEY  (machine_id),
  CONSTRAINT cpu_serial_no UNIQUE (cpu_serial_no)
);

--
-- Table structure for table messages
--

CREATE TABLE messages (
  message_id NUMBER(20,0) NOT NULL,-- auto_increment,
  Type varchar(20) NOT NULL,
  start_time DATE NOT NULL,
  end_time DATE NOT NULL,
  mod_time DATE NOT NULL,
  title varchar(64) NOT NULL,
  contents varchar(255) NOT NULL,
  summary varchar(255) NOT NULL,
  priority varchar(20) NOT NULL,
  popup_duration NUMBER(11,0) NOT NULL,
  click_destination_url varchar2(255) NOT NULL,
  destination varchar2(255) NOT NULL,
  group_name varchar2(255) default NULL,
  vive_id varchar2(99) NOT NULL,

  PRIMARY KEY  (message_id),
  CONSTRAINT type_constraint CHECK (Type IN ('Alert','News','Dunning','Terminate','Private','PrivateAlert','Stolen','Backup','AV','Software','DriveConnection','Hardware','General','Partner','Marketing','Advertising','Other','Test')),
  CONSTRAINT priority_constraint CHECK (priority IN ('High','Normal')),
  CONSTRAINT destination_constraint CHECK (destination IN ('Member','Group','All'))
);

-- 
-- Table structure for table ws_sessions
-- 

CREATE TABLE ws_sessions (
  ws_session_id NUMBER(20,0) NOT NULL, --Need to increment,
  app_name varchar(150)  NOT NULL,
  session_id varchar(255) NOT NULL,
  machine_id NUMBER(20,0) NOT NULL,
  time_stamp DATE NOT NULL,
  PRIMARY KEY  (ws_session_id)
);

-- 
-- Table structure for table installed_software
--

 CREATE TABLE installed_software (
  software_id NUMBER(20,0) NOT NULL,-- auto_increment,
  customer_id NUMBER(20,0) NOT NULL,
  machine_id NUMBER(20,0) NOT NULL,
  product_key varchar(255) NOT NULL,
  product_name varchar(255),
  company_name varchar(255),
  product_version varchar(255),
  PRIMARY KEY  (software_id)
);

--
-- Table structure for table `networkinfo`
--

CREATE TABLE networkinfo (
  networkinfo_id NUMBER(20,0) NOT NULL,-- auto_increment,
  customer_id NUMBER(20,0) NOT NULL,
  machine_id NUMBER(20,0) NOT NULL,
  ssid varchar(255),
  passphrase varchar(255),
  wirelessinfotype varchar(255),
  timestamp date NOT NULL,
  PRIMARY KEY  (networkinfo_id)
);

--
-- Table structure for table `clqinfo`
--

CREATE TABLE clqinfo (
  clqinfo_id NUMBER(20,0) NOT NULL,-- auto_increment,
  networkinfo_id NUMBER(20,0) NOT NULL,
  name varchar(255),
  cmdline varchar(255),
  result varchar(255),
  PRIMARY KEY  (clqinfo_id)
);

--
-- Table structure for table `wmiqinfo`
--

CREATE TABLE wmiqinfo (
  wmiqinfo_id NUMBER(20,0) NOT NULL,-- auto_increment,
  networkinfo_id NUMBER(20,0) NOT NULL,
  name varchar(255) default NULL,
  query varchar(255) default NULL,
  result varchar(255) default NULL,
  PRIMARY KEY  (wmiqinfo_id)
);

--
-- Table structure for table `wnqinfo`
--

CREATE TABLE wnqinfo (
  wnqinfo_id NUMBER(20,0) NOT NULL,-- auto_increment,
  networkinfo_id NUMBER(20,0) NOT NULL,
  provider varchar(255),
  remotename varchar(255),
  localname varchar(255),
  ipaddress varchar(255),
  wnqcomment varchar(255),
  displaytype varchar(255),
  wnqscope varchar(255),
  wnqtype varchar(255),
  wnqusage varchar(255),
  PRIMARY KEY  (wnqinfo_id)
);

--
-- Table structure for table `snmpqinfo`
--

CREATE TABLE snmpqinfo (
  snmpqinfo_id NUMBER(20,0) NOT NULL,-- auto_increment,
  networkinfo_id NUMBER(20,0) NOT NULL,
  name varchar(255) ,
  tree varchar(255) ,
  PRIMARY KEY  (snmpqinfo_id)
);

-- 
-- Table structure for table update_status
--

CREATE TABLE update_status (
  update_status_id NUMBER(20,0) NOT NULL,-- auto_increment,
  session_id varchar(255) NOT NULL,
  machine_id NUMBER(20,0) NOT NULL,
  product_id varchar(255) NOT NULL,
  description varchar(255),
  report varchar(255),
  status varchar(80),
  PRIMARY KEY  (update_status_id),
  CONSTRAINT status_constraint CHECK (status IN ('Success','Fail','Unknown'))
);


-- Creating table

CREATE TABLE modified_data (
  modified_data_id  NUMBER(20,0) NOT NULL, --Auto Increment this value
  customer_id NUMBER(20,0) NOT NULL,
  modified_time DATE NOT NULL,
  PRIMARY KEY  (modified_data_id)
);


-- DROPPING Sequences
DROP SEQUENCE software_id_seq;
DROP SEQUENCE config_id_seq;
DROP SEQUENCE ws_session_id_seq;
DROP SEQUENCE machine_id_seq;
DROP SEQUENCE message_id_seq;
DROP SEQUENCE networkinfo_id_seq;
DROP SEQUENCE clqinfo_id_seq;
DROP SEQUENCE wmiqinfo_id_seq;
DROP SEQUENCE wnqinfo_id_seq;
DROP SEQUENCE snmpqinfo_id_seq;
DROP SEQUENCE update_status_id_seq;
DROP SEQUENCE modified_data_id_seq;


-- Creating Auto Increment for config_id


CREATE SEQUENCE config_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for config_id

CREATE SEQUENCE machine_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id

CREATE SEQUENCE message_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for ws_sessions_id
CREATE SEQUENCE ws_session_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id
CREATE SEQUENCE software_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id
CREATE SEQUENCE networkinfo_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id
CREATE SEQUENCE clqinfo_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id
CREATE SEQUENCE wmiqinfo_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id
CREATE SEQUENCE wnqinfo_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id
CREATE SEQUENCE snmpqinfo_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id
CREATE SEQUENCE update_status_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;

-- Creating Auto Increment for message_id
CREATE SEQUENCE modified_data_id_seq
START WITH 1000
INCREMENT BY 1
NOCACHE
NOCYCLE;


--
-- Creating Trigger for the server_runtime_config
--

/*CREATE OR REPLACE TRIGGER server_runtime_insert_trigger 
  BEFORE INSERT ON server_runtime_config FOR EACH ROW
  BEGIN
    SELECT config_id_seq.nextval
      INTO :new.config_id
    FROM dual;
  END;
  /
-- --------------------------------------------------------
--
-- Creating Trigger for the table machines
--

CREATE OR REPLACE TRIGGER machines_insert_trigger 
  BEFORE INSERT ON machines FOR EACH ROW
  BEGIN
    SELECT machine_id_seq.nextval
      INTO :new.machine_id
    FROM dual;
  END;
/
--
-- Creating Trigger for the table ws_sessions
--

CREATE OR REPLACE TRIGGER ws_sessions_insert_trigger 
  BEFORE INSERT ON ws_sessions FOR EACH ROW
  BEGIN
    SELECT ws_session_id_seq.nextval
      INTO :new.ws_session_id
    FROM dual;
  END;
/
--
-- Creating Trigger for the table messages
--

CREATE OR REPLACE TRIGGER messages_insert_trigger 
  BEFORE INSERT ON messages FOR EACH ROW
  BEGIN
    SELECT message_id_seq.nextval
      INTO :new.message_id
    FROM dual;
  END;
/
--
-- Creating Trigger for the table installed_software
--

CREATE OR REPLACE TRIGGER software_insert_trigger 
  BEFORE INSERT ON installed_software FOR EACH ROW
  BEGIN
    SELECT software_id_seq.nextval
      INTO :new.software_id
    FROM dual;
  END;
/

--
-- Creating Trigger for the table installed_software
--

CREATE OR REPLACE TRIGGER netinfo_insert_trigger 
  BEFORE INSERT ON networkinfo FOR EACH ROW
  BEGIN
    SELECT networkinfo_id_seq.nextval
      INTO :new.networkinfo_id
    FROM dual;
  END;
/

--
-- Creating Trigger for the table clqinfo
--
CREATE OR REPLACE TRIGGER clqinfo_insert_trigger 
  BEFORE INSERT ON clqinfo FOR EACH ROW
  BEGIN
    SELECT clqinfo_id_seq.nextval
      INTO :new.clqinfo_id
    FROM dual;
  END;
/

--
-- Creating Trigger for the table wmiqinfo
--
CREATE OR REPLACE TRIGGER wmiqinfo_insert_trigger 
  BEFORE INSERT ON wmiqinfo FOR EACH ROW
  BEGIN
    SELECT wmiqinfo_id_seq.nextval
      INTO :new.wmiqinfo_id
    FROM dual;
  END;
/
--
-- Creating Trigger for the table wnqinfo
--
CREATE OR REPLACE TRIGGER wnqinfo_insert_trigger 
  BEFORE INSERT ON wnqinfo FOR EACH ROW
  BEGIN
    SELECT wnqinfo_id_seq.nextval
      INTO :new.wnqinfo_id
    FROM dual;
  END;
/
--
-- Creating Trigger for the table snmpqinfo
--
CREATE OR REPLACE TRIGGER snmpqinfo_insert_trigger 
  BEFORE INSERT ON snmpqinfo FOR EACH ROW
  BEGIN
    SELECT snmpqinfo_id_seq.nextval
      INTO :new.snmpqinfo_id
    FROM dual;
  END;
/

--
-- Creating Trigger for the table update_status
--
CREATE OR REPLACE TRIGGER update_status_insert_trigger 
  BEFORE INSERT ON update_status FOR EACH ROW
  BEGIN
    SELECT update_status_id_seq.nextval
      INTO :new.update_status_id
    FROM dual;
  END;
/

--
-- Creating Trigger for the table update_status
--
CREATE OR REPLACE TRIGGER is_kaseya_installed_trigger 
  AFTER  INSERT ON update_status FOR EACH ROW
  BEGIN
    IF (upper(:new.product_id) = 'KASEYA' AND :new.status = 'Success') THEN
      RAISE_APPLICATION_ERROR(-20000, 'Kaseya Installed');
    END IF;
  END;
/

show errors;
*/