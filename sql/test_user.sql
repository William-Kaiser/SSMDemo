/*
Navicat MySQL Data Transfer

Source Server         : mysql_it
Source Server Version : 50628
Source Host           : 10.100.2.30:3306
Source Database       : crisp

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2018-02-24 17:28:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_user
-- ----------------------------
DROP TABLE IF EXISTS `test_user`;
CREATE TABLE `test_user` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `username` varchar(16) NOT NULL COMMENT '用户名称',
  `password` varchar(16) NOT NULL COMMENT '用户密码',
  `addr_id` int(16) NOT NULL COMMENT '地址',
  PRIMARY KEY (`id`),
  KEY `FK_user_1` (`addr_id`),
  CONSTRAINT `FK_user_1` FOREIGN KEY (`addr_id`) REFERENCES `test_address` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user
-- ----------------------------
INSERT INTO `test_user` VALUES ('1', '小明', '1111111', '1');
INSERT INTO `test_user` VALUES ('2', '小米', '2222222', '2');
INSERT INTO `test_user` VALUES ('3', '小黑', '3333333', '1');
