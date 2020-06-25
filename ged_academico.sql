SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

CREATE SCHEMA IF NOT EXISTS `ged_academico` DEFAULT CHARACTER SET latin1 ;
USE `ged_academico` ;

-- -----------------------------------------------------
-- Table `ged_academico`.`tbladministradores`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tbladministradores` (
  `admId` INT(11) NOT NULL AUTO_INCREMENT ,
  `admNome` VARCHAR(45) NULL DEFAULT NULL ,
  `admLogon` VARCHAR(10) NULL ,
  `admSenha` VARCHAR(10) NULL DEFAULT NULL ,
  PRIMARY KEY (`admId`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ged_academico`.`tblarea`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tblarea` (
  `areaId` INT(11) NOT NULL AUTO_INCREMENT ,
  `areaNome` VARCHAR(45) NULL DEFAULT NULL ,
  `areaCodigo` VARCHAR(14) NULL ,
  PRIMARY KEY (`areaId`) ,
  UNIQUE INDEX `areaCodigo_UNIQUE` (`areaCodigo` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ged_academico`.`tblautores`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tblautores` (
  `autorId` INT(11) NOT NULL AUTO_INCREMENT ,
  `autorNome` VARCHAR(45) NULL DEFAULT NULL ,
  `autorEmail` VARCHAR(45) NULL DEFAULT NULL ,
  `autorCidade` VARCHAR(45) NULL ,
  `autorEndereco` VARCHAR(45) NULL ,
  `autorFone` VARCHAR(45) NULL ,
  `autorCelular` VARCHAR(45) NULL ,
  PRIMARY KEY (`autorId`) ,
  UNIQUE INDEX `autorEmail_UNIQUE` (`autorEmail` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ged_academico`.`tblcategoria`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tblcategoria` (
  `categoriaId` INT(11) NOT NULL AUTO_INCREMENT ,
  `categoriaNome` VARCHAR(45) NULL DEFAULT NULL ,
  `categoriaCodigo` VARCHAR(14) NULL ,
  PRIMARY KEY (`categoriaId`) ,
  UNIQUE INDEX `categoriaCodigo_UNIQUE` (`categoriaCodigo` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ged_academico`.`tblidioma`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tblidioma` (
  `idiomaId` INT(11) NOT NULL AUTO_INCREMENT ,
  `idiomaNome` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`idiomaId`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ged_academico`.`tblgrau`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tblgrau` (
  `grauId` INT(11) NOT NULL AUTO_INCREMENT ,
  `grauNome` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`grauId`) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ged_academico`.`tblgrande_area`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tblgrande_area` (
  `g_areaId` INT(11) NOT NULL AUTO_INCREMENT ,
  `g_areaNome` VARCHAR(45) NULL DEFAULT NULL ,
  `g_areaCodigo` VARCHAR(14) NULL ,
  PRIMARY KEY (`g_areaId`) ,
  UNIQUE INDEX `g_areaCodigo_UNIQUE` (`g_areaCodigo` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ged_academico`.`tblespecialidade`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tblespecialidade` (
  `especialidadeId` INT(11) NOT NULL AUTO_INCREMENT ,
  `especialidadeNome` VARCHAR(60) NULL DEFAULT NULL ,
  `especialidadeCodigo` VARCHAR(14) NULL ,
  PRIMARY KEY (`especialidadeId`) ,
  UNIQUE INDEX `especialidadeCodigo_UNIQUE` (`especialidadeCodigo` ASC) )
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `ged_academico`.`tbldocumentos`
-- -----------------------------------------------------
CREATE  TABLE IF NOT EXISTS `ged_academico`.`tbldocumentos` (
  `docId` INT(11) NOT NULL AUTO_INCREMENT ,
  `autorId` INT(11) NOT NULL ,
  `docAno` INT(4) NULL DEFAULT NULL ,
  `areaId` INT(11) NOT NULL ,
  `g_areaId` INT(11) NOT NULL ,
  `idiomaId` INT(11) NOT NULL ,
  `docBancaDefesa` VARCHAR(60) NULL DEFAULT NULL ,
  `categoriaId` INT(11) NOT NULL ,
  `docQtPaginas` INT(11) NULL DEFAULT NULL ,
  `docPalavrasChaves` VARCHAR(100) NULL DEFAULT NULL ,
  `docRodape` VARCHAR(45) NULL DEFAULT NULL ,
  `grauId` INT(11) NOT NULL ,
  `docTitulo` VARCHAR(120) NULL DEFAULT NULL ,
  `admId` INT(11) NOT NULL ,
  `especialidadeId` INT(11) NOT NULL ,
  `docNomeArquivoOrigem` VARCHAR(127) NOT NULL ,
  `docNomeArquivoIndice` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`docId`) ,
  INDEX `autorId` (`autorId` ASC) ,
  INDEX `idiomaId` (`idiomaId` ASC) ,
  INDEX `grauId` (`grauId` ASC) ,
  INDEX `areaId` (`areaId` ASC) ,
  INDEX `caterogiaId` (`categoriaId` ASC) ,
  INDEX `admId` (`admId` ASC) ,
  INDEX `g_areaId` (`g_areaId` ASC) ,
  INDEX `especialidadeId` (`especialidadeId` ASC) ,
  CONSTRAINT `autorId`
    FOREIGN KEY (`autorId` )
    REFERENCES `ged_academico`.`tblautores` (`autorId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `idiomaId`
    FOREIGN KEY (`idiomaId` )
    REFERENCES `ged_academico`.`tblidioma` (`idiomaId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `grauId`
    FOREIGN KEY (`grauId` )
    REFERENCES `ged_academico`.`tblgrau` (`grauId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `areaId`
    FOREIGN KEY (`areaId` )
    REFERENCES `ged_academico`.`tblarea` (`areaId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `caterogiaId`
    FOREIGN KEY (`categoriaId` )
    REFERENCES `ged_academico`.`tblcategoria` (`categoriaId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `admId`
    FOREIGN KEY (`admId` )
    REFERENCES `ged_academico`.`tbladministradores` (`admId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `g_areaId`
    FOREIGN KEY (`g_areaId` )
    REFERENCES `ged_academico`.`tblgrande_area` (`g_areaId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `especialidadeId`
    FOREIGN KEY (`especialidadeId` )
    REFERENCES `ged_academico`.`tblespecialidade` (`especialidadeId` )
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = latin1;



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
