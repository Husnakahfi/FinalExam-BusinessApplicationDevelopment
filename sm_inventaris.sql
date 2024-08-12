-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 12, 2024 at 04:18 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `sm_inventaris`
--

-- --------------------------------------------------------

--
-- Table structure for table `m_kategori`
--

CREATE TABLE `m_kategori` (
  `id_kategori` int(11) NOT NULL,
  `nama_kategori` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `m_kategori`
--

INSERT INTO `m_kategori` (`id_kategori`, `nama_kategori`) VALUES
(1, 'TV'),
(2, 'Radio'),
(5, 'DVD'),
(6, 'Laptop');

-- --------------------------------------------------------

--
-- Table structure for table `m_produk`
--

CREATE TABLE `m_produk` (
  `id_produk` int(11) NOT NULL,
  `nama_produk` varchar(150) NOT NULL,
  `kode_produk` varchar(100) NOT NULL,
  `id_kategori` int(11) NOT NULL,
  `deskripsi` text NOT NULL,
  `harga` int(11) NOT NULL,
  `stok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `m_produk`
--

INSERT INTO `m_produk` (`id_produk`, `nama_produk`, `kode_produk`, `id_kategori`, `deskripsi`, `harga`, `stok`) VALUES
(1, 'Samsung Televesion', '01-TV-Samsung', 1, 'Samsung Televesion 21 inch', 3000000, 1),
(3, 'LG Television', '03-TV-LG', 1, 'Deskripsi untuk Produk A', 50000, 55),
(4, 'Radio Tape LG', '04-Radio-LG', 2, 'Deskripsi untuk Produk B', 75000, 45),
(5, 'Polytron DVD', '05-DVD-Polytron', 5, 'Deskripsi untuk Produk C', 150000, 200),
(6, 'Lenovo Laptop Yoga', '', 6, 'Deskripsi untuk Produk D', 25000, 150),
(7, 'Polytron Television', '', 1, 'Deskripsi untuk Produk E', 100000, 120),
(8, 'Panasonic DVD', '', 5, 'Deskripsi untuk Produk F', 20000, 80),
(9, 'Panasonic Television', '', 1, 'Deskripsi untuk Produk G', 55000, 80),
(10, 'Nikon Radio', '', 2, 'Deskripsi untuk Produk H', 85000, 60),
(11, 'HP Profesional', '', 6, 'Deskripsi untuk Produk I', 120000, 150),
(12, 'Changhong Television', '', 1, 'Deskripsi untuk Produk J', 65000, 75),
(13, 'Bagas Television', '', 1, 'Lorem Ipsum asdjankdj', 20000, 10),
(20, 'Smart LED', '', 2, 'Deskripsi Smart LED ', 12000000, 12);

-- --------------------------------------------------------

--
-- Table structure for table `t_penjualan`
--

CREATE TABLE `t_penjualan` (
  `id_transaksi` int(11) NOT NULL,
  `kode_transaksi` varchar(20) NOT NULL,
  `id_produk` int(11) NOT NULL,
  `tgl_transaksi` date NOT NULL,
  `jml_pembelian` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `t_penjualan`
--

INSERT INTO `t_penjualan` (`id_transaksi`, `kode_transaksi`, `id_produk`, `tgl_transaksi`, `jml_pembelian`) VALUES
(8, 'SM-001-TV', 1, '2024-08-12', 2),
(9, 'LG-001-TV', 3, '2024-08-07', 10),
(10, 'SM-002-TV', 1, '2024-08-11', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `m_kategori`
--
ALTER TABLE `m_kategori`
  ADD PRIMARY KEY (`id_kategori`);

--
-- Indexes for table `m_produk`
--
ALTER TABLE `m_produk`
  ADD PRIMARY KEY (`id_produk`);

--
-- Indexes for table `t_penjualan`
--
ALTER TABLE `t_penjualan`
  ADD PRIMARY KEY (`id_transaksi`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `m_kategori`
--
ALTER TABLE `m_kategori`
  MODIFY `id_kategori` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `m_produk`
--
ALTER TABLE `m_produk`
  MODIFY `id_produk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT for table `t_penjualan`
--
ALTER TABLE `t_penjualan`
  MODIFY `id_transaksi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
