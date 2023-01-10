package bai3.models.service;

import bai3.models.model.Bank;
import bai3.models.repository.IBankRepo;
import bai3.models.repository.InterfaceRepo;

public class IBankService implements InterfaceService {
    InterfaceRepo interfaceRepo = new IBankRepo();

    @Override
    public void display() {
        interfaceRepo.display();
    }

    @Override
    public void add(Bank bank) {
        interfaceRepo.add(bank);
    }
}
