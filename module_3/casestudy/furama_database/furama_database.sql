CREATE DATABASE furama_database;
USE furama_database;
CREATE TABLE vi_tri (
    ma_vi_tri INT AUTO_INCREMENT PRIMARY KEY,
    ten_vi_tri VARCHAR(50)
);
INSERT INTO vi_tri (ten_vi_tri) VALUES ('Quản Lý');
INSERT INTO vi_tri (ten_vi_tri) VALUES ('Nhân viên');
SELECT 
    *
FROM
    vi_tri;
CREATE TABLE trinh_do (
    ma_trinh_do INT AUTO_INCREMENT PRIMARY KEY,
    ten_trinh_do VARCHAR(50)
);
INSERT INTO trinh_do(ten_trinh_do) VALUES ('Trung Cấp');
INSERT INTO trinh_do(ten_trinh_do) VALUES ('Cao Đẳng');
INSERT INTO trinh_do(ten_trinh_do) VALUES ('Đại Học');
INSERT INTO trinh_do(ten_trinh_do) VALUES ('Sau Đại Học');
SELECT 
    *
FROM
    trinh_do;
CREATE TABLE bo_phan (
    ma_bo_phan INT AUTO_INCREMENT PRIMARY KEY,
    ten_bo_phan VARCHAR(50)
);
INSERT INTO bo_phan(ten_bo_phan) VALUES ('Sale-Marketing');
INSERT INTO bo_phan(ten_bo_phan) VALUES ('Hành Chính');
INSERT INTO bo_phan(ten_bo_phan) VALUES ('Phục Vụ');
INSERT INTO bo_phan(ten_bo_phan) VALUES ('Quản Lý');
SELECT 
    *
FROM
    bo_phan;
CREATE TABLE nhan_vien (
    ma_nhan_vien INT AUTO_INCREMENT PRIMARY KEY,
    ho_ten VARCHAR(50) NOT NULL,
    ngay_sinh DATE NOT NULL,
    so_cmnd VARCHAR(50) NOT NULL,
    luong DOUBLE NOT NULL,
    so_dien_thoai VARCHAR(50) NOT NULL,
    email VARCHAR(50),
    dia_chi VARCHAR(50),
    ma_vi_tri INT NOT NULL,
    ma_trinh_do INT NOT NULL,
    ma_bo_phan INT NOT NULL,
    CONSTRAINT fk_ma_vi_tri FOREIGN KEY (ma_vi_tri)
        REFERENCES vi_tri (ma_vi_tri),
    CONSTRAINT fk_ma_trinh_do FOREIGN KEY (ma_trinh_do)
        REFERENCES trinh_do (ma_trinh_do),
    CONSTRAINT fk_bo_phan FOREIGN KEY (ma_bo_phan)
        REFERENCES bo_phan (ma_bo_phan)
);
INSERT INTO nhan_vien(ho_ten, ngay_sinh, so_cmnd, luong, so_dien_thoai, email, dia_chi, ma_vi_tri, ma_trinh_do, ma_bo_phan) VALUES 
("Nguyễn Văn An", "1970-11-07", "456231786", "10000000", "0901234121", "annguyen@gmail.com", "295 Nguyễn Tất Thành, Đà Nẵng", 1, 3, 1);
("Lê Văn Bình", "1970-11-07", "456231786", "10000000", "0901234121", "annguyen@gmail.com", "295 Nguyễn Tất Thành, Đà Nẵng", 1, 3, 1);
SELECT 
    *
FROM
    nhan_vien;
