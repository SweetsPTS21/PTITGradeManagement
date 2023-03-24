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
-- Table structure for table `ket_qua`
--

DROP TABLE IF EXISTS `ket_qua`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ket_qua` (
  `id` int NOT NULL AUTO_INCREMENT,
  `diem` float NOT NULL,
  `ghi_chu` varchar(255) DEFAULT NULL,
  `id_dangKiHoc` int DEFAULT NULL,
  `id_monHocDauDiem` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `id_dangKiHoc` (`id_dangKiHoc`),
  KEY `id_monHocDauDiem` (`id_monHocDauDiem`),
  CONSTRAINT `ket_qua_ibfk_1` FOREIGN KEY (`id_dangKiHoc`) REFERENCES `dang_ki_hoc` (`id`),
  CONSTRAINT `ket_qua_ibfk_2` FOREIGN KEY (`id_monHocDauDiem`) REFERENCES `monhoc_daudiem` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ket_qua`
--

LOCK TABLES `ket_qua` WRITE;
/*!40000 ALTER TABLE `ket_qua` DISABLE KEYS */;
INSERT INTO `ket_qua` VALUES (1,10,NULL,1,1),(2,9,NULL,1,2),(3,0,NULL,1,3),(4,5,NULL,1,4),(5,7,NULL,1,5);
/*!40000 ALTER TABLE `ket_qua` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-03-22 20:37:38
