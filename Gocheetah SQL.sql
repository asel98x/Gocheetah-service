-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 19, 2022 at 01:26 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gocheetah`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `admin_id` int(11) NOT NULL,
  `admin_name` varchar(45) NOT NULL,
  `admin_address` varchar(100) NOT NULL,
  `admin_mobile` int(10) NOT NULL,
  `admin_nic` varchar(10) NOT NULL,
  `admin_dob` varchar(45) NOT NULL,
  `admin_email` varchar(45) NOT NULL,
  `admin_age` varchar(45) NOT NULL,
  `admin_password` varchar(45) NOT NULL,
  `branch` varchar(45) NOT NULL,
  `admin_type` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`admin_id`, `admin_name`, `admin_address`, `admin_mobile`, `admin_nic`, `admin_dob`, `admin_email`, `admin_age`, `admin_password`, `branch`, `admin_type`) VALUES
(1, 'asel vinjitha', 'kadawatha', 765760512, '983002919v', '2022-09-09', 'asel@gmail.com', '23', 'MTIzNDU2Nzg5MA==', 'Kandy', 'Main');

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `order_id` int(11) NOT NULL,
  `customerID` int(11) NOT NULL,
  `branch` varchar(45) NOT NULL,
  `pickupLocation` varchar(45) NOT NULL,
  `dropLocation` varchar(45) NOT NULL,
  `price` varchar(45) NOT NULL,
  `vehicleId` varchar(45) NOT NULL,
  `driverId` varchar(45) NOT NULL,
  `acception` varchar(45) DEFAULT NULL,
  `time` varchar(45) DEFAULT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`order_id`, `customerID`, `branch`, `pickupLocation`, `dropLocation`, `price`, `vehicleId`, `driverId`, `acception`, `time`, `date`) VALUES
(12, 69, 'Colombo', 'Thibirigasyaya', 'Pitakotuwa', '625.0', '1', '1', 'null', '11:56:29 PM', '2022-09-18');

-- --------------------------------------------------------

--
-- Table structure for table `branch`
--

CREATE TABLE `branch` (
  `branch_id` int(11) NOT NULL,
  `location` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `branch`
--

INSERT INTO `branch` (`branch_id`, `location`) VALUES
(48, 'Colombo'),
(49, 'Galle'),
(50, 'Jaffna'),
(54, 'Matara'),
(59, 'Kandy');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `Customer_id` int(11) NOT NULL,
  `Customer_name` varchar(45) NOT NULL,
  `Customer_address` varchar(100) NOT NULL,
  `Customer_mobile` int(10) NOT NULL,
  `Customer_nic` varchar(10) NOT NULL,
  `Customer_email` varchar(45) NOT NULL,
  `Customer_photo` binary(100) DEFAULT NULL,
  `Customer_branch` varchar(45) NOT NULL,
  `Customer_password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`Customer_id`, `Customer_name`, `Customer_address`, `Customer_mobile`, `Customer_nic`, `Customer_email`, `Customer_photo`, `Customer_branch`, `Customer_password`) VALUES
(69, 'asel Vinjitha', 'nugegoda', 765760512, '983302919v', 'vinjitha@gmail.com', NULL, 'Matara', 'MTIzNDU2Nzg5MA==');

-- --------------------------------------------------------

--
-- Table structure for table `destination`
--

