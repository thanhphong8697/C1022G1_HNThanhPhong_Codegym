create database chuyen_doi_erd;
use chuyen_doi_erd;
CREATE TABLE nha_cung_cap (
    ma_nha_cung_cap INT PRIMARY KEY,
    ten_nha_cung_cap VARCHAR(50),
    dia_chi VARCHAR(50)
);
CREATE TABLE so_dien_thoai (
    so_dien_thoai INT PRIMARY KEY,
    CHECK (so_dien_thoai <= 10),
    ma_nha_cung_cap INT NOT NULL,
    CONSTRAINT fk_ma_nha_cung_cap FOREIGN KEY (ma_nha_cung_cap)
        REFERENCES nha_cung_cap (ma_nha_cung_cap)
);
CREATE TABLE don_dat_hang (
    so_dat_hang INT PRIMARY KEY,
    ngay_dat_hang DATETIME,
    ma_nha_cung_cap INT NOT NULL,
    CONSTRAINT fk_ma_nha_cung_cap_don_dat_hang FOREIGN KEY (ma_nha_cung_cap)
        REFERENCES nha_cung_cap (ma_nha_cung_cap)
);
CREATE TABLE vat_tu (
    ma_vat_tu INT PRIMARY KEY,
    ten_vat_tu VARCHAR(50)
);
CREATE TABLE chi_tiet_don_dat_hang (
    so_dat_hang INT NOT NULL,
    ma_vat_tu INT NOT NULL,
    PRIMARY KEY (so_dat_hang , ma_vat_tu),
    CONSTRAINT fk_so_dat_hang FOREIGN KEY (so_dat_hang)
        REFERENCES don_dat_hang (so_dat_hang),
    CONSTRAINT fk_ma_vat_tu FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu)
);
CREATE TABLE phieu_xuat (
    so_phieu_xuat INT PRIMARY KEY,
    ngay_xuat DATE
);
CREATE TABLE chi_tiet_phieu_xuat (
    so_phieu_xuat INT NOT NULL,
    ma_vat_tu INT NOT NULL,
    PRIMARY KEY (so_phieu_xuat , ma_vat_tu),
    CONSTRAINT fk_so_phieu_xuat FOREIGN KEY (so_phieu_xuat)
        REFERENCES phieu_xuat (so_phieu_xuat),
    CONSTRAINT fk_ma_vat_tu_phieu_xuat FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    don_gia_xuat DOUBLE,
    so_luong_xuat INT
);
CREATE TABLE phieu_nhap (
    so_phieu_nhap INT PRIMARY KEY,
    ngay_nhap DATE
);
CREATE TABLE chi_tiet_phieu_nhap (
    so_phieu_nhap INT NOT NULL,
    ma_vat_tu INT NOT NULL,
    PRIMARY KEY (so_phieu_nhap , ma_vat_tu),
    CONSTRAINT fk_so_phieu_nhap FOREIGN KEY (so_phieu_nhap)
        REFERENCES phieu_nhap (so_phieu_nhap),
    CONSTRAINT fk_ma_vat_tu_phieu_nhap FOREIGN KEY (ma_vat_tu)
        REFERENCES vat_tu (ma_vat_tu),
    don_gia_nhap DOUBLE,
    so_luong_nhap INT
);