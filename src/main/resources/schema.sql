DROP TABLE IF EXISTS PRICES;

CREATE TABLE PRICES (
	ID INT AUTO_INCREMENT PRIMARY KEY,
	BRAND_ID INT NOT NULL, 
	START_DATE TIMESTAMP NOT NULL, 
	END_DATE TIMESTAMP NOT NULL, 
	PRICE_LIST INT NOT NULL,
	PRODUCT_ID INT NOT NULL, 
	PRIORITY INT NOT NULL, 
	PRICE DOUBLE NOT NULL, 
	CURR VARCHAR(10) NOT NULL
);