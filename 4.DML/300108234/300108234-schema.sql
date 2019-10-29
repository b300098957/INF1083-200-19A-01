-- Mon domaine

CREATE DATABASE IF NOT EXISTS Hijabfashion;

-- Mon utilisateur

CREATE USER IF NOT EXISTS 'halima'@'localhost' IDENTIFIED BY 'password';
GRANT ALL ON Hijabfashion.* TO 'halima'@'localhost';


-- Selectionner la base de donnees 
 
use Hijabfashion;


-- Mes tables



CREATE TABLE TISSUS (
tissu INT AUTO_INCREMENT,
nom VARCHAR(30) NOT NULL, 
PRIMARY KEY (tissu)
);


CREATE TABLE ACCESSOIRES (
accessoire INT AUTO_INCREMENT,  
nom VARCHAR(30) NOT NULL,
type VARCHAR(30) NOT NULL,   
PRIMARY KEY (accessoire)

);


CREATE TABLE PAYS_DE_FABRICATION ( 
tissu INT,
accessoire INT,
pays_de_fabrication INT,
PRIMARY KEY ( tissu, accessoire),
FOREIGN KEY(tissu) 
     REFERENCES TISSUS(tissu),
FOREIGN KEY(accessoire) 
     REFERENCES ACCESSOIRES(accessoire)
 
 );
