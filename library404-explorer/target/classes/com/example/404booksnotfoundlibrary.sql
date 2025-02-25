CREATE DATABASE  IF NOT EXISTS `404booksnotfoundlibrary` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `404booksnotfoundlibrary`;
-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: 404booksnotfoundlibrary
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(255) NOT NULL,
  `author` varchar(255) NOT NULL,
  `publication_year` int NOT NULL,
  `genre` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
INSERT INTO `book` VALUES (1,'The Hitchhiker\'s Guide to the Galaxy','Douglas Adams',1979,'Science Fiction'),(2,'1984','George Orwell',1949,'Dystopian'),(3,'Pride and Prejudice','Jane Austen',1813,'Romance'),(4,'To Kill a Mockingbird','Harper Lee',1960,'Fiction'),(5,'Brave New World','Aldous Huxley',1932,'Dystopian'),(6,'The Great Gatsby','F. Scott Fitzgerald',1925,'Fiction'),(7,'Moby-Dick','Herman Melville',1851,'Adventure'),(8,'War and Peace','Leo Tolstoy',1869,'Historical Fiction'),(9,'The Catcher in the Rye','J.D. Salinger',1951,'Fiction'),(10,'The Fellowship of the Ring','J.R.R. Tolkien',1954,'Fantasy'),(11,'The Two Towers','J.R.R. Tolkien',1954,'Fantasy'),(12,'The Return of the King','J.R.R. Tolkien',1955,'Fantasy'),(13,'Frankenstein','Mary Shelley',1818,'Gothic Fiction'),(14,'Dracula','Bram Stoker',1897,'Horror'),(15,'The Picture of Dorian Gray','Oscar Wilde',1890,'Philosophical Fiction'),(16,'Crime and Punishment','Fyodor Dostoevsky',1866,'Psychological Fiction'),(17,'The Brothers Karamazov','Fyodor Dostoevsky',1880,'Philosophical Fiction'),(18,'Anna Karenina','Leo Tolstoy',1878,'Romance'),(19,'One Hundred Years of Solitude','Gabriel García Márquez',1967,'Magical Realism'),(20,'Don Quixote','Miguel de Cervantes',1605,'Adventure');
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-09-27 12:24:09
