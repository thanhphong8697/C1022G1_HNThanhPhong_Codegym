package bai3.models.repository;

import bai3.data.ReadAndWriteFileCSV;
import bai3.models.model.Bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IBankRepo implements InterfaceRepo {
    List<Bank> bankList = new ArrayList<>();

    @Override
    public void display() {
        List<Bank> bankList1 = ReadAndWriteFileCSV.readCSV();
        for (Bank bank : bankList1) {
            System.out.println(bankList1);
        }
    }

    @Override
    public void add(Bank bank) {
        bankList.clear();
        bankList.add(bank);
        ReadAndWriteFileCSV.writeCSVAppend(bankList);
    }
}
