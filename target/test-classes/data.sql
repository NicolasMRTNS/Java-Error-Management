CREATE TABLE IF NOT EXISTS `user_table` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`usersId`),
  UNIQUE KEY `users_table_un` (`username`)
);

INSERT INTO user_table (id, username) VALUES(123, 'Test Username');
