-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 21, 2020 at 06:24 AM
-- Server version: 5.7.31
-- PHP Version: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `qlplanes`
--

-- --------------------------------------------------------

--
-- Table structure for table `age`
--

DROP TABLE IF EXISTS `age`;
CREATE TABLE IF NOT EXISTS `age` (
  `age_id` int(11) NOT NULL,
  `age_name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`age_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `age`
--

INSERT INTO `age` (`age_id`, `age_name`) VALUES
(1, 'Người lớn'),
(2, 'Trẻ em');

-- --------------------------------------------------------

--
-- Table structure for table `airline_company`
--

DROP TABLE IF EXISTS `airline_company`;
CREATE TABLE IF NOT EXISTS `airline_company` (
  `company_id` int(11) NOT NULL,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sign` varchar(6) COLLATE utf8mb4_unicode_ci NOT NULL,
  `standard` int(5) NOT NULL,
  `img` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`company_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `airline_company`
--

INSERT INTO `airline_company` (`company_id`, `name`, `sign`, `standard`, `img`) VALUES
(1, 'VietNam Airlines', 'VNA', 4, 'VNAirlines.PNG'),
(2, 'Vietjet Air', 'VJ', 4, 'VTAir.PNG'),
(3, 'Jetstar Pacific Airlines', 'BL', 4, 'Jetstar.PNG'),
(4, 'Bamboo Airways', 'QH', 4, 'NOKAir.PNG');

-- --------------------------------------------------------

--
-- Table structure for table `airticket`
--

DROP TABLE IF EXISTS `airticket`;
CREATE TABLE IF NOT EXISTS `airticket` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `diemdi` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `diemden` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioxp` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioden` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `giatien` int(11) NOT NULL,
  `ngaydi` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `ngayden` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `company_id` int(1) NOT NULL,
  `planes_id` int(1) NOT NULL,
  `cate_id` int(1) NOT NULL,
  `age_id` int(1) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `airticket`
--

INSERT INTO `airticket` (`id`, `diemdi`, `diemden`, `gioxp`, `gioden`, `giatien`, `ngaydi`, `ngayden`, `company_id`, `planes_id`, `cate_id`, `age_id`) VALUES
(4, 'DLI', 'DIN', '8:00', '11:00', 600000, '24/7/2020', '24/7/2020', 4, 1, 2, 1),
(5, 'VDH', 'HPH', '16:00', '18:00', 500000, '12/7/2020', '12/7/2020', 1, 1, 1, 2),
(6, 'HUI', 'CXR', '10:00', '12:00', 600000, '20/7/2020', '20/7/2020', 2, 4, 2, 1),
(7, 'NHA', 'SGN', '13:00', '15:00', 600000, '19/7/2020', '19/7/2020', 3, 1, 2, 2),
(8, 'PQC', 'HAN', '8:00', '10:00', 700000, '29/7/2020', '29/7/2020', 4, 2, 1, 1),
(9, 'NHA', 'SGN', '15:00', '17:00', 500000, '16/7/2020', '16/7/2020', 2, 2, 2, 1),
(10, 'CHD', 'WCT', '9:00', '11:00', 500000, '12/7/2020', '12/7/2020', 4, 3, 1, 2),
(11, 'SGN', 'NHA', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 2, 1, 1, 1),
(12, 'PXU', 'SGN', '13:00', '15:00', 600000, '19/7/2020', '19/7/2020', 1, 1, 1, 2),
(13, 'UIH', 'HAN', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 3, 1, 2, 2),
(14, 'DLI', 'VCL', '11:00', '15: 00', 700000, '27/7/2020', '27/7/2020', 4, 3, 2, 1),
(15, 'DIN', 'VCA', '12:00', '14:00', 500000, '27/7/2020', '27/7/2020', 3, 3, 1, 1),
(16, 'BMV', 'VDH', '8:00', '11:00', 600000, '24/7/2020', '24/7/2020', 1, 1, 2, 2),
(17, 'DIN', 'VCS', '16:00', '18:00', 500000, '12/7/2020', '12/7/2020', 4, 1, 2, 1),
(18, 'VII', 'VKG', '10:00', '12:00', 600000, '20/7/2020', '20/7/2020', 3, 4, 1, 2),
(19, 'DLI', 'HPH', '13:00', '15:00', 600000, '19/7/2020', '19/7/2020', 1, 1, 1, 1),
(20, 'CAH', 'HAN', '8:00', '10:00', 700000, '29/7/2020', '29/7/2020', 2, 2, 2, 2),
(21, 'DIN', 'CXR', '15:00', '17:00', 500000, '16/7/2020', '16/7/2020', 2, 2, 1, 1),
(22, 'HUI', 'CAH', '9:00', '11:00', 500000, '12/7/2020', '12/7/2020', 4, 3, 1, 2),
(23, 'VKG', 'PQC', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 3, 1, 2, 1),
(24, 'TBB', 'VII', '13:00', '15:00', 600000, '19/7/2020', '19/7/2020', 2, 1, 1, 2),
(25, 'NHA', 'HAN', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 3, 1, 2, 1),
(48, 'VKG', 'PQC', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 1, 1, 2, 1),
(47, 'HUI', 'CAH', '9:00', '11:00', 500000, '24/7/2020', '24/7/2020', 1, 3, 1, 2),
(46, 'DIN', 'CXR', '15:00', '17:00', 500000, '16/7/2020', '16/7/2020', 2, 2, 1, 1),
(45, 'CAH', 'HAN', '8:00', '10:00', 700000, '29/7/2020', '29/7/2020', 4, 2, 2, 2),
(44, 'DLI', 'HPH', '13:00', '15:00', 600000, '19/7/2020', '19/7/2020', 3, 1, 1, 1),
(43, 'VII', 'VKG', '10:00', '12:00', 600000, '20/7/2020', '20/7/2020', 2, 4, 1, 2),
(42, 'DIN', 'VCS', '16:00', '18:00', 500000, '12/7/2020', '12/7/2020', 1, 1, 2, 1),
(41, 'BMV', 'VDH', '8:00', '11:00', 600000, '24/7/2020', '24/7/2020', 2, 1, 2, 2),
(40, 'DIN', 'VCA', '12:00', '14:00', 500000, '27/7/2020', '27/7/2020', 1, 3, 1, 1),
(39, 'DLI', 'VCL', '11:00', '15: 00', 700000, '27/7/2020', '27/7/2020', 3, 3, 2, 1),
(38, 'UIH', 'HAN', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 1, 1, 2, 2),
(37, 'PXU', 'SGN', '13:00', '15:00', 600000, '19/7/2020', '19/7/2020', 4, 1, 1, 2),
(36, 'SGN', 'NHA', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 3, 1, 1, 1),
(35, 'CHD', 'WCT', '9:00', '11:00', 500000, '12/7/2020', '12/7/2020', 1, 3, 1, 2),
(34, 'NHA', 'SGN', '15:00', '17:00', 500000, '16/7/2020', '16/7/2020', 3, 2, 2, 1),
(33, 'PQC', 'HAN', '8:00', '10:00', 700000, '29/7/2020', '29/7/2020', 2, 2, 1, 1),
(32, 'NHA', 'SGN', '13:00', '15:00', 600000, '19/7/2020', '19/7/2020', 1, 1, 2, 2),
(31, 'HUI', 'CXR', '10:00', '12:00', 600000, '20/7/2020', '20/7/2020', 2, 4, 2, 1),
(30, 'VDH', 'HPH', '16:00', '18:00', 500000, '12/7/2020', '12/7/2020', 3, 1, 1, 2),
(29, 'DLI', 'DIN', '8:00', '11:00', 600000, '24/7/2020', '24/7/2020', 4, 1, 2, 1),
(28, 'VCA', 'DAD', '12:00', '14:00', 500000, '27/7/2020', '27/7/2020', 4, 3, 1, 1),
(26, 'SGN', 'HAN', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 3, 1, 1, 2),
(27, 'BMV', 'CAH', '11:00', '15: 00', 700000, '27/7/2020', '27/7/2020', 1, 3, 2, 2),
(49, 'TBB', 'VII', '13:00', '15:00', 600000, '19/7/2020', '19/7/2020', 2, 1, 1, 2),
(50, 'NHA', 'HAN', '10:00', '14:00', 600000, '16/3/2020', '16/3/2020', 3, 1, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
CREATE TABLE IF NOT EXISTS `category` (
  `cate_id` int(11) NOT NULL,
  `cate_name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`cate_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`cate_id`, `cate_name`) VALUES
(1, 'Khứ hồi'),
(2, 'Một chiều');

-- --------------------------------------------------------

--
-- Table structure for table `city_code`
--

DROP TABLE IF EXISTS `city_code`;
CREATE TABLE IF NOT EXISTS `city_code` (
  `city_id` int(11) NOT NULL,
  `name_city` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `code` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`city_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `city_code`
--

INSERT INTO `city_code` (`city_id`, `name_city`, `code`) VALUES
(1, 'Ha Noi', 'HAN'),
(2, 'Ho Chi Minh', 'SGN'),
(3, 'Buon Me Thuot', 'BMV'),
(4, 'Ca Mau', 'CAH'),
(5, 'Can Tho', 'VCA'),
(6, 'Con Dao', 'VCS'),
(7, 'Da Nang', 'DAH'),
(8, 'Da Lat', 'DLI'),
(9, 'Dien Bien Phu', 'DIN'),
(10, 'Dong Hoi', 'VDH'),
(11, 'Hai Phong', 'HPH'),
(12, 'Hue', 'HUI'),
(13, 'Nha Trang', 'CXR'),
(14, 'Nha Trang', 'NHA'),
(15, 'Phu Quoc', 'PQC'),
(16, 'Pleiku', 'PXU'),
(17, 'Qui Nhon', 'UIH'),
(18, 'Rach Gia', 'VKG'),
(19, 'Chu Lai', 'VCL'),
(20, 'Tuy Hoa', 'TBB'),
(21, 'Thanh Pho Vinh', 'VII'),
(22, 'Can Tho', 'VVCT'),
(23, 'Thanh Hoa', 'THD');

-- --------------------------------------------------------

--
-- Table structure for table `comments`
--

DROP TABLE IF EXISTS `comments`;
CREATE TABLE IF NOT EXISTS `comments` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cmt` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `hoten` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `sdt` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `comments`
--

INSERT INTO `comments` (`id`, `cmt`, `hoten`, `sdt`) VALUES
(1, 'Chúng tôi rất hài lòng về những gì mà trang đã cung cấp.......', 'Phạm Thái Dương', 977801937),
(2, 'Chung toi rat hai long khi su dung dich vu cua cong ty', 'Pham Thai Duong', 123456789);

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
CREATE TABLE IF NOT EXISTS `customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `address` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `gioitinh` varchar(10) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL,
  `hanhli` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `sead` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(200) COLLATE utf8mb4_unicode_ci NOT NULL,
  `luatuoi` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`customer_id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`customer_id`, `name`, `address`, `gioitinh`, `phone`, `hanhli`, `sead`, `email`, `luatuoi`) VALUES
(1, 'Phạm Thái Dương', 'Huyện Phú Hòa, tỉnh Phú Yên , Việt Nam', 'Nam', '0585298286', 'Vali', '1', 'ptduong@keri.vn', 'Nguoi lon'),
(2, 'Nguyễn Văn Hảo', 'Bình Định , Việt Nam', 'Nam', '123465789', 'Túi xách', '6', 'nvhao@keri.vn', 'Tre em');

-- --------------------------------------------------------

--
-- Table structure for table `planes`
--

DROP TABLE IF EXISTS `planes`;
CREATE TABLE IF NOT EXISTS `planes` (
  `planes_id` int(11) NOT NULL,
  `number` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `company_id` int(11) NOT NULL,
  PRIMARY KEY (`planes_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `planes`
--

INSERT INTO `planes` (`planes_id`, `number`, `company_id`) VALUES
(1, 'VNA1778', 2),
(2, 'VJ1500', 3),
(3, 'BL1640', 1),
(4, 'QH2012', 2),
(5, 'VNA2520', 1),
(6, 'QH1320', 3);

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `full_name` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `user_name`, `password`, `full_name`) VALUES
(3, 'admin', '21232f297a57a5a743894a0e4a801fc3', 'admin'),
(2, 'thaiduong', '25f9e794323b453885f5181f1b624d0b', 'Pham Thai Duong'),
(5, 'admin1', 'admin', 'admin');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
