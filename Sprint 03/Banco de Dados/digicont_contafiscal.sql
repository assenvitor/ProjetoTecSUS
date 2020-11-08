-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: digicont
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `contafiscal`
--

DROP TABLE IF EXISTS `contafiscal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contafiscal` (
  `ContaLuzCFOP` int NOT NULL,
  `ContaLuzFiscalGrupo` int NOT NULL,
  `ContaLuzFiscalSubGrupo` int NOT NULL,
  `ContaLuzFiscalClasse` varchar(45) NOT NULL,
  `ContaLuzFiscalSubClasse` varchar(45) NOT NULL,
  `ContaLuzFiscalJurosMora` double NOT NULL,
  `ContaLuzFiscalMulta` double NOT NULL,
  `ContaLuzFiscalTarifaAplicada` double NOT NULL,
  `ContaLuzFiscalBaseICMS` double NOT NULL,
  `ContaLuzFiscalAliquotaIMCS` double NOT NULL,
  `ContaLuzFiscalValorICMS` double NOT NULL,
  `ContaLuzFiscalBasePisCofins` double NOT NULL,
  `ContaLuzFiscalAliquotaPis` double NOT NULL,
  `ContaLuzFiscalValorPis` double NOT NULL,
  `ContaLuzFiscalAliquotaCofins` double NOT NULL,
  `ContaLuzFiscalValorCofins` int NOT NULL,
  `ContaLuzFiscalTipoFornecimento` varchar(45) NOT NULL,
  `ContaLuzFiscalModalidadeTarifaria` varchar(45) NOT NULL,
  `ContaLuzFiscalNumeroMedidor` int NOT NULL,
  `ContaLuzFiscalNumeroInstalacao` int NOT NULL,
  PRIMARY KEY (`ContaLuzCFOP`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contafiscal`
--

LOCK TABLES `contafiscal` WRITE;
/*!40000 ALTER TABLE `contafiscal` DISABLE KEYS */;
/*!40000 ALTER TABLE `contafiscal` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-11-08  0:07:38
