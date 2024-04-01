# 需求：计算三个经纬度到点point(120.042085, 30.293071)的距离
# 1248,4411,0 第一种
# 1355,4414,0 第二种
# 1250,4417,0 第三种
# 其他网站计算的距离：1248,4411,0
# 总结：推荐第一种

# 方法一：利用mysql自带的函数st_distance_sphere，单位是米
SELECT name,
       lng,
       lat,
       st_distance_sphere(point(lng, lat), point(120.042085, 30.293071) )  AS distance
FROM tb_self_pickup_point;


# 方法二：利用mysql自带的函数st_distance，单位是度 （弧度），所以需要×111195  转换为米
# st_distance返回的度
# st_distance 计算的结果单位是度，需要乘111195（地球半径6371000*PI/180）是将值转化为米。
SELECT name,
       lng,
       lat,
       st_distance(point(lng, lat), point(120.042085, 30.293071) ) * 111195  AS distance
FROM tb_self_pickup_point;

# 方法三：自己计算距离 单位是米
SELECT name,
       lng,
       lat,
       ROUND(
                   6378.138 * 2 * ASIN(
                       SQRT(
                                   POW(SIN((30.293071 * PI() / 180 - lat * PI() / 180) / 2), 2) +
                                   COS(30.293071 * PI() / 180) * COS(lat * PI() / 180) *
                                   POW(SIN((120.042085 * PI() / 180 - lng * PI() / 180) / 2), 2))) * 1000
           ) AS juli
FROM tb_self_pickup_point
