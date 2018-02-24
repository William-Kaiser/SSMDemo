/*
Navicat MySQL Data Transfer

Source Server         : mysql_it
Source Server Version : 50628
Source Host           : 10.100.2.30:3306
Source Database       : crisp

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2018-02-24 17:29:04
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_user_role
-- ----------------------------
DROP TABLE IF EXISTS `test_user_role`;
CREATE TABLE `test_user_role` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `user_id` int(16) NOT NULL COMMENT '用户名',
  `role_id` int(16) NOT NULL COMMENT '角色名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_user_role
-- ----------------------------
INSERT INTO `test_user_role` VALUES ('1', '1', '1');
INSERT INTO `test_user_role` VALUES ('2', '1', '3');
INSERT INTO `test_user_role` VALUES ('3', '2', '2');
INSERT INTO `test_user_role` VALUES ('4', '2', '3');
INSERT INTO `test_user_role` VALUES ('5', '3', '3');
