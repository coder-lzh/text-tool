https://www.cnblogs.com/jingzh/p/16540150.html
https://www.cnblogs.com/javastack/p/15425146.html


CREATE TABLE `users` (
  `id` int(11) AUTO_INCREMENT NOT NULL,
  `username` varchar(50)  NOT NULL,
  `sex` varchar(50)  NOT NULL,
  `email` varchar(100)  NOT NULL,
  `password` varchar(100)  NOT NULL,
  `feature` json DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

INSERT INTO `test`.`users`(`id`, `username`, `sex`, `email`, `password`, `feature`) VALUES (1, 'john.doe', '男', 'john@example.com', 'password123', '{\"dev\": \"pre\", \"obj\": {\"name\": \"lzh\"}, \"tags\": [\"A\", \"B\"]}');
INSERT INTO `test`.`users`(`id`, `username`, `sex`, `email`, `password`, `feature`) VALUES (2, 'jane.smith', '男', 'jane@example.com', 'password456', NULL);
INSERT INTO `test`.`users`(`id`, `username`, `sex`, `email`, `password`, `feature`) VALUES (3, 'mark.wilson', '女', 'mark@example.com', 'password789', NULL);


-- 查询json字段
SELECT feature->'$.dev' FROM users;
SELECT feature->'$.obj.name' FROM users;

-- 判断数组字段是否包含某个值
SELECT * FROM users WHERE JSON_CONTAINS(feature->'$.tags', '"A"');

-- 查询数组字段的长度
SELECT JSON_LENGTH(feature->'$.tags') FROM users;

-- where 条件查询
SELECT * FROM users WHERE feature->'$.env' = 'pre'

-- json对象的key  结果是集合  ["dev", "obj", "tags"]
SELECT JSON_KEYS(feature) FROM users;


-- 更新JSON字段
UPDATE test_table SET feature = JSON_SET(feature, '$.env', 'online') WHERE id = 1;
-- 更新多个字段
update tableName set feature = json_set(feature, '$.name', '喵喵喵', '$.age', 120) where id = 1;


-- 删除"age"字段
UPDATE test_table SET data = JSON_REMOVE(data, '$.age') WHERE id = 1;