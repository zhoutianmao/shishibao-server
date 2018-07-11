create database shishibao default charset utf8;

CREATE TABLE IF NOT EXISTS `ssb_user`(
   `u_user_id` char(32),
   `u_password` VARCHAR(32) NOT NULL,
   `u_username` VARCHAR(60) NOT NULL,
   `u_email` VARCHAR(50),
   `u_phone` VARCHAR (15) NOT NULL,
   `create_time` TIMESTAMP NOT NULL,
   `sex` CHAR(1) comment '0: main; 1: woman; 2 other',
   PRIMARY KEY (`u_user_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;