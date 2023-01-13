USE quan_ly_sinh_vien;
-- 1. Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
SELECT 
    *
FROM
    `subject`
WHERE
    credit = (SELECT 
            MAX(credit)
        FROM
            `subject`);
-- 2. Hiển thị các thông tin môn học có điểm thi lớn nhất.
SELECT 
    `subject`.*, mark.mark
FROM
    `subject`
        INNER JOIN
    mark ON subject.sub_id = mark.sub_id
WHERE
    mark.mark = (SELECT 
            MAX(mark)
        FROM
            mark);
-- 3. Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần.
SELECT 
    student.*, AVG(mark.mark)
FROM
    student
        INNER JOIN
    mark ON student.student_id = mark.student_id
GROUP BY student.student_id
ORDER BY AVG(mark.mark) DESC;