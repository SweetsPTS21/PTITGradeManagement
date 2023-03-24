-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: quanlydiem
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `monhoc_daudiem`
--

DROP TABLE IF EXISTS `monhoc_daudiem`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `monhoc_daudiem` (
  `id` int NOT NULL AUTO_INCREMENT,
  `id_monhoc` varchar(255) DEFAULT NULL,
  `id_daudiem` int DEFAULT NULL,
  `tile_phantram` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_monhoc` (`id_monhoc`),
  KEY `id_daudiem` (`id_daudiem`),
  CONSTRAINT `monhoc_daudiem_ibfk_1` FOREIGN KEY (`id_monhoc`) REFERENCES `mon_hoc` (`id`),
  CONSTRAINT `monhoc_daudiem_ibfk_2` FOREIGN KEY (`id_daudiem`) REFERENCES `dau_diem` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `monhoc_daudiem`
--

LOCK TABLES `monhoc_daudiem` WRITE;
/*!40000 ALTER TABLE `monhoc_daudiem` DISABLE KEYS */;
INSERT INTO `monhoc_daudiem` VALUES (1,'BAS1201',1,10),(2,'BAS1201',2,10),(3,'BAS1201',3,0),(4,'BAS1201',4,10),(5,'BAS1201',5,70),(6,'INT1154',1,10),(7,'INT1154',2,10),(8,'INT1154',3,0),(9,'INT1154',4,10),(10,'INT1154',5,70),(11,'BAS1203',1,10),(12,'BAS1203',2,10),(13,'BAS1203',3,0),(14,'BAS1203',4,10),(15,'BAS1203',5,70),(16,'BAS1150',1,10),(17,'BAS1150',2,20),(18,'BAS1150',3,0),(19,'BAS1150',4,0),(20,'BAS1150',5,70);
/*!40000 ALTER TABLE `monhoc_daudiem` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-22 20:37:39
