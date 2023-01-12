CREATE DATABASE quan_ly_sinh_vien;
USE quan_ly_sinh_vien;
CREATE TABLE class (
    class_id INT AUTO_INCREMENT PRIMARY KEY,
    class_name VARCHAR(60) NOT NULL,
    start_date DATETIME NOT NULL,
    `status` BIT
);
INSERT INTO class(class_name, start_date, `status`) VALUES 
("A1", "2008-12-20", 1),
("A2", "2008-12-22", 1),
("B3", "2008-12-24", 0);
SELECT 
    *
FROM
    class;
CREATE TABLE student (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    student_name VARCHAR(45) NOT NULL,
    address VARCHAR(45),
    phone VARCHAR(45),
    `status` BIT,
    class_id INT NOT NULL,
    CONSTRAINT fk_class_id FOREIGN KEY (class_id)
        REFERENCES class (class_id)
);
INSERT INTO student (student_name, address, phone, `status`,  class_id) VALUES 
("Hung", "Ha Noi", "0912113113", 1, 1);
INSERT INTO student (student_name, address, `status`,  class_id) VALUES 
("Hoa", "Hai Phong", 1, 1);
INSERT INTO student (student_name, address, phone, `status`,  class_id) VALUES 
("Manh", "HCM", "0123123123", 0, 2);
SELECT 
    *
FROM
    student;
CREATE TABLE `subject` (
    sub_id INT AUTO_INCREMENT PRIMARY KEY,
    sub_name VARCHAR(45) NOT NULL,
    credit TINYINT NOT NULL DEFAULT 1 CHECK (credit >= 1),
    `status` BIT DEFAULT 1
);
INSERT INTO `subject` (sub_name, credit, `status`) VALUES 
('CF', 5, 1),
('C', 6, 1),
('HDJ', 5, 1),
('RDBMS', 10, 1);
SELECT 
    *
FROM
    `subject`;
CREATE TABLE mark (
    mark_id INT AUTO_INCREMENT PRIMARY KEY,
    sub_id INT NOT NULL,
    student_id INT NOT NULL,
    UNIQUE (sub_id , student_id),
    CONSTRAINT fk_student_id FOREIGN KEY (student_id)
        REFERENCES student (student_id),
    CONSTRAINT fk_sub_id FOREIGN KEY (sub_id)
        REFERENCES `subject` (sub_id),
    mark FLOAT DEFAULT 0 CHECK (mark BETWEEN 0 AND 100),
    exam_times TINYINT DEFAULT 1
);
INSERT INTO mark (sub_id, student_id, mark, exam_times)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
