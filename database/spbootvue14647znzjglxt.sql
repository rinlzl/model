/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50553
Source Host           : localhost:3306
Source Database       : spbootvue14647znzjglxt

Target Server Type    : MYSQL
Target Server Version : 50553
File Encoding         : 65001

Date: 2022-12-30 21:52:06
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for `admins`
-- ----------------------------
DROP TABLE IF EXISTS `admins`;
CREATE TABLE `admins` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL COMMENT '帐号',
  `pwd` varchar(50) NOT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COMMENT='管理员';

-- ----------------------------
-- Records of admins
-- ----------------------------
INSERT INTO `admins` VALUES ('1', 'admin', 'admin');

-- ----------------------------
-- Table structure for `dengji`
-- ----------------------------
DROP TABLE IF EXISTS `dengji`;
CREATE TABLE `dengji` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `zhajiid` int(10) unsigned NOT NULL COMMENT '闸机id',
  `jiqihao` varchar(50) NOT NULL COMMENT '机器号',
  `mingcheng` varchar(255) NOT NULL COMMENT '名称',
  `tupian` varchar(255) NOT NULL COMMENT '图片',
  `quyu` int(10) unsigned NOT NULL COMMENT '区域',
  `dengji` varchar(50) NOT NULL COMMENT '登记',
  `gerenxinxi` int(10) unsigned NOT NULL COMMENT '个人信息ID',
  `yonghuming` varchar(50) NOT NULL COMMENT '用户名',
  `xingming` varchar(50) NOT NULL COMMENT '姓名',
  `shouji` varchar(50) NOT NULL COMMENT '手机',
  `zhaopian` varchar(255) NOT NULL COMMENT '照片',
  `beizhu` text NOT NULL COMMENT '备注',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '登记时间',
  PRIMARY KEY (`id`),
  KEY `dengji_zhajiid_index` (`zhajiid`),
  KEY `dengji_quyu_index` (`quyu`),
  KEY `dengji_gerenxinxi_index` (`gerenxinxi`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COMMENT='登记';

-- ----------------------------
-- Records of dengji
-- ----------------------------
INSERT INTO `dengji` VALUES ('2', '1', '123019182807', 'A区一号闸机', '/upload/20221230/6829e966-ddb7-4734-977f-c407711cb962.png', '1', '进', '1', '001', '张三', '13800138001', 'upload/73a014d4b0ef08da9ab9016d139b060c.PNG', '张三登记备注\nxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 20:00:50');
INSERT INTO `dengji` VALUES ('3', '1', '123019182807', 'A区一号闸机', '/upload/20221230/6829e966-ddb7-4734-977f-c407711cb962.png', '1', '出', '1', '001', '张三', '13800138001', 'upload/73a014d4b0ef08da9ab9016d139b060c.PNG', '张三登记备注信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 20:02:05');
INSERT INTO `dengji` VALUES ('4', '2', '123019182807', 'A区二号闸机', '/upload/20221230/8e3ca6d3-a7cb-40cd-8f73-cfeb683320e1.png', '1', '进', '1', '001', '张三', '13800138001', 'upload/73a014d4b0ef08da9ab9016d139b060c.PNG', '张三登记备注信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 20:02:47');
INSERT INTO `dengji` VALUES ('5', '3', '12301920466', 'A区三号闸机', '/upload/20221230/88d70034-e3e0-4e2a-ac90-230cfb4ab8f0.png', '1', '出', '1', '001', '张三', '13800138001', 'upload/73a014d4b0ef08da9ab9016d139b060c.PNG', '张三登记备注信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 20:03:16');
INSERT INTO `dengji` VALUES ('6', '3', '12301920466', 'A区三号闸机', '/upload/20221230/88d70034-e3e0-4e2a-ac90-230cfb4ab8f0.png', '1', '进', '2', '002', '李四', '13800138002', 'upload/eee027ca8336458f0fdb4fe8bb4d26f6.jpg', '李四登记备注信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 20:05:07');
INSERT INTO `dengji` VALUES ('7', '3', '12301920466', 'A区三号闸机', '/upload/20221230/88d70034-e3e0-4e2a-ac90-230cfb4ab8f0.png', '1', '出', '2', '002', '李四', '13800138002', 'upload/eee027ca8336458f0fdb4fe8bb4d26f6.jpg', '李四登记备注信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 20:05:26');
INSERT INTO `dengji` VALUES ('8', '7', '12302139234', '测试闸机XX', '/upload/20221230/a1b4d9e9-90bf-4732-b882-e07d22ea57a3.png', '4', '进', '5', '888', '测试姓名X', '13800138888', '/upload/20221230/d6f30151-4f96-4cf2-8b00-728d50272d32.PNG', '测试登记备注\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 21:41:09');
INSERT INTO `dengji` VALUES ('9', '6', '123019217098', 'C区六号闸机', '/upload/20221230/4036c6cb-16e6-4e82-8147-2d2ec8686b5f.png', '3', '出', '5', '888', '测试姓名X', '13800138888', '/upload/20221230/d6f30151-4f96-4cf2-8b00-728d50272d32.PNG', '888测试登记备注\nxxxxxxxxxxxxxxxxxxx', '2022-12-30 21:41:29');

-- ----------------------------
-- Table structure for `kaiguanji`
-- ----------------------------
DROP TABLE IF EXISTS `kaiguanji`;
CREATE TABLE `kaiguanji` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `zhajiid` int(10) unsigned NOT NULL COMMENT '闸机id',
  `jiqihao` varchar(50) NOT NULL COMMENT '机器号',
  `mingcheng` varchar(255) NOT NULL COMMENT '名称',
  `tupian` varchar(255) NOT NULL COMMENT '图片',
  `quyu` int(10) unsigned NOT NULL COMMENT '区域',
  `caozuo` varchar(50) NOT NULL COMMENT '操作',
  `beizhu` text NOT NULL COMMENT '备注',
  `addtime` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '操作时间',
  PRIMARY KEY (`id`),
  KEY `kaiguanji_zhajiid_index` (`zhajiid`),
  KEY `kaiguanji_quyu_index` (`quyu`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COMMENT='开关机';

-- ----------------------------
-- Records of kaiguanji
-- ----------------------------
INSERT INTO `kaiguanji` VALUES ('1', '1', '123019182807', 'A区一号闸机', '/upload/20221230/6829e966-ddb7-4734-977f-c407711cb962.png', '1', '开机', 'A区一号闸机开机备注信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 19:40:24');
INSERT INTO `kaiguanji` VALUES ('2', '2', '123019182807', 'A区二号闸机', '/upload/20221230/8e3ca6d3-a7cb-40cd-8f73-cfeb683320e1.png', '1', '开机', 'A区二号闸机开机备注信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 19:40:57');
INSERT INTO `kaiguanji` VALUES ('3', '3', '12301920466', 'A区三号闸机', '/upload/20221230/88d70034-e3e0-4e2a-ac90-230cfb4ab8f0.png', '1', '开机', 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 19:41:07');
INSERT INTO `kaiguanji` VALUES ('4', '4', '123019203898', 'B区四号闸机', '/upload/20221230/0963d948-e0e0-437c-88e3-4ff22ebe1499.png', '2', '开机', 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 19:41:12');
INSERT INTO `kaiguanji` VALUES ('5', '5', '123019217098', 'B区五号闸机', '/upload/20221230/8ea836de-f74f-41cb-a173-60f25dcda113.png', '2', '开机', 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 19:41:18');
INSERT INTO `kaiguanji` VALUES ('6', '6', '123019217098', 'C区六号闸机', '/upload/20221230/4036c6cb-16e6-4e82-8147-2d2ec8686b5f.png', '3', '开机', 'xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 19:41:22');
INSERT INTO `kaiguanji` VALUES ('7', '5', '123019217098', 'B区五号闸机', '/upload/20221230/8ea836de-f74f-41cb-a173-60f25dcda113.png', '2', '关机', '关机备注信息\nxxxxxxxxxxxxxxxxxxx', '2022-12-30 19:42:48');
INSERT INTO `kaiguanji` VALUES ('8', '4', '123019203898', 'B区四号闸机', '/upload/20221230/0963d948-e0e0-437c-88e3-4ff22ebe1499.png', '2', '关机', '关机备注信息\nxxxxxxxxxxxxxxxxxxx', '2022-12-30 21:30:53');
INSERT INTO `kaiguanji` VALUES ('9', '4', '123019203898', 'B区四号闸机', '/upload/20221230/0963d948-e0e0-437c-88e3-4ff22ebe1499.png', '2', '开机', '开机备注信息\nxxxxxxxxxxxxxxxxxxx', '2022-12-30 21:31:26');
INSERT INTO `kaiguanji` VALUES ('10', '7', '12302139234', '测试闸机XX', '/upload/20221230/a1b4d9e9-90bf-4732-b882-e07d22ea57a3.png', '4', '开机', '测试闸机开机备注\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx', '2022-12-30 21:40:25');

-- ----------------------------
-- Table structure for `quyu`
-- ----------------------------
DROP TABLE IF EXISTS `quyu`;
CREATE TABLE `quyu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `quyuming` varchar(50) NOT NULL COMMENT '区域名',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COMMENT='区域';

-- ----------------------------
-- Records of quyu
-- ----------------------------
INSERT INTO `quyu` VALUES ('1', 'A区');
INSERT INTO `quyu` VALUES ('2', 'B区');
INSERT INTO `quyu` VALUES ('3', 'C区');
INSERT INTO `quyu` VALUES ('4', '测试区域X');

-- ----------------------------
-- Table structure for `yonghu`
-- ----------------------------
DROP TABLE IF EXISTS `yonghu`;
CREATE TABLE `yonghu` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `yonghuming` varchar(50) NOT NULL COMMENT '用户名',
  `mima` varchar(50) NOT NULL COMMENT '密码',
  `xingming` varchar(50) NOT NULL COMMENT '姓名',
  `xingbie` varchar(10) NOT NULL COMMENT '性别',
  `shouji` varchar(50) NOT NULL COMMENT '手机',
  `youxiang` varchar(50) NOT NULL COMMENT '邮箱',
  `shenfenzheng` varchar(50) NOT NULL COMMENT '身份证',
  `zhaopian` varchar(255) NOT NULL COMMENT '照片',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COMMENT='用户';

-- ----------------------------
-- Records of yonghu
-- ----------------------------
INSERT INTO `yonghu` VALUES ('1', '001', '001', '张三', '男', '13800138001', '123456001@qq.com', '123456789123001', 'upload/73a014d4b0ef08da9ab9016d139b060c.PNG');
INSERT INTO `yonghu` VALUES ('2', '002', '002', '李四', '女', '13800138002', '123456002@qq.com', '123456789123002', 'upload/eee027ca8336458f0fdb4fe8bb4d26f6.jpg');
INSERT INTO `yonghu` VALUES ('3', '003', '003', '王五', '男', '13800138003', '123456003@qq.com', '123456789123003', 'upload/063f3e742d4c245be2773dbaae666862.JPG');
INSERT INTO `yonghu` VALUES ('4', '004', '004', '赵六', '女', '13800138004', '123456004@qq.com', '123456789123004', 'upload/f5e52008cb0bd59a08c2930c9c3ec138.jpg');
INSERT INTO `yonghu` VALUES ('5', '888', '888', '测试姓名X', '男', '13800138888', '123456888@qq.com', '123456789123888', '/upload/20221230/d6f30151-4f96-4cf2-8b00-728d50272d32.PNG');

-- ----------------------------
-- Table structure for `zhaji`
-- ----------------------------
DROP TABLE IF EXISTS `zhaji`;
CREATE TABLE `zhaji` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `jiqihao` varchar(50) NOT NULL COMMENT '机器号',
  `mingcheng` varchar(255) NOT NULL COMMENT '名称',
  `tupian` varchar(255) NOT NULL COMMENT '图片',
  `quyu` int(10) unsigned NOT NULL COMMENT '区域',
  `zhuangtai` varchar(50) NOT NULL COMMENT '状态',
  `xiangxi` text NOT NULL COMMENT '详细',
  PRIMARY KEY (`id`),
  KEY `zhaji_quyu_index` (`quyu`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COMMENT='闸机';

-- ----------------------------
-- Records of zhaji
-- ----------------------------
INSERT INTO `zhaji` VALUES ('1', '123019182807', 'A区一号闸机', '/upload/20221230/6829e966-ddb7-4734-977f-c407711cb962.png', '1', '已开机', 'A区一号闸机详细信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
INSERT INTO `zhaji` VALUES ('2', '123019182807', 'A区二号闸机', '/upload/20221230/8e3ca6d3-a7cb-40cd-8f73-cfeb683320e1.png', '1', '已开机', 'A区二号闸机机详细信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
INSERT INTO `zhaji` VALUES ('3', '12301920466', 'A区三号闸机', '/upload/20221230/88d70034-e3e0-4e2a-ac90-230cfb4ab8f0.png', '1', '已开机', 'A区三号闸机详细信息 \nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
INSERT INTO `zhaji` VALUES ('4', '123019203898', 'B区四号闸机', '/upload/20221230/0963d948-e0e0-437c-88e3-4ff22ebe1499.png', '2', '已开机', 'B区四号闸机详细信息\n xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
INSERT INTO `zhaji` VALUES ('5', '123019217098', 'B区五号闸机', '/upload/20221230/8ea836de-f74f-41cb-a173-60f25dcda113.png', '2', '已关机', 'B区五号闸机详细信息 \nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
INSERT INTO `zhaji` VALUES ('6', '123019217098', 'C区六号闸机', '/upload/20221230/4036c6cb-16e6-4e82-8147-2d2ec8686b5f.png', '3', '已开机', 'C区六号闸机详细信息\nxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx');
INSERT INTO `zhaji` VALUES ('7', '12302139234', '测试闸机XX', '/upload/20221230/a1b4d9e9-90bf-4732-b882-e07d22ea57a3.png', '4', '已开机', '测试相关备注\nxxxxxxxxxxxxxxxxxxx');
