
-- ----------------------------
-- Table structure for hm_user
-- ----------------------------
DROP TABLE IF EXISTS `hm_user`;
CREATE TABLE `hm_user` (
  `user_id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `alias` varchar(50) DEFAULT NULL,
  `age` int(10) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hm_user
-- ----------------------------
INSERT INTO `hm_user` VALUES ('1', '李五', '别名五', '52');
INSERT INTO `hm_user` VALUES ('2', '小泽', '小泽', '24');