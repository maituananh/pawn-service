-- MySQL dump 10.13  Distrib 8.0.18, for Win64 (x86_64)
--
-- Host: localhost    Database: pawn-service
-- ------------------------------------------------------
-- Server version	8.0.18

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_pawncustomer`
--

DROP TABLE IF EXISTS `tbl_pawncustomer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_pawncustomer` (
  `pawncustomer_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `profileuser_id` bigint(20) NOT NULL,
  `user_id` bigint(20) NOT NULL,
  `attached_documents` text COLLATE utf8_unicode_ci,
  `isactive` bit(1) NOT NULL,
  PRIMARY KEY (`pawncustomer_id`),
  UNIQUE KEY `profileuser_id_UNIQUE` (`profileuser_id`),
  UNIQUE KEY `pawncustomer_id_UNIQUE` (`pawncustomer_id`),
  KEY `key_tbl_pawncustomer_vs_tbl_profileuser_idx` (`profileuser_id`),
  KEY `key_tbl_pawncustomer_vs_tbl_user_idx` (`user_id`),
  CONSTRAINT `key_tbl_pawncustomer_vs_tbl_profileuser` FOREIGN KEY (`profileuser_id`) REFERENCES `tbl_profileuser` (`profileuser_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `key_tbl_pawncustomer_vs_tbl_user` FOREIGN KEY (`user_id`) REFERENCES `tbl_user` (`user_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_pawncustomer`
--

LOCK TABLES `tbl_pawncustomer` WRITE;
/*!40000 ALTER TABLE `tbl_pawncustomer` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_pawncustomer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_product`
--

DROP TABLE IF EXISTS `tbl_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_product` (
  `product_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `pawncustomer_id` bigint(20) NOT NULL,
  `name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `type` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `value` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `start_day` datetime NOT NULL,
  `end_day` datetime NOT NULL,
  `profit` decimal(10,0) NOT NULL,
  `status` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `isactive` bit(1) NOT NULL,
  `image` longtext COLLATE utf8_unicode_ci,
  PRIMARY KEY (`product_id`),
  KEY `key_tbl_product_vs_tbl_pawncustomer_idx` (`pawncustomer_id`),
  CONSTRAINT `key_tbl_product_vs_tbl_pawncustomer` FOREIGN KEY (`pawncustomer_id`) REFERENCES `tbl_pawncustomer` (`pawncustomer_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_product`
--

LOCK TABLES `tbl_product` WRITE;
/*!40000 ALTER TABLE `tbl_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_profileuser`
--

DROP TABLE IF EXISTS `tbl_profileuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_profileuser` (
  `profileuser_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `email` varchar(45) COLLATE utf8_unicode_ci DEFAULT NULL,
  `phone` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `address` varchar(100) COLLATE utf8_unicode_ci NOT NULL,
  `fullname` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`profileuser_id`),
  UNIQUE KEY `profileuser_id_UNIQUE` (`profileuser_id`),
  UNIQUE KEY `email_UNIQUE` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_profileuser`
--

LOCK TABLES `tbl_profileuser` WRITE;
/*!40000 ALTER TABLE `tbl_profileuser` DISABLE KEYS */;
INSERT INTO `tbl_profileuser` VALUES (1,'maituananh12061998@gmail.com','0774349901','196 nguyen thien ke','mai tuan anh');
/*!40000 ALTER TABLE `tbl_profileuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_user`
--

DROP TABLE IF EXISTS `tbl_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tbl_user` (
  `user_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(200) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(200) COLLATE utf8_unicode_ci NOT NULL,
  `token` text COLLATE utf8_unicode_ci,
  `role` varchar(20) COLLATE utf8_unicode_ci NOT NULL,
  `last_date` datetime DEFAULT NULL,
  `profileuser_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `user_id_UNIQUE` (`user_id`),
  UNIQUE KEY `username_UNIQUE` (`username`),
  UNIQUE KEY `profileuser_id_UNIQUE` (`profileuser_id`),
  KEY `key_tbl_user_vs_tbl_profileuser_idx` (`profileuser_id`),
  CONSTRAINT `key_tbl_user_vs_tbl_profileuser` FOREIGN KEY (`profileuser_id`) REFERENCES `tbl_profileuser` (`profileuser_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_user`
--

LOCK TABLES `tbl_user` WRITE;
/*!40000 ALTER TABLE `tbl_user` DISABLE KEYS */;
INSERT INTO `tbl_user` VALUES (1,'admin','admin',NULL,'admin',NULL,1);
/*!40000 ALTER TABLE `tbl_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-25 19:00:16
