package bai3.controller;

import bai3.data.RegexCode;
import bai3.models.model.Bank;
import bai3.models.service.IBankService;
import bai3.models.service.InterfaceService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InterfaceService interfaceService = new IBankService();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        do {
            System.out.println("Nhap lua chon cua ban: \n" +
                    "1. Hien thi danh sach so tiet kiem. \n" +
                    "2. Dang ky so tiet kiem. \n" +
                    "3. Thoat.");
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choice) {
                case 1:
                    interfaceService.display();
                    break;
                case 2:
                    System.out.println("Nhap so thu tu.");
                    String soThuTu = scanner.nextLine();
                    String maSoTietKiem;
                    do {
                        System.out.println("Nhap ma so tiet kiem theo dinh hang STK-xxx. voi x la so nguyen duong.");
                        maSoTietKiem = scanner.nextLine();
                        if (!(maSoTietKiem.matches(RegexCode.MASOTIETKIEM))) {
                            System.out.println("Nhap sai dinh dang");
                        }
                    } while (!(maSoTietKiem.matches(RegexCode.MASOTIETKIEM)));
                    System.out.println("Nhap ten khach hang.");
                    String tenKhachHang = scanner.nextLine();
                    String soTien;
                    do {
                        System.out.println("Nhap so tien là so nguyen duong.");
                        soTien = scanner.nextLine();
                        if (!(soTien.matches(RegexCode.SOTIEN))) {
                            System.out.println("Nhap sai dinh dang");
                        }
                    } while (!(soTien.matches(RegexCode.SOTIEN)));
                    String kyHan;
                    do {
                        System.out.println("Nhap ky han dung voi gia tri: vo thoi han, 1 thang," +
                                " 3 thang, 6 thang, 1 nam.");
                        kyHan = scanner.nextLine();
                        if (!(kyHan.matches(RegexCode.KYHAN))) {
                            System.out.println("Nhap sai dinh dang");
                        }
                    } while (!(kyHan.matches(RegexCode.KYHAN)));
                    String laiSuat;
                    do {
                        System.out.println("Nhap lai suat là so nguyen duong.");
                        laiSuat = scanner.nextLine();
                        if (!(laiSuat.matches(RegexCode.LAISUAT))) {
                            System.out.println("Nhap sai dinh dang");
                        }
                    } while (!(laiSuat.matches(RegexCode.LAISUAT)));
                    Bank bank = new Bank(soThuTu, maSoTietKiem, tenKhachHang, soTien, kyHan, laiSuat);
                    interfaceService.add(bank);
                    break;
            }
        } while (choice != 3);
    }
}
