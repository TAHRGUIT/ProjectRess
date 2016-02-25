-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 25, 2016 at 09:47 PM
-- Server version: 5.6.17
-- PHP Version: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `ressources humaines`
--

-- --------------------------------------------------------

--
-- Table structure for table `absence`
--

CREATE TABLE IF NOT EXISTS `absence` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `PIECE_JUSTIFICATIVES` varchar(255) NOT NULL,
  `TERME` varchar(255) NOT NULL,
  `SERVICE` varchar(255) NOT NULL,
  `RAISON_ABSENCE` varchar(255) NOT NULL,
  `DU` date NOT NULL,
  `AU` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `attestation`
--

CREATE TABLE IF NOT EXISTS `attestation` (
  `ID` int(255) NOT NULL AUTO_INCREMENT,
  `DATE` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `conge_congeexceptionnel`
--

CREATE TABLE IF NOT EXISTS `conge_congeexceptionnel` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DUREE` int(11) NOT NULL,
  `DU` date NOT NULL,
  `AU` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `infopersonnels`
--

CREATE TABLE IF NOT EXISTS `infopersonnels` (
  `ID` int(255) NOT NULL AUTO_INCREMENT,
  `SEX` varchar(255) NOT NULL,
  `الإسم العائلي` varchar(255) CHARACTER SET utf8 NOT NULL,
  `الإسم الشخصي` varchar(255) CHARACTER SET utf8 NOT NULL,
  `DATE_NAISSANCE` date NOT NULL,
  `LIEU_DE_NAISSANCE` varchar(255) NOT NULL,
  `SITUATION_FAMILIALE` varchar(255) NOT NULL,
  `SITUATION_ADMINISTRATIVE` varchar(255) NOT NULL,
  `DATE_RECRUTMENT` date NOT NULL,
  `ECHELLE` varchar(255) NOT NULL,
  `ECHELON` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `infopersonnels`
--

INSERT INTO `infopersonnels` (`ID`, `SEX`, `الإسم العائلي`, `الإسم الشخصي`, `DATE_NAISSANCE`, `LIEU_DE_NAISSANCE`, `SITUATION_FAMILIALE`, `SITUATION_ADMINISTRATIVE`, `DATE_RECRUTMENT`, `ECHELLE`, `ECHELON`) VALUES
(1, 'HOMME', 'الحياني', 'منير', '1993-02-11', 'zazate', 'celibataire', '', '2016-02-10', '12', '12');

-- --------------------------------------------------------

--
-- Table structure for table `infopersonnes`
--

CREATE TABLE IF NOT EXISTS `infopersonnes` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOM` varchar(255) NOT NULL,
  `PRENOM` varchar(255) NOT NULL,
  `SOM` varchar(255) NOT NULL,
  `CIN` varchar(255) NOT NULL,
  `GRADE` varchar(255) NOT NULL,
  `CADRE` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `international`
--

CREATE TABLE IF NOT EXISTS `international` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AFFECTATION` varchar(255) NOT NULL,
  `AVIS_CHEF` varchar(255) NOT NULL,
  `MOTIF` varchar(255) NOT NULL,
  `ADRESSE` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `ordre_de_mission`
--

CREATE TABLE IF NOT EXISTS `ordre_de_mission` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MISSION_A` varchar(255) NOT NULL,
  `OBJET_MISSION` varchar(255) NOT NULL,
  `TRANSPORT` varchar(255) NOT NULL,
  `DU` date NOT NULL,
  `AU` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `travail`
--

CREATE TABLE IF NOT EXISTS `travail` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DRPP` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `name`, `password`) VALUES
(1, 'lahyani', 'lahyani');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
