-- 错误信息  ERROR 144 (HY000)Table 'dede_archives' is marked

-- 故障原因
-- Mysqld进程在数据写入时被意外关闭
-- 意外关闭计算机
-- 硬件故障

mysql> check table xx FAST  QUICK; /*快速检查表*/

或者

mysql> check table xx EXTENDED; /*全表检查,耗时长*/



-- REPAIR TABLE  修复表 适用于MyISAM  方法1
mysql> REPAIR TABLE xx;

-- myisamchk 快速修复表（恢复模式，并重建索引文件） 方法2
C:\>myisamchk -r xx
