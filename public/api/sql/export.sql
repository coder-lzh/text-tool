
-- 导出整个数据库
mysqldump -uroot -p123456 database > /data/backup/backup.sql


-- 导出pan_v3 数据库 下的tb_user表
mysqldump -uroot -h127.0.0.1 -p123456 -P3306 pan_v3 tb_user > d:/user.sql


-- 注linux下如果需要输出压缩包格式则：
mmysqldump -uroot -p databases | gzip > backup.tar.gz

gzip -d xxxx.tar.gz （对于.tar.gz文件的处理方式）
tar -xf xxxx.tar    （对于.tar文件处理方式）


格式：

mysqldump -u用戶名 -p密码 -d 数据库名 表名 > 脚本名

-- 导出整个数据库结构和数据：
mysqldump -h localhost -uroot -p123456 database > dump.sql

-- 导出单个数据表结构和数据：
mysqldump -h localhost -uroot -p123456 database table > dump.sql

-- 导出整个数据库结构（不包含数据）：
mysqldump -h localhost -uroot -p123456 -d database > dump.sql

-- 导出单个数据表结构（不包含数据）：
mysqldump -h localhost -uroot -p123456 -d database table > dump.sql

-- 导出全部数据库数据：
mysqldump -uroot -p --all-databases > alldb.sql



-- 导入  支持sql和tar 两种格式  一定要登录进去mysql 然后use数据库才执行sql  建议执行sql文件 而不是压缩包，因为可能会有编码问题
source /data/backup/backup.sql
source /data/panV3/pan_v3.tar
