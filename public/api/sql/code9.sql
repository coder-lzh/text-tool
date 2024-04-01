-- 需求：将表tb_attachment 字段url  域名批量替换
-- REPLACE(字段, from_string, new_string)

-- 先查看结果 是否符合预期
select replace(url,'http://192.168.132.33','http://192.168.1.104') from tb_attachment;

-- 执行sql
update tb_attachment set url = replace(url,'http://192.168.1.104/shopee','http://192.168.1.104')
