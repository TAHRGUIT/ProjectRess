-- phpMyAdmin SQL Dump
-- version 4.1.4
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Mar 23 Février 2016 à 18:09
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
-- Structure de la table `administration`
--

CREATE TABLE IF NOT EXISTS `administration` (
  `ID_Administration` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Administration`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `conge`
--

CREATE TABLE IF NOT EXISTS `conge` (
  `ID_Conge` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Conge`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `emp`
--

CREATE TABLE IF NOT EXISTS `emp` (
  `ID_Emp` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Emp`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `exceptionnel`
--

CREATE TABLE IF NOT EXISTS `exceptionnel` (
  `ID_Exceptionnel` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Exceptionnel`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `infoprofesseur`
--

CREATE TABLE IF NOT EXISTS `infoprofesseur` (
  `ID_InfoProfesseur` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_InfoProfesseur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `international`
--

CREATE TABLE IF NOT EXISTS `international` (
  `ID_Internasional` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Internasional`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `maladie`
--

CREATE TABLE IF NOT EXISTS `maladie` (
  `ID_Maladie` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Maladie`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `national`
--

CREATE TABLE IF NOT EXISTS `national` (
  `ID_National` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_National`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `ordre_de_mission`
--

CREATE TABLE IF NOT EXISTS `ordre_de_mission` (
  `ID_Ordre_de_mission` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Ordre_de_mission`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `prof`
--

CREATE TABLE IF NOT EXISTS `prof` (
  `ID_Prof` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Prof`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

CREATE TABLE IF NOT EXISTS `professeur` (
  `ID_Professeur` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Professeur`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `travail`
--

CREATE TABLE IF NOT EXISTS `travail` (
  `ID_Travail` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID_Travail`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE IF NOT EXISTS `user` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  PRIMARY KEY (`id_user`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Contenu de la table `user`
--

INSERT INTO `user` (`id_user`, `name`, `password`) VALUES
(1, 'lahyani', 'lahyani');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
