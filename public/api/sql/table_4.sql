-- 新增字段  默认值，备注，顺序都有
alter table tb_spu
	add test_name varchar(20) default '测试'  comment '我是备注' after detail;



-- 删除字段 test_name
alter table tb_spu drop column test_name;