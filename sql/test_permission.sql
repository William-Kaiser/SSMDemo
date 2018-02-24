/*
Navicat MySQL Data Transfer

Source Server         : mysql_it
Source Server Version : 50628
Source Host           : 10.100.2.30:3306
Source Database       : crisp

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2018-02-24 17:29:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for test_permission
-- ----------------------------
DROP TABLE IF EXISTS `test_permission`;
CREATE TABLE `test_permission` (
  `id` int(16) NOT NULL AUTO_INCREMENT,
  `role_id` int(16) NOT NULL COMMENT '角色名',
  `permname` varchar(16) NOT NULL COMMENT '权限名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of test_permission
-- ----------------------------
INSERT INTO `test_permission` VALUES ('1', '2', 'add');
INSERT INTO `test_permission` VALUES ('2', '1', 'del');
INSERT INTO `test_permission` VALUES ('3', '2', 'update');
INSERT INTO `test_permission` VALUES ('4', '3', 'user:query');