CREATE TABLE `destination` (
  `destination_id` int(11) NOT NULL,
  `destination_branch` varchar(45) NOT NULL,
  `destination_pickup` varchar(45) NOT NULL,
  `destination_drop` varchar(45) NOT NULL,
  `distance` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `destination`
--

INSERT INTO `destination` (`destination_id`, `destination_branch`, `destination_pickup`, `destination_drop`, `distance`) VALUES
(1, 'Colombo', 'Thibirigasyaya', 'Pitakotuwa', '5');

-- --------------------------------------------------------

--
-- Table structure for table `driver`
--

CREATE TABLE `driver` (
  `driver_id` int(11) NOT NULL,
  `driver_name` varchar(45) NOT NULL,
  `driver_address` varchar(100) NOT NULL,
  `driver_mobile` int(10) NOT NULL,
  `driver_nic` varchar(10) NOT NULL,
  `driver_licence` varchar(45) NOT NULL,
  `driver_dob` varchar(45) NOT NULL,
  `driver_email` varchar(45) NOT NULL,
  `driver_age` int(2) NOT NULL,
  `driver_password` varchar(45) NOT NULL,
  `driver_photo` binary(45) DEFAULT NULL,
  `branch` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `driver`
--

INSERT INTO `driver` (`driver_id`, `driver_name`, `driver_address`, `driver_mobile`, `driver_nic`, `driver_licence`, `driver_dob`, `driver_email`, `driver_age`, `driver_password`, `driver_photo`, `branch`) VALUES
(1, 'Kasun gunawardana', 'kadawataha', 765210452, '983002919v', '23F9SK4GSD', '2022-09-10', 'vinjith11@gmail.com', 25, 'MTIzNDU2Nzg5MA==', 0x000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000, 'Kandy');

-- --------------------------------------------------------

--
-- Table structure for table `feedback`
--

CREATE TABLE `feedback` (
  `id` int(11) NOT NULL,
  `order_id` varchar(45) NOT NULL,
  `customer_Id` varchar(45) NOT NULL,
  `driver_Id` varchar(45) NOT NULL,
  `feedback_title` varchar(100) NOT NULL,
  `feedback` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `feedback`
--

INSERT INTO `feedback` (`id`, `order_id`, `customer_Id`, `driver_Id`, `feedback_title`, `feedback`) VALUES
(7, '12', '69', '1', 'about driver', 'safe driver\r\n');

-- --------------------------------------------------------

--
-- Table structure for table `vehicategory`
--

CREATE TABLE `vehicategory` (
  `vehicleCat_id` int(11) NOT NULL,
  `vehicleCat_category` varchar(45) NOT NULL,
  `vehicleCat_precentage` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vehicategory`
--

INSERT INTO `vehicategory` (`vehicleCat_id`, `vehicleCat_category`, `vehicleCat_precentage`) VALUES
(3, 'van', '0.35'),
(11, 'Mini car', '0.25');

-- --------------------------------------------------------

--
-- Table structure for table `vehicle`
--

CREATE TABLE `vehicle` (
  `vehicle_id` int(11) NOT NULL,
  `vehicle_name` varchar(45) NOT NULL,
  `vehicle_chasiNno` varchar(45) NOT NULL,
  `vehicle_noPlate` varchar(45) NOT NULL,
  `vehicleCatgory` varchar(45) NOT NULL,
  `vehicle_type` varchar(45) NOT NULL,
  `vehicle_passengers` varchar(45) NOT NULL,
  `branch` varchar(45) NOT NULL,
  `driver_id` varchar(45) NOT NULL,
  `vehicle_photo` varchar(100) DEFAULT NULL,
  `vehicle_availability` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `vehicle`
--

INSERT INTO `vehicle` (`vehicle_id`, `vehicle_name`, `vehicle_chasiNno`, `vehicle_noPlate`, `vehicleCatgory`, `vehicle_type`, `vehicle_passengers`, `branch`, `driver_id`, `vehicle_photo`, `vehicle_availability`) VALUES
(1, 'Toyota Corolla', 'z0x984mdf83k', 'ABC-1234', 'car', 'Sedan', '1-5', 'Colombo', '1', NULL, 'Available');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`admin_id`);

--
-- Indexes for table `booking`
--
ALTER TABLE `booking`
  ADD PRIMARY KEY (`order_id`);

--
-- Indexes for table `branch`
--
ALTER TABLE `branch`
  ADD PRIMARY KEY (`branch_id`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`Customer_id`);

--
-- Indexes for table `destination`
--
ALTER TABLE `destination`
  ADD PRIMARY KEY (`destination_id`);

--
-- Indexes for table `driver`
--
ALTER TABLE `driver`
  ADD PRIMARY KEY (`driver_id`);

--
-- Indexes for table `feedback`
--
ALTER TABLE `feedback`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `vehicategory`
--
ALTER TABLE `vehicategory`
  ADD PRIMARY KEY (`vehicleCat_id`);

--
-- Indexes for table `vehicle`
--
ALTER TABLE `vehicle`
  ADD PRIMARY KEY (`vehicle_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `admin_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT for table `booking`
--
ALTER TABLE `booking`
  MODIFY `order_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT for table `branch`
--
ALTER TABLE `branch`
  MODIFY `branch_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `Customer_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=75;

--
-- AUTO_INCREMENT for table `destination`
--
ALTER TABLE `destination`
  MODIFY `destination_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `driver`
--
ALTER TABLE `driver`
  MODIFY `driver_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `feedback`
--
ALTER TABLE `feedback`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `vehicategory`
--
ALTER TABLE `vehicategory`
  MODIFY `vehicleCat_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT for table `vehicle`
--
ALTER TABLE `vehicle`
  MODIFY `vehicle_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
