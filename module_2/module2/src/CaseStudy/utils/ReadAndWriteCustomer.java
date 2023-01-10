package CaseStudy.utils;

import CaseStudy.models.Person.Customer;
import CaseStudy.models.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteCustomer {
    private static final String FILE_CUSTOMER = "src\\CaseStudy\\filecsv\\customer.csv";

    public static List<Customer> readCustomer() {
        List<Customer> customerList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_CUSTOMER);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Customer customer;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String fullName = temp[0];
                String birthday = temp[1];
                String gender = temp[2];
                String identityNUmb = temp[3];
                String phoneNumb = temp[4];
                String email = temp[5];
                String customerId = temp[6];
                String customerType = temp[7];
                String address = temp[8];
                customer = new Customer(fullName, birthday, gender, identityNUmb, phoneNumb, email, customerId, customerType, address);
                customerList.add(customer);
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
        return customerList;
    }

    public static void writeCustomer(List<Customer> customers) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_CUSTOMER);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer1 : customers) {
                bufferedWriter.write(customer1.formatCSVCus());
                bufferedWriter.newLine();
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
