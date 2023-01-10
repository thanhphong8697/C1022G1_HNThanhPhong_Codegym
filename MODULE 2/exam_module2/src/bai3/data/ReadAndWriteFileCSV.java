package bai3.data;

import bai3.models.model.Bank;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFileCSV {
    public static final String FILE_PATH = "D:\\MODULE 2\\exam_module2\\src\\bai3\\data\\so_tiet_kiem.csv";

    public static List<Bank> readCSV() {
        List<Bank> bankList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_PATH);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Bank bank;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String soThuTu = temp[0];
                String maSoTietKiem = temp[1];
                String soTien = temp[2];
                String kyHan = temp[3];
                String laiSuat = temp[4];
                String maKhachHang = temp[5];
                bank = new Bank(soThuTu, maSoTietKiem, soTien, kyHan, laiSuat, maKhachHang);
                bankList.add(bank);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return bankList;
    }

    public static void writeCSV(List<Bank> bankList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Bank bank : bankList) {
                bufferedWriter.write(bank.getSoThutu() + "," + bank.getMaSoTietKiem() + "," + bank.getSoTien() +
                        "," + bank.getKyHan() + ","
                        + bank.getLaiSuat() + "," + bank.getMaKhachHang());
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void writeCSVAppend(List<Bank> bankList) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_PATH,true);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Bank bank : bankList) {
                bufferedWriter.write(bank.getSoThutu() + "," +bank.getMaSoTietKiem() + "," + bank.getSoTien() + "," + bank.getKyHan() + ","
                        + bank.getLaiSuat() + "," + bank.getMaKhachHang());
                bufferedWriter.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
