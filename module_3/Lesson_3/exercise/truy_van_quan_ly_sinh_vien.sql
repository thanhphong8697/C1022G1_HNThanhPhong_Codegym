USE quan_ly_sinh_vien;
-- 1. Hiển thị tất cả các sinh viên có tên bắt đầu bảng ký tự 'h'.
SELECT 
    *
FROM
    student
WHERE
    student_name LIKE 'h%';
-- 2. Hiển thị các thông tin lớp học có thời gian bắt đầu vào tháng 12.
SELECT 
    *
FROM
    class
WHERE
    MONTH(start_date) = 12;
-- 3. Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5.
SELECT 
    *
FROM
    `subject`
WHERE
    credit >= 3 AND credit <= 5;
-- 4. Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2.
UPDATE student 
SET 
    class_id = 2
WHERE
    student_name = 'Hung';
SELECT 
    *
FROM
    student;
-- 5. Hiển thị các thông tin: StudentName, SubName, Mark. Dữ liệu sắp xếp theo điểm thi (mark) giảm dần. nếu trùng sắp theo tên tăng dần.
SELECT 
    student.student_name, subject.sub_name, mark.mark
FROM
    mark
        INNER JOIN
    student ON mark.student_id = student.student_id
        INNER JOIN
    subject ON mark.sub_id = subject.sub_id
ORDER BY mark.mark DESC , student.student_name;