-- 设置自增字段从10开始。
ALTER TABLE `tb_custom` AUTO_INCREMENT= 10;

-- 查看表tb_custom的下一个自增
SELECT
	AUTO_INCREMENT
FROM
	INFORMATION_SCHEMA.TABLES
WHERE
	TABLE_NAME = 'tb_custom'