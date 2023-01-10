package bai3.models.model;

public class Bank{
    private String soThutu;
    private String maSoTietKiem;
    private String soTien;
    private String kyHan;
    private String laiSuat;
    private String maKhachHang;

    public Bank(String soThutu, String maSoTietKiem, String soTien, String kyHan, String laiSuat, String maKhachHang) {
        this.soThutu = soThutu;
        this.maSoTietKiem = maSoTietKiem;
        this.soTien = soTien;
        this.kyHan = kyHan;
        this.laiSuat = laiSuat;
        this.maKhachHang = maKhachHang;
    }

    public String getSoThutu() {
        return soThutu;
    }

    public void setSoThutu(String soThutu) {
        this.soThutu = soThutu;
    }

    public String getMaSoTietKiem() {
        return maSoTietKiem;
    }

    public void setMaSoTietKiem(String maSoTietKiem) {
        this.maSoTietKiem = maSoTietKiem;
    }

    public String getSoTien() {
        return soTien;
    }

    public void setSoTien(String soTien) {
        this.soTien = soTien;
    }

    public String getKyHan() {
        return kyHan;
    }

    public void setKyHan(String kyHan) {
        this.kyHan = kyHan;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "soThutu='" + soThutu + '\'' +
                ", maSoTietKiem='" + maSoTietKiem + '\'' +
                ", soTien='" + soTien + '\'' +
                ", kyHan='" + kyHan + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                '}';
    }
}
