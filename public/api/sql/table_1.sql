
-- 查看表结构  推荐这一种！！！    MyISAM 和 InnoDB
SHOW CREATE TABLE tb_attachment;

-- 结果:
-- CREATE TABLE `tb_attachment` (
--  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'ID',
--  `group_id` bigint(20) DEFAULT '1' COMMENT '附件组ID,1就是默认组',
--  `filename` varchar(255) NOT NULL COMMENT '文件源名字',
--  `suffix` varchar(255) DEFAULT NULL COMMENT '文件后缀',
--  `filesize` bigint(20) DEFAULT NULL COMMENT '文件大小  单位字节  1byte=8bit',
--  `url` varchar(500) NOT NULL COMMENT '附件地址',
--  PRIMARY KEY (`id`) USING BTREE
-- ) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='附件表'


-- 查看表结构
DESCRIBE tb_attachment;

-- 结果:
-- id	bigint(20)	NO	PRI		auto_increment
-- group_id	bigint(20)	YES	""	1	""
-- filename	varchar(255)	NO	""		""
-- suffix	varchar(255)	YES	""		""
-- filesize	bigint(20)	YES	""		""
-- url	varchar(500)	NO	""		""

