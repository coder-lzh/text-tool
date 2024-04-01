-- 新增唯一索引
ALTER TABLE `tb_db_3` ADD UNIQUE uk_md5 ( `md5` )

-- 新增普通索引
ALTER TABLE `table_name` ADD INDEX index_name ( `column` )

-- 新增全文索引
ALTER TABLE `table_name` ADD FULLTEXT ( `column`)

-- 新增多列索引
ALTER TABLE `table_name` ADD INDEX index_name ( `column1`, `column2`, `column3` )

-- 新增主键索引
ALTER TABLE `table_name` ADD PRIMARY KEY ( `column` )

-- 删除索引
alter table tb_db_3 drop index 索引别名
