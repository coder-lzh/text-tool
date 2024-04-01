-- 插入全部字段的值
INSERT INTO student VALUES ("5","HARSH","WEST BENGAL","XXXXXXXXXX","19");
-- 只在指定的列中插入值
INSERT INTO student (ROLL_NO, NAME, Age) VALUES ("5","PRATIK","19");
-- 批量插入INSERT INTO student (NAME, Age) VALUES ("PRATIK","19"),("PRATIK","19");
-- 插入一个表的所有列:我们可以复制一个表的所有数据，并插入到另一个表中
INSERT INTO first_table SELECT * FROM second_table;
-- 插入表中的特定列:我们只能复制表中我们想插入到另一个表中的那些列。
INSERT INTO first_table(names_of_columns1) SELECT names_of_columns2 FROM second_table;
