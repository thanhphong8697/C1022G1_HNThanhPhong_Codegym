use `co_so_du_lieu_quan_he`;
CREATE TABLE teacher (
    id INT NOT NULL,
    `name` VARCHAR(50),
    age INT,
    country VARCHAR(50),
    PRIMARY KEY (id)
);
insert into teacher (id, name, age, country) values (1, "phong", 25, "vietnam");
SELECT 
    *
FROM
    teacher;