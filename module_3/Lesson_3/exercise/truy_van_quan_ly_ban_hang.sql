USE quan_ly_ban_hang;
SELECT 
    so_hoa_don, ngay_mua_hang, tong_hoa_don
FROM
    hoa_don;
SELECT 
    ten_khach_hang, ten_san_pham
FROM
    mat_hang
        INNER JOIN
    hoa_don ON mat_hang.so_hoa_don = hoa_don.so_hoa_don
        INNER JOIN
    san_pham ON mat_hang.id_san_pham = san_pham.id_san_pham
        INNER JOIN
    khach_hang ON khach_hang.id_khach_hang = hoa_don.id_khach_hang;
SELECT 
    khach_hang.ten_khach_hang
FROM
    khach_hang
        LEFT JOIN
    hoa_don ON khach_hang.id_khach_hang = hoa_don.id_khach_hang
WHERE
    hoa_don.id_khach_hang IS NULL;
SELECT 
    hoa_don.so_hoa_don,
    hoa_don.ngay_mua_hang,
    mat_hang.so_luong * san_pham.don_gia AS gia
FROM
    mat_hang
        INNER JOIN
    hoa_don ON mat_hang.so_hoa_don = hoa_don.so_hoa_don
        INNER JOIN
    san_pham ON mat_hang.id_san_pham = san_pham.id_san_pham;