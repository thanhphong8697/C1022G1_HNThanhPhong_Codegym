create database quan_ly_ban_hang;
use quan_ly_ban_hang;
CREATE TABLE khach_hang (
    id_khach_hang INT PRIMARY KEY,
    ten_khach_hang VARCHAR(45),
    do_tuoi INT
);
CREATE TABLE hoa_don (
    so_hoa_don INT PRIMARY KEY,
    id_khach_hang INT NOT NULL,
    CONSTRAINT fk_id_khach_hang FOREIGN KEY (id_khach_hang)
        REFERENCES khach_hang (id_khach_hang),
    ngay_mua_hang DATE,
    tong_hoa_don DOUBLE
);
CREATE TABLE san_pham (
    id_san_pham INT PRIMARY KEY,
    ten_san_pham VARCHAR(50),
    don_gia DOUBLE
);
CREATE TABLE mat_hang (
    so_hoa_don INT NOT NULL,
    id_san_pham INT NOT NULL,
    PRIMARY KEY (so_hoa_don , id_san_pham),
    CONSTRAINT fk_so_hoa_don_mat_hang FOREIGN KEY (so_hoa_don)
        REFERENCES hoa_don (so_hoa_don),
    CONSTRAINT fk_id_san_pham_mat_hang FOREIGN KEY (id_san_pham)
        REFERENCES san_pham (id_san_pham),
    so_luong INT
);