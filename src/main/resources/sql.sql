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

CREATE TABLE IF NOT EXISTS `ssb_room`(
   `u_room_id` CHAR(32),
   `u_title` VARCHAR(120) NOT NULL,
   `u_cover` VARCHAR(160) NOT NULL,
   `u_room_holder` VARCHAR(32) NOT NULL,
   `u_create_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
   `u_last_update_time` TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
   `longitude` VARCHAR(15),
   `latitude` VARCHAR(15),
    `comment_count` BIGINT,
    `approval_count` BIGINT,
     PRIMARY KEY (`u_room_id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;