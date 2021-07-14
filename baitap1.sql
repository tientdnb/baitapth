DROP DATABASE IF EXISTS ProductManager;
CREATE DATABASE ProductManager;
USE ProductManager;

-- Create table ProductType --
DROP TABLE IF EXISTS ProductType;
CREATE TABLE ProductType (
	ProductTypeId	SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ProductTypeName	VARCHAR(50) NOT NULL UNIQUE
);

-- Create table Product --
DROP TABLE IF EXISTS Product;
CREATE TABLE Product (
	ProductId 		SMALLINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    ProductName 	VARCHAR(50) NOT NULL UNIQUE,
    Producer		VARCHAR(50) NOT NULL,
    ProductTypeId 	SMALLINT UNSIGNED NOT NULL,
    FOREIGN KEY (ProductTypeId) REFERENCES ProductType(ProductTypeId)
);

