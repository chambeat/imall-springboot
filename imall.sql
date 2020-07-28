/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : imall

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2020-07-06 10:08:30
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '商品ID',
  `g_name` varchar(60) NOT NULL COMMENT '商品名称',
  `g_price` double NOT NULL COMMENT '商品价格',
  `g_stock` int(11) NOT NULL COMMENT '商品库存',
  `g_type` varchar(10) NOT NULL DEFAULT '其他' COMMENT '商品类型',
  `g_origin` varchar(30) NOT NULL COMMENT '生产地',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '雅马哈民谣吉他40寸全角', '999', '1083', '艺术/文化', '上海');
INSERT INTO `goods` VALUES ('2', '洁柔抽纸3层20包/箱*2', '59.8', '111988', '生活用品', '山东');
INSERT INTO `goods` VALUES ('3', '小米电视43寸全面屏4k全高清', '1799', '836', '家电', '浙江');
INSERT INTO `goods` VALUES ('4', '博达蓝山咖啡滤挂式10包/盒*2', '47.9', '61231', '食品', '云南');
INSERT INTO `goods` VALUES ('5', '阿迪达斯速干衣运动衣全套', '299', '8981', '服饰', '四川');
INSERT INTO `goods` VALUES ('6', '蓝月亮洗衣液2.88L', '53.9', '211713', '生活用品', '河南');
INSERT INTO `goods` VALUES ('7', '红双喜乒乓球拍比赛专用', '299', '90356', '运动/户外', '山西');
INSERT INTO `goods` VALUES ('8', '联想小新笔记本电脑', '4399', '7985', '数码音像', '北京');
INSERT INTO `goods` VALUES ('11', 'MacBook Pro苹果笔记本', '12999', '8756', '数码音像', '香港');
INSERT INTO `goods` VALUES ('12', '《Java成神之路》新版书+光盘', '69.9', '7866', '教育培训', '爪哇岛');
INSERT INTO `goods` VALUES ('13', 'Mac Pro苹果笔记本', '12999', '8756', '数码音像', '澳门');
INSERT INTO `goods` VALUES ('14', 'Mac Pro苹果笔记本', '12999', '8756', '数码音像', '澳门');
INSERT INTO `goods` VALUES ('15', 'Mac Pro苹果笔记本', '12999', '8756', '数码音像', '台湾');
INSERT INTO `goods` VALUES ('16', 'Mac Pro苹果笔记本', '12999', '8756', '数码音像', '台湾1');
INSERT INTO `goods` VALUES ('17', 'Mac Pro苹果笔记本', '12999', '8756', '数码音像', '台湾2');
INSERT INTO `goods` VALUES ('18', 'Mac Pro苹果笔记本', '12999', '8756', '数码音像', '台湾3');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `name` varchar(50) NOT NULL COMMENT '真实姓名',
  `username` varchar(20) NOT NULL COMMENT '帐号',
  `password` varchar(20) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '苏东坡', 'sudongpo', 'sudongpo');
INSERT INTO `user` VALUES ('2', '欧阳修', 'ouyang123', '123456');
INSERT INTO `user` VALUES ('3', '苏辙', 'sz2020', 'wenrenSZ');
