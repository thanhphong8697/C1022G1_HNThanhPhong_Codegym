package CaseStudy.repository.implRepo;

import CaseStudy.models.Person.Customer;
import CaseStudy.repository.interfaceRepo.ICustomerRepo;
import CaseStudy.utils.ReadAndWriteCustomer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo implements ICustomerRepo {
    static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer("Nguyễn Văn A", "14/12/1990", "Nam", "123456987", "123456", "a@gmail.com", "1", "Diamond", "Đà Nẵng"));
        customerList.add(new Customer("Nguyễn Văn B", "15/12/1990", "Nam", "123456988", "123457", "b@gmail.com", "2", "Platinium", "Hà Nội"));
        customerList.add(new Customer("Nguyễn Văn C", "16/12/1990", "Nam", "123756987", "123458", "c@gmail.com", "3", "Gold", "Hải Phòng"));
        customerList.add(new Customer("Nguyễn Văn D", "17/12/1990", "Nam", "123486987", "123459", "d@gmail.com", "4", "Silver", "Sài Gòn"));
        customerList.add(new Customer("Lê Thị A", "18/12/1990", "Nữ", "127486987", "223459", "e@gmail.com", "5", "Member", "Huế"));
    }

    @Override
    public void display() {
        customerList = ReadAndWriteCustomer.readCustomer();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }

    @Override
    public void add(Object object) {
        customerList.add((Customer) object);
        ReadAndWriteCustomer.writeCustomer(customerList);
    }

    @Override
    public Object findID(String id) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId() == id) {
                return customer;
            }
        }
        return null;
    }


    @Override
    public void editCustomer(Customer customer) {
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getCustomerId() == customer.getCustomerId()) {
                customerList.set(i, customer);
            }
        }
    }
}