CREATE TABLE loai_khach (
    ma_loai_khach INT AUTO_INCREMENT PRIMARY KEY,
    ten_loai_khach VARCHAR(50)
);
CREATE TABLE khach_hang (
    ma_khach_hang INT AUTO_INCREMENT PRIMARY KEY,
    ma_loai_khach INT NOT NULL,
    CONSTRAINT fk_ma_loai_khach FOREIGN KEY (ma_loai_khach)
        REFERENCES loai_khach (ma_loai_khach),
    ho_ten VARCHAR(50) NOT NULL,
    ngay_sinh DATE NOT NULL,
    gioi_tinh BIT(1) NOT NULL,
    so_cmnd VARCHAR(50) NOT NULL,
    so_dien_thoai VARCHAR(50) NOT NULL,
    email VARCHAR(50),
    dia_chi VARCHAR(50)
);
CREATE TABLE loai_dich_vu (
    ma_loai_dich_vu INT AUTO_INCREMENT PRIMARY KEY,
    ten_loai_dich_vu VARCHAR(50)
);
CREATE TABLE kieu_thue (
    ma_kieu_thue INT AUTO_INCREMENT PRIMARY KEY,
    ten_kieu_thue VARCHAR(50)
);
CREATE TABLE dich_vu (
    ma_dich_vu INT AUTO_INCREMENT PRIMARY KEY,
    ten_dich_vu VARCHAR(50) NOT NULL,
    dien_tich INT,
    chi_phi_thue DOUBLE NOT NULL,
    so_nguoi_toi_da INT,
    ma_kieu_thue INT NOT NULL,
    ma_loai_dich_vu INT NOT NULL,
    CONSTRAINT fk_ma_kieu_thue FOREIGN KEY (ma_kieu_thue)
        REFERENCES kieu_thue (ma_kieu_thue),
    CONSTRAINT fk_ma_loai_dich_vu FOREIGN KEY (ma_loai_dich_vu)
        REFERENCES loai_dich_vu (ma_loai_dich_vu),
    tieu_chuan_phong VARCHAR(50),
    mo_ta_tien_nghi_khac VARCHAR(50),
    dien_tich_ho_boi DOUBLE,
    so_tang INT,
    dich_vu_mien_phi_di_kem TEXT
);
CREATE TABLE hop_dong (
    ma_hop_dong INT AUTO_INCREMENT PRIMARY KEY,
    ngay_lam_hop_dong DATETIME NOT NULL,
    ngay_ket_thuc DATETIME NOT NULL,
    tien_dat_coc DOUBLE NOT NULL,
    ma_nhan_vien INT NOT NULL,
    ma_khach_hang INT NOT NULL,
    ma_dich_vu INT NOT NULL,
    CONSTRAINT fk_ma_nhan_vien FOREIGN KEY (ma_nhan_vien)
        REFERENCES nhan_vien (ma_nhan_vien),
    CONSTRAINT fk_ma_khach_hang FOREIGN KEY (ma_khach_hang)
        REFERENCES khach_hang (ma_khach_hang),
    CONSTRAINT fk_ma_dich_vu FOREIGN KEY (ma_dich_vu)
        REFERENCES dich_vu (ma_dich_vu)
);
CREATE TABLE dich_vu_di_kem (
    ma_dich_vu_di_kem INT AUTO_INCREMENT PRIMARY KEY,
    ten_dich_vu_di_kem VARCHAR(45) NOT NULL,
    gia DOUBLE NOT NULL,
    don_vi VARCHAR(10) NOT NULL,
    trang_thai VARCHAR(45)
);
CREATE TABLE hop_dong_chi_tiet (
    ma_hop_dong_chi_tiet INT AUTO_INCREMENT PRIMARY KEY,
    so_luong INT NOT NULL,
    ma_hop_dong INT NOT NULL,
    ma_dich_vu_di_kem INT NOT NULL,
    CONSTRAINT fk_ma_hop_dong FOREIGN KEY (ma_hop_dong)
        REFERENCES hop_dong (ma_hop_dong),
    CONSTRAINT fk_ma_dich_vu_di_kem FOREIGN KEY (ma_dich_vu_di_kem)
        REFERENCES dich_vu_di_kem (ma_dich_vu_di_kem)
);