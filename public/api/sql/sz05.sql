-- order by 可以省略
SELECT
	sex,
	GROUP_CONCAT( username ORDER BY username ASC SEPARATOR ';' )  as xx,
	count(1)
FROM
	users 
GROUP BY
	sex