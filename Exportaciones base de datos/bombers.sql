-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 18-12-2023 a las 15:34:59
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bombers`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `bombero`
--

CREATE TABLE `bombero` (
  `id` int(10) NOT NULL,
  `parque_id` int(10) DEFAULT NULL,
  `apellidos` varchar(30) DEFAULT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `dni` varchar(10) DEFAULT NULL,
  `fecha_nacimiento` date DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `edad` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `bombero`
--

INSERT INTO `bombero` (`id`, `parque_id`, `apellidos`, `nombre`, `dni`, `fecha_nacimiento`, `direccion`, `telefono`, `edad`) VALUES
(10, 1, 'Flores Leyva', 'Andres', '15875840', '2000-06-02', 'av.Soledad', '994952768', 20),
(11, 2, 'Toledo Pala', 'Mikael', '15875841', '2001-03-30', 'av.Libertad', '994952769', 19),
(12, 3, 'Valverde Aquino', 'Angel', '15875842', '1999-10-28', 'av.Barranca', '994952770', 21);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `coche`
--

CREATE TABLE `coche` (
  `id` int(10) NOT NULL,
  `parque_id` int(10) DEFAULT NULL,
  `marca` varchar(20) DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `matricula` varchar(15) DEFAULT NULL,
  `fecha_compra` date DEFAULT NULL,
  `fecha_revision` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `coche`
--

INSERT INTO `coche` (`id`, `parque_id`, `marca`, `modelo`, `matricula`, `fecha_compra`, `fecha_revision`) VALUES
(15, 1, 'Toyota', 'modelo 1', '12345', '2013-10-09', '2015-11-08'),
(16, 2, 'Chevrolet', 'modelo 1', '13579', '2011-05-03', '2012-10-03'),
(17, 3, 'Ford', 'modelo 1', '24681', '2020-07-08', '2021-09-04');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `equipo`
--

CREATE TABLE `equipo` (
  `servicio_id` int(10) NOT NULL,
  `bombero_id` int(10) NOT NULL,
  `puesto` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `equipo`
--

INSERT INTO `equipo` (`servicio_id`, `bombero_id`, `puesto`) VALUES
(4, 10, 'Bombero1'),
(5, 11, 'Bombero2'),
(6, 12, 'Bombero3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `parque`
--

CREATE TABLE `parque` (
  `id` int(10) NOT NULL,
  `nombre` varchar(100) DEFAULT NULL,
  `direccion` varchar(100) DEFAULT NULL,
  `polacion` varchar(30) DEFAULT NULL,
  `telefono` varchar(9) DEFAULT NULL,
  `categoria` char(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `parque`
--

INSERT INTO `parque` (`id`, `nombre`, `direccion`, `polacion`, `telefono`, `categoria`) VALUES
(1, 'Parque Plaza', 'Av.LLeida', 'lleida', '994925753', '1'),
(2, 'Parque Mollerusa', 'Av.Mollerusa', 'Mollerusa', '994925754', '2'),
(3, 'Parque Madrid', 'Av.Madrid', 'Madrid', '994925755', '3');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `id` int(10) NOT NULL,
  `parque_id` int(10) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `tipo_servicio` varchar(100) DEFAULT NULL,
  `urgencia` int(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`id`, `parque_id`, `fecha`, `hora`, `tipo_servicio`, `urgencia`) VALUES
(4, 1, '2023-11-20', '19:30:10', 'Ambulancia', 1),
(5, 2, '2023-11-18', '13:10:30', 'Ambulancia', 2),
(6, 3, '2023-11-08', '17:05:15', 'Ambulancia', 3);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD PRIMARY KEY (`id`),
  ADD KEY `parque_id` (`parque_id`);

--
-- Indices de la tabla `coche`
--
ALTER TABLE `coche`
  ADD PRIMARY KEY (`id`),
  ADD KEY `parque_id` (`parque_id`);

--
-- Indices de la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD PRIMARY KEY (`servicio_id`,`bombero_id`),
  ADD KEY `bombero_id` (`bombero_id`);

--
-- Indices de la tabla `parque`
--
ALTER TABLE `parque`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `parque_id` (`parque_id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `bombero`
--
ALTER TABLE `bombero`
  ADD CONSTRAINT `bombero_ibfk_1` FOREIGN KEY (`parque_id`) REFERENCES `parque` (`id`);

--
-- Filtros para la tabla `coche`
--
ALTER TABLE `coche`
  ADD CONSTRAINT `coche_ibfk_1` FOREIGN KEY (`parque_id`) REFERENCES `parque` (`id`);

--
-- Filtros para la tabla `equipo`
--
ALTER TABLE `equipo`
  ADD CONSTRAINT `equipo_ibfk_1` FOREIGN KEY (`servicio_id`) REFERENCES `servicio` (`id`),
  ADD CONSTRAINT `equipo_ibfk_2` FOREIGN KEY (`bombero_id`) REFERENCES `bombero` (`id`);

--
-- Filtros para la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD CONSTRAINT `servicio_ibfk_1` FOREIGN KEY (`parque_id`) REFERENCES `parque` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
