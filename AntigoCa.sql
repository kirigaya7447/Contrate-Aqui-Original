-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Tempo de geração: 06-Out-2023 às 02:20
-- Versão do servidor: 10.4.27-MariaDB
-- versão do PHP: 7.4.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `ca`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `autonomo`
--

CREATE TABLE `autonomo` (
  `idAutonomo` int(11) NOT NULL,
  `idUserAutonomo` int(11) DEFAULT NULL,
  `profissaoAutonomo` text DEFAULT NULL,
  `avaliacaoAutonomo` float DEFAULT NULL,
  `numAvaliacaoAutonomo` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `autonomo`
--

INSERT INTO `autonomo` (`idAutonomo`, `idUserAutonomo`, `profissaoAutonomo`, `avaliacaoAutonomo`, `numAvaliacaoAutonomo`) VALUES
(1, 3, 'Analista de Dados', 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `colaborador`
--

CREATE TABLE `colaborador` (
  `idColaborador` int(11) NOT NULL,
  `idUserColaborador` int(11) DEFAULT NULL,
  `areaColaborador` text DEFAULT NULL,
  `situacaoColaborador` enum('Procurando oportunidades','Trabalhando','Oferecendo oportunidades') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `colaborador`
--

INSERT INTO `colaborador` (`idColaborador`, `idUserColaborador`, `areaColaborador`, `situacaoColaborador`) VALUES
(1, 1, 'Técnico em Informática', 'Procurando oportunidades');

-- --------------------------------------------------------

--
-- Estrutura da tabela `empresa`
--

CREATE TABLE `empresa` (
  `idEmpresa` int(11) NOT NULL,
  `idUserEmpresa` int(11) DEFAULT NULL,
  `cnpjEmpresa` char(18) DEFAULT NULL,
  `telefoneEmpresa` char(15) DEFAULT NULL,
  `trabalhoEmpresa` text DEFAULT NULL,
  `estagioEmpresa` enum('Sim','Não') DEFAULT NULL,
  `avaliacaoEmpresa` float DEFAULT NULL,
  `numAvaliacaoEmpresa` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `empresa`
--

INSERT INTO `empresa` (`idEmpresa`, `idUserEmpresa`, `cnpjEmpresa`, `telefoneEmpresa`, `trabalhoEmpresa`, `estagioEmpresa`, `avaliacaoEmpresa`, `numAvaliacaoEmpresa`) VALUES
(1, 2, '18.703.167/0001-84', '(35) 99931-8087', 'Limpador de janelas e encarregado', 'Sim', 0, 0),
(2, 7, NULL, NULL, 'Atendente', 'Não', 0, 0);

-- --------------------------------------------------------

--
-- Estrutura da tabela `jovemaprendiz`
--

CREATE TABLE `jovemaprendiz` (
  `idAprendiz` int(11) NOT NULL,
  `idUserAprendiz` int(11) DEFAULT NULL,
  `instituicaoAprendiz` text DEFAULT NULL,
  `areaAprendiz` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `jovemaprendiz`
--

INSERT INTO `jovemaprendiz` (`idAprendiz`, `idUserAprendiz`, `instituicaoAprendiz`, `areaAprendiz`) VALUES
(1, 4, 'Presidente Bernardes', 'Analista de Dados'),
(3, 9, 'Ifsuldeminas Pouso Alegre ', 'Administração '),
(5, 11, 'Ifsuldeminas Pouso Alegre ', 'Administração ');

-- --------------------------------------------------------

--
-- Estrutura da tabela `login`
--

CREATE TABLE `login` (
  `idLogin` int(11) NOT NULL,
  `idUserLogin` int(11) DEFAULT NULL,
  `tipoLogin` enum('Autônomo','Colaborador','Empresa','Jovem Aprendiz') DEFAULT NULL,
  `horaLogin` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `login`
--

INSERT INTO `login` (`idLogin`, `idUserLogin`, `tipoLogin`, `horaLogin`) VALUES
(1, 1, 'Colaborador', '2023-08-14 22:20:26'),
(2, 1, 'Colaborador', '2023-08-14 23:30:56'),
(3, 1, 'Colaborador', '2023-08-15 00:27:57'),
(4, 1, 'Colaborador', '2023-08-16 19:03:41'),
(5, 2, 'Empresa', '2023-08-16 20:32:38'),
(6, 3, 'Autônomo', '2023-08-16 20:45:38'),
(7, 4, 'Jovem Aprendiz', '2023-08-16 21:15:25'),
(8, 1, 'Colaborador', '2023-08-16 21:26:59'),
(9, 1, 'Colaborador', '2023-08-21 20:49:40'),
(10, 1, 'Colaborador', '2023-08-21 20:52:36'),
(11, 1, 'Colaborador', '2023-08-21 20:54:27'),
(12, 1, 'Colaborador', '2023-08-21 20:55:43'),
(13, 1, 'Colaborador', '2023-08-21 21:00:01'),
(14, 1, 'Colaborador', '2023-08-21 21:02:11'),
(15, 1, 'Colaborador', '2023-08-21 21:06:21'),
(16, 1, 'Colaborador', '2023-08-21 21:07:13'),
(17, 1, 'Colaborador', '2023-08-21 21:51:18'),
(18, 1, 'Colaborador', '2023-08-22 15:34:06'),
(19, 1, 'Colaborador', '2023-08-22 18:39:54'),
(20, 1, 'Colaborador', '2023-08-22 18:52:17'),
(21, 1, 'Colaborador', '2023-08-23 02:24:49'),
(22, 2, 'Empresa', '2023-08-26 08:15:14'),
(23, 2, 'Empresa', '2023-08-26 08:19:52'),
(24, 1, 'Colaborador', '2023-08-26 08:20:36'),
(25, 1, 'Colaborador', '2023-08-26 08:22:47'),
(26, 1, 'Colaborador', '2023-08-26 08:25:37'),
(27, 1, 'Colaborador', '2023-08-26 08:27:50'),
(28, 1, 'Colaborador', '2023-08-26 08:28:11'),
(29, 1, 'Colaborador', '2023-08-26 16:30:59'),
(30, 2, 'Empresa', '2023-08-26 17:32:39'),
(31, 3, 'Autônomo', '2023-08-26 17:33:44'),
(32, 4, 'Jovem Aprendiz', '2023-08-26 17:34:20'),
(33, 4, 'Jovem Aprendiz', '2023-08-26 17:36:28'),
(34, 4, 'Jovem Aprendiz', '2023-08-26 17:37:24'),
(35, 4, 'Jovem Aprendiz', '2023-08-26 17:38:58'),
(36, 4, 'Jovem Aprendiz', '2023-08-26 17:40:06'),
(37, 4, 'Jovem Aprendiz', '2023-08-26 17:42:48'),
(38, 3, 'Autônomo', '2023-08-26 17:43:35'),
(39, 4, 'Jovem Aprendiz', '2023-08-26 17:45:06'),
(40, 4, 'Jovem Aprendiz', '2023-08-26 17:46:04'),
(41, 4, 'Jovem Aprendiz', '2023-08-26 17:46:04'),
(42, 3, 'Autônomo', '2023-08-26 17:49:03'),
(43, 1, 'Colaborador', '2023-08-30 01:03:04'),
(44, 2, 'Empresa', '2023-08-30 01:12:59'),
(45, 3, 'Autônomo', '2023-08-30 01:14:10'),
(46, 4, 'Jovem Aprendiz', '2023-08-30 01:14:55'),
(47, 1, 'Colaborador', '2023-08-30 01:33:33'),
(48, 3, 'Autônomo', '2023-08-30 02:18:10'),
(49, 2, 'Empresa', '2023-08-30 02:19:37'),
(50, 4, 'Jovem Aprendiz', '2023-08-30 02:20:40'),
(51, 1, 'Colaborador', '2023-08-30 02:22:25'),
(52, 1, 'Colaborador', '2023-08-31 01:54:05'),
(53, 3, 'Autônomo', '2023-08-31 01:59:32'),
(54, 1, 'Colaborador', '2023-08-31 02:08:28'),
(55, 2, 'Empresa', '2023-08-31 02:12:26'),
(56, 4, 'Jovem Aprendiz', '2023-08-31 02:15:16'),
(57, 1, 'Colaborador', '2023-08-31 17:37:35'),
(58, 1, 'Colaborador', '2023-09-02 08:56:29'),
(59, 2, 'Empresa', '2023-09-02 08:59:08'),
(60, 1, 'Colaborador', '2023-09-02 09:01:49'),
(61, 1, 'Colaborador', '2023-09-04 15:35:09'),
(62, 1, 'Colaborador', '2023-09-04 15:35:46'),
(63, 2, 'Empresa', '2023-09-04 16:41:56'),
(64, 3, 'Autônomo', '2023-09-04 16:44:04'),
(65, 4, 'Jovem Aprendiz', '2023-09-07 00:52:58'),
(66, 2, 'Empresa', '2023-09-07 02:34:54'),
(67, 1, 'Colaborador', '2023-09-07 16:05:56'),
(68, 3, 'Autônomo', '2023-09-07 16:06:26'),
(69, 7, 'Empresa', '2023-09-07 16:16:49'),
(70, 2, 'Empresa', '2023-09-12 10:41:39'),
(71, 2, 'Empresa', '2023-09-12 10:41:57'),
(72, 2, 'Empresa', '2023-09-12 10:44:38'),
(73, 1, 'Colaborador', '2023-09-19 15:10:56'),
(74, 2, 'Empresa', '2023-09-19 15:27:02'),
(75, 1, 'Colaborador', '2023-09-19 15:38:53'),
(76, 2, 'Empresa', '2023-09-25 16:49:53'),
(77, 3, 'Autônomo', '2023-09-25 17:52:25'),
(78, 1, 'Colaborador', '2023-09-26 15:15:44'),
(79, 1, 'Colaborador', '2023-09-27 01:18:27'),
(80, 9, 'Jovem Aprendiz', '2023-09-27 01:55:02'),
(81, 10, 'Jovem Aprendiz', '2023-09-27 01:55:02'),
(82, 2, 'Empresa', '2023-09-27 01:59:30'),
(83, 1, 'Colaborador', '2023-09-27 02:30:22'),
(84, 2, 'Empresa', '2023-09-27 02:31:18'),
(85, 1, 'Colaborador', '2023-10-04 01:32:54'),
(86, 2, 'Empresa', '2023-10-04 01:48:53'),
(87, 1, 'Colaborador', '2023-10-04 01:55:11'),
(88, 1, 'Colaborador', '2023-10-04 02:08:04'),
(89, 1, 'Colaborador', '2023-10-04 20:41:19'),
(90, 1, 'Colaborador', '2023-10-04 20:55:22'),
(91, 1, 'Colaborador', '2023-10-04 20:59:33'),
(92, 1, 'Colaborador', '2023-10-04 21:04:50'),
(93, 1, 'Colaborador', '2023-10-04 21:11:51'),
(94, 3, 'Autônomo', '2023-10-04 21:14:39'),
(95, 3, 'Autônomo', '2023-10-04 21:19:53'),
(96, 4, 'Jovem Aprendiz', '2023-10-04 21:20:29'),
(97, 11, 'Jovem Aprendiz', '2023-10-04 21:21:52'),
(98, 2, 'Empresa', '2023-10-04 21:24:38'),
(99, 1, 'Colaborador', '2023-10-06 01:30:57'),
(100, 2, 'Empresa', '2023-10-06 01:46:27'),
(101, 1, 'Colaborador', '2023-10-06 02:09:59');

-- --------------------------------------------------------

--
-- Estrutura da tabela `posts`
--

CREATE TABLE `posts` (
  `idPost` int(11) NOT NULL,
  `idUserPost` int(11) DEFAULT NULL,
  `emailPost` text DEFAULT NULL,
  `dataPost` datetime DEFAULT NULL,
  `tempPost` enum('Sim','Não') DEFAULT NULL,
  `textoPost` text DEFAULT NULL,
  `nomeInteressadoPost` text DEFAULT NULL,
  `numInteressadoPost` int(11) DEFAULT NULL,
  `finalizadoPost` enum('Sim','Não') DEFAULT NULL,
  `imagemPost` text DEFAULT NULL,
  `imagemWebPost` text DEFAULT NULL,
  `publicoPost` text DEFAULT NULL,
  `apagadoPost` enum('Sim','Não') DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `posts`
--

INSERT INTO `posts` (`idPost`, `idUserPost`, `emailPost`, `dataPost`, `tempPost`, `textoPost`, `nomeInteressadoPost`, `numInteressadoPost`, `finalizadoPost`, `imagemPost`, `imagemWebPost`, `publicoPost`, `apagadoPost`) VALUES
(43, 1, 'joaoh2915@gmail.com', '2023-10-04 21:14:14', NULL, 'Estou procurando emprego nas áreas de programação ou conserto de máquinas!', '', 0, 'Não', NULL, NULL, 'Autônomo/Empresa', 'Não'),
(44, 3, 'luis.analista@gmail.com', '2023-10-04 21:19:11', NULL, 'Faço análises em empresas com fluxo de dados grande, médio e pequeno', '', 0, 'Não', NULL, '1696447151651dbaafb2ae5.jpg', 'Colaborador/Empresa', 'Não'),
(45, 11, 'joaquimsilvamelo5@gmail.com', '2023-10-04 21:23:42', NULL, 'Para poder finalizar o meu curso eu necessito realizar 120 horas de estágios, remuneradas ou não. A empresa que houver interesse pode entrar em contato comigo pelo número:  (35)999318089', NULL, 0, 'Não', NULL, '1696447422651dbbbe4c2d1.png', 'Empresa', 'Não');

-- --------------------------------------------------------

--
-- Estrutura da tabela `user`
--

CREATE TABLE `user` (
  `idUser` int(11) NOT NULL,
  `nomeUser` text DEFAULT NULL,
  `tipoUser` enum('Autônomo','Colaborador','Empresa','Jovem Aprendiz') DEFAULT NULL,
  `emailUser` text DEFAULT NULL,
  `estadoUser` char(2) DEFAULT NULL,
  `cidadeUser` text DEFAULT NULL,
  `bairroUser` text DEFAULT NULL,
  `dataUser` date DEFAULT NULL,
  `filhoUser` int(11) DEFAULT NULL,
  `fotoUser` text DEFAULT NULL,
  `curriculoUser` text DEFAULT NULL,
  `experienciaUser` varchar(7) DEFAULT NULL,
  `bioUser` text DEFAULT NULL,
  `senhaUser` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Extraindo dados da tabela `user`
--

INSERT INTO `user` (`idUser`, `nomeUser`, `tipoUser`, `emailUser`, `estadoUser`, `cidadeUser`, `bairroUser`, `dataUser`, `filhoUser`, `fotoUser`, `curriculoUser`, `experienciaUser`, `bioUser`, `senhaUser`) VALUES
(1, 'João Henrique', 'Colaborador', 'joaoh2915@gmail.com', 'RN', 'Pouso Alegre', 'Guaratinguetá', '2005-11-12', 2, 'joaoh2915@gmail.com.jpg', NULL, '0', 'Eu não cometo erros! Eu sou \r\nmais forte, mais esperto e e ... \r\neu sou melhor', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(2, 'Americanas', 'Empresa', 'americanas.empresa@gmail.com', 'SP', 'São Bernardo do Campo', 'Centro', NULL, NULL, 'americanas.empresa@gmail.com.png', NULL, NULL, 'Empresa que tem de tudo', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(3, 'Luís Tavares', 'Autônomo', 'luis.analista@gmail.com', 'SC', 'Pouso Alegre', 'Jatoba', '1992-02-20', 1, NULL, NULL, '24', 'Formado em Análise de Dados', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(4, 'Antônio Almeida', 'Jovem Aprendiz', 'antony.guides@gmail.com', 'AC', 'Pouso Alegre', 'JK', '2005-11-12', NULL, NULL, NULL, NULL, 'O povo não quer comprar cartucho de carabina. \r\n(pausa dramática)\r\nO povo ... quer GOZARRRR....', '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(7, 'Casas Bahia', 'Empresa', 'casas.bahia@gmail.com', 'MG', 'Cachoeira de Minas', 'Centro', NULL, NULL, NULL, NULL, NULL, NULL, '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4'),
(11, 'Joaquim Rafael da Silva Melo ', 'Jovem Aprendiz', 'joaquimsilvamelo5@gmail.com', 'MG', 'Pouso Alegre ', 'Centro ', '2005-10-17', NULL, NULL, NULL, NULL, NULL, '03ac674216f3e15c761ee1a5e255f067953623c8b388b4459e13f978d7c846f4');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `autonomo`
--
ALTER TABLE `autonomo`
  ADD PRIMARY KEY (`idAutonomo`),
  ADD KEY `idUserAutonomo_idUser` (`idUserAutonomo`);

--
-- Índices para tabela `colaborador`
--
ALTER TABLE `colaborador`
  ADD PRIMARY KEY (`idColaborador`),
  ADD KEY `idUserColaborador_idUser` (`idUserColaborador`);

--
-- Índices para tabela `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`idEmpresa`),
  ADD KEY `idUserEmpresa_idUser` (`idUserEmpresa`);

--
-- Índices para tabela `jovemaprendiz`
--
ALTER TABLE `jovemaprendiz`
  ADD PRIMARY KEY (`idAprendiz`),
  ADD KEY `idUserAprendiz_idUser` (`idUserAprendiz`);

--
-- Índices para tabela `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`idLogin`),
  ADD KEY `idUserLogin_idUser` (`idUserLogin`);

--
-- Índices para tabela `posts`
--
ALTER TABLE `posts`
  ADD PRIMARY KEY (`idPost`),
  ADD KEY `idUserPost_idUser` (`idUserPost`);

--
-- Índices para tabela `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`idUser`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `autonomo`
--
ALTER TABLE `autonomo`
  MODIFY `idAutonomo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `colaborador`
--
ALTER TABLE `colaborador`
  MODIFY `idColaborador` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `empresa`
--
ALTER TABLE `empresa`
  MODIFY `idEmpresa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de tabela `jovemaprendiz`
--
ALTER TABLE `jovemaprendiz`
  MODIFY `idAprendiz` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de tabela `login`
--
ALTER TABLE `login`
  MODIFY `idLogin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=102;

--
-- AUTO_INCREMENT de tabela `posts`
--
ALTER TABLE `posts`
  MODIFY `idPost` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT de tabela `user`
--
ALTER TABLE `user`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
