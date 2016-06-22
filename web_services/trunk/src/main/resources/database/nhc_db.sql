-- phpMyAdmin SQL Dump
-- version 2.10.0.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Oct 30, 2007 at 11:01 AM
-- Server version: 5.0.37
-- PHP Version: 5.2.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

-- 
-- Database: `nhc_db`
-- 


--
-- Table structure for table `server_runtime_config`
--

CREATE TABLE `server_runtime_config` (
  `config_id` bigint(20) NOT NULL auto_increment,
  `config_key` varchar(80) collate latin1_general_ci NOT NULL,
  `config_value` varchar(40) collate latin1_general_ci NOT NULL,
  PRIMARY KEY  (`config_key`),
  KEY `config_id` (`config_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=110;

--
-- Dumping data for table `server_runtime_config`
--

INSERT INTO `server_runtime_config` (`config_id`, `config_key`, `config_value`) VALUES
(101, 'heartbeat.rate.seconds', '2'),
(102, 'online.expiration.monitor.period.factor', '2.9'),
(103, 'online.expiration.period.factor', '2.1'),
(104, 'upload.session.monitor.period.factor', '4.0'),
(105, 'upload.session.expiration.period.factor', '5.0'),
(106, 'agents.send.result.files.period', '1'),
(107, 'agents.send.monitor.os.files.period', '1'),
(108, 'agents.send.monitor.hardware.files.period', '1'),
(109, 'agents.send.monitor.software.files.period', '1');

-- --------------------------------------------------------


-- --------------------------------------------------------

-- 
-- Table structure for table `machines`
-- 

CREATE TABLE `machines` (
  `machine_id` bigint(20) NOT NULL auto_increment,
  `customer_id` bigint(20) NOT NULL,
  `vive_id` varchar(99) collate latin1_general_ci NOT NULL,
  `cpu_serial_no` varchar(40) collate latin1_general_ci NOT NULL,
  `key_data` varchar(32) collate latin1_general_ci NOT NULL,
  `key_timestamp` bigint(20) NOT NULL,
  `stolen_flag` tinyint(4) default '0',
  `terminate_flag` tinyint(4) default '0',
  `registered_flag` tinyint(4) default '0',
  PRIMARY KEY  (`machine_id`),
  UNIQUE KEY `cpu_serial_no` (`cpu_serial_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_general_ci AUTO_INCREMENT=10 ;

-- 
-- Dumping data for table `machines`
-- 

INSERT INTO `machines` (`machine_id`, `customer_id`, `vive_id`, `cpu_serial_no`, `key_data`, `key_timestamp`, `stolen_flag`, `terminate_flag`, `registered_flag`) VALUES 
(3, 0, '2', '7777777', 'e120035d-edb8-4a12-acee-dd3ef5b2', 1193353232742, 0, 0, 0),
(4, 0, '2', '1193353699064', 'af336db4-92f6-41b7-ab98-92d0ef35', 1193353699111, 0, 0, 0),
(5, 0, '2', '1193354142916', '866f9837-a94e-4eea-b9e8-a11a79ea', 1193354713430, 0, 0, 0),
(6, 0, '2', '333333', 'fb8eb8a2-0429-48ff-8d8c-ff260087', 1193354923546, 0, 0, 0),
(7, 0, '2', '342342', '321bc624-6869-4592-a8fb-743ae0da', 1193355693251, 0, 0, 0),
(8, 0, '2', '328742290348', '3c17e313-6f36-4222-8982-40760bdb', 1193356103127, 0, 0, 0),
(9, 0, '2', '32874545652290', '5475e6ea-b0f4-46d7-8953-c7709b5e', 1193356205358, 0, 0, 0);

-- --------------------------------------------------------


--
-- Table structure for table `messages`
--

CREATE TABLE `messages` (
  `message_id` bigint(20) NOT NULL auto_increment,
  `Type` enum('Alert','News','Dunning','Terminate','Private','PrivateAlert','Stolen','Backup','AV','Software','DriveConnection','Hardware','General','Partner','Marketing','Advertising','Other','Test') NOT NULL,
  `start_time` datetime NOT NULL,
  `end_time` datetime NOT NULL,
  `mod_time` datetime NOT NULL,
  `title` varchar(64) NOT NULL,
  `content` varchar(255) NOT NULL,
  `summary` varchar(255) NOT NULL,
  `priority` enum('High','Normal') NOT NULL,
  `popup_duration` int(11) NOT NULL,
  `click_destination_url` varchar(255) NOT NULL,
  `destination` enum('Member','Group','All') NOT NULL,
  `group_name` varchar(255) default NULL,
  `vive_id` varchar(99) collate latin1_general_ci NOT NULL,

  PRIMARY KEY  (`message_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;


-- --------------------------------------------------------

-- 
-- Table structure for table `ws_sessions`
-- 

CREATE TABLE `ws_sessions` (
  `ws_session_id` bigint(20) NOT NULL auto_increment,
  `app_name` varchar(40) character set latin1 collate latin1_general_ci NOT NULL,
  `session_id` varchar(255) NOT NULL,
  `machine_id` bigint(20) NOT NULL,
  `time_stamp` datetime NOT NULL,
  PRIMARY KEY  (`ws_session_id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=22 ;

-- 
-- Dumping data for table `ws_sessions`
-- 

INSERT INTO `ws_sessions` (`ws_session_id`, `app_name`, `session_id`, `machine_id`, `time_stamp`) VALUES 
(21, '', 'ab6ec810-b573-4a97-8aa4-ed7ee6707550', 0, '2007-10-25 19:50:05'),
(20, '', '7e6d4dcf-3da7-47f1-b38f-3e749bd2524a', 0, '2007-10-25 19:48:23'),
(19, '', '49efe822-4e4e-4691-a039-622a9ff250be', 0, '2007-10-25 19:41:33'),
(18, '', '329cf801-4fec-4cd7-b85c-f1d5930364c3', 0, '2007-10-25 19:28:07'),
(17, '', '8857d48e-0fa8-41f5-99cb-bdc1927a9fe8', 0, '2007-10-25 19:15:45'),
(16, '', 'b80b15f2-13a9-4a16-b15a-ffb4181f9107', 0, '2007-10-25 19:08:19'),
(15, '', '5c78fa32-8f29-4ef5-bdc5-495b3d0ed6a4', 0, '2007-10-25 18:41:14');

-- --------------------------------------------------------


--
-- Table structure for table `installed_software`
--

CREATE TABLE IF NOT EXISTS `installed_software` (
  `software_id` bigint(20) NOT NULL auto_increment,
  `session_id` varchar(255) NOT NULL,
  `machine_id` bigint(20) NOT NULL,
  `product_key` varchar(255) NOT NULL,
  `product_name` varchar(255),
  `company_name` varchar(255),
  `product_version` varchar(255),
  PRIMARY KEY  (`software_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

--
-- Dumping data for table `installed_software`
--





-- 
-- Table structure for table `customers`
-- 

CREATE TABLE `customers` (
  `customers_id` int(11) NOT NULL auto_increment,
  `customers_gender` char(1) NOT NULL default '',
  `customers_firstname` varchar(32) NOT NULL default '',
  `customers_lastname` varchar(32) NOT NULL default '',
  `customers_dob` datetime NOT NULL default '0001-01-01 00:00:00',
  `customers_email_address` varchar(96) NOT NULL default '',
  `customers_nick` varchar(96) NOT NULL default '',
  `customers_default_address_id` int(11) NOT NULL default '0',
  `customers_telephone` varchar(32) NOT NULL default '',
  `customers_fax` varchar(32) default NULL,
  `customers_password` varchar(40) NOT NULL default '',
  `customers_newsletter` char(1) default NULL,
  `customers_group_pricing` int(11) NOT NULL default '0',
  `customers_email_format` varchar(4) NOT NULL default 'TEXT',
  `customers_authorization` int(1) NOT NULL default '0',
  `customers_referral` varchar(32) NOT NULL default '',
  `customers_paypal_payerid` varchar(20) NOT NULL default '',
  `customers_paypal_ec` tinyint(1) unsigned NOT NULL default '0',
  PRIMARY KEY  (`customers_id`),
  KEY `idx_email_address_zen` (`customers_email_address`),
  KEY `idx_referral_zen` (`customers_referral`(10)),
  KEY `idx_grp_pricing_zen` (`customers_group_pricing`),
  KEY `idx_nick_zen` (`customers_nick`),
  KEY `idx_newsletter_zen` (`customers_newsletter`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

-- 
-- Dumping data for table `zen_customers`
-- 

INSERT INTO `customers` (`customers_id`, `customers_gender`, `customers_firstname`, `customers_lastname`, `customers_dob`, `customers_email_address`, `customers_nick`, `customers_default_address_id`, `customers_telephone`, `customers_fax`, `customers_password`, `customers_newsletter`, `customers_group_pricing`, `customers_email_format`, `customers_authorization`, `customers_referral`, `customers_paypal_payerid`, `customers_paypal_ec`) VALUES 
(1, 'm', 'Bill', 'Smith', '2001-01-01 00:00:00', 'root@localhost', '', 1, '12345', '', 'd95e8fa7f20a009372eb3477473fcd34:1c', '0', 0, 'TEXT', 0, '', '', 0),
(2, 'm', 'Tim', 'Rea', '1962-04-26 00:00:00', 'timreaemailaddresshere', '', 2, '123-123-1234', '', 'b983872d0f0dcb5d88e7616f8a83d4a9:d0', '0', 0, 'HTML', 0, '', '', 0);

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `orders_id` int(11) NOT NULL auto_increment,
  `customers_id` int(11) NOT NULL default '0',
  `customers_name` varchar(64) NOT NULL default '',
  `customers_company` varchar(32) default NULL,
  `customers_street_address` varchar(64) NOT NULL default '',
  `customers_suburb` varchar(32) default NULL,
  `customers_city` varchar(32) NOT NULL default '',
  `customers_postcode` varchar(10) NOT NULL default '',
  `customers_state` varchar(32) default NULL,
  `customers_country` varchar(32) NOT NULL default '',
  `customers_telephone` varchar(32) NOT NULL default '',
  `customers_email_address` varchar(96) NOT NULL default '',
  `customers_address_format_id` int(5) NOT NULL default '0',
  `delivery_name` varchar(64) NOT NULL default '',
  `delivery_company` varchar(32) default NULL,
  `delivery_street_address` varchar(64) NOT NULL default '',
  `delivery_suburb` varchar(32) default NULL,
  `delivery_city` varchar(32) NOT NULL default '',
  `delivery_postcode` varchar(10) NOT NULL default '',
  `delivery_state` varchar(32) default NULL,
  `delivery_country` varchar(32) NOT NULL default '',
  `delivery_address_format_id` int(5) NOT NULL default '0',
  `billing_name` varchar(64) NOT NULL default '',
  `billing_company` varchar(32) default NULL,
  `billing_street_address` varchar(64) NOT NULL default '',
  `billing_suburb` varchar(32) default NULL,
  `billing_city` varchar(32) NOT NULL default '',
  `billing_postcode` varchar(10) NOT NULL default '',
  `billing_state` varchar(32) default NULL,
  `billing_country` varchar(32) NOT NULL default '',
  `billing_address_format_id` int(5) NOT NULL default '0',
  `payment_method` varchar(128) NOT NULL default '',
  `payment_module_code` varchar(32) NOT NULL default '',
  `shipping_method` varchar(128) NOT NULL default '',
  `shipping_module_code` varchar(32) NOT NULL default '',
  `coupon_code` varchar(32) NOT NULL default '',
  `cc_type` varchar(20) default NULL,
  `cc_owner` varchar(64) default NULL,
  `cc_number` varchar(32) default NULL,
  `cc_expires` varchar(4) default NULL,
  `cc_cvv` blob,
  `last_modified` datetime default NULL,
  `date_purchased` datetime default NULL,
  `orders_status` int(5) NOT NULL default '0',
  `orders_date_finished` datetime default NULL,
  `currency` char(3) default NULL,
  `currency_value` decimal(14,6) default NULL,
  `order_total` decimal(14,2) default NULL,
  `order_tax` decimal(14,2) default NULL,
  `paypal_ipn_id` int(11) NOT NULL default '0',
  `ip_address` varchar(96) NOT NULL default '',
  PRIMARY KEY  (`orders_id`),
  KEY `idx_status_orders_cust_zen` (`orders_status`,`orders_id`,`customers_id`),
  KEY `idx_date_purchased_zen` (`date_purchased`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--


/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
LOCK TABLES `orders` WRITE;
INSERT INTO `orders` VALUES (1,1,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States','540-822-3946','steve@pcthree.com',2,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States',2,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States',2,'Credit Card','cc','United Parcel Service (1 x 3.00lbs) (Ground)','ups','','Visa','Steve Monroe','4111XXXXXXXX1111','0110',NULL,NULL,'2007-10-03 11:03:45',1,NULL,'USD','1.000000','8.53','0.00',0,'172.16.0.38 - 172.16.0.38'),(2,1,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States','540-822-3946','steve@pcthree.com',2,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States',2,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States',2,'Credit Card','cc','United Parcel Service (1 x 10.00lbs) (Ground)','ups','','Visa','Steve Monroe','4111XXXXXXXX1111','0110',NULL,NULL,'2007-10-04 09:02:01',1,NULL,'USD','1.000000','1298.83','0.00',0,'172.16.0.38 - 172.16.0.38'),(3,2,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States','540-822-3946','steve@pcthree.com',2,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States',2,'Steve Monroe','','13185 Berlin Tpke','','Lovettsville','20180','Virginia','United States',2,'Credit Card','cc','United Parcel Service (1 x 3.00lbs) (Next Day Air)','ups','','Visa','Steve Monroe','4111XXXXXXXX1111','0109',NULL,NULL,'2007-10-24 09:34:51',1,NULL,'USD','1.000000','915.23','0.00',0,'172.16.0.38 - 172.16.0.38');
UNLOCK TABLES;
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;

--
-- Table structure for table `orders_products`
--

DROP TABLE IF EXISTS `orders_products`;
CREATE TABLE `orders_products` (
  `orders_products_id` int(11) NOT NULL auto_increment,
  `orders_id` int(11) NOT NULL default '0',
  `products_id` int(11) NOT NULL default '0',
  `products_model` varchar(32) default NULL,
  `products_name` varchar(64) NOT NULL default '',
  `products_price` decimal(15,4) NOT NULL default '0.0000',
  `final_price` decimal(15,4) NOT NULL default '0.0000',
  `products_tax` decimal(7,4) NOT NULL default '0.0000',
  `products_quantity` float NOT NULL default '0',
  `onetime_charges` decimal(15,4) NOT NULL default '0.0000',
  `products_priced_by_attribute` tinyint(1) NOT NULL default '0',
  `product_is_free` tinyint(1) NOT NULL default '0',
  `products_discount_type` tinyint(1) NOT NULL default '0',
  `products_discount_type_from` tinyint(1) NOT NULL default '0',
  `products_prid` tinytext NOT NULL,
  PRIMARY KEY  (`orders_products_id`),
  KEY `idx_orders_id_prod_id_zen` (`orders_id`,`products_id`)
) ENGINE=MyISAM AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders_products`
--


/*!40000 ALTER TABLE `orders_products` DISABLE KEYS */;
LOCK TABLES `orders_products` WRITE;
INSERT INTO `orders_products` VALUES (1,1,1,'','Used Twinkie','0.0100','0.0100','0.0000',1,'0.0000',0,0,0,0,'1'),(2,2,2,'vostronb_1000','Vostro 1000','489.0000','1289.0000','0.0000',1,'0.0000',0,0,0,0,'2:3f19f72f0aa7398a6c8819be6647e10c'),(3,3,2,'','Vostro 1000','489.0000','889.0000','0.0000',1,'0.0000',0,0,0,0,'2:e69cb0dec6e16778f4c83cdbac368f23'),(4,3,1,'','Used Twinkie','0.0100','0.0100','0.0000',1,'0.0000',0,0,0,0,'1');
UNLOCK TABLES;
/*!40000 ALTER TABLE `orders_products` ENABLE KEYS */;


