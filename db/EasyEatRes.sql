CREATE DATABASE  IF NOT EXISTS `easyeatres` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `easyeatres`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: easyeatres
-- ------------------------------------------------------
-- Server version	5.7.14-log

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

--
-- Table structure for table `business`
--

DROP TABLE IF EXISTS `business`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `business` (
  `BusinessID` varchar(15) NOT NULL,
  `BusiLogo` varchar(100) DEFAULT NULL,
  `BusiName` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `BusiDesc` varchar(100) DEFAULT NULL,
  `Address` varchar(100) DEFAULT NULL,
  `Phone` varchar(25) DEFAULT NULL,
  `Aptitude` varchar(100) DEFAULT NULL,
  `Circumstance` varchar(100) DEFAULT NULL,
  `EvaluLevel` varchar(10) DEFAULT NULL,
  `KeptTimes` varchar(10) DEFAULT NULL,
  `periodOfBusi` varchar(50) DEFAULT NULL,
  `IsOnBuss` varchar(5) DEFAULT NULL,
  `IsFull` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`BusinessID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `business`
--

LOCK TABLES `business` WRITE;
/*!40000 ALTER TABLE `business` DISABLE KEYS */;
/*!40000 ALTER TABLE `business` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collect`
--

DROP TABLE IF EXISTS `collect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collect` (
  `CusID` varchar(20) DEFAULT NULL,
  `BussinessID` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collect`
--

LOCK TABLES `collect` WRITE;
/*!40000 ALTER TABLE `collect` DISABLE KEYS */;
/*!40000 ALTER TABLE `collect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `CusID` varchar(20) NOT NULL,
  `CusPhoneNum` varchar(20) DEFAULT NULL,
  `CallCus` varchar(20) DEFAULT NULL,
  `CusGender` varchar(5) DEFAULT NULL,
  `CusName` varchar(20) DEFAULT NULL,
  `CusIcon` varchar(100) DEFAULT NULL,
  `CusPWD` varchar(20) DEFAULT NULL,
  `CusPWDforPay` varchar(6) DEFAULT NULL,
  PRIMARY KEY (`CusID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('123','15198132915','游','M','美的','/123/index.icon','123456','777777');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dishes`
--

DROP TABLE IF EXISTS `dishes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dishes` (
  `DishID` varchar(20) NOT NULL,
  `DishLogo` varchar(100) DEFAULT NULL,
  `DishName` varchar(50) DEFAULT NULL,
  `DishPrice` float DEFAULT NULL,
  `TimeToGetDone` varchar(10) DEFAULT NULL,
  `DishDesc` varchar(100) DEFAULT NULL,
  `SoldTimes` int(11) DEFAULT NULL,
  `TypeID` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`DishID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dishes`
--

LOCK TABLES `dishes` WRITE;
/*!40000 ALTER TABLE `dishes` DISABLE KEYS */;
/*!40000 ALTER TABLE `dishes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dishtype`
--

DROP TABLE IF EXISTS `dishtype`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dishtype` (
  `TypeId` varchar(20) NOT NULL,
  `TypeName` varchar(40) DEFAULT NULL,
  `BussinessID` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`TypeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dishtype`
--

LOCK TABLES `dishtype` WRITE;
/*!40000 ALTER TABLE `dishtype` DISABLE KEYS */;
/*!40000 ALTER TABLE `dishtype` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dishtypecontent`
--

DROP TABLE IF EXISTS `dishtypecontent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dishtypecontent` (
  `TypeID` varchar(20) DEFAULT NULL,
  `DishID` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dishtypecontent`
--

LOCK TABLES `dishtypecontent` WRITE;
/*!40000 ALTER TABLE `dishtypecontent` DISABLE KEYS */;
/*!40000 ALTER TABLE `dishtypecontent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evaluation`
--

DROP TABLE IF EXISTS `evaluation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `evaluation` (
  `EvaluID` varchar(20) NOT NULL,
  `EvaluTime` datetime DEFAULT NULL,
  `CusID` varchar(20) DEFAULT NULL,
  `Level` int(11) DEFAULT NULL,
  `EvaluDesc` varchar(100) DEFAULT NULL,
  `OrderID` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`EvaluID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evaluation`
--

LOCK TABLES `evaluation` WRITE;
/*!40000 ALTER TABLE `evaluation` DISABLE KEYS */;
/*!40000 ALTER TABLE `evaluation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favorsituation`
--

DROP TABLE IF EXISTS `favorsituation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `favorsituation` (
  `FavorID` varchar(20) NOT NULL,
  `Satisfy` int(11) DEFAULT NULL,
  `Minus` int(11) DEFAULT NULL,
  `BussinessID` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`FavorID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favorsituation`
--

LOCK TABLES `favorsituation` WRITE;
/*!40000 ALTER TABLE `favorsituation` DISABLE KEYS */;
/*!40000 ALTER TABLE `favorsituation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `income`
--

DROP TABLE IF EXISTS `income`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `income` (
  `Date` datetime DEFAULT NULL,
  `Income` varchar(20) DEFAULT NULL,
  `BussinessID` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `income`
--

LOCK TABLES `income` WRITE;
/*!40000 ALTER TABLE `income` DISABLE KEYS */;
/*!40000 ALTER TABLE `income` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order`
--

DROP TABLE IF EXISTS `order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `order` (
  `OrderID` varchar(15) NOT NULL,
  `Finished` varchar(10) DEFAULT NULL,
  `ReserveTime` varchar(20) DEFAULT NULL,
  `CustomNum` varchar(10) DEFAULT NULL,
  `OrderPrice` varchar(10) DEFAULT NULL,
  `DishReady` varchar(10) DEFAULT NULL,
  `CusPhoneNum` varchar(20) DEFAULT NULL,
  `CallCus` varchar(20) DEFAULT NULL,
  `CusGender` varchar(5) DEFAULT NULL,
  `CusID` varchar(20) DEFAULT NULL,
  `OrderTime` varchar(20) DEFAULT NULL,
  `PS` varchar(100) DEFAULT NULL,
  `BussinessID` varchar(20) DEFAULT NULL,
  `isPaid` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`OrderID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order`
--

LOCK TABLES `order` WRITE;
/*!40000 ALTER TABLE `order` DISABLE KEYS */;
/*!40000 ALTER TABLE `order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ordercontent`
--

DROP TABLE IF EXISTS `ordercontent`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ordercontent` (
  `OrderID` varchar(20) DEFAULT NULL,
  `DishID` varchar(20) DEFAULT NULL,
  `Count` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ordercontent`
--

LOCK TABLES `ordercontent` WRITE;
/*!40000 ALTER TABLE `ordercontent` DISABLE KEYS */;
/*!40000 ALTER TABLE `ordercontent` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'easyeatres'
--

--
-- Dumping routines for database 'easyeatres'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-03-18 15:59:35
