-- 修改表名字
alter Table tb_db_xxx rename to tb_db_155;

-- 修改表的字符集
alter Table tb_db_xxx character set utf8;

-- 修改表的引擎
alter Table tb_db_xxx ENGINE=InnoDB

-- 删除表SQL
DROP TABLE Mystudent

-- 已存在的表增加字段
-- 单单添加一个字段
ALTER TABLE student ADD age INT(4);
-- 默认值
ALTER TABLE tb_db_3 ADD age INT(4) default 0;
-- 默认值 + 注释
ALTER TABLE tb_db_3 ADD age INT(4) default 0 COMMENT '注释';

-- 删除表字段
alter table tb_db_3 drop column age;

-- 排序
-- 修改字段MD5  在  字段 isdir 的后面
alter table tb_db_3 modify md5 varchar(50) not null comment 'md5值' after isdir;
