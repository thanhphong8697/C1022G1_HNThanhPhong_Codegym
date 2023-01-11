create database `co_so_du_lieu_quan_he`;
use `co_so_du_lieu_quan_he`;
CREATE TABLE `class` (
    id INT NOT NULL,
    `name` VARCHAR(50),
    PRIMARY KEY (id)
);
insert into class (id, `name`) values (1, "phong");
SELECT 
    *
FROM
    class;
UPDATE class 
SET 
    name = 'c1022g1'
WHERE
    id = 1;