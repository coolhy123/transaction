/*
Navicat MySQL Data Transfer

Source Server         : spring5
Source Server Version : 50726
Source Host           : localhost:3306
Source Database       : spring5

Target Server Type    : MYSQL
Target Server Version : 50726
File Encoding         : 65001

Date: 2020-06-02 13:58:53
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(255) NOT NULL,
  PRIMARY KEY (`userId`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'heyong');
INSERT INTO `user` VALUES ('2', 'heyong');
INSERT INTO `user` VALUES ('3', 'heyong');
INSERT INTO `user` VALUES ('4', 'heyong');
INSERT INTO `user` VALUES ('5', 'heyong');
