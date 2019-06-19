/*
 Navicat Premium Data Transfer

 Source Server         : LocalMysql5.6
 Source Server Type    : MySQL
 Source Server Version : 50644
 Source Host           : localhost:3306
 Source Schema         : springbootbox

 Target Server Type    : MySQL
 Target Server Version : 50644
 File Encoding         : 65001

 Date: 20/06/2019 01:26:20
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT,
  `org_id` int(10) NOT NULL DEFAULT 0,
  `username` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `telephone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `register_time` datetime(0) NULL DEFAULT NULL,
  `status` int(1) NULL DEFAULT 0,
  `create_time` datetime(0) NULL DEFAULT NULL,
  `update_time` datetime(0) NULL DEFAULT NULL,
  `delete_flag` int(1) NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1, 2, 'Anwei', '123', '18288886666', '2019-06-19 23:58:15', 1, NULL, NULL, 0);
INSERT INTO `sys_user` VALUES (2, 0, 'Cloud', '12345', '18288886666', '2019-06-20 00:03:13', 1, '2019-06-20 00:03:13', '2019-06-20 00:08:12', 1);

SET FOREIGN_KEY_CHECKS = 1;
