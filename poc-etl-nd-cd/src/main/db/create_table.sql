-- MySQL dump 10.13  Distrib 5.7.12, for osx10.10 (x86_64)
--
-- Host: gds-snc1-latam-uat-rw-vip.snc1    Database: clandescuento
-- ------------------------------------------------------
-- Server version	5.6.20-68.0-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


-- ****** ONLY FOR TESTING PURPOSES ********

DROP TABLE IF EXISTS `deal_dummy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deal_dummy` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `date` varchar(255) DEFAULT NULL,
  `brand_id` varchar(255) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `type2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=81 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

-----------------------

-- MySQL dump 10.13  Distrib 5.7.12, for osx10.10 (x86_64)
--
-- Host: gds-snc1-latam-uat-rw-vip.snc1    Database: clandescuento
-- ------------------------------------------------------
-- Server version   5.6.20-68.0-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;


DROP TABLE IF EXISTS `users_billing_history`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users_billing_history` (
  `ubh_id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `ubh_created` varchar(255) DEFAULT NULL,
  `ubh_user_id` varchar(255) DEFAULT NULL,
  `ubh_payment_provider_id` varchar(255) DEFAULT NULL,
  `ubh_chargeback_reason` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ubh_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;



--------------

Postgres1:


CREATE TABLE users_billing_history_dummy (
    ubh_id bigint NOT NULL,
    ubh_created text,
    ubh_user_id text,
    ubh_payment_provider_id text,
    ubh_chargeback_reason text
);



Postgres2:


CREATE TABLE users_billing_history_dummy (
    ubh_id bigint NOT NULL,
    ubh_created timestamp without time zone DEFAULT now() NOT NULL,
    ubh_user_id integer,
    ubh_payment_provider_id smallint NOT NULL,
    ubh_chargeback_reason text
);




----------------


/*
-- Query: SELECT * FROM mydb01.deal_dummy
LIMIT 0, 1000

-- Date: 2016-05-23 16:40
*/
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (81,'Date','Impressions','Clicks','Earning');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (82,'6/1/13','139,237','37','227.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (83,'6/2/13','149,582','55','234.71');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (84,'6/3/13','457,425','132','211.48');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (85,'6/4/13','466,870','141','298.40');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (86,'6/5/13','472,385','194','281.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (87,'6/6/13','438,653','153','273.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (88,'6/7/13','423,614','155','283.66');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (89,'6/8/13','112,449','62','223.89');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (90,'6/9/13','126,651','50','297.97');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (91,'6/10/13','453,405','135','291.16');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (92,'6/11/13','461,418','140','209.42');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (93,'6/12/13','436,383','135','258.28');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (94,'6/13/13','424,476','143','242.72');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (95,'6/14/13','314,817','103','283.95');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (96,'6/15/13','120,120','50','278.57');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (97,'6/16/13','138,803','46','196.92');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (98,'6/17/13','448,633','108','287.78');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (99,'6/18/13','436,350','135','197.08');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (100,'6/19/13','418,489','149','213.00');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (101,'6/20/13','323,947','121','212.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (102,'6/21/13','323,037','88','237.25');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (103,'6/22/13','138,339','55','141.93');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (104,'6/23/13','143,570','60','153.19');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (105,'6/24/13','328,277','145','217.84');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (106,'6/25/13','426,393','142','198.54');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (107,'6/26/13','496,995','160','155.20');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (108,'Date','Impressions','Clicks','Earning');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (109,'6/1/13','139,237','37','227.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (110,'6/2/13','149,582','55','234.71');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (111,'6/3/13','457,425','132','211.48');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (112,'6/4/13','466,870','141','298.40');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (113,'6/5/13','472,385','194','281.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (114,'6/6/13','438,653','153','273.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (115,'6/7/13','423,614','155','283.66');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (116,'6/8/13','112,449','62','223.89');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (117,'6/9/13','126,651','50','297.97');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (118,'6/10/13','453,405','135','291.16');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (119,'6/11/13','461,418','140','209.42');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (120,'6/12/13','436,383','135','258.28');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (121,'6/13/13','424,476','143','242.72');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (122,'6/14/13','314,817','103','283.95');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (123,'6/15/13','120,120','50','278.57');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (124,'6/16/13','138,803','46','196.92');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (125,'6/17/13','448,633','108','287.78');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (126,'6/18/13','436,350','135','197.08');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (127,'6/19/13','418,489','149','213.00');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (128,'6/20/13','323,947','121','212.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (129,'6/21/13','323,037','88','237.25');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (130,'6/22/13','138,339','55','141.93');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (131,'6/23/13','143,570','60','153.19');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (132,'6/24/13','328,277','145','217.84');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (133,'6/25/13','426,393','142','198.54');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (134,'6/26/13','496,995','160','155.20');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (135,'Date','Impressions','Clicks','Earning');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (136,'6/1/13','139,237','37','227.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (137,'6/2/13','149,582','55','234.71');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (138,'6/3/13','457,425','132','211.48');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (139,'6/4/13','466,870','141','298.40');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (140,'6/5/13','472,385','194','281.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (141,'6/6/13','438,653','153','273.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (142,'6/7/13','423,614','155','283.66');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (143,'6/8/13','112,449','62','223.89');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (144,'6/9/13','126,651','50','297.97');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (145,'6/10/13','453,405','135','291.16');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (146,'6/11/13','461,418','140','209.42');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (147,'6/12/13','436,383','135','258.28');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (148,'6/13/13','424,476','143','242.72');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (149,'6/14/13','314,817','103','283.95');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (150,'6/15/13','120,120','50','278.57');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (151,'6/16/13','138,803','46','196.92');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (152,'6/17/13','448,633','108','287.78');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (153,'6/18/13','436,350','135','197.08');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (154,'6/19/13','418,489','149','213.00');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (155,'6/20/13','323,947','121','212.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (156,'6/21/13','323,037','88','237.25');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (157,'6/22/13','138,339','55','141.93');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (158,'6/23/13','143,570','60','153.19');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (159,'6/24/13','328,277','145','217.84');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (160,'6/25/13','426,393','142','198.54');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (161,'6/26/13','496,995','160','155.20');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (162,'Date','Impressions','Clicks','Earning');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (163,'6/1/13','139,237','37','227.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (164,'6/2/13','149,582','55','234.71');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (165,'6/3/13','457,425','132','211.48');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (166,'6/4/13','466,870','141','298.40');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (167,'6/5/13','472,385','194','281.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (168,'6/6/13','438,653','153','273.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (169,'6/7/13','423,614','155','283.66');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (170,'6/8/13','112,449','62','223.89');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (171,'6/9/13','126,651','50','297.97');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (172,'6/10/13','453,405','135','291.16');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (173,'6/11/13','461,418','140','209.42');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (174,'6/12/13','436,383','135','258.28');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (175,'6/13/13','424,476','143','242.72');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (176,'6/14/13','314,817','103','283.95');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (177,'6/15/13','120,120','50','278.57');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (178,'6/16/13','138,803','46','196.92');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (179,'6/17/13','448,633','108','287.78');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (180,'6/18/13','436,350','135','197.08');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (181,'6/19/13','418,489','149','213.00');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (182,'6/20/13','323,947','121','212.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (183,'6/21/13','323,037','88','237.25');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (184,'6/22/13','138,339','55','141.93');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (185,'6/23/13','143,570','60','153.19');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (186,'6/24/13','328,277','145','217.84');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (187,'6/25/13','426,393','142','198.54');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (188,'6/26/13','496,995','160','155.20');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (189,'Date','Impressions','Clicks','Earning');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (190,'6/1/13','139,237','37','227.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (191,'6/2/13','149,582','55','234.71');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (192,'6/3/13','457,425','132','211.48');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (193,'6/4/13','466,870','141','298.40');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (194,'6/5/13','472,385','194','281.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (195,'6/6/13','438,653','153','273.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (196,'6/7/13','423,614','155','283.66');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (197,'6/8/13','112,449','62','223.89');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (198,'6/9/13','126,651','50','297.97');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (199,'6/10/13','453,405','135','291.16');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (200,'6/11/13','461,418','140','209.42');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (201,'6/12/13','436,383','135','258.28');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (202,'6/13/13','424,476','143','242.72');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (203,'6/14/13','314,817','103','283.95');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (204,'6/15/13','120,120','50','278.57');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (205,'6/16/13','138,803','46','196.92');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (206,'6/17/13','448,633','108','287.78');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (207,'6/18/13','436,350','135','197.08');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (208,'6/19/13','418,489','149','213.00');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (209,'6/20/13','323,947','121','212.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (210,'6/21/13','323,037','88','237.25');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (211,'6/22/13','138,339','55','141.93');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (212,'6/23/13','143,570','60','153.19');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (213,'6/24/13','328,277','145','217.84');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (214,'6/25/13','426,393','142','198.54');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (215,'6/26/13','496,995','160','155.20');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (216,'Date','Impressions','Clicks','Earning');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (217,'6/1/13','139,237','37','227.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (218,'6/2/13','149,582','55','234.71');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (219,'6/3/13','457,425','132','211.48');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (220,'6/4/13','466,870','141','298.40');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (221,'6/5/13','472,385','194','281.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (222,'6/6/13','438,653','153','273.21');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (223,'6/7/13','423,614','155','283.66');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (224,'6/8/13','112,449','62','223.89');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (225,'6/9/13','126,651','50','297.97');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (226,'6/10/13','453,405','135','291.16');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (227,'6/11/13','461,418','140','209.42');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (228,'6/12/13','436,383','135','258.28');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (229,'6/13/13','424,476','143','242.72');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (230,'6/14/13','314,817','103','283.95');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (231,'6/15/13','120,120','50','278.57');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (232,'6/16/13','138,803','46','196.92');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (233,'6/17/13','448,633','108','287.78');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (234,'6/18/13','436,350','135','197.08');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (235,'6/19/13','418,489','149','213.00');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (236,'6/20/13','323,947','121','212.35');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (237,'6/21/13','323,037','88','237.25');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (238,'6/22/13','138,339','55','141.93');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (239,'6/23/13','143,570','60','153.19');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (240,'6/24/13','328,277','145','217.84');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (241,'6/25/13','426,393','142','198.54');
INSERT INTO `deal_dummy` (`id`,`date`,`brand_id`,`status`,`type2`) VALUES (242,'6/26/13','496,995','160','155.20');







