-- 当前时间 日期类型 2023-10-09
select CURDATE();

-- 当前时间 +1 字符串 20231010  。不建议使用  不规范
select CURDATE() + 1 ;

-- 当前时间+1  日期类型 2023-10-10
select DATE_SUB(CURDATE(),INTERVAL -1 DAY) ;

-- 都是日期类型 yyyy-MM-dd HH:mm:ss 、yyyy-MM-dd 、hh:mm:ss
SELECT NOW(),CURDATE(),CURTIME();

set @dt = now();
/*加1天*/
select date_add(@dt, interval 1 day);
/*加1小时*/
select date_add(@dt, interval 1 hour);
/*加1分钟*/
select date_add(@dt, interval 1 minute);
/*加1秒*/
select date_add(@dt, interval 1 second);
/*加1毫秒*/
select date_add(@dt, interval 1 microsecond);
/*加1周*/
select date_add(@dt, interval 1 week);
/*加1月*/
select date_add(@dt, interval 1 month);
/*加1季*/
select date_add(@dt, interval 1 quarter);
/*加1年*/
select date_add(@dt, interval 1 year);