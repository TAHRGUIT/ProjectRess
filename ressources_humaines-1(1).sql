-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 07 Avril 2016 à 22:38
-- Version du serveur :  5.6.15-log
-- Version de PHP :  5.4.24

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `ressources humaines`
--

-- --------------------------------------------------------

--
-- Structure de la table `absence`
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
-- Contenu de la table `absence`
--

INSERT INTO `absence` (`ID`, `PIECE_JUSTIFICATIVES`, `TERME`, `SERVICE`, `RAISON_ABSENCE`, `DU`, `AU`) VALUES
(1, 'lwelada', 'long', 'man3ref', 'chofnta', '20/12/2016', '20/12/2018'),
(2, 'lwelada', 'long', 'man3ref', 'chofnta', '20/12/2016', '20/12/2018');

-- --------------------------------------------------------

--
-- Structure de la table `attestation`
--

CREATE TABLE IF NOT EXISTS `attestation` (
  `ID` int(255) NOT NULL AUTO_INCREMENT,
  `DATE` date NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `conge_congeexceptionnel`
--

CREATE TABLE IF NOT EXISTS `conge_congeexceptionnel` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DUREE` int(11) NOT NULL,
  `DU` varchar(255) NOT NULL,
  `AU` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `conge_congeexceptionnel`
--

INSERT INTO `conge_congeexceptionnel` (`ID`, `DUREE`, `DU`, `AU`) VALUES
(1, 25, '20/12/2016', '20/12/2019'),
(2, 25, '20/12/2016', '20/12/2019');

-- --------------------------------------------------------

--
-- Structure de la table `infopersonnels`
--

CREATE TABLE IF NOT EXISTS `infopersonnels` (
  `ID` int(255) NOT NULL AUTO_INCREMENT,
  `SEX` varchar(255) DEFAULT NULL,
  `NOMAR` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `PRENOMAR` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `DATE_NAISSANCE` varchar(255) DEFAULT NULL,
  `LIEU_DE_NAISSANCE` varchar(255) DEFAULT NULL,
  `SITUATION_FAMILIALE` varchar(255) DEFAULT NULL,
  `SITUATION_ADMINISTRATIVE` varchar(255) DEFAULT NULL,
  `DATE_RECRUTMENT` varchar(255) DEFAULT NULL,
  `Date_affectation` varchar(255) DEFAULT NULL,
  `ECHELLE` varchar(255) DEFAULT NULL,
  `ECHELON` varchar(255) DEFAULT NULL,
  `SEPCIALITE` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=170 ;

--
-- Contenu de la table `infopersonnels`
--

INSERT INTO `infopersonnels` (`ID`, `SEX`, `NOMAR`, `PRENOMAR`, `DATE_NAISSANCE`, `LIEU_DE_NAISSANCE`, `SITUATION_FAMILIALE`, `SITUATION_ADMINISTRATIVE`, `DATE_RECRUTMENT`, `Date_affectation`, `ECHELLE`, `ECHELON`, `SEPCIALITE`, `type`) VALUES
(165, '12', 'بسيب', 'نمستب', '12', NULL, '12', NULL, '12', '12', '12', '12', NULL, 'emp'),
(168, '1', 'واحد', 'واحد', '1', NULL, '1', NULL, '1', '1', '1', '1', NULL, 'emp'),
(169, 'mal', 'منير', 'الحياني', '12/12/12', NULL, 'celib', NULL, '1212', '12', '12', '22', NULL, 'emp');

-- --------------------------------------------------------

--
-- Structure de la table `infopersonnes`
--

CREATE TABLE IF NOT EXISTS `infopersonnes` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NOM` varchar(255) DEFAULT NULL,
  `PRENOM` varchar(255) DEFAULT NULL,
  `SOM` varchar(255) DEFAULT NULL,
  `CIN` varchar(255) DEFAULT NULL,
  `GRADE` varchar(255) DEFAULT NULL,
  `CADRE` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=168 ;

--
-- Contenu de la table `infopersonnes`
--

INSERT INTO `infopersonnes` (`ID`, `NOM`, `PRENOM`, `SOM`, `CIN`, `GRADE`, `CADRE`, `type`) VALUES
(166, '1', '1', '1', '1', '1', NULL, 'emp'),
(163, '12', '12', '12', '12', '12', NULL, 'emp'),
(167, 'lahyani', 'mounir', '121212', 'p121212', '12', NULL, 'emp');

-- --------------------------------------------------------

--
-- Structure de la table `international`
--

CREATE TABLE IF NOT EXISTS `international` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `AFFECTATION` varchar(255) NOT NULL,
  `AVIS_CHEF` varchar(255) NOT NULL,
  `MOTIF` varchar(255) NOT NULL,
  `ADRESSE` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

-- --------------------------------------------------------

--
-- Structure de la table `ordre_de_mission`
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
-- Contenu de la table `ordre_de_mission`
--

INSERT INTO `ordre_de_mission` (`ID`, `MISSION_A`, `OBJET_MISSION`, `TRANSPORT`, `DU`, `AU`) VALUES
(1, 'london', 'education', 'avion', '12/03/2018', '12/03/2030'),
(2, 'london', 'education', 'avion', '12/03/2018', '12/03/2030');

-- --------------------------------------------------------

--
-- Structure de la table `travail`
--

CREATE TABLE IF NOT EXISTS `travail` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `DRPP` varchar(255) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Contenu de la table `travail`
--

INSERT INTO `travail` (`ID`, `DRPP`) VALUES
(1, 'drpp'),
(2, 'drpp');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `position` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id_user`, `name`, `password`, `position`) VALUES
(1, 'lahyani', 'lahyani', 'kolchi');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
