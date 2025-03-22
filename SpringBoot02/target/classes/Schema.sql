DROP TABLE IF EXISTS productdeatails;
  
CREATE TABLE productdeatails (
  productId INT AUTO_INCREMENT  PRIMARY KEY,
  productName VARCHAR(45) NOT NULL,
  ProductQuantity VARCHAR(45) NOT NULL,
  productPrice VARCHAR(45) DEFAULT NULL
);