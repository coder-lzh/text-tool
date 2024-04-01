-- 创建用户表
CREATE TABLE users (
    id INT PRIMARY KEY,
    username VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL,
    password VARCHAR(100) NOT NULL
);

-- 插入数据
INSERT INTO users (id, username, email, password)
VALUES (1, 'john.doe', 'john@example.com', 'password123'),
       (2, 'jane.smith', 'jane@example.com', 'password456'),
       (3, 'mark.wilson', 'mark@example.com', 'password789');


-- 批量插入千万数据
DECLARE @i INT = 1;
WHILE @i <= 10000000
BEGIN
    DECLARE @username VARCHAR(50) = 'username' + CAST(@i AS VARCHAR);
    DECLARE @email VARCHAR(100) = 'user' + CAST(@i AS VARCHAR) + '@example.com';
    DECLARE @password VARCHAR(100) = 'password' + CAST(@i AS VARCHAR);

    INSERT INTO users (id, username, email, password)
    VALUES (@i, @username, @email, @password);

    SET @i = @i + 1;
END
