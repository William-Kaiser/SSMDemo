/*
SQLyog v10.2 
MySQL - 5.1.72-community : Database - mybatis
*********************************************************************
*/
/*Table structure for table `user` */

CREATE TABLE `test_address` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `address` varchar(16) NOT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `test_user` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) NOT NULL COMMENT '用户名称',
  `password` varchar(16) NOT NULL COMMENT '用户密码',
  `addr_id` int(16) NOT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  KEY `FK_user_1` (`addr_id`),
  CONSTRAINT `FK_user_1` FOREIGN KEY (`addr_id`) REFERENCES `test_address` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

/*Table structure for table `orders` */

CREATE TABLE `test_orders` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `user_id` int(16) NOT NULL COMMENT '下单用户id',
  `orderno` varchar(16) NOT NULL COMMENT '订单号',
  `ordername` varchar(16) NOT NULL COMMENT '订单名称',
  PRIMARY KEY (`id`),
  KEY `FK_orders_1` (`user_id`),
  CONSTRAINT `FK_orders_id` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


CREATE TABLE `test_orders_detail` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `orders_id` int(16) NOT NULL COMMENT '订单id',
  `price` float(10,1) NOT NULL COMMENT '商品定价',
  `detail` text COMMENT '商品描述',
  PRIMARY KEY (`id`),
  KEY `FK_detail_1` (`orders_id`),
  CONSTRAINT `FK_detail_1` FOREIGN KEY (`orders_id`) REFERENCES `test_orders` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `test_role` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(16) NOT NULL COMMENT '角色名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `test_user_role` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `role_id` int(16) NOT NULL COMMENT '角色名',
  `user_id` int(16) NOT NULL COMMENT '用户名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;

CREATE TABLE `test_permission` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `role_id` int(16) NOT NULL COMMENT '角色名',
  `permname` varchar(16) NOT NULL COMMENT '权限名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;




