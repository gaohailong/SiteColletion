/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50617
Source Host           : localhost:3306
Source Database       : site_collection

Target Server Type    : MYSQL
Target Server Version : 50617
File Encoding         : 65001

Date: 2016-09-07 07:51:09
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `site`
-- ----------------------------
DROP TABLE IF EXISTS `site`;
CREATE TABLE `site` (
  `id` int(5) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `categeory` int(2) DEFAULT '1',
  `date` timestamp(6) NULL DEFAULT NULL,
  `frequency` int(5) unsigned zerofill NOT NULL DEFAULT '00000',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of site
-- ----------------------------
INSERT INTO `site` VALUES ('1', 'test', 'http://localhost:8080/SiteColletion/', '1', null, '00000');
INSERT INTO `site` VALUES ('2', 'test2', 'http://blog.sina.com.cn/s/blog_9e3e549901012wrs.html', '1', null, '00001');
INSERT INTO `site` VALUES ('3', 'test3', 'https://www.baidu.com/s?ie=UTF-8&wd=css%E5%A6%82%E4%BD%95%E8%AE%A9%E4%B8%80%E4%B8%AA%E6%8C%89%E9%92%AE%E5%B1%85%E6%B5%8F%E8%A7%88%E5%99%A8%E5%8F%B3', '1', null, '00000');
INSERT INTO `site` VALUES ('24', 'test4', 'http://blog.sina.com.cn/s/blog_9e3e549901012wrs.html', '2', null, '00002');
INSERT INTO `site` VALUES ('25', 'test5', 'categeory', '2', null, '00001');
INSERT INTO `site` VALUES ('26', 'test4', 'http://localhost:8080/SiteColletion/', '1', null, '00001');
INSERT INTO `site` VALUES ('27', '5', '', '0', null, '00000');
INSERT INTO `site` VALUES ('28', '', '', '0', null, '00000');
INSERT INTO `site` VALUES ('29', 'f', 'f', '0', null, '00000');
INSERT INTO `site` VALUES ('30', 'test6', 'http://localhost:8080/SiteColletion/', '0', null, '00000');
INSERT INTO `site` VALUES ('31', 'test7', 'http://localhost:8080/SiteColletion/', '1', null, '00000');

-- ----------------------------
-- Table structure for `subject_categeory`
-- ----------------------------
DROP TABLE IF EXISTS `subject_categeory`;
CREATE TABLE `subject_categeory` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `type` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of subject_categeory
-- ----------------------------
INSERT INTO `subject_categeory` VALUES ('1', 'android');
INSERT INTO `subject_categeory` VALUES ('2', 'php');
