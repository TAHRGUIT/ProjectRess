-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Mar 03, 2016 at 01:22 AM
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
  `DU` varchar(255) NOT NULL,
  `AU` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `absence`
--

INSERT INTO `absence` (`ID`, `PIECE_JUSTIFICATIVES`, `TERME`, `SERVICE`, `RAISON_ABSENCE`, `DU`, `AU`) VALUES
(1, 'lwelada', 'long', 'man3ref', 'chofnta', '20/12/2016', '20/12/2018'),
(2, 'lwelada', 'long', 'man3ref', 'chofnta', '20/12/2016', '20/12/2018');

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
  `DU` varchar(255) NOT NULL,
  `AU` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `conge_congeexceptionnel`
--

INSERT INTO `conge_congeexceptionnel` (`ID`, `DUREE`, `DU`, `AU`) VALUES
(1, 25, '20/12/2016', '20/12/2019'),
(2, 25, '20/12/2016', '20/12/2019');

-- --------------------------------------------------------

--
-- Table structure for table `infopersonnels`
--

CREATE TABLE IF NOT EXISTS `infopersonnels` (
  `ID` int(255) NOT NULL AUTO_INCREMENT,
  `SEX` varchar(255) DEFAULT NULL,
  `NOMAR` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `PRENOMAR` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `DATE_NAISSANCE` varchar(255) DEFAULT NULL,
  `LIEU_DE_NAISSANCE` varchar(255) DEFAULT NULL,
  `SITUATION_FAMILIALE` varchar(255) DEFAULT NULL,
  `SITUATION_ADMINISTRATIVE` varchar(255) DEFAULT NULL,
  `DATE_RECRUTMENT` varchar(255) DEFAULT NULL,
  `ECHELLE` varchar(255) DEFAULT NULL,
  `ECHELON` varchar(255) DEFAULT NULL,
  `SEPCIALITE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=34 ;

--
-- Dumping data for table `infopersonnels`
--

INSERT INTO `infopersonnels` (`ID`, `SEX`, `NOMAR`, `PRENOMAR`, `DATE_NAISSANCE`, `LIEU_DE_NAISSANCE`, `SITUATION_FAMILIALE`, `SITUATION_ADMINISTRATIVE`, `DATE_RECRUTMENT`, `ECHELLE`, `ECHELON`, `SEPCIALITE`) VALUES
(33, NULL, NULL, NULL, '1993', 'azilal', 'prof', 'ma3rftch', '2020', NULL, '12/ho', 'doyen');

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=23 ;

--
-- Dumping data for table `infopersonnes`
--

INSERT INTO `infopersonnes` (`ID`, `NOM`, `PRENOM`, `SOM`, `CIN`, `GRADE`, `CADRE`) VALUES
(22, 'lol', 'lol', 'lol', 'lol', 'lol', 'lol');

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
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `international`
--

INSERT INTO `international` (`ID`, `AFFECTATION`, `AVIS_CHEF`, `MOTIF`, `ADRESSE`) VALUES
(1, 'MIRIKAN', 'pro', 'oizsfv', 'Hey El Mohammadi '),
(2, 'MIRIKAN', 'pro', 'oizsfv', 'Hey El Mohammadi ');

-- --------------------------------------------------------

--
-- Table structure for table `ordre_de_mission`
--

CREATE TABLE IF NOT EXISTS `ordre_de_mission` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `MISSION_A` varchar(255) NOT NULL,
  `OBJET_MISSION` varchar(255) NOT NULL,
  `TRANSPORT` varchar(255) NOT NULL,
  `DU` varchar(255) NOT NULL,
  `AU` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `ordre_de_mission`
--

INSERT INTO `ordre_de_mission` (`ID`, `MISSION_A`, `OBJET_MISSION`, `TRANSPORT`, `DU`, `AU`) VALUES
(1, 'london', 'education', 'avion', '12/03/2018', '12/03/2030'),
(2, 'london', 'education', 'avion', '12/03/2018', '12/03/2030');

-- --------------------------------------------------------

--
-- Table structure for table `travail`
--

CREATE TABLE IF NOT EXISTS `travail` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DRPP` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `travail`
--

INSERT INTO `travail` (`ID`, `DRPP`) VALUES
(1, 'drpp'),
(2, 'drpp');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `position` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `name`, `password`, `position`) VALUES
(1, 'lahyani', 'lahyani', 'kolchi');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
