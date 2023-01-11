CREATE DATABASE `co_so_du_lieu_quan_he`;
USE `co_so_du_lieu_quan_he`;
CREATE TABLE `class` (
    id INT NOT NULL,
    `name` VARCHAR(50),
    PRIMARY KEY (id)
);
INSERT INTO class (id, `name`) VALUES (1, "phong");
SELECT 
    *
FROM
    class;
UPDATE class 
SET 
    name = 'c1022g1'
WHERE
    id = 1;