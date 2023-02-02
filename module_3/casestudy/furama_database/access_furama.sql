USE furama_database;
SELECT 
    ma_nhan_vien, ho_ten
FROM
    nhan_vien
WHERE
    SUBSTRING_INDEX(ho_ten, ' ', - 1) LIKE 'H%'
        OR SUBSTRING_INDEX(ho_ten, ' ', - 1) LIKE 'T%'
        OR SUBSTRING_INDEX(ho_ten, ' ', - 1) LIKE 'K%'
        AND CHAR_LENGTH(ho_ten) <= 15;
SELECT 
    ma_khach_hang, ho_ten, dia_chi, ngay_sinh
FROM
    khach_hang
WHERE
    (YEAR(CURDATE()) - YEAR(ngay_sinh)) BETWEEN 18 AND 50
        AND dia_chi LIKE '%Đà Nẵng'
        OR dia_chi LIKE '%Quảng Trị';

-- 4.	Đếm xem tương ứng với mỗi khách hàng đã từng đặt phòng bao nhiêu lần. Kết quả hiển thị được sắp xếp tăng dần theo số lần đặt phòng của khách hàng.
-- Chỉ đếm những khách hàng nào có Tên loại khách hàng là “Diamond”.
SELECT 
    khach_hang.ma_khach_hang,
    ho_ten,
    COUNT(khach_hang.ma_khach_hang) AS so_lan_dat_phong
FROM
    khach_hang
        INNER JOIN
    hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
        INNER JOIN
    loai_khach ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
WHERE
    loai_khach.ten_loai_khach = 'Diamond'
GROUP BY khach_hang.ma_khach_hang
ORDER BY khach_hang.ma_khach_hang;

-- 5.	Hiển thị ma_khach_hang, ho_ten, ten_loai_khach, ma_hop_dong, ten_dich_vu, ngay_lam_hop_dong, ngay_ket_thuc, tong_tien (Với tổng tiền được tính theo công thức như sau: 
-- Chi Phí Thuê + Số Lượng * Giá, với Số Lượng và Giá là từ bảng dich_vu_di_kem, hop_dong_chi_tiet) cho tất cả các khách hàng đã từng đặt phòng.
-- (những khách hàng nào chưa từng đặt phòng cũng phải hiển thị ra).
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SELECT 
    khach_hang.ma_khach_hang, khach_hang.ho_ten, loai_khach.ten_loai_khach, hop_dong.ma_hop_dong, dich_vu.ten_dich_vu, hop_dong.ngay_lam_hop_dong, hop_dong.ngay_ket_thuc,
    SUM(IFNULL(dich_vu.chi_phi_thue, 0) + IFNULL(hop_dong_chi_tiet.so_luong, 0) * IFNULL(dich_vu_di_kem.gia, 0)) AS tong_tien
FROM
    khach_hang
        INNER JOIN
    loai_khach ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
        LEFT JOIN
    hop_dong ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
        LEFT JOIN
    dich_vu ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
        LEFT JOIN
    loai_dich_vu ON loai_dich_vu.ma_loai_dich_vu = dich_vu.ma_loai_dich_vu
        LEFT JOIN
    hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
        LEFT JOIN
    dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
GROUP BY ma_hop_dong, khach_hang.ma_khach_hang
ORDER BY ma_khach_hang ASC;

-- 6.	Hiển thị ma_dich_vu, ten_dich_vu, dien_tich, chi_phi_thue, ten_loai_dich_vu của tất cả các loại dịch vụ
-- chưa từng được khách hàng thực hiện đặt từ quý 1 của năm 2021 (Quý 1 là tháng 1, 2, 3).
SELECT 
    dv.ma_dich_vu,
    dv.ten_dich_vu,
    dv.dien_tich,
    dv.chi_phi_thue,
    ldv.ten_loai_dich_vu
FROM
    dich_vu dv
        INNER JOIN
    loai_dich_vu ldv ON ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
        INNER JOIN
    hop_dong hd ON hd.ma_dich_vu = dv.ma_dich_vu
WHERE
    QUARTER(hd.ngay_ket_thuc) <> 1
        AND YEAR(hd.ngay_ket_thuc) = 2021
GROUP BY dv.ma_dich_vu;

-- 7.	Hiển thị thông tin ma_dich_vu, ten_dich_vu, dien_tich, so_nguoi_toi_da, chi_phi_thue, ten_loai_dich_vu 
-- của tất cả các loại dịch vụ đã từng được khách hàng đặt phòng trong năm 2020 nhưng chưa từng được khách hàng đặt phòng trong năm 2021.
SELECT 
    dv.ma_dich_vu,
    dv.ten_dich_vu,
    dv.dien_tich,
    dv.so_nguoi_toi_da,
    dv.chi_phi_thue,
    ldv.ten_loai_dich_vu
FROM
    dich_vu dv
        INNER JOIN
    loai_dich_vu ldv ON ldv.ma_loai_dich_vu = dv.ma_loai_dich_vu
        INNER JOIN
    hop_dong hd ON hd.ma_dich_vu = dv.ma_dich_vu
WHERE
    dv.ma_dich_vu NOT IN (SELECT 
            hop_dong.ma_dich_vu
        FROM
            hop_dong
        WHERE
            YEAR(hop_dong.ngay_ket_thuc) like 2021)
GROUP BY dv.ma_dich_vu;

-- 8.	Hiển thị thông tin ho_ten khách hàng có trong hệ thống, với yêu cầu ho_ten không trùng nhau.
-- Học viên sử dụng theo 3 cách khác nhau để thực hiện yêu cầu trên.
SELECT 
    kh.ho_ten
FROM
    khach_hang kh
GROUP BY kh.ho_ten;

SELECT DISTINCT
    kh.ho_ten
FROM
    khach_hang kh;

SELECT 
    kh.ho_ten
FROM
    khach_hang kh 
UNION SELECT 
    ho_ten
FROM
    khach_hang;

-- 9.	Thực hiện thống kê doanh thu theo tháng, nghĩa là tương ứng với mỗi tháng trong năm 2021 thì sẽ có bao nhiêu khách hàng thực hiện đặt phòng.
SELECT 
    MONTH(ngay_lam_hop_dong) AS thang,
    COUNT(ma_hop_dong) AS luong_khach_hang
FROM
    hop_dong
WHERE
    YEAR(hop_dong.ngay_ket_thuc) = 2021
GROUP BY thang
ORDER BY thang;

-- 10.	Hiển thị thông tin tương ứng với từng hợp đồng thì đã sử dụng bao nhiêu dịch vụ đi kèm. 
-- Kết quả hiển thị bao gồm ma_hop_dong, ngay_lam_hop_dong, ngay_ket_thuc, tien_dat_coc, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem).
SELECT 
    hd.ma_hop_dong,
    hd.ngay_lam_hop_dong,
    hd.ngay_ket_thuc,
    hd.tien_dat_coc,
    SUM(IFNULL(hdct.so_luong, 0)) AS so_luong_dich_vu_di_kem
FROM
    hop_dong hd
        LEFT JOIN
    hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
GROUP BY hd.ma_hop_dong;

-- 11. Hiển thị thông tin các dịch vụ đi kèm đã được sử dụng bởi những khách hàng có ten_loai_khach là “Diamond” và có dia_chi ở “Vinh” hoặc “Quảng Ngãi”.
SELECT 
    dvdk.ma_dich_vu_di_kem,
	dvdk.ten_dich_vu_di_kem
FROM
    dich_vu_di_kem dvdk
        INNER JOIN
    hop_dong_chi_tiet hdct ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
        INNER JOIN
    hop_dong hd ON hd.ma_hop_dong = hdct.ma_hop_dong
        INNER JOIN
    khach_hang kh ON kh.ma_khach_hang = hd.ma_khach_hang
        INNER JOIN
    loai_khach lk ON lk.ma_loai_khach = kh.ma_loai_khach
WHERE
    lk.ten_loai_khach = 'Diamond'
        AND kh.dia_chi LIKE '% Vinh'
        OR '% Quảng Ngãi';
        
-- 12.Hiển thị thông tin ma_hop_dong, ho_ten (nhân viên), ho_ten (khách hàng), so_dien_thoai (khách hàng), ten_dich_vu, so_luong_dich_vu_di_kem 
-- (được tính dựa trên việc sum so_luong ở dich_vu_di_kem), tien_dat_coc của tất cả các dịch vụ đã từng được khách hàng đặt vào 3 tháng cuối năm 
-- 2020 nhưng chưa từng được khách hàng đặt vào 6 tháng đầu năm 2021.
SELECT 
    hd.ma_hop_dong,
    nv.ho_ten,
    kh.ho_ten,
    kh.so_dien_thoai,
    dv.ten_dich_vu,
    SUM(IFNULL(hdct.so_luong, 0)) AS so_luong_dich_vu_di_kem,
    hd.tien_dat_coc
FROM
    hop_dong hd
        INNER JOIN
    dich_vu dv ON dv.ma_dich_vu = hd.ma_dich_vu
        INNER JOIN
    khach_hang kh ON kh.ma_khach_hang = hd.ma_khach_hang
        LEFT JOIN
    hop_dong_chi_tiet hdct ON hd.ma_hop_dong = hdct.ma_hop_dong
        INNER JOIN
    nhan_vien nv ON nv.ma_nhan_vien = hd.ma_nhan_vien
WHERE
    YEAR(hd.ngay_lam_hop_dong) = 2020
        AND MONTH(hd.ngay_lam_hop_dong) > 9
        AND hd.ma_hop_dong NOT IN (SELECT 
            hop_dong.ngay_lam_hop_dong
        FROM
            hop_dong
        WHERE
            YEAR(hop_dong.ngay_lam_hop_dong) = 2021
                AND MONTH(hop_dong.ngay_lam_hop_dong) < 7)
GROUP BY hd.ma_hop_dong
ORDER BY hd.ma_hop_dong;
 
 -- 13.	Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. 
 -- (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
SELECT 
    dvdk.ten_dich_vu_di_kem,
    SUM(IFNULL(hdct.so_luong, 0)) AS so_luong
FROM
    dich_vu_di_kem dvdk
        INNER JOIN
    hop_dong_chi_tiet hdct ON hdct.ma_dich_vu_di_kem = dvdk.ma_dich_vu_di_kem
GROUP BY dvdk.ma_dich_vu_di_kem
HAVING SUM(IFNULL(hdct.so_luong, 0)) >= (SELECT 
        MAX(hop_dong_chi_tiet.so_luong)
    FROM
        hop_dong_chi_tiet);
        
-- 14.	Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. 
-- Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung 
-- (được tính dựa trên việc count các ma_dich_vu_di_kem).
SET sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
 select hd.ma_hop_dong, dv.ten_dich_vu, dvdk.ten_dich_vu_di_kem, count(hdct.ma_dich_vu_di_kem) as so_lan_su_dung from hop_dong hd 
 inner join dich_vu dv on dv.ma_dich_vu = hd.ma_dich_vu
 inner join hop_dong_chi_tiet hdct on hdct.ma_hop_dong = hd.ma_hop_dong
 inner join dich_vu_di_kem dvdk on dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
 group by dvdk.ma_dich_vu_di_kem
 having count(hdct.ma_dich_vu_di_kem) = 1
 order by hd.ma_hop_dong;
 
 -- 15.Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, 
 -- dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
SELECT 
    nv.ma_nhan_vien,
    nv.ho_ten,
    td.ten_trinh_do,
    bp.ten_bo_phan,
    nv.so_dien_thoai
FROM
    nhan_vien nv
        INNER JOIN
    hop_dong hd ON hd.ma_nhan_vien = nv.ma_nhan_vien
        INNER JOIN
    trinh_do td ON td.ma_trinh_do = nv.ma_trinh_do
        INNER JOIN
    bo_phan bp ON bp.ma_bo_phan = nv.ma_bo_phan
GROUP BY nv.ma_nhan_vien
HAVING COUNT(nv.ma_nhan_vien) < 4;
 
 -- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
DELETE FROM nhan_vien nv 
WHERE nv.ma_nhan_vien NOT IN (SELECT hd.ma_nhan_vien FROM hop_dong hd WHERE YEAR(hd.ngay_lam_hop_dong) BETWEEN 2019 AND 2021);
SELECT 
    *
FROM
    nhan_vien;
    
-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, 
-- chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 1.000.000 VNĐ.
CREATE VIEW view_tong_tien AS
    SELECT 
        kh.ma_khach_hang,
        lk.ten_loai_khach,
        SUM(IFNULL(dv.chi_phi_thue, 0) + IFNULL(hdct.so_luong, 0) * IFNULL(dvdk.gia, 0)) AS tong_tien
    FROM
        khach_hang kh
            JOIN
        loai_khach lk ON lk.ma_loai_khach = kh.ma_loai_khach
            JOIN
        hop_dong hd ON hd.ma_khach_hang = kh.ma_khach_hang
            JOIN
        dich_vu dv ON dv.ma_dich_vu = hd.ma_dich_vu
            JOIN
        hop_dong_chi_tiet hdct ON hdct.ma_hop_dong = hd.ma_hop_dong
            JOIN
        dich_vu_di_kem dvdk ON dvdk.ma_dich_vu_di_kem = hdct.ma_dich_vu_di_kem
    WHERE
        lk.ten_loai_khach = 'Platinium'
            AND YEAR(ngay_lam_hop_dong) = 2021
    GROUP BY lk.ma_loai_khach , kh.ma_khach_hang;
UPDATE khach_hang 
SET 
    ma_loai_khach = 1
WHERE
    ma_khach_hang = (SELECT 
            view_tong_tien.ma_khach_hang
        FROM
            view_tong_tien
        WHERE
            view_tong_tien.tong_tien > '1000000'
                AND ten_loai_khach = 'Platinium');

 
-- 18.Xóa những khách hàng có hợp đồng trước năm 2021 (chú ý ràng buộc giữa các bảng).
SET foreign_key_checks = 0;
DELETE FROM khach_hang kh 
WHERE kh.ma_khach_hang IN (SELECT hd.ma_khach_hang FROM hop_dong hd WHERE YEAR(hd.ngay_lam_hop_dong) < 2021);
SELECT 
    *
FROM
    khach_hang;
    
    
-- 19.	Cập nhật giá cho các dịch vụ đi kèm được sử dụng trên 10 lần trong năm 2020 lên gấp đôi.
UPDATE dich_vu_di_kem dvdk
SET dvdk.gia = dvdk.gia * 2
WHERE dvdk.ma_dich_vu_di_kem 
IN (SELECT hdct.ma_dich_vu_di_kem FROM hop_dong_chi_tiet hdct WHERE hdct.ma_hop_dong 
IN (SELECT ma_hop_dong FROM hop_dong WHERE YEAR(hop_dong.ngay_lam_hop_dong) = 2020)
GROUP BY hdct.ma_dich_vu_di_kem
HAVING sum(ifnull(hdct.so_luong,0)) > 10);


 -- 20.	Hiển thị thông tin của tất cả các nhân viên và khách hàng có trong hệ thống, thông tin hiển thị bao gồm id 
 -- (ma_nhan_vien, ma_khach_hang), ho_ten, email, so_dien_thoai, ngay_sinh, dia_chi.
SELECT kh.ma_khach_hang as id, kh.ho_ten, kh.email, kh.so_dien_thoai, kh.ngay_sinh, kh.dia_chi FROM khach_hang kh
UNION ALL 
SELECT nv.ma_nhan_vien as id, nv.ho_ten, nv.email, nv.so_dien_thoai, nv.ngay_sinh, dia_chi FROM nhan_vien nv;
 
 
 
 
 