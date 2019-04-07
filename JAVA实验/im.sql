/*
Navicat MySQL Data Transfer

Source Server         : 戴智辉
Source Server Version : 50547
Source Host           : localhost:3306
Source Database       : im

Target Server Type    : MYSQL
Target Server Version : 50547
File Encoding         : 65001

Date: 2018-06-27 00:36:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `userName` varchar(55) DEFAULT NULL,
  `userPwd` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'test', '1234');
INSERT INTO `users` VALUES ('2', 'zhangsan', '1234');
INSERT INTO `users` VALUES ('3', 'abcd', '1234');
INSERT INTO `users` VALUES ('4', 'lisi', '1234');
INSERT INTO `users` VALUES ('5', 'wangwu', '1234');
