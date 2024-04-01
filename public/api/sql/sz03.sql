CREATE TABLE menu (
  id INT,
  name VARCHAR(50),
  parent_id INT
);
INSERT INTO menu (id, name, parent_id)
VALUES (1, 'Menu 1', NULL),
       (2, 'Menu 2', NULL),
       (3, 'Submenu 1', 1),
       (4, 'Submenu 2', 1),
       (5, 'Submenu 3', 2),
       (6, 'Sub-submenu 1', 3),
       (7, 'Sub-submenu 2', 3),
       (8, 'Sub-submenu 3', 4);

-- SQL语法
WITH RECURSIVE menu_tree AS (
  SELECT id, name, parent_id, 0 AS level
  FROM menu
  WHERE parent_id IS NULL
  UNION ALL
  SELECT m.id, m.name, m.parent_id, mt.level + 1
  FROM menu m
  INNER JOIN menu_tree mt ON m.parent_id = mt.id
)
SELECT id, name, level
FROM menu_tree
ORDER BY id;
