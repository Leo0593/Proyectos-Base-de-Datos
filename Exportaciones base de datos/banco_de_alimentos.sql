-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 11-12-2023 a las 18:38:49
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
-- Base de datos: `banco_de_alimentos`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alimento`
--

CREATE TABLE `alimento` (
  `Codi_Alimento` int(11) NOT NULL,
  `Institucion` int(11) DEFAULT NULL,
  `cantidad` int(11) DEFAULT NULL,
  `Almacen` int(11) DEFAULT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `fecha_de_ingreso` date DEFAULT NULL,
  `fecha_de_caducidad` date DEFAULT NULL,
  `evaluacion_del_producto` varchar(100) DEFAULT NULL,
  `id_lotes` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alimento`
--

INSERT INTO `alimento` (`Codi_Alimento`, `Institucion`, `cantidad`, `Almacen`, `nombre`, `fecha_de_ingreso`, `fecha_de_caducidad`, `evaluacion_del_producto`, `id_lotes`) VALUES
(1, 1, 10, 1, 'arroz', '2023-11-27', '2025-08-19', 'Buen estado', 9),
(2, 1, 25, 1, 'arroz', '2023-12-17', '2025-10-19', 'Pasable', 9),
(3, 2, 10, 1, 'arroz', '2025-12-17', '2030-10-19', 'Pasable', 9),
(4, 2, 17, 1, 'arroz', '2019-12-17', '2027-08-25', 'Buen estado', 9),
(5, 3, 18, 2, 'atun', '2020-10-17', '2028-08-19', 'Pasable', 10),
(6, 3, 9, 2, 'atun', '2022-09-17', '2028-01-19', 'Entregar rapido', 10),
(7, 4, 6, 1, 'leche en polvo', '2022-05-17', '2032-08-19', 'Entregar rapido', 10),
(8, 4, 10, 1, 'leche en polvo', '2022-04-25', '2032-09-07', 'Buen estado', 10),
(9, 5, 6, 1, 'sal', '2021-06-17', '2029-10-19', 'Pasable', 10),
(10, 5, 25, 1, 'sal', '2023-12-10', '2040-10-19', 'Buen estado', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `almacen`
--

CREATE TABLE `almacen` (
  `Codi_almacen` int(11) NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Capacidad` int(11) DEFAULT NULL,
  `Numero_voluntarios` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `almacen`
--

INSERT INTO `almacen` (`Codi_almacen`, `Nombre`, `Capacidad`, `Numero_voluntarios`) VALUES
(1, 'Almacen de Mollerusa', 3000, 30),
(2, 'Almacen de Lleida', 1000, 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor`
--

CREATE TABLE `conductor` (
  `codi_conductor` int(11) NOT NULL,
  `nombre` char(45) DEFAULT NULL,
  `apellido` char(45) DEFAULT NULL,
  `DNI` varchar(45) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `codi_voluntario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `conductor`
--

INSERT INTO `conductor` (`codi_conductor`, `nombre`, `apellido`, `DNI`, `direccion`, `telefono`, `codi_voluntario`) VALUES
(1, 'Alejandro', 'García', 'Y7265938E', 'Carrer de Domènec Cardenal, 1', 648211195, 1),
(2, 'Juan', 'López', 'X6163089D', 'Avinguda de Jaume I, 1', 780935658, 4),
(3, 'Carolina', 'Torres', 'X4375786J', 'Carrer del Germà Jaume Hilari, 11', 662635507, 14);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `destino`
--

CREATE TABLE `destino` (
  `codi` int(11) NOT NULL,
  `nombre` varchar(11) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `Vehiculo` int(11) DEFAULT NULL,
  `Conductor` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `destino`
--

INSERT INTO `destino` (`codi`, `nombre`, `direccion`, `telefono`, `Vehiculo`, `Conductor`) VALUES
(1, 'CARITAS DIO', 'Carrer Bisbe Guitart, 27-29 BAJO;OC ALT URGELL, 25700, La Seu d´Urgell (LLEIDA)', 973351266, 1, 1),
(2, 'Oficina De ', 'Miracle, 23, 25600, Balaguer (LLEIDA)', 973450462, 1, 1),
(3, 'Remar - Reh', 'Passeig Gran Passeig de Ronda, 31 BAJO, 25003, Lleida', 973271185, 2, 2),
(4, 'Cáritas Par', 'Llevant (Pol. Ind. Riambau), 1, 25300, Tàrrega (LLEIDA)', 973314079, 2, 2),
(5, 'Reto A La E', 'Partida Part. Balàfia, 7 BAJO, 25196, Gualda, Lleida', 973231096, 3, 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `institucion`
--

CREATE TABLE `institucion` (
  `codi_Institucion` int(11) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `provincia` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `institucion`
--

INSERT INTO `institucion` (`codi_Institucion`, `nombre`, `direccion`, `telefono`, `provincia`) VALUES
(1, 'bonarea', 'Plaza de Manuel Bertrand, 10 ', 973674608, 'Mollerusa'),
(2, 'Mercadona', 'Avinguda de Jaume I, 30', 973679719, 'Mollerusa'),
(3, 'Carrefour', 'Gran Passeig de Ronda, 63', 973268587, 'Lleida'),
(4, 'Caprabo', 'Poligono Industrial Golpark', 932616060, 'Mollerusa'),
(5, 'Plusfresc', 'Carrer de Ferrer i Busquets, 9', 973602448, 'Mollerusa');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `codi_vehiculo` int(11) NOT NULL,
  `matriculo` varchar(40) DEFAULT NULL,
  `modelo` varchar(40) DEFAULT NULL,
  `entrada_vehiculo` date DEFAULT NULL,
  `salida_vehiculo` date DEFAULT NULL,
  `id_conductor` int(11) DEFAULT NULL,
  `codi_almacen` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`codi_vehiculo`, `matriculo`, `modelo`, `entrada_vehiculo`, `salida_vehiculo`, `id_conductor`, `codi_almacen`) VALUES
(1, '6832GKP', 'TOYOTA Land Cruiser', '2023-02-17', '2023-02-23', 1, 1),
(2, '3130SPR', 'BMW iX', '2023-01-20', '2024-02-02', 2, 1),
(3, '2141LHS', 'TOYOTA C-HR', '2023-01-20', '2023-01-30', 3, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `volutarios`
--

CREATE TABLE `volutarios` (
  `codi_voluntario` int(11) NOT NULL,
  `nombre` char(45) DEFAULT NULL,
  `apellido` char(45) DEFAULT NULL,
  `DNI` varchar(11) DEFAULT NULL,
  `telefono` int(11) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `id_almacen` int(11) DEFAULT NULL,
  `provincia` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `volutarios`
--

INSERT INTO `volutarios` (`codi_voluntario`, `nombre`, `apellido`, `DNI`, `telefono`, `direccion`, `id_almacen`, `provincia`) VALUES
(1, 'Alejandro', 'García', 'Y7265938E', 648211195, 'Carrer de Domènec Cardenal, 1', 1, 'Mollerusa'),
(2, 'Martín', 'Rodríguez', 'Y1915073S', 620638618, 'Plaça de Manuel Bertrand', 2, 'Lleida'),
(3, 'Javier', 'Martínez', 'Z1136488V', 698261330, 'Carrer de Domènec Cardenal, 1', 1, 'Mollerusa'),
(4, 'Juan', 'López', 'X6163089D', 780935658, 'Avinguda de Jaume I, 1', 2, 'Lleida'),
(5, 'Carlos', 'Sánchez', 'X4069220Z', 793999576, 'Carrer Joan Maragall, 2', 1, 'Mollerusa'),
(6, 'Diego', 'Pérez', 'X4489203V', 685821074, 'Carrer de Sidamon, 8', 2, 'Lleida'),
(7, 'Andrés', 'Fernández', 'Z5218639J', 680571488, 'Carrer de Fondarella, 20', 2, 'Lleida'),
(8, 'Luis', 'González', 'Y6261841J', 618126308, 'Carrer de Canàries, 11', 1, 'Mollerusa'),
(9, 'Jorge', 'Ramírez', 'Z8494369Z', 613447080, 'Avinguda de Jaume I, 32', 2, 'Lleida'),
(10, 'Gabriel', 'Díaz', 'Z2426181P', 732652162, 'Avinguda del President Macià', 1, 'Mollerusa'),
(11, 'Ana', 'Hernández', 'Y7731704S', 719313404, 'Ctra. de Torregrossa', 2, 'Lleida'),
(12, 'María', 'Gómez', 'X9944741R', 723486901, 'Carrer del Germà Jaume Hilari', 1, 'Mollerusa'),
(13, 'Laura', 'Jiménez', 'X6368057R', 727198001, 'Ctra. Torregrossa, 20-46', 2, 'Lleida'),
(14, 'Carolina', 'Torres', 'X4375786J', 662635507, 'Carrer del Germà Jaume Hilari, 11', 1, 'Mollerusa'),
(15, 'Isabel', 'Vargas', 'Y8277410T', 603106818, 'LV-2001, 37', 2, 'Lleida'),
(16, 'Paula', 'Ruiz', 'X6941974E', 788147774, 'Carrer Toni Castellseguer, 9', 1, 'Mollerusa'),
(17, 'Gabriela', 'Castro', 'X7311518W', 651, 'Carrer Pol. Ind. Tumsa, 29', 2, 'Lleida');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD PRIMARY KEY (`Codi_Alimento`),
  ADD KEY `Institucion` (`Institucion`),
  ADD KEY `Almacen` (`Almacen`);

--
-- Indices de la tabla `almacen`
--
ALTER TABLE `almacen`
  ADD PRIMARY KEY (`Codi_almacen`);

--
-- Indices de la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`codi_conductor`),
  ADD KEY `codi_voluntario` (`codi_voluntario`);

--
-- Indices de la tabla `destino`
--
ALTER TABLE `destino`
  ADD PRIMARY KEY (`codi`),
  ADD KEY `Vehiculo` (`Vehiculo`),
  ADD KEY `Conductor` (`Conductor`);

--
-- Indices de la tabla `institucion`
--
ALTER TABLE `institucion`
  ADD PRIMARY KEY (`codi_Institucion`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`codi_vehiculo`),
  ADD KEY `id_conductor` (`id_conductor`);

--
-- Indices de la tabla `volutarios`
--
ALTER TABLE `volutarios`
  ADD PRIMARY KEY (`codi_voluntario`),
  ADD KEY `id_almacen` (`id_almacen`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `alimento`
--
ALTER TABLE `alimento`
  ADD CONSTRAINT `alimento_ibfk_1` FOREIGN KEY (`Institucion`) REFERENCES `institucion` (`codi_Institucion`),
  ADD CONSTRAINT `alimento_ibfk_2` FOREIGN KEY (`Almacen`) REFERENCES `almacen` (`Codi_almacen`);

--
-- Filtros para la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD CONSTRAINT `conductor_ibfk_1` FOREIGN KEY (`codi_voluntario`) REFERENCES `volutarios` (`codi_voluntario`);

--
-- Filtros para la tabla `destino`
--
ALTER TABLE `destino`
  ADD CONSTRAINT `destino_ibfk_1` FOREIGN KEY (`Vehiculo`) REFERENCES `vehiculo` (`codi_vehiculo`),
  ADD CONSTRAINT `destino_ibfk_2` FOREIGN KEY (`Conductor`) REFERENCES `conductor` (`codi_conductor`);

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`id_conductor`) REFERENCES `conductor` (`codi_conductor`);

--
-- Filtros para la tabla `volutarios`
--
ALTER TABLE `volutarios`
  ADD CONSTRAINT `volutarios_ibfk_1` FOREIGN KEY (`id_almacen`) REFERENCES `almacen` (`Codi_almacen`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
