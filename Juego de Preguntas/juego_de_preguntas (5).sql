-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-02-2024 a las 16:03:47
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `juego_de_preguntas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categorias`
--

CREATE TABLE `categorias` (
  `ID_Categoria` int(11) NOT NULL,
  `NombreCategoria` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categorias`
--

INSERT INTO `categorias` (`ID_Categoria`, `NombreCategoria`) VALUES
(1, 'Harry Potter'),
(2, 'Videojuegos'),
(3, 'Deportes'),
(4, 'Figuras');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `imagenes`
--

CREATE TABLE `imagenes` (
  `ID_Imagenes` int(11) NOT NULL,
  `ID_Nivel` int(11) DEFAULT NULL,
  `ID_Categoria` int(11) DEFAULT NULL,
  `Imagen_1` text DEFAULT NULL,
  `Imagen_2` text DEFAULT NULL,
  `Imagen_3` text DEFAULT NULL,
  `Imagen_4` text DEFAULT NULL,
  `Imagen_5` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `imagenes`
--

INSERT INTO `imagenes` (`ID_Imagenes`, `ID_Nivel`, `ID_Categoria`, `Imagen_1`, `Imagen_2`, `Imagen_3`, `Imagen_4`, `Imagen_5`) VALUES
(1, 1, 4, '████████████████████████████████████████\r\n█████████░░░░░░░░░░░░░░░░░░░░░░░████████\r\n████████▀░░░██████████████████░░████████\r\n████████░░░░██████████████████░░████████\r\n████████░░░░██████░░████░░████░░████████\r\n████████░░░░██████░░████░░████░░████████\r\n████████░░░░██████░░████░░████░░████████\r\n████████░░░░██████▄▄████▄▄████░░████████\r\n████████░░░░████████████████▀░░▄████████\r\n████████░░░░▀▀▀▀████▀▀▀▀▀▀▀░░▄██████████\r\n████████░░░░░░░░░█▀░░░░░░░░▄████████████\r\n████████▄▄▄▄▄▄░░░░░░▄▄▄▄▄▄██████████████\r\n██████████████░░░░▄█████████████████████\r\n████████████████████████████████████████', '░░░░░░░░░░░░░░░░░░▄▄░░░░░░░░░░░░░░░░░░\r\n░░░░░░░░░░░░░░░░░▄██▄░░░░░░░░░░░░░░░░░\r\n░░░░░░░░░░░░░░░░▄████▄░░░░░░░░░░░░░░░░\r\n░░░░░░░░░░░░░░░░██████░░░░░░░░░░░░░░░░\r\n███▄▄░░░░░░░░░░████████░░░░░░░░░░▄▄▄██\r\n▀██████▄▄░░░░░░████████░░░░░░▄▄██████▀\r\n░█████████▄░░░░████████░░░░▄█████████░\r\n░░▀▀▀▀▀▀▀▀▀▀░░░▀▀▀▀▀▀▀▀░░░▀▀▀▀▀▀▀▀▀▀░░\r\n░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░\r\n░░░░▀████████████████████████████▀░░░░\r\n░░░░░░▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄░░░░░░\r\n░░░░░░░▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀░░░░░░░\r\n░░░░░░░░░░░▄▄▄▄▄▄░▄▄░▄▄▄▄▄▄░░░░░░░░░░░\r\n░░░░░░░░░░░░░░▀▀▀░▀▀░▀▀▀░░░░░░░░░░░░░░\r\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░', '░▄▀█▀█▀█▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▀▄░░░\r\n█░░█░█░█░░░░░░░░░░░░░░░▄▄▄▄▄░▀▄░\r\n█░░█░█░█░░░░░░░░░░░░░░░█████░░░█\r\n█░░█░█░█░░░░░░░░░░░░░░░█████░░░█\r\n█░░░░░░░░░▄▄██████▄▄░░░░░░░░░░░█\r\n█▀▀▀▀▀▀▀▀██▀░░▄▄▄░▀▀██▀▀▀▀▀▀▀▀▀█\r\n█░░░░░░▄██░▄███████░▀█▄░░░░░░░░█\r\n█░░░░░░██░░█████████░██░░░░░░░░█\r\n█░░░░░░██░░████████▀░██░░░░░░░░█\r\n█░░░░░░░██▄░▀█████▀░▄█▀░░░░░░░░█\r\n█░░░░░░░░▀██▄▄░░░▄▄██▀░░░░░░░░░█\r\n█░░░░░░░░░░▀▀████▀▀░░░░░░░░░░░░█\r\n█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░█\r\n█░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▄▀\r\n▀▄░░░░░░░░░░░░░░░░░░░░░░░░░░▄▀░░\r\n░░▀▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▀░░░░', '░░░░░░░░░░░░▄▄▄█████████▄▄▄░░░░░░░░░░░░\r\n░░░░░░░░▄▄██████▀▀▀▀▀▀▀██████▄▄░░░░░░░░\r\n░░░░░░▄████▀▀░░░░░░░░░░░░░▀▀████▄░░░░░░\r\n░░░░▄███▀░░░░░░░░░░░░░░░░░░░░▀▀███▄░░░░\r\n░░▄███▀░░░░░░░░░░░░░░░░░░░░░░░░░████░░░\r\n░▄███▀░░░░░▄▄▄▄░░░░░░░░░░░░░░░░░░▀███░░\r\n░███░░░░░░█████▄░░░░░░░░░░░░░░░░░░▀███░\r\n███▀░░░░░░██████░░░░░░░░░░░░░░░░░░░███▄\r\n███░░░░░░░█████▀░░░░░░░░░░░░░░░░░░░░███\r\n███░░░░░░░░████▄░░░░░░░░░░░░░░░░░░░░███\r\n███░░░░░░░░░▀███▄░░░░░░░░░░░░░░░░░░░███\r\n███░░░░░░░░░░░█████▄░░░▄███▄▄░░░░░░▄███\r\n▀███░░░░░░░░░░░░▀████████████░░░░░░███░\r\n░███▄░░░░░░░░░░░░░▀▀████████▀░░░░░███▀░\r\n░░████░░░░░░░░░░░░░░░░░▀▀▀░░░░░░▄███▀░░\r\n░░███▀░░░░░░░░░░░░░░░░░░░░░░░░░▄███▀░░░\r\n░▄███░░░░▄▄░░░░░░░░░░░░░░░░░▄████▀░░░░░\r\n▄███▄▄███████▄▄▄░░░░░░░▄▄▄█████▀░░░░░░░\r\n███████▀▀▀▀▀███████████████▀▀░░░░░░░░░░\r\n░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░', '████████████████████████████████████████\r\n██████▓███████████████████████████████▓▓\r\n████▓─██████████████████████████▓▒▒─▒▒▓█\r\n███▓─▓█████████████████████▓▒────▒▓█████\r\n██▓──▓██████████████▓▓▒──────▒▓█████████\r\n█▓────████████▓▒▒────────▒██████████████\r\n█────────────────────▓██████████████████\r\n█───────────────▒▓██████████████████████\r\n█▓──────────▒▓██████████████████████████\r\n███▓▒▒▒▓▓███████████████████████████████'),
(2, 2, 4, '───────────████████\r\n──────────███▄███████\r\n──────────███████████\r\n──────────███████████\r\n──────────██████\r\n──────────█████████\r\n█───────███████\r\n██────████████████\r\n███──██████████──█\r\n███████████████\r\n███████████████\r\n─█████████████\r\n──███████████\r\n────████████\r\n─────███──██\r\n─────██────█\r\n─────█─────█\r\n─────██────██', '░░░░█████░░░░░░░░\r\n░░░█▓▓▒▓▓██░░░░░\r\n░░░█▓▒▒▒▓▓▓█░░░░\r\n░░███████▓▓▓█░░░░\r\n░██████████▓▓█░░░\r\n░███████████▓▓█░░\r\n░░██░░▒░░▒██▓██░░\r\n░░░█░█▒█░▒▒██▒▒█░\r\n░░█▒░█▒█░▒▒██▒▒█░\r\n░░█▒▒▒▒▒▒▒██▒▒▒█░\r\n░░█▒▒▒▒██▒▒█▒▒▒█░\r\n░░███████▒▒▒██░░\r\n░░██████▒▒▒▒██░░░\r\n░░░░█▒▒▒▒▒▒██░░░\r\n░░░░░██████░', '███▀▀▀▀███████████████\r\n██░░░░░▄██████████████\r\n█▌░░░░████░░██░░██░░██\r\n██░░░░░▀██████████████\r\n███▄▄▄▄███████████████', '▓▓▓▓▓▓▓▓██▓▓▓▓▓▓▓▓▓▓▓▓\r\n▓▓▓▓▓▓▓█████▓▓▓▓▓▓▓▓▓▓\r\n▓▓▓▓▓████████▓▓▓▓▓▓▓▓▓\r\n▓▓▓▓████████▓▓▓▓▓▓▓▓▓▓\r\n▓▓▓▓▓█████████▓▓▓▓▓▓▓▓\r\n████▓▓█████▓░▓██▓▓▓▓▓▓\r\n█████▒▓███▒░░░▓█▓▓▓▓▓▓\r\n██████████░░░░█▒██▓▓▓▓\r\n██████▒░░█░░░░█▒█▓▓▓▓▓\r\n█████▓░░░░░░░░█▒███▓██\r\n█████░░▒▒░░░░░█░▓▒░███\r\n▓▓▓▓█▒░░▒░░░░░░░░░░░█▓\r\n▓▓▓▓█▓░░░▓░░░░░░░░░▒█▓\r\n▓▓▓▓▓█▒░░██░░░░░░░▒█▓▓\r\n▓▓▓▓▓▓█▓▒▓███▓▒▒▒▓█▓▓▓\r\n▓▓▓▓▓▓▓██▒███░████▓▓▓▓\r\n▓▓▓▓▓▓▓██▓░▒░▓█████▓▓▓', '░░░░░░░▄▄▄░░░░░██▄░░░▄██░░░░░░░░░\r\n░░░░░░░░█▀▀█▄▄█▀░▀█▄█▀▀██░░▄▄▄░░░\r\n░░░█▄▄▄▄██░░▀▀▀░░░▀▀░░░███▀▀██░░░\r\n░░░▀█▄░▀▀▀░░░░░░░░░░░░░░░░░██░░░░\r\n░░░▄██░░░░░░░░░░░░░░░░░░░░░▀█▄▄░░\r\n▄████░░░░░░░░░░░░░░░░░░░░░░░▄▄███\r\n░▀▀▀█▀░▄▄███████████████▄▄▄▀█▀░░░\r\n░░░████████░░░░░░░░░░░░███████░░░\r\n░░░▀███████░░░░░░░░░░░░███████▀░░\r\n░░░░███████▄▄▄▄▄▄▄▄▄▄▄▄███████░░░\r\n░░░░▄█▀░░░░░▄░░░░░░░░▄░░░░░▀█▄░░░\r\n░░░░██░░░░░▀█▀░░░░░░▀█▀░░░░░██░░░\r\n░░░░▀█▄░░░▄▄░░░░░░░░░░▄▄░░░▄█░░░░\r\n░░░░░░▀███▀▀░░░░░░░░░░▀▀███▀░░░░░\r\n░░░░░░░▀█▄▄█▀░░░░░░░░▀█▄▄█▀░░░░░░\r\n░░░░░░░░▀██░▄█░░░░░░█▄░██▀░░░░░░░\r\n░░░░░░░░░▀▀██▄░░░░░░▄██▀░░░░░░░░░\r\n░░░░░░░░░░░░▀▀██▄▄█▀▀░░░░░░░░░░░░'),
(3, 3, 4, '____11________________1___________________________\r\n___¶¶¶¶_____________¶¶¶¶__________________________\r\n___¶¶_¶¶¶1_______1¶¶¶1¶¶__________________________\r\n___¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶__________________________\r\n___¶¶_1¶¶¶¶¶¶¶¶¶¶¶¶¶1_¶¶__________________________\r\n____1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________________________\r\n____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________________________\r\n____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶___________________________\r\n____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________________________\r\n_____¶¶¶11¶¶¶¶¶¶¶¶¶¶_¶¶¶__________________________\r\n____¶¶_¶1___¶¶¶¶¶__1¶1_¶¶¶________________________\r\n____¶¶__1¶¶11¶¶¶¶1¶¶___1¶¶¶1______________________\r\n____¶¶_____¶¶¶¶¶¶¶1____1¶¶¶¶¶¶1___________________\r\n____¶¶_______11_¶______¶¶¶¶¶¶¶¶¶__________________\r\n____1¶1_______________¶¶¶¶¶¶¶¶¶¶¶¶________________\r\n_____¶¶_______________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____________\r\n______1¶_____________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1___________\r\n_______1¶1_______11_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__________\r\n_________¶1_____¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________\r\n_________¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1________\r\n_________¶1_¶¶1¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶________\r\n_________¶1_¶¶1¶¶¶¶¶1_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1______\r\n________¶¶¶_¶1¶¶¶¶¶_¶¶_¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1______\r\n________¶¶¶_¶_¶¶¶¶¶1_¶¶_1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_____\r\n________¶¶¶_¶_¶¶¶¶¶1__11_1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____\r\n________1¶¶_¶_¶¶¶¶¶_¶¶¶¶¶¶¶¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____\r\n_______¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶____\r\n_______¶¶¶¶¶1¶¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1_¶¶¶¶¶¶____\r\n_____________________________________¶¶¶¶¶¶¶¶¶____\r\n______________________¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_____\r\n___________________¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶______\r\n_________________¶¶1__1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶_________\r\n_________________1¶¶11¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1____________\r\n____________________1¶¶¶¶¶¶¶¶¶1___________________\r\n', '______$$$$$$$$$$$_____$$$$$$$$$$$_____\r\n____$$$$$$$$$$$$________$$$$$$$$$$$$__\r\n__$$$$$$$$$$$$____________$$$$$$$$$$$$\r\n__$$$$$$$$____________________$$$$$$$$\r\n__$$$$$$$$$$$$____________$$$$$$$$$$$$\r\n__$$__$$$$$$__$$________$$__$$$$$$__$$\r\n__$$__________$$________$$__________$$\r\n__$$$$__________$$____$$__________$$$$\r\n____$$$$__________$$$$__________$$$$__\r\n______$$$$______$$$$$$$$______$$$$____\r\n________$$$$$$__$$$$$$$$__$$$$$$______\r\n__$$______$$$$$$$$$$$$$$$$$$$$______$$\r\n__$$$$______$$$$$$$$$$$$$$$$______$$$$\r\n____$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$_\r\n__________$$$$$$$$$$$$$$$$$$$________\r\n______$$$$$$$$$$$$$$$$$$$$$$$$$$$$__\r\n____$$$$____$$$$$$$$$$$$$$$______$$$\r\n__$$____$$$$$$$$$$$$$$$$$$$$$$$____$$\r\n______$$$$____$$$$$$$$$$$____$$$$___\r\n______$$__$$$$__$$$$$$$__$$$$___$$__\r\n____$$$$$$____$$$$$$$$$$$___$$$$$$$_\r\n____$$______$$$$$$$$$$$$$$$_______$$\r\n____$$______$$$$$$$$$$$$$$$_________\r\n______________$$$$$$$$$$$___________\r\n________________$$$$$$$_____________\r\n_________________$$$$$______________\r\n___________________$$$________________\r\n_________________$$$$$$$______________\r\n_______________$$$$$$$$$$$____________\r\n_______________$$$$$$$$$$$____________\r\n________________$$$$$$$$$_____________\r\n___________________$$$________________\r\n', '▀▀░▄▄▄▄▄░░█▀░░▄▄▄▄█▀░░\r\n█▄░░▀▄███░░░░███▄▀░░▄█\r\n▀▀█▄▄░░░▀░░░░▀░░▄▄▄▀▀░\r\n█▄░▀▀▀▀░░░░░░░░▀▀▀░▄▄█\r\n▀▀▀██▀▀░░▀███▀░▀█▄█▀▀░\r\n', '░░░░░░░░░░░░▄░░▄░▀█▄░░\r\n░░▄████████▄██▄██▄██░░\r\n░░█████████████▄████▌░\r\n░░▌████████████▀▀▀▀▀░░\r\n▒▀▒▐█▄▐█▄▐█▄▐█▄▒░▒░▒░▒\r\n', '_______________¶¶¶¶¶______¶¶¶¶_______________\r\n____________¶¶¶1¶¶_________¶¶¶¶¶¶¶___________\r\n_________¶¶¶111¶¶___________¶¶111¶¶¶¶________\r\n______¶¶¶¶1111¶¶¶____________¶¶¶1111¶¶¶1_____\r\n_____¶¶¶1111¶¶¶¶_____________¶¶¶¶11111¶¶¶____\r\n___¶¶¶11¶1¶1¶¶¶¶___¶¶____¶¶__¶¶¶¶¶1¶1¶1¶¶¶1__\r\n__¶¶¶11¶1¶11¶¶¶¶¶__¶¶¶¶¶¶¶¶__¶¶¶¶¶1¶1¶¶11¶¶1_\r\n_¶¶¶11¶¶1¶11¶¶¶¶¶¶__¶¶¶¶¶¶_¶¶¶¶¶¶¶1¶¶1¶¶1¶¶¶_\r\n¶¶¶¶1¶¶11¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶1¶¶¶1¶¶¶\r\n¶¶¶11¶¶11¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶1¶¶¶1¶¶¶\r\n¶¶¶1¶¶¶¶1¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶11¶¶¶1¶¶¶11¶¶\r\n_¶¶11¶¶¶1¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶1¶¶¶¶1¶¶¶\r\n_¶¶¶1¶¶¶¶1¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶1¶¶¶¶1¶¶1\r\n__¶¶1¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶1¶¶¶_\r\n___¶¶1¶¶¶_¶¶_______¶¶¶¶¶¶¶¶______¶¶¶¶¶¶¶¶¶¶__\r\n____¶¶¶¶____________¶¶¶¶¶¶___________¶¶¶¶____\r\n______¶¶¶__________¶¶¶__¶¶¶__________¶¶______\r\n_______¶¶¶_________¶______¶_________¶¶¶______\r\n\r\n');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nivel`
--

CREATE TABLE `nivel` (
  `ID_Nivel` int(11) NOT NULL,
  `NombreNivel` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `nivel`
--

INSERT INTO `nivel` (`ID_Nivel`, `NombreNivel`) VALUES
(1, 'Facil'),
(2, 'Normal'),
(3, 'Dificil');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `preguntas`
--

CREATE TABLE `preguntas` (
  `ID_Preguntas` int(11) NOT NULL,
  `ID_Nivel` int(11) DEFAULT NULL,
  `ID_Categoria` int(11) DEFAULT NULL,
  `Pregunta_1` varchar(255) DEFAULT NULL,
  `Pregunta_2` varchar(255) DEFAULT NULL,
  `Pregunta_3` varchar(255) DEFAULT NULL,
  `Pregunta_4` varchar(255) DEFAULT NULL,
  `Pregunta_5` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `preguntas`
--

INSERT INTO `preguntas` (`ID_Preguntas`, `ID_Nivel`, `ID_Categoria`, `Pregunta_1`, `Pregunta_2`, `Pregunta_3`, `Pregunta_4`, `Pregunta_5`) VALUES
(1, 1, 1, '¿Cual es el animal doméstico de Hermione Granger en la serie de libros \"Harry Potter\"?', '¿Como se llama el/la mejor amigo/a de Harry Potter?', '¿Cuál es la mascota de Ron Weasley?', '¿Quién es el director de la escuela Howgarts en la serie de libros \"Harry Potter\"?', '¿Cuál es la tienda de varitas más famosa en el callejón Diagon?'),
(2, 2, 1, '¿Cuál es el nombre completo del protagonista de la serie?', '¿Cuál de estos personajes NO fueron profesores de Defensa Contra las Artes Oscuras en Hogwarts?', '¿Qué criatura mágica es conocida por ser invisible y chupar la sangre de los magos?', '¿Cuál es el equipo de Quidditch al que pertenece Harry Potter?', '¿Cuáles son las casas en Hogwarts a las que pertenecen Harry Potter y sus dos mejores amigos, Ron Weasley y Hermione Granger?'),
(3, 3, 1, '¿Qué objeto mágico es capaz de destruir Horrocruxes?', '¿Cuál es el nombre completo del personaje que fundó la Casa Hufflepuff en Hogwarts?', 'En el Torneo de los Tres Magos, ¿Cuál es la criatura que Harry Potter debe enfrentar en la segunda prueba?', '¿Qué hecizo utiliza Hermione Granger para borrar la memoria de sus padres antes de ir a buscar los Horrocruxes?', '¿Cuántos hermanos y hermanas tiene Ron Weasley?'),
(4, 1, 2, 'En el juego \"Super Mario Bros\", ¿Cuáles son los nombres de los dos hermanos fontaneros protagonistas?', 'En el juego \"The Legend of Zelda: Ocarina of Time\",¿Cules son los dos elementos esenciales apra el héroe, Link?', 'En el juego \"Minecraft\", ¿Cuáles de estos elementos se pueden usar para crear una antorcha?', 'En eñ juego \"Pokémon\",¿Cuáles son los tipos de Pokémon de los personajes principales, Pikachu y Charmander? (Selecciona uno)', 'En el juego \"Fortnite\",¿Cuáles son los dos modos de juego principales?'),
(5, 2, 2, 'En el juego \"Overwatch\", ¿Cuál es el nombre del personaje que puede curar a sus compañeros de equipo?', 'En el juego \"League of Legends\",¿Cualés de los siguientes roles son típicamente responsables de daño a larga distancia?', 'En el juego \"The Elder Scrolls\", ¿Cuál es el nombre de la región donde se desarrolla \"Skyrim\"?', 'En el juego \"World of Warcraft\",¿Cuál de las siguientes razas pertenece a la Alianza?', 'En el juego \"Super Smash Bros. Ultimate\",¿Cuáles son los dos personajes que son hermanos y luchan como un dúo?'),
(6, 3, 2, 'En el juego \"Dark Souls\", ¿Cuáles el nombre del reino en el que se desarolla la mayoria de la historia?', 'En el juego \"Metal Gear Solid\",¿Quién es el antagonista principal y el líder de FOXHOUND en el primer juego de la serie?', 'En el juego \"The Witcher 3: Wild Hunt\", ¿Cuál es el nombre completo del protagonista, Geralt de Rivia, conocido por su titulo?', 'En eñ juego \"Final Fantasy VII\",¿Cuál es el villano que busca controlar el planeta usando la energía Mako?', 'En el juego \"Bloodborne\",¿Cuál es el nombre de la ciudad donde tiene lugar la cacería de bestias?'),
(7, 1, 3, 'En el fútbol, ¿Cuál de las siguientes posiciones generalmente se encarga de marcar goles?', 'En el baloncesto, ¿Cuántos puntos vale un tiro de campo realizado desde fuera del arco de tres puntos?', 'En el tenis, ¿Cuál es el nombre del torneo que se juega en Wimbledon?', 'En el béisbol, ¿Cuántas bases hay en total que un corredor puede correr alrededor del diamante?', 'El fúbtol americano, ¿Cántos puntos vale un touchdown?'),
(8, 2, 3, 'En el fútbol. ¿Cuántos puntos se otorgan por un gol?', 'En el tenis ¿Cuál de las siguientes opciones describe un \"gran slam\"?', 'En el béisbol, ¿Cuántos strikes necesita un bateador para ser ponchado?', 'En el baloncesto, ¿Cuál es el tiempo máximo que un equipo tiene para cruzar la mitad de la cancha después de tomar posesión del balón?', 'En el golf, ¿Qué término se utiliza pra describir un hoyo que se completa con un golpe menos que el par establecido?'),
(9, 3, 3, 'En el ciclismo, ¿Cuántos días dura el Tour de Francia en total?', 'En el cricket, ¿Cuál es el término para describir cuando un lanzador lograr eliminar a tres bateadores con tres lanzamientos consecutivos?', 'En el rugby, ¿Cuántos puntos se otorgan por una conversión después de un try?', 'En el atletismo, ¿Cuál es la distancia de una maratón olímpica estándar?', 'En el gdeporte del golf, ¿Cuántos hoyos se juegan típicamente en una ronda de golf de 18 hoyos?'),
(10, 1, 4, 'Imagen_1', 'Imagen_2', 'Imagen_3', 'Imagen_4', 'Imagen_5'),
(11, 2, 4, 'Imagen_6', 'Imagen_7', 'Imagen_8', 'Imagen_9', 'Imagen_10'),
(12, 3, 4, 'Imagen_11', 'Imagen_12', 'Imagen_13', 'Imagen_14', 'Imagen_15');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ranking`
--

CREATE TABLE `ranking` (
  `ID_Ranking` int(11) NOT NULL,
  `Puntuacion` int(11) DEFAULT NULL,
  `ID_Nivel` int(11) DEFAULT NULL,
  `ID_Categoria` int(11) DEFAULT NULL,
  `Nombre` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ranking`
--

INSERT INTO `ranking` (`ID_Ranking`, `Puntuacion`, `ID_Nivel`, `ID_Categoria`, `Nombre`) VALUES
(57, 1, 3, 4, 'MARIA '),
(58, 5, 1, 4, 'Leandro'),
(59, 2, 2, 3, ' '),
(60, 5, 1, 4, 'pepitogrillo'),
(61, 3, 1, 1, 'Pamela'),
(62, 2, 2, 1, 'Pamela'),
(63, 3, 1, 4, 'Pamela'),
(64, 4, 2, 4, ' '),
(65, 3, 2, 2, ' '),
(66, 3, 1, 3, ' '),
(67, 2, 3, 4, 'Pamela'),
(68, 2, 2, 1, 'Pamela'),
(69, 4, 1, 1, 'Pamela'),
(70, 3, 3, 4, 'Pamela'),
(71, 4, 2, 4, 'Pamela'),
(72, 3, 2, 4, 'Marco'),
(73, 1, 3, 3, 'Marco'),
(74, 5, 1, 4, 'Leandro'),
(75, 4, 3, 4, 'Leandro'),
(76, 3, 1, 4, 'Leandro'),
(77, 4, 1, 4, ' '),
(78, 5, 3, 4, ' ');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `respuestas`
--

CREATE TABLE `respuestas` (
  `ID_Respuestas` int(11) NOT NULL,
  `Respuesta_1` varchar(255) DEFAULT NULL,
  `Respuesta_2` varchar(255) DEFAULT NULL,
  `Respuesta_3` varchar(255) DEFAULT NULL,
  `Respuesta_4` varchar(255) DEFAULT NULL,
  `ID_Preguntas` int(11) DEFAULT NULL,
  `Id_imagenes` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `respuestas`
--

INSERT INTO `respuestas` (`ID_Respuestas`, `Respuesta_1`, `Respuesta_2`, `Respuesta_3`, `Respuesta_4`, `ID_Preguntas`, `Id_imagenes`) VALUES
(1, 'Gato (Crookshanks)', 'Rata (Scabbers)', 'Lechuza (Pigwidgeon)', 'Buho (Errol)', 1, NULL),
(2, 'Ron Weasley', 'Neville Longbotton', 'Draco Malfoy', 'Hermione Granger', 1, NULL),
(3, 'Gato (Crookshanks)', 'Lechuza (Pigwidgeon)', 'Rata (Scabbers)', 'Buho (Errol)', 1, NULL),
(4, 'Alastor Moody', 'Severus Snape', 'Albus Dumbledore', 'Minerva McGonagall', 1, NULL),
(5, 'Gregorovitch', 'Ollivanders', 'Garrick`s Wand Shop', 'WandsWhimsy', 1, NULL),
(6, 'Harry Weasley', 'Harry Granger', 'Harry Potter', 'Harry Malfoy', 2, NULL),
(7, 'Remus Lupin', 'Gilderoy Lockhart', 'Dolores Umbridge', 'Sybill Trelawney', 2, NULL),
(8, 'Hippogriffo', 'Thestral', 'Blast-Ended Skrewt', 'El Colacuerno Húngaro', 2, NULL),
(9, 'Flandes Flayers', 'Chudley Cannons', 'Puddlemere United', 'Holyhead Harpies', 2, NULL),
(10, 'Gryffindor', 'Hufflepuff', 'Ravenclaw', 'Slytherin', 2, NULL),
(11, 'La Varita de Saúco', 'La Espada de Gryffindor', 'El Giratiempo', 'La Piedra Filosofal', 3, NULL),
(12, 'Helga Grindelwald', 'Helga Hufflepuff', 'Rowena Ravenclaw', 'Salazar Slytherijn', 3, NULL),
(13, 'El Dragón Colacuerno Húngaro', 'El Caldero de los Elementos', 'El Basilisco', 'El Lago Negro', 3, NULL),
(14, 'Oblivate', 'Expelliarmus', 'Sectumsempra', 'Crucio', 3, NULL),
(15, '4', '5', '6', '7', 3, NULL),
(16, 'Mario', 'Luigi', 'Bowser', 'Toad', 4, NULL),
(17, 'Master Sword', 'Hylian Shield', 'Navi', 'Ocarina of Time', 4, NULL),
(18, 'Piedra', 'Madera', 'Carbon', 'Hierro', 4, NULL),
(19, 'Planta', 'Fuego', 'Agua', 'Eléctrico', 4, NULL),
(20, 'Battle Royale', 'Sve the World', 'Creative', 'League of Legends', 4, NULL),
(21, 'Reaper', 'Mercy', 'Hanzo', 'Soldier: 76', 5, NULL),
(22, 'Tanque', 'Tirador (ADC)', 'Asesino (Assassin)', 'Soporte', 5, NULL),
(23, 'Cyrodill', 'Morrowind', 'Skyrim', 'Hammerfell', 5, NULL),
(24, 'Orcos', 'Tauren', 'Elfos de la Noche', 'Enanos', 5, NULL),
(25, 'Mario', 'Ice Climbers', 'Link', 'Pickachu', 5, NULL),
(26, 'Lothric', 'Lordan', 'Drangleic', 'Yharnam', 6, NULL),
(27, 'Solid Snake', 'Revolver Ocelot', 'Liquid Snake', 'Big Boss', 6, NULL),
(28, 'Geralt el indestrucible', 'Geralt el Blanco', 'Geralt el Lobo Blanco', 'Geral el cazador de Monstruos', 6, NULL),
(29, 'Sephiroth', 'Kefka', 'Golbez', 'Kuja', 6, NULL),
(30, 'Latria', 'Boletaria', 'Anor Londo', 'Yharnam', 6, NULL),
(31, 'Delantero', 'Defensa', 'Portero', 'Centrocampista', 7, NULL),
(32, '1 punto', '2 puntos', '3 puntos', '4 puntos', 7, NULL),
(33, 'Wimbledon', 'US Open', 'Roland Garros', 'Australian Open', 7, NULL),
(34, '1', '2', '3', '4', 7, NULL),
(35, '6 puntos', '3 puntos', '7 puntos', '2 puntos', 7, NULL),
(36, '1', '2', '3', '4', 8, NULL),
(37, 'Ganar los cuatro torneos de Grand Slam en un año', 'Ganar un solo torneo de Grand Slam', 'Llegar a la final de cualquier torneo de tenis', 'Ganar un partido de tenis en sets seguidos', 8, NULL),
(38, '8 segundos', '12 segundos', '24 segundos', '30 segundos', 8, NULL),
(39, 'Bridie', 'Par', 'Bogey', 'EagleS', 8, NULL),
(40, '6 puntos', '3 puntos', '7 puntos', '2 puntos', 8, NULL),
(41, '15 dias', '21 dias', '30 dias', '45 dias', 9, NULL),
(42, 'Hat-trick', 'Grand Slam', 'Perfect Game', 'Triple play', 9, NULL),
(43, '2 puntos', '3 puntos', '5 puntos', '7 puntos', 9, NULL),
(44, '13.1 millas (42.195 km)', '20 millas (21.0975 km)', '30 millas (48.2803 km)', '26.2 millas (42.195 km)', 9, NULL),
(45, '12', '15', '18', '24', 9, NULL),
(46, 'twitch', 'Facebook', 'Signal', 'Mozilla Firefox', 10, 1),
(47, 'FILA', 'Adidas', 'HOKA', 'KARL KANI', 10, 1),
(48, 'Telegram', 'Yahoo Mail', 'HOKA', 'Instagram', 10, 1),
(49, 'Netflix', 'Trello', 'WhatsApp', 'TikTok', 10, 1),
(50, 'Nike', 'Bloom&You', 'Wonders', 'Victoria', 10, 1),
(51, 'Solitario', 'Rex Game', 'Buscaminas', 'Juego Google', 11, 2),
(52, 'Mario', 'Yoshi', 'Wuario', 'Luigi', 11, 2),
(53, 'Pac-Man', 'Out Run', 'Pacman', 'Pang', 11, 2),
(54, 'Mickey Mouse', 'Pluto', 'minnie mouse', 'Donald', 11, 2),
(55, 'Boruto', 'Sasuke', 'Naruto', 'Neji', 11, 2),
(56, 'Zorro', 'Gato', 'Perro', 'Pantera', 12, 3),
(57, 'Cangrejo', 'Camaleon', 'Langosta', 'Placton', 12, 3),
(58, 'Tigre', 'Zebra', 'Gato', 'Leon', 12, 3),
(59, 'Elefante', 'Rinoceronte', 'Jabali', 'Puerco', 12, 3),
(60, 'Pajaro', 'Aguila', 'Gato Alado', 'Murcielago', 12, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID_Usuario` int(11) NOT NULL,
  `Nombre` varchar(255) DEFAULT NULL,
  `Apellido` varchar(255) DEFAULT NULL,
  `Correo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_Usuario`, `Nombre`, `Apellido`, `Correo`) VALUES
(1, 'Leandro', 'Clavijo', 'leandro176@gmail.com'),
(2, 'hola', 'mund', 'holas'),
(3, 'leo', 'leo', 'jdaskd'),
(4, 'MARIA', 'LOPEZ', 'maria.lopezgmail.com'),
(5, 'pepitogrillo', 'anselmo', 'e'),
(6, 'Pamela', 'Ortiz', 'pmaela07@gmail.com'),
(7, 'Steve', 'Portella', 'steve\"f.com'),
(8, 'Marco', 'Titua�a', 'marco988@gmail.com'),
(9, 'M', 'M', 'MA');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categorias`
--
ALTER TABLE `categorias`
  ADD PRIMARY KEY (`ID_Categoria`);

--
-- Indices de la tabla `imagenes`
--
ALTER TABLE `imagenes`
  ADD PRIMARY KEY (`ID_Imagenes`),
  ADD KEY `ID_Categoria` (`ID_Categoria`),
  ADD KEY `ID_Nivel` (`ID_Nivel`);

--
-- Indices de la tabla `nivel`
--
ALTER TABLE `nivel`
  ADD PRIMARY KEY (`ID_Nivel`);

--
-- Indices de la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD PRIMARY KEY (`ID_Preguntas`),
  ADD KEY `ID_Categoria` (`ID_Categoria`),
  ADD KEY `ID_Nivel` (`ID_Nivel`);

--
-- Indices de la tabla `ranking`
--
ALTER TABLE `ranking`
  ADD PRIMARY KEY (`ID_Ranking`),
  ADD KEY `ID_Categoria` (`ID_Categoria`),
  ADD KEY `ID_Nivel` (`ID_Nivel`);

--
-- Indices de la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD PRIMARY KEY (`ID_Respuestas`),
  ADD KEY `ID_Preguntas` (`ID_Preguntas`),
  ADD KEY `Id_imagenes` (`Id_imagenes`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_Usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ranking`
--
ALTER TABLE `ranking`
  MODIFY `ID_Ranking` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=79;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID_Usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `imagenes`
--
ALTER TABLE `imagenes`
  ADD CONSTRAINT `imagenes_ibfk_1` FOREIGN KEY (`ID_Categoria`) REFERENCES `categorias` (`ID_Categoria`),
  ADD CONSTRAINT `imagenes_ibfk_2` FOREIGN KEY (`ID_Nivel`) REFERENCES `nivel` (`ID_Nivel`);

--
-- Filtros para la tabla `preguntas`
--
ALTER TABLE `preguntas`
  ADD CONSTRAINT `preguntas_ibfk_1` FOREIGN KEY (`ID_Categoria`) REFERENCES `categorias` (`ID_Categoria`),
  ADD CONSTRAINT `preguntas_ibfk_2` FOREIGN KEY (`ID_Nivel`) REFERENCES `nivel` (`ID_Nivel`);

--
-- Filtros para la tabla `ranking`
--
ALTER TABLE `ranking`
  ADD CONSTRAINT `ranking_ibfk_1` FOREIGN KEY (`ID_Categoria`) REFERENCES `categorias` (`ID_Categoria`),
  ADD CONSTRAINT `ranking_ibfk_2` FOREIGN KEY (`ID_Nivel`) REFERENCES `nivel` (`ID_Nivel`);

--
-- Filtros para la tabla `respuestas`
--
ALTER TABLE `respuestas`
  ADD CONSTRAINT `respuestas_ibfk_1` FOREIGN KEY (`ID_Preguntas`) REFERENCES `preguntas` (`ID_Preguntas`),
  ADD CONSTRAINT `respuestas_ibfk_2` FOREIGN KEY (`Id_imagenes`) REFERENCES `imagenes` (`ID_Imagenes`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
