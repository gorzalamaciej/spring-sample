CREATE TABLE user (
  id NUMBER auto_increment PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  email VARCHAR(50),
  password VARCHAR(500),
  activated BOOLEAN DEFAULT FALSE
);