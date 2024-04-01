CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `salary` decimal(10,2) DEFAULT NULL,
  `department` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

INSERT INTO `test`.`employee`(`id`, `name`, `salary`, `department`) VALUES (1, 'Joe', 70000.00, '研发部');
INSERT INTO `test`.`employee`(`id`, `name`, `salary`, `department`) VALUES (2, 'Henry', 80000.00, '研发部');
INSERT INTO `test`.`employee`(`id`, `name`, `salary`, `department`) VALUES (3, 'Sam', 60000.00, '研发部');
INSERT INTO `test`.`employee`(`id`, `name`, `salary`, `department`) VALUES (4, 'Max', 90000.00, '研发部');
INSERT INTO `test`.`employee`(`id`, `name`, `salary`, `department`) VALUES (5, 'Janet', 69000.00, '人事部');
INSERT INTO `test`.`employee`(`id`, `name`, `salary`, `department`) VALUES (6, 'Randy', 85000.00, '人事部');
INSERT INTO `test`.`employee`(`id`, `name`, `salary`, `department`) VALUES (7, 'Eva', 85000.00, '人事部');


-- 查询出employee表每个部门的前三名
SELECT *
FROM (
  SELECT department,name, salary,
         ROW_NUMBER() OVER (PARTITION BY department ORDER BY salary DESC) AS row_num
  FROM employee
) AS tt
WHERE row_num <= 3;


-- ================================非窗口函数============================================
-- 部门分组取薪水第一高的，但是这样写不严谨，对于并列第一的会出现多条
SELECT
  e.`department` AS '部门',
  e.`name` AS '员工',
  e.salary AS '工资'
FROM
  employee e
WHERE
  (
    SELECT
      count(em.salary)
    FROM
      employee em
    WHERE
      em.salary > e.salary
      AND em.department = e.department
  ) < 1
ORDER BY
  e.department,
  e.salary DESC