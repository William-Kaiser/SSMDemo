/*
Navicat MySQL Data Transfer

Source Server         : mysql_it
Source Server Version : 50628
Source Host           : 10.100.2.30:3306
Source Database       : crisp

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2018-02-24 17:28:47
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_role
-- ----------------------------
DROP TABLE IF EXISTS `test_role`;
CREATE TABLE `test_role` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `rolename` varchar(16) NOT NULL COMMENT '角色名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_role
-- ----------------------------
INSERT INTO `test_role` VALUES ('1', 'admin');
INSERT INTO `test_role` VALUES ('2', 'manager');
INSERT INTO `test_role` VALUES ('3', 'normal');
