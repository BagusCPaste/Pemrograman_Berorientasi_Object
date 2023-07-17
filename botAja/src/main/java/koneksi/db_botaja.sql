-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 16, 2023 at 08:19 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_botaja`
--

-- --------------------------------------------------------

--
-- Table structure for table `broadcast`
--

CREATE TABLE `broadcast` (
  `id` int(11) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `nama_pengirim` varchar(25) NOT NULL,
  `pesan` text NOT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `broadcast`
--

INSERT INTO `broadcast` (`id`, `nama`, `nama_pengirim`, `pesan`, `tanggal`) VALUES
(1, 'Bagus', 'Admin', 'halo selamat sore', NULL),
(2, 'Fannan', 'Admin', 'halo selamat sore', NULL),
(3, 'Bagus', 'Admin', 'malam all', NULL),
(4, 'Fannan', 'Admin', 'malam all', NULL),
(5, 'Bagus', 'Admin', 'test tanggal', '2023-07-16'),
(6, 'Fannan', 'Admin', 'test tanggal', '2023-07-16');

-- --------------------------------------------------------

--
-- Table structure for table `chat`
--

CREATE TABLE `chat` (
  `id` int(91) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `pesan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `chat`
--

INSERT INTO `chat` (`id`, `nama`, `pesan`) VALUES
(75, 'Bagus', '/chatall'),
(76, 'Bagus', '/chatall'),
(77, 'Bagus', '/chatall'),
(78, 'Bagus', '/chatall'),
(79, 'Bagus', '/chatall'),
(80, 'Bagus', '/chatall'),
(81, 'Bagus', '/chatall'),
(82, 'Bagus', '/chatall'),
(83, 'Bagus', '/chatall'),
(84, 'Bagus', '/chatall'),
(85, 'Bagus', '/chatall'),
(86, 'Bagus', '/chatall'),
(87, 'Bagus', '/chatall'),
(88, 'Bagus', '/chatall'),
(89, 'Bagus', '/chatall'),
(90, 'Bagus', '/chatall'),
(91, 'Bagus', '/chatall'),
(92, 'Bagus', '/chatall'),
(93, 'Bagus', '/chatall'),
(94, 'Bagus', '/chatall'),
(95, 'Bagus', '/chatall'),
(96, 'Bagus', '/chatall'),
(97, 'Bagus', '/chatall'),
(98, 'Bagus', '/chatall'),
(99, 'Bagus', '/chatall'),
(100, 'Bagus', '/chatall'),
(101, 'Bagus', '/chatall'),
(102, 'Bagus', '/chatall'),
(103, 'Bagus', '/chatall'),
(104, 'Bagus', '/chatall'),
(105, 'Bagus', '/chatall'),
(106, 'Bagus', '/chatall'),
(107, 'Bagus', '/chatall'),
(108, 'Bagus', '/chatall'),
(109, 'Bagus', '/chatall');

-- --------------------------------------------------------

--
-- Table structure for table `command`
--

CREATE TABLE `command` (
  `id` int(11) NOT NULL,
  `keyword` text NOT NULL,
  `jawaban` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `command`
--

INSERT INTO `command` (`id`, `keyword`, `jawaban`) VALUES
(5, '/cara', 'adsdsdsa'),
(7, '/dan', 'adsdsdsa'),
(8, '/halo', 'hai bro'),
(9, '/kk', 'oke'),
(10, '/yoi', 'yoiiiii');

-- --------------------------------------------------------

--
-- Table structure for table `qoute`
--

CREATE TABLE `qoute` (
  `id` int(11) NOT NULL,
  `nama` varchar(35) NOT NULL,
  `pesan` text NOT NULL,
  `tanggal` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `qoute`
--

INSERT INTO `qoute` (`id`, `nama`, `pesan`, `tanggal`) VALUES
(6, 'Bagus', 'Setidaknya berjuang adalah hal yang paling utama', NULL),
(7, 'Fannan', 'helloo', NULL),
(8, 'Fannan', 'yahh mete', NULL),
(11, 'Fannan', 'GUSSSSSS AAAAJJJJAAAAA', NULL),
(12, 'Bagus', 'Hai', NULL),
(13, 'Bagus', 'Iya', NULL),
(14, 'Bagus', 'Iay', NULL),
(15, 'Bagus', 'Oke', NULL),
(16, 'Bagus', 'Siap', NULL),
(17, 'Bagus', 'Hai broo', NULL),
(18, 'Bagus', 'Haii bro', NULL),
(19, 'Bagus', 'halo mas bro', NULL),
(20, 'Bagus', 'Ty sir', NULL),
(21, 'Bagus', 'Terimakasih', NULL),
(22, 'Bagus', 'Hai', NULL),
(23, 'Bagus', 'Hai', '2023-07-16'),
(24, 'Bagus', 'Oke', '2023-07-16');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(7) NOT NULL,
  `chat_id` text NOT NULL,
  `nama` varchar(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `chat_id`, `nama`) VALUES
(1, '5974110344', 'Bagus'),
(3, '1207968377', 'Fannan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `broadcast`
--
ALTER TABLE `broadcast`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `chat`
--
ALTER TABLE `chat`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `command`
--
ALTER TABLE `command`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `qoute`
--
ALTER TABLE `qoute`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `broadcast`
--
ALTER TABLE `broadcast`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `chat`
--
ALTER TABLE `chat`
  MODIFY `id` int(91) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=110;

--
-- AUTO_INCREMENT for table `command`
--
ALTER TABLE `command`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `qoute`
--
ALTER TABLE `qoute`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(7) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
