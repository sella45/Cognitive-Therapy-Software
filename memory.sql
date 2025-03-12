CREATE DATABASE memories;
USE memories;

CREATE TABLE user (
    user_id VARCHAR(20) PRIMARY KEY,
    user_password VARCHAR(255) NOT NULL,
    user_name VARCHAR(20) NOT NULL,
    user_address TEXT NOT NULL,
    detail_address TEXT NOT NULL,
	user_tell_number VARCHAR(15) NOT NULL UNIQUE
);

SHOW TABLES;