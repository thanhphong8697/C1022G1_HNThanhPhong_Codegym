create database furama_database;
use furama_database;
create table vi_tri (
ma_vi_tri int primary key,
ten_vi_tri varchar(50)
);
create table trinh_do (
ma_trinh_do int primary key,
ten_trinh_do varchar(50)
);
create table bo_phan (
ma_bo_phan int primary key,
ten_bo_phan varchar(50)
);
create table nhan_vien(
ma_nhan_vien int primary key,
ho_ten varchar(50) not null,
ngay_sinh date not null,
so_cmnd varchar(50) not null,
luong double  not null,
so_dien_thoai varchar(50) not null,
email varchar(50),
dia_chi varchar(50),
ma_vi_tri int,
ma_trinh_do int,
ma_bo_phan int,
constraint fk_ma_vi_tri foreign key (ma_vi_tri) references vi_tri(ma_vi_tri),
constraint fk_ma_trinh_do foreign key (ma_trinh_do) references trinh_do(ma_trinh_do),
constraint fk_bo_phan foreign key (ma_bo_phan) references bo_phan(ma_bo_phan)
);
create table loai_khach (
ma_loai_khach int primary key,
ten_loai_khach varchar(50)
);
create table khach_hang (
ma_khach_hang int primary key,
ma_loai_khach int,
constraint fk_ma_loai_khach foreign key (ma_loai_khach) references loai_khach(ma_loai_khach),
ho_ten varchar(50) not null,
ngay_sinh date not null,
gioi_tinh bit(1) not null,
so_cmnd varchar(50) not null,
so_dien_thoai varchar(50) not null,
email varchar(50),
dia_chi varchar(50)
);
create table loai_dich_vu (
ma_loai_dich_vu int primary key,
ten_loai_dich_vu varchar(50)
);
create table kieu_thue (
ma_kieu_thue int primary key,
ten_kieu_thue varchar(50)
);
create table dich_vu (
ma_dich_vu int primary key,
ten_dich_vu varchar(50) not null,
dien_tich int,
chi_phi_thue double not null,
so_nguoi_toi_da int,
ma_kieu_thue int not null,
ma_loai_dich_vu int not null,
constraint fk_ma_kieu_thue foreign key (ma_kieu_thue) references kieu_thue(ma_kieu_thue),
constraint fk_ma_loai_dich_vu foreign key (ma_loai_dich_vu) references loai_dich_vu(ma_loai_dich_vu),
tieu_chuan_phong varchar(50),
mo_ta_tien_nghi_khac varchar(50),
dien_tich_ho_boi double,
so_tang int,
dich_vu_mien_phi_di_kem text
);
