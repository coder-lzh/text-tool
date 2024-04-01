create table tb_self_pickup_point
(
    id          bigint auto_increment comment 'ID'
        primary key,
    name        varchar(50)     null comment '名字',
    lng         decimal(18, 10) null comment '经度',
    lat         decimal(18, 10) null comment '纬度'
)
    comment '自提点表' engine = InnoDB;


INSERT INTO tb_self_pickup_point (id, name, lng, lat) VALUES (1, '阿里巴巴',  120.0326980000, 30.2852960000);
INSERT INTO tb_self_pickup_point (id, name, lng, lat) VALUES (2, '西溪景苑',  120.0392360000, 30.2534720000);
INSERT INTO tb_self_pickup_point (id, name, lng, lat) VALUES (3, '西溪北苑',  120.0420850000, 30.2930710000);
