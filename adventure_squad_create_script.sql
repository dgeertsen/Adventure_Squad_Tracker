DROP TABLE IF EXISTS `user_adventure`;
DROP TABLE IF EXISTS `user`;
DROP TABLE IF EXISTS `adventure`;
DROP TABLE IF EXISTS `location`;

CREATE TABLE `location` (
  `location_id` int NOT NULL AUTO_INCREMENT,
  `city` varchar(45) NOT NULL,
  `state_province` varchar(45) NOT NULL,
  `country` varchar(45) NOT NULL,
  PRIMARY KEY (`location_id`)
);

CREATE TABLE `adventure` (
  `adventure_id` int NOT NULL AUTO_INCREMENT,
  `location_id` int NOT NULL,
  `start_date` date NOT NULL,
  `end_date` date DEFAULT NULL,
  PRIMARY KEY (`adventure_id`),
  FOREIGN KEY (`location_id`) REFERENCES `location` (`location_id`)
);

CREATE TABLE `user` (
  `user_id` int NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `age` int NOT NULL,
  PRIMARY KEY (`user_id`)
);

CREATE TABLE `user_adventure` (
  `user_id` int NOT NULL,
  `adventure_id` int NOT NULL,
  PRIMARY KEY (`user_id`,`adventure_id`),
  FOREIGN KEY (`user_id`) REFERENCES `user` (`user_id`),
  FOREIGN KEY (`adventure_id`) REFERENCES `adventure` (`adventure_id`)
);
