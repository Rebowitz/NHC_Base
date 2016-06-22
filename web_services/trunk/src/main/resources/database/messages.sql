-- phpMyAdmin SQL Dump
-- version 2.10.0.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Oct 22, 2007 at 01:01 PM
-- Server version: 5.0.22
-- PHP Version: 5.1.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";

--
-- Database: `vive_db`
--

-- --------------------------------------------------------

--
-- Table structure for table `messages`
--

CREATE TABLE `messages` (
  `MessageID` double NOT NULL,
  `Type` enum('Alert','News','Dunning','Terminate','Private','PrivateAlert','Stolen','Test') NOT NULL,
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
  `cpu_serial_no` varchar(40) collate latin1_general_ci NOT NULL,
  `group_name` varchar(255) default NULL,
  PRIMARY KEY  (`message_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `messages`
--

