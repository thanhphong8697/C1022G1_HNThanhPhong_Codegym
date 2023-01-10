package CaseStudy.controllers;

import CaseStudy.repository.implRepo.CustomerRepo;
import CaseStudy.repository.interfaceRepo.ICustomerRepo;
import CaseStudy.models.Person.Customer;
import CaseStudy.services.implService.CustomerService;
import CaseStudy.services.interfaceService.ICustomerService;

import java.util.Scanner;

public class CustomerController {
    void customerDisplayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        ICustomerService iCustomerSer = new CustomerService();
        int choiceTwo = 0;
        do {
            System.out.println("Your option customers \n" +
                    "1. Display list customer. \n" +
                    "2. Add new customer. \n" +
                    "3. Edit customer. \n" +
                    "4. Return main menu");
            try {
                choiceTwo = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choiceTwo) {
                case 1:
                    iCustomerSer.display();
                    break;
                case 2:
                    System.out.println("Nhập tên");
                    String customerName = scanner.nextLine();
                    System.out.println("Nhập ngày sinh");
                    String customerBirthday = scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String customerGender = scanner.nextLine();
                    System.out.println("Nhập CMND");
                    String customerIdentityNumb = scanner.nextLine();
                    System.out.println("Nhập SĐT");
                    String customerPhoneNumb = scanner.nextLine();
                    System.out.println("Nhập mail");
                    String customerEmail = scanner.nextLine();
                    System.out.println("Nhập id");
                    String customerId = scanner.nextLine();
                    System.out.println("Nhập hạn mức khách hàng");
                    String customerType = scanner.nextLine();
                    System.out.println("Nhập địa chỉ");
                    String customerAddress = scanner.nextLine();
                    Customer customer = new Customer(customerName, customerBirthday, customerGender,
                            customerIdentityNumb, customerPhoneNumb, customerEmail, customerId, customerType,
                            customerAddress);
                    iCustomerSer.add(customer);
                    break;
                case 3:
                    System.out.println("Nhập id để kiểm tra");
                    String idToCheckCusEdit = scanner.nextLine();
                    Customer customer1 = (Customer) iCustomerSer.findID(idToCheckCusEdit);
                    if (customer1 != null) {
                        int yourChoiceCus = 0;
                        do {
                            System.out.println(
                                    "Your choice: \n" +
                                            "1. Cập nhật lại tên khách hàng. \n" +
                                            "2. Cập nhật lại ngày sinh kh. \n" +
                                            "3. Cập nhật lại giới tính kh. \n" +
                                            "4. Cập nhật lại CMND kh. \n" +
                                            "5. Cập nhật lại SĐT kh. \n" +
                                            "6. Cập nhật lại Email kh. \n" +
                                            "7. Cập nhật lại hạn mức kh. \n" +
                                            "8. Cập nhật lại địa chỉ kh. \n" +
                                            "9. quay lại menu kh");
                            try {
                                yourChoiceCus = Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            switch (yourChoiceCus) {
                                case 1:
                                    System.out.println("Nhập tên kh");
                                    String customerNewName = scanner.nextLine();
                                    customer1.setFullName(customerNewName);
                                    break;
                                case 2:
                                    System.out.println("Nhập ngày sinh kh");
                                    String customerNewBirthday = scanner.nextLine();
                                    customer1.setBirthday(customerNewBirthday);
                                    break;
                                case 3:
                                    System.out.println("Nhập giới tính kh");
                                    String customerNewGender = scanner.nextLine();
                                    customer1.setGender(customerNewGender);
                                    break;
                                case 4:
                                    System.out.println("Nhập CMND kh");
                                    String customerNewIdentityNumb = scanner.nextLine();
                                    customer1.setIdentityNUmb(customerNewIdentityNumb);
                                    break;
                                case 5:
                                    System.out.println("Nhập SĐT kh");
                                    String customerNewPhoneNumb = scanner.nextLine();
                                    customer1.setPhoneNumb(customerNewPhoneNumb);
                                    break;
                                case 6:
                                    System.out.println("Nhập mail kh");
                                    String customerNewEmail = scanner.nextLine();
                                    customer1.setEmail(customerNewEmail);
                                    break;
                                case 7:
                                    System.out.println("Nhập hạn mức kh");
                                    String customerNewType = scanner.nextLine();
                                    customer1.setCustomerType(customerNewType);
                                    break;
                                case 8:
                                    System.out.println("Nhập địa chỉ kh");
                                    String customerNewAddress = scanner.nextLine();
                                    customer1.setAddress(customerNewAddress);
                                    break;
                            }
                        } while (yourChoiceCus != 9);
                        iCustomerSer.editCustomer(customer1);
                    } else {
                        System.out.println("id kh không tồn tại");
                    }
                    break;
            }
        } while (choiceTwo != 4);
    }
}
