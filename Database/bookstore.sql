-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 10, 2019 at 07:04 PM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bookstore`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `Book_ID` varchar(50) NOT NULL,
  `Book_name` varchar(50) DEFAULT NULL,
  `Book_type` varchar(50) DEFAULT NULL,
  `Author` varchar(50) DEFAULT NULL,
  `Number` varchar(50) DEFAULT NULL,
  `Price` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`Book_ID`, `Book_name`, `Book_type`, `Author`, `Number`, `Price`) VALUES
('01', 'JAVA PROGRAMMING', 'computer', 'Dr.Jirawat', '2', '450'),
('02', 'C/C++ PROGRAMMING', 'computer', 'Dr.Pattaraphong', '3', '250'),
('03', 'PYTHON PROGRAMMING', 'computer', 'Dr.Parin', '5', '1500'),
('04', 'HOW TO PAY PHOTOSET BNK48', 'entertainment', 'Mr.Surapat', '8', '5500'),
('05', 'TRAVEL TO AMERICA', 'travel', 'Mrs.Kesinee', '7', '380'),
('06', 'TRAVEL TO JAPAN', 'travel', 'Mrs.Kesinee', '9', '550'),
('07', 'HOW TO GO BANGNA WITH HANDSHAKE EVENT BNK48', 'entertainment', 'Mr.Surapat', '11', '1500'),
('08', 'How TO FIND A GIRLFRIEND QUICKLY', 'psychology', 'Dr.Tanasak', '12', '50'),
('09', 'HOW TO PRESENT PROJECT OOP GET A LOT OF POINTS', 'psychology', 'Dr.Piyagoon', '13', '500'),
('10', 'HOW TO USE MICROSOFT OFFICE', 'computer', 'Mrs.Nui', '22', '189'),
('11', 'THAI LANGUAGE', 'language', 'Dr.Piyagoon', '25', '89'),
('12', 'HOW TO FIND A FOOD', 'food', 'Mrs.Chonlada', '6', '399'),
('13', 'HOW TO FIND A SHOES STORE', 'shoes', 'Mr.Yuttapichai', '17', '450'),
('14', 'REVIEW TO SUPERCAR', 'car', 'Dr.Surapat', '19', '3200'),
('15', 'LEARN TO BLUESCREEN WINDOWS', 'computer', 'Dr.Surapat', '22', '329'),
('16', 'PREMIERE PRO CC 2018', 'computer', 'Dr.Raweeroch', '78', '400'),
('17', 'MARIO', 'cartoon', 'Dr.Surapat', '3', '399'),
('18', 'PREMIERE PRO & AFTER EFFECTS CC 2018', 'computer', 'Ph.D.Samarn', '12', '2500'),
('19', 'SUPER EASY EXCEL', 'computer', 'Mr.John', '11', '225'),
('20', 'AUTOCAD 2019 : 2D DRAFTING', 'computer', 'Dr.Pattaraphong', '5', '990'),
('21', 'WINDOWS 7', 'computer', 'Dr.Pattaraphong', '11', '250'),
('22', 'WINDOWS XP', 'computer', 'Dr.Teerapat', '45', '250'),
('23', 'GOOD KERWORD + SEO', 'computer', 'Dr.Parin', '35', '500'),
('24', 'CG PAINTING BASIC', 'computer', 'Dr.Parin', '32', '750'),
('25', 'NOTEBOOK & ULTRABOOK WINDOWS 8', 'computer', 'Dr.Jirawat', '15', '650'),
('26', 'PRACTICAL IOT DESIGN AND IMPLEMENTATION FREE', 'computer', 'Dr.Jirawat', '36', '453'),
('27', 'WEB SECURITY', 'computer', 'Dr.Pattaraphong', '2', '480'),
('28', 'PROGRAM OF THE YEAR', 'computer', 'Dr.Pattaraphong', '1', '1990'),
('29', 'TRIP TO PLUTO ', 'travel', 'Mr.Ong', '2', '9950'),
('30', 'TRIP TO OSAKA : KYOTO & KANSAI', 'travel', 'Mr.Ong', '1', '4500'),
('31', 'LETS GO ITALY', 'travel', 'Mr.Injan', '32', '450'),
('32', 'AROUND THE WORLD', 'travel', 'Mr.Injan', '22', '320'),
('33', 'AFRICA A JOURNEY', 'travel', 'Mr.Injan', '55', '450'),
('34', 'VISIT NEW YORK', 'travel', 'Mr.Injan', '32', '450'),
('35', 'JAPAN FAMILY TRIP', 'travel', 'Mrs.Kesinee', '32', '799'),
('36', 'JAPAN FIRST TIME', 'travel', 'Mrs.Kesinee', '12', '450'),
('37', 'THAILAND GOLF GUIDE BY KBANK 2014', 'travel', 'Mr.Injan', '32', '450'),
('38', 'PERFECT ENGLISH VOCABULARY', 'language', 'Dr.Jakkra', '32', '650'),
('39', 'SHORTCUT CHINESE', 'language', 'Dr.Jakkra', '2', '450'),
('40', 'ENJOY ENGLISH', 'language', 'Dr.Piyagoon', '45', '450'),
('41', 'ENGLISH COMMUNICATION SKILLS FOR AIRLINE BUSINESS', 'language', 'Dr.Jakkra', '5', '550'),
('42', 'EASY & PERFECT EMAIL WRITING', 'language', 'Dr.Jakkra', '8', '650'),
('43', 'ENGLISH CONVERSATION FROM AM TO PM', 'language', 'Dr.Piyagoon', '3', '350'),
('44', 'CINDERELLA', 'cartoon', 'Mr.Tanathip', '8', '399'),
('45', 'TREASURE ISLAND', 'cartoon', 'Mr.Nonny', '5', '399'),
('46', 'THE LITTLE MATCH GIRL', 'cartoon', 'Mr.Nonny', '6', '499'),
('47', 'ALADDIN AND THE MAGIC LAMP', 'cartoon', 'Mr.Nonny', '3', '299'),
('48', 'THE LITTLE MERMAID', 'cartoon', 'Mr.Tae', '7', '399'),
('49', 'PINOCCHIO', 'cartoon', 'Mr.Tae', '15', '199'),
('50', 'PETER PAN', 'cartoon', 'Mr.R', '3', '299'),
('51', 'DORAEMON', 'cartoon', 'Mr.Tae', '9', '599'),
('52', 'CONAN', 'cartoon', 'Mr.Tanathip', '5', '899');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`Book_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
