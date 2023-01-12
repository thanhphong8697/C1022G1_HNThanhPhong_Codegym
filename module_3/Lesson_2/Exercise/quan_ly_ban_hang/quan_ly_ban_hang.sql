CREATE DATABASE quan_ly_ban_hang;
USE quan_ly_ban_hang;
CREATE TABLE khach_hang (
    id_khach_hang INT PRIMARY KEY AUTO_INCREMENT,
    ten_khach_hang VARCHAR(45),
    do_tuoi INT
);
INSERT INTO khach_hang(ten_khach_hang, do_tuoi) VALUES 
("Minh Quan", 10),
("Ngoc Oanh", 20),
("Hong Ha", 50);
SELECT 
    *
FROM
    khach_hang;
CREATE TABLE hoa_don (
    so_hoa_don INT PRIMARY KEY AUTO_INCREMENT,
    id_khach_hang INT NOT NULL,
    CONSTRAINT fk_id_khach_hang FOREIGN KEY (id_khach_hang)
        REFERENCES khach_hang (id_khach_hang),
    ngay_mua_hang DATE,
    tong_hoa_don DOUBLE
);
INSERT INTO hoa_don(id_khach_hang, ngay_mua_hang) VALUES 
(1, "2006-3-21"),
(2, "2006-3-23"),
(1, "2006-3-16");
SELECT 
    *
FROM
    hoa_don;
CREATE TABLE san_pham (
    id_san_pham INT PRIMARY KEY AUTO_INCREMENT,
    ten_san_pham VARCHAR(50),
    don_gia DOUBLE
);
INSERT INTO san_pham(ten_san_pham, don_gia) VALUES 
("May giat", 3),
("Tu lanh", 5),
("Dieu hoa", 7),
("Quat", 1),
("Bep dien", 2);
SELECT 
    *
FROM
    san_pham;
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
INSERT INTO mat_hang(so_hoa_don, id_san_pham, so_luong) VALUES (1, 1, 3);
INSERT INTO mat_hang(so_hoa_don, id_san_pham, so_luong) VALUES (1, 3, 7);
INSERT INTO mat_hang(so_hoa_don, id_san_pham, so_luong) VALUES (1, 4, 2);
INSERT INTO mat_hang(so_hoa_don, id_san_pham, so_luong) VALUES (2, 1, 1);
INSERT INTO mat_hang(so_hoa_don, id_san_pham, so_luong) VALUES (3, 1, 8);
INSERT INTO mat_hang(so_hoa_don, id_san_pham, so_luong) VALUES (1, 5, 4);
INSERT INTO mat_hang(so_hoa_don, id_san_pham, so_luong) VALUES (2, 3, 3);
SELECT 
    *
FROM
    mat_hang;