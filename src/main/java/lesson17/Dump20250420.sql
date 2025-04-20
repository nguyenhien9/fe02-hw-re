-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: ronin_test
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
-- Table structure for table `products`
--

DROP TABLE IF EXISTS `products`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `products` (
  `id` int NOT NULL AUTO_INCREMENT,
  `name` varchar(500) NOT NULL,
  `description` text,
  `price` decimal(18,3) NOT NULL,
  `stock` int DEFAULT NULL,
  `original_price` decimal(18,3) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=52 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `products`
--

LOCK TABLES `products` WRITE;
/*!40000 ALTER TABLE `products` DISABLE KEYS */;
INSERT INTO `products` VALUES (1,'Máy khoan Bosch GSB 550','Máy khoan động lực công suất 550W, khoan bê tông, thép',1250.500,30,1350.000,'Công cụ'),(2,'Cưa điện Makita UC4041A','Cưa điện 1800W lưỡi 40cm, tiện lợi cắt cây cối',2200.000,12,2500.000,'Thiết bị điện'),(3,'Máy cắt sắt Total TS92035516','Máy cắt sắt 2200W lưỡi 355mm',3100.000,5,3300.000,'Công cụ'),(4,'Máy vặn vít Dewalt DCF887D2','Máy pin 18V, tốc độ cao',4850.000,8,5000.000,'Công cụ'),(5,'Thước đo laser Bosch GLM 50C','Đo khoảng cách bằng laser, độ chính xác cao',3250.000,20,3400.000,'Phụ kiện'),(6,'Máy hàn điện tử Hồng Ký SR200R','Máy hàn que công suất 7.0 KVA',2450.000,10,2600.000,'Công cụ'),(7,'Cưa lọng Bosch GST 8000E','Cưa lọng 710W, tốc độ 3100 lần/phút',1900.000,15,2000.000,'Thiết bị điện'),(8,'Đèn pin sạc Comet CRT331','Đèn pin sạc đa năng',400.000,50,450.000,'Phụ kiện'),(9,'Máy hút bụi Electrolux Z123','Công suất 1800W, dung tích 1.5L',2100.000,7,2200.000,'Thiết bị điện'),(10,'Máy bơm nước Panasonic GP-129JXK','Máy bơm nước dân dụng 125W',1350.000,10,1400.000,'Công cụ'),(11,'Máy khoan Bosch GSB 650RE','Máy khoan động lực công suất 650W, khoan bê tông, thép',1450.000,25,1500.000,'Công cụ'),(12,'Máy cắt gạch Makita 4100KB','Máy cắt gạch 1400W, đường kính lưỡi 110mm',3000.000,10,3200.000,'Thiết bị điện'),(13,'Máy mài góc Dewalt DWE8200','Máy mài góc 900W, đường kính đĩa 125mm',1800.000,20,1900.000,'Công cụ'),(14,'Máy cưa đĩa Total TS20035516','Máy cưa đĩa 1600W, lưỡi 255mm',2800.000,8,3000.000,'Công cụ'),(15,'Máy phun sơn Bosch PFS 1000','Máy phun sơn công suất 1000W',3500.000,12,3800.000,'Thiết bị điện'),(16,'Máy đục bê tông Makita HM0810','Máy đục bê tông 800W, đầu đục 20mm',4200.000,7,4500.000,'Công cụ'),(17,'Máy bào Bosch GHO 6500','Máy bào điện 650W, bào gỗ, độ sâu cắt 2.6mm',1950.000,15,2100.000,'Công cụ'),(18,'Máy ép thủy lực Kocu HPS-200','Máy ép thủy lực 20T, thiết kế nhỏ gọn',5500.000,5,5800.000,'Công cụ'),(19,'Máy nén khí Total TDA7000','Máy nén khí 700W, dung tích bình 24L',3200.000,6,3400.000,'Thiết bị điện'),(20,'Máy hàn Mig Inverter Hồng Ký MIG 250A','Máy hàn Mig công suất 250A, hàn inox, thép',7200.000,4,7500.000,'Công cụ'),(21,'Máy phun thuốc trừ sâu Y-125','Máy phun thuốc 12L, công suất 300W',1000.000,30,1100.000,'Công cụ'),(22,'Máy khoan cầm tay Total TS3303507','Máy khoan cầm tay 350W, khoan gỗ, thép',550.000,40,600.000,'Công cụ'),(23,'Máy xịt rửa xe Karcher K3','Máy xịt rửa 1600W, áp suất 120 bar',2200.000,10,2400.000,'Thiết bị điện'),(24,'Máy rửa chén Electrolux ESF6010BW','Máy rửa chén 12 bộ, tiết kiệm năng lượng',8400.000,3,8800.000,'Thiết bị điện'),(25,'Máy hàn Mig Xytron MIG-200','Máy hàn Mig công suất 200A, hàn cho thép',5900.000,6,6200.000,'Công cụ'),(26,'Máy khoan bê tông Makita HR2470','Máy khoan bê tông 780W, khoan búa',3700.000,8,3900.000,'Công cụ'),(27,'Máy đánh bóng Bosch GPO 950','Máy đánh bóng 950W, dùng cho ô tô, xe máy',2400.000,12,2600.000,'Công cụ'),(28,'Máy hút bụi cầm tay Total THV-500','Máy hút bụi cầm tay 500W',850.000,20,900.000,'Phụ kiện'),(29,'Máy phun sơn Electrolux ESF1000','Máy phun sơn công suất 1000W, phun sơn bề mặt lớn',2500.000,15,2700.000,'Thiết bị điện'),(30,'Máy lọc nước RO Kangaroo KG10A3','Máy lọc nước RO công suất 10L/h',3700.000,7,3900.000,'Thiết bị điện'),(31,'Máy khoan búa Dewalt D25133K','Máy khoan búa 800W, khoan bê tông',5200.000,6,5500.000,'Công cụ'),(32,'Máy làm mát không khí Daikin MCK55TVM6','Máy làm mát không khí công suất 55W',3700.000,9,4000.000,'Thiết bị điện'),(33,'Máy sấy tóc Philips HP8108','Máy sấy tóc 1200W, 2 chế độ gió',650.000,40,700.000,'Phụ kiện'),(34,'Máy đầm cóc Hồng Ký HD-80','Máy đầm cóc công suất 6.5HP, dùng cho đất nền',9800.000,3,10200.000,'Công cụ'),(35,'Máy khoan vặn vít Dewalt DCD771C2','Máy khoan vặn vít pin 18V',3800.000,10,4000.000,'Công cụ'),(36,'Máy hút bụi công nghiệp Karcher WD 5','Máy hút bụi công nghiệp 1100W, dung tích 25L',4200.000,5,4500.000,'Thiết bị điện'),(37,'Máy nướng bánh mì Philips HD2582','Máy nướng bánh mì 700W, 7 mức độ nướng',850.000,25,900.000,'Phụ kiện'),(38,'Máy quét mã vạch Datalogic QuickScan QD2130','Máy quét mã vạch đơn tia',1800.000,20,2000.000,'Phụ kiện'),(39,'Máy tạo oxy Kangaroo KG10A','Máy tạo oxy công suất 10L/h',6200.000,3,6500.000,'Thiết bị điện'),(40,'Máy phun sơn Makita PFS 5000E','Máy phun sơn 5000W, áp lực cao',6000.000,8,6300.000,'Thiết bị điện'),(41,'Máy hàn que Hồng Ký HT-200','Máy hàn que công suất 200A',3300.000,10,3500.000,'Công cụ'),(42,'Máy khoan búa Makita HR2475','Máy khoan búa 790W, khoan bê tông',4700.000,7,5000.000,'Công cụ'),(43,'Máy mài khuôn Bosch GGS 28 LCE','Máy mài khuôn 650W, công suất cao',3200.000,10,3400.000,'Công cụ'),(44,'Máy xay sinh tố Philips HR2056','Máy xay sinh tố 600W, dung tích 1.5L',950.000,30,1000.000,'Phụ kiện'),(45,'Máy cắt nhôm Makita LC1230','Máy cắt nhôm 2300W, lưỡi cắt 305mm',7500.000,3,7800.000,'Công cụ'),(46,'Máy sưởi dầu Sunhouse SHD7007','Máy sưởi dầu 2000W, tiết kiệm điện',1800.000,15,2000.000,'Thiết bị điện'),(47,'Máy ép trái cây Panasonic MJ-DJ31','Máy ép trái cây 800W, 2 chế độ ép',2100.000,12,2200.000,'Phụ kiện'),(48,'Máy thổi bụi Bosch GBL 800E','Máy thổi bụi công suất 800W',2200.000,10,2400.000,'Công cụ'),(49,'Máy cắt góc Makita LS1018L','Máy cắt góc 1430W, đường kính lưỡi 255mm',4800.000,6,5100.000,'Công cụ'),(50,'Máy hàn Mig Perfect MIG 200','Máy hàn Mig công suất 200A',5600.000,4,5900.000,'Công cụ'),(51,'Máy khoan búa Bosch GBH 2-28','Máy khoan búa 880W, khoan bê tông',5500.000,7,5800.000,'Công cụ');
/*!40000 ALTER TABLE `products` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `users` (
  `id` int NOT NULL AUTO_INCREMENT,
  `email` varchar(255) NOT NULL,
  `password` varchar(500) NOT NULL,
  `fullname` varchar(500) NOT NULL,
  `status` varchar(500) NOT NULL,
  `role` varchar(50) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (1,'anhtuanpham@gmail.com','hashedpassword1','Anh Tuan Pham','active','user'),(2,'phuonglinhvo@gmail.com','hashedpassword2','Phuong Linh Vo','active','user'),(3,'quanghuyle@gmail.com','hashedpassword3','Quang Huy Le','inactive','admin'),(4,'hoanganhle5@gmail.com','hashedpassword4','Hoang Anh Le','active','user'),(5,'minhtrungnguyen@gmail.com','hashedpassword5','Minh Trung Nguyen','active','user'),(6,'tranvanbinh@gmail.com','hashedpassword6','Tran Van Binh','block','user'),(7,'lethithao@gmail.com','hashedpassword7','Le Thi Thao','active','user'),(8,'huynhkimphung@gmail.com','hashedpassword8','Huynh Kim Phung','block','user'),(9,'vominhtoan@gmail.com','hashedpassword9','Vo Minh Toan','active','user'),(10,'phanthienan@gmail.com','hashedpassword10','Phan Thien An','inactive','user'),(11,'truonghoang@gmail.com','hashedpassword11','Truong Hoang','active','user'),(12,'nhatnam@gmail.com','hashedpassword12','Nhat Nam','active','user'),(13,'tuanhung@gmail.com','hashedpassword13','Tuan Hung','block','user'),(14,'manhcuong@gmail.com','hashedpassword14','Manh Cuong','active','user'),(15,'ngocanh@gmail.com','hashedpassword15','Ngoc Anh','active','user'),(16,'truongvinh@gmail.com','hashedpassword16','Truong Vinh','inactive','user'),(17,'mytien@gmail.com','hashedpassword17','My Tien','block','user'),(18,'kimanh@gmail.com','hashedpassword18','Kim Anh','active','user'),(19,'thaonguyen@gmail.com','hashedpassword19','Thao Nguyen','active','user'),(20,'quocbao@gmail.com','hashedpassword20','Quoc Bao','active','user'),(21,'baotran@gmail.com','hashedpassword21','Bao Tran','block','user'),(22,'huutri@gmail.com','hashedpassword22','Huu Tri','active','user'),(23,'giangnguyen@gmail.com','hashedpassword23','Giang Nguyen','active','user'),(24,'duyphong@gmail.com','hashedpassword24','Duy Phong','inactive','user'),(25,'thanhcong@gmail.com','hashedpassword25','Thanh Cong','active','user'),(26,'thanhhuyen@gmail.com','hashedpassword26','Thanh Huyen','block','user'),(27,'caominh@gmail.com','hashedpassword27','Cao Minh','active','user'),(28,'ngocson@gmail.com','hashedpassword28','Ngoc Son','active','user'),(29,'tranbinh@gmail.com','hashedpassword29','Tran Binh','block','user'),(30,'nguyenan@gmail.com','hashedpassword30','Nguyen An','inactive','user'),(31,'longvu@gmail.com','hashedpassword31','Long Vu','active','user'),(32,'truongan@gmail.com','hashedpassword32','Truong An','active','user'),(33,'kimngan@gmail.com','hashedpassword33','Kim Ngan','block','user'),(34,'huynhhoa@gmail.com','hashedpassword34','Huynh Hoa','active','user'),(35,'phuongloan@gmail.com','hashedpassword35','Phuong Loan','active','user'),(36,'khanhvy@gmail.com','hashedpassword36','Khanh Vy','block','user'),(37,'lamphuc@gmail.com','hashedpassword37','Lam Phuc','active','user'),(38,'xuanhuong@gmail.com','hashedpassword38','Xuan Huong','active','user'),(39,'baotien@gmail.com','hashedpassword39','Bao Tien','inactive','user'),(40,'lephat@gmail.com','hashedpassword40','Le Phat','active','user'),(41,'nhuanphan@gmail.com','hashedpassword41','Nhuan Phan','active','user'),(42,'congdat@gmail.com','hashedpassword42','Cong Dat','block','user'),(43,'kimminh@gmail.com','hashedpassword43','Kim Minh','active','user'),(44,'lynguyen@gmail.com','hashedpassword44','Ly Nguyen','active','user'),(45,'nhattan@gmail.com','hashedpassword45','Nhat Tan','block','user'),(46,'hungvu@gmail.com','hashedpassword46','Hung Vu','active','user'),(47,'tunglam@gmail.com','hashedpassword47','Tung Lam','inactive','user'),(48,'minhchau@gmail.com','hashedpassword48','Minh Chau','active','user'),(49,'tuanvu@gmail.com','hashedpassword49','Tuan Vu','active','user'),(50,'hoangkim@gmail.com','hashedpassword50','Hoang Kim','active','user');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-04-20 20:59:26
