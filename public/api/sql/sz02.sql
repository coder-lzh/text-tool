-- 行转列
SELECT user_id,
  MAX(CASE WHEN category = '语文' THEN value END) AS 语文,
  MAX(CASE WHEN category = '英语' THEN value END) AS 英语,
  MAX(CASE WHEN category = '数学' THEN value END) AS 数学
FROM tb_student
GROUP BY user_id;


-- 行转列
SELECT id, '语文' AS category, yuwen AS value
FROM tb_student
UNION ALL
SELECT id, '英语' AS category, yingyu AS value
FROM tb_student
UNION ALL
SELECT id, '数学' AS category, shuxue AS value
FROM tb_student;
