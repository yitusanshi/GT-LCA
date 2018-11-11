/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50626
Source Host           : localhost:3306
Source Database       : tyre

Target Server Type    : MYSQL
Target Server Version : 50626
File Encoding         : 65001

Date: 2018-11-11 18:50:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for maunfacturer
-- ----------------------------
DROP TABLE IF EXISTS `maunfacturer`;
CREATE TABLE `maunfacturer` (
  `firm_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '厂商id',
  `username` varchar(255) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(255) NOT NULL COMMENT '密码',
  `firm_name` varchar(255) NOT NULL COMMENT '厂商名称',
  `product` varchar(255) NOT NULL COMMENT '产品',
  `address` varchar(255) NOT NULL COMMENT '地址',
  `phone` varchar(255) DEFAULT NULL COMMENT '电话',
  `department` varchar(255) DEFAULT NULL COMMENT '所属部门',
  `email` varchar(255) DEFAULT NULL COMMENT '公司邮箱',
  `founding_time` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '公司成立时间',
  `register_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `desc` text CHARACTER SET utf8 COMMENT '公司描述',
  `grade` int(10) NOT NULL DEFAULT '-1' COMMENT '等级权限',
  PRIMARY KEY (`firm_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;
