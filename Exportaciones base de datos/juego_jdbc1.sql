-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 08-01-2024 a las 18:33:14
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
-- Base de datos: `juego_jdbc1`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estadisticas`
--

CREATE TABLE `estadisticas` (
  `XP_Total` int(11) NOT NULL,
  `XP_Ataque` int(11) DEFAULT NULL,
  `XP_Defensa` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estadisticas`
--

INSERT INTO `estadisticas` (`XP_Total`, `XP_Ataque`, `XP_Defensa`) VALUES
(100, 70, 30),
(130, 90, 40),
(140, 60, 80),
(145, 85, 60),
(150, 75, 75),
(180, 80, 100),
(190, 100, 90),
(200, 150, 50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partida`
--

CREATE TABLE `partida` (
  `ID_partida` int(11) NOT NULL,
  `Puntuacion` int(11) DEFAULT NULL,
  `fecha_partida` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `partida`
--

INSERT INTO `partida` (`ID_partida`, `Puntuacion`, `fecha_partida`) VALUES
(1, 600, '2023-08-30'),
(2, 750, '2023-10-08'),
(3, 800, '2022-05-25'),
(4, 250, '2022-12-25'),
(5, 500, '2023-02-14'),
(6, 185, '2023-04-25'),
(7, 750, '2023-09-07'),
(8, 800, '2022-05-07');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `personaje`
--

CREATE TABLE `personaje` (
  `Id_del_personaje` int(11) DEFAULT NULL,
  `id_partidad` int(11) DEFAULT NULL,
  `XP_TOTAL` int(11) DEFAULT NULL,
  `Rango` char(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `personaje`
--

INSERT INTO `personaje` (`Id_del_personaje`, `id_partidad`, `XP_TOTAL`, `Rango`) VALUES
(4, 5, 180, 'PLATINO'),
(3, 1, 145, 'PLATINO'),
(2, 6, 190, 'DIAMANTE'),
(1, 5, 150, 'ORO'),
(2, 4, 200, 'DIAMANTE'),
(4, 8, 100, 'ORO'),
(3, 7, 145, 'PLATINO'),
(1, 3, 180, 'DIAMANTE'),
(2, 4, 150, 'ORO'),
(1, 2, 190, 'DIAMANTE'),
(3, 3, 130, 'ORO'),
(4, 8, 180, 'DIAMANTE'),
(3, 2, 100, 'ORO'),
(1, 8, 190, 'PLATINO'),
(4, 6, 140, 'PLATINO');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `ID_del_usuario` int(11) NOT NULL,
  `Nombre` char(45) DEFAULT NULL,
  `Apellido` char(45) DEFAULT NULL,
  `Usuario` varchar(150) DEFAULT NULL,
  `Correo_electronico` varchar(150) DEFAULT NULL,
  `Contraseña` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`ID_del_usuario`, `Nombre`, `Apellido`, `Usuario`, `Correo_electronico`, `Contraseña`) VALUES
(1, 'Santiago', 'Ortiz', 'Santi025', 'santiortega258@gmail.com', 'santi_258'),
(2, 'Vanesa', 'Salazar', 'Vanelu', 'vanelu159@gmail.com', 'vanelu_159'),
(3, 'Alejandro', 'Palma', 'ALEX10P', 'alejandropalma147@gmail.com', 'AlejoP_147'),
(4, 'Britany', 'Naranajo', 'Britstar', 'britnaranjo@gmail.com', 'britStar0593'),
(5, 'Arturo', 'Santander', 'Artur63', 'artursantander@gmail.com', 'artur357'),
(7, ' Samuel', ' Beltran', ' SamuBel89 ', 'samuelbeltran07@gmail.com', 'Samubel7');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estadisticas`
--
ALTER TABLE `estadisticas`
  ADD PRIMARY KEY (`XP_Total`);

--
-- Indices de la tabla `partida`
--
ALTER TABLE `partida`
  ADD PRIMARY KEY (`ID_partida`);

--
-- Indices de la tabla `personaje`
--
ALTER TABLE `personaje`
  ADD KEY `personaje_ibfk_1` (`Id_del_personaje`),
  ADD KEY `personaje_ibfk_2` (`id_partidad`),
  ADD KEY `personaje_ibfk_3` (`XP_TOTAL`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`ID_del_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `partida`
--
ALTER TABLE `partida`
  MODIFY `ID_partida` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `ID_del_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `personaje`
--
ALTER TABLE `personaje`
  ADD CONSTRAINT `personaje_ibfk_1` FOREIGN KEY (`Id_del_personaje`) REFERENCES `usuario` (`ID_del_usuario`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personaje_ibfk_2` FOREIGN KEY (`id_partidad`) REFERENCES `partida` (`ID_partida`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `personaje_ibfk_3` FOREIGN KEY (`XP_TOTAL`) REFERENCES `estadisticas` (`XP_Total`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
