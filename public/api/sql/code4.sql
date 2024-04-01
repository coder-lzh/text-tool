-- 用户信息表
DROP TABLE IF EXISTS `tb_user_info`;
CREATE TABLE IF NOT EXISTS  `tb_user_info`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(30)  NOT NULL COMMENT '登录账号',
  `email` varchar(50)  NOT NULL COMMENT '用户邮箱',
  `phone_number` varchar(11)  NOT NULL COMMENT '手机号码',
  `sex` int(11)  DEFAULT 2 COMMENT '用户性别（0男 1女 2未知）',
  `avatar` varchar(1000)   DEFAULT NULL COMMENT '头像路径',
  `pwd` varchar(50)   DEFAULT NULL COMMENT '密码',
  `status` int(11) UNSIGNED  DEFAULT 1 COMMENT '帐号状态（1正常 0停用）',
  `balance`  decimal  DEFAULT NULL comment '余额',
  `introduce` varchar(1000)   DEFAULT NULL COMMENT '自我介绍',
  `login_ip` varchar(50)   DEFAULT NULL COMMENT '最后登录IP',
  `login_ip_address` varchar(255)   DEFAULT NULL COMMENT '登录的IP地址',
  `login_date` datetime(0)  DEFAULT NULL COMMENT '最后登录时间',
  `pwd_update_date` datetime(0)  DEFAULT NULL COMMENT '密码最后更新时间',
  `create_by` bigint(20)  DEFAULT NULL COMMENT '创建者',
  `create_time` datetime(0)  DEFAULT NULL COMMENT '创建时间',
  `update_by` bigint(20)  DEFAULT NULL COMMENT '更新者',
  `update_time` datetime(0)  DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `qu_phoneNumber`(`phone_number`) USING BTREE,
  INDEX `uq_username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '用户信息表' ROW_FORMAT = Dynamic;
