/*
Navicat MySQL Data Transfer

Source Server         : mysql_it
Source Server Version : 50628
Source Host           : 10.100.2.30:3306
Source Database       : crisp

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2018-02-24 17:29:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_address
-- ----------------------------
DROP TABLE IF EXISTS `test_address`;
CREATE TABLE `test_address` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `address` varchar(16) NOT NULL COMMENT '性别',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_address
-- ----------------------------
INSERT INTO `test_address` VALUES ('1', '徐州云龙');
INSERT INTO `test_address` VALUES ('2', '徐州金山桥');
