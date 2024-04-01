-- 查看数据库的详细编码
show create database test1;

show variables like '%char%';

-- 设置永久的字符编码，即需要在配置文件中修改数据库的字符编码
[mysqld]
character-set-server=utf8

[client]
default-character-set=utf8

[mysql]
default-character-set=utf8


然后重启数据库即可，service mysql restart


=================================临时方案=====================================
执行  [SET NAMES UTF8] 的效果等同于同时设定如下：
SET character_set_client='utf8';
SET character_set_connection='utf8';
SET character_set_results='utf8';

但这里要声明一点，SET NAMES UTF8 ; 作用只是临时的，MySQL重启后就恢复默认了。