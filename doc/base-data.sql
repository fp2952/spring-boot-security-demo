/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : base1

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-04-23 19:34:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for base_menu
-- ----------------------------
DROP TABLE IF EXISTS `base_menu`;
CREATE TABLE `base_menu` (
  `ID` varchar(32) NOT NULL,
  `MENU_URL` varchar(120) DEFAULT NULL,
  `MENU_SEQ` varchar(120) DEFAULT NULL,
  `MENU_PARENT_ID` int(11) DEFAULT NULL,
  `MENU_NAME` varchar(50) DEFAULT NULL,
  `MENU_ICON` varchar(20) DEFAULT NULL,
  `MENU_ORDER` varchar(11) DEFAULT NULL,
  `IS_LEAF` varchar(20) DEFAULT NULL COMMENT '1 是 0 否',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_menu
-- ----------------------------
INSERT INTO `base_menu` VALUES ('1', '/menu.ftl', '1', null, null, null, null, null);

-- ----------------------------
-- Table structure for base_role
-- ----------------------------
DROP TABLE IF EXISTS `base_role`;
CREATE TABLE `base_role` (
  `ID` varchar(32) NOT NULL,
  `ROLE_CODE` varchar(32) DEFAULT NULL,
  `ROLE_NAME` varchar(64) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_role
-- ----------------------------
INSERT INTO `base_role` VALUES ('1', 'sysadmin', '管理员');
INSERT INTO `base_role` VALUES ('2', 'test', '角色1');
INSERT INTO `base_role` VALUES ('3', 'test1', '角色2');

-- ----------------------------
-- Table structure for base_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `base_role_menu`;
CREATE TABLE `base_role_menu` (
  `ID` varchar(32) NOT NULL,
  `ROLE_ID` varchar(32) DEFAULT NULL,
  `MENU_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_role_menu
-- ----------------------------
INSERT INTO `base_role_menu` VALUES ('1', '2', '1');

-- ----------------------------
-- Table structure for base_user
-- ----------------------------
DROP TABLE IF EXISTS `base_user`;
CREATE TABLE `base_user` (
  `ID` varchar(32) NOT NULL,
  `USER_NAME` varchar(50) DEFAULT NULL,
  `USER_PASSWORD` varchar(100) DEFAULT NULL,
  `NIKE_NAME` varchar(50) DEFAULT NULL,
  `STATUS` int(11) DEFAULT NULL COMMENT '1 正常，2 禁用',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_user
-- ----------------------------
INSERT INTO `base_user` VALUES ('1', 'sysadmin', '$2a$10$6UzMN/VMh73bAHmkMwgFZukOThm/EPzu/q.kTqCCpKUMFtljeKBaq', 'sysadmin', '1');

-- ----------------------------
-- Table structure for base_user_role
-- ----------------------------
DROP TABLE IF EXISTS `base_user_role`;
CREATE TABLE `base_user_role` (
  `ID` varchar(32) NOT NULL,
  `USER_ID` varchar(32) DEFAULT NULL,
  `ROLE_ID` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of base_user_role
-- ----------------------------
INSERT INTO `base_user_role` VALUES ('1', '1', '1');
INSERT INTO `base_user_role` VALUES ('2', '1', '2');
INSERT INTO `base_user_role` VALUES ('3', '1', '3');
