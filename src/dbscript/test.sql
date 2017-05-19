CREATE DATABASE IF NOT EXISTS test DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use test;

DROP TABLE IF EXISTS `user_t`;

CREATE TABLE `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(40) NOT NULL,
  `password` varchar(255) NOT NULL,
  `age` int(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

/*Data for the table `user_t` */

insert  into `users`(`user_name`,`password`,`age`) values ('测试','sfasgfaf',24);


/*Data for the table `goods` */

DROP TABLE IF EXISTS `goods`;

CREATE TABLE `goods` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`good_name` varchar(40) NOT NULL,
	`quantity` int(11) NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

INSERT INTO `goods`(`good_name`, `quantity`) VALUES ('测试商品', 34);


DROP TABLE IF EXISTS `orders`;

CREATE TABLE `orders` (
	`id` int(11) NOT NULL AUTO_INCREMENT,
	`user_id` int(11) NOT NULL,
	`good_id` int(11) NOT NULL,
	`sale_good_quantity` int(11) NOT NULL,
	`created_at` timestamp NOT NULL,
	PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
