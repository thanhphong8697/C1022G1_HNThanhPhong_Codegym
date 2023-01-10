package CaseStudy.controllers;

import CaseStudy.repository.implRepo.EmployeeRepo;
import CaseStudy.repository.interfaceRepo.IEmployeeRepo;
import CaseStudy.models.Person.Employee;
import CaseStudy.services.implService.EmployeeService;
import CaseStudy.services.interfaceService.IEmployeeService;
import CaseStudy.utils.NotFoundException;

import java.util.Scanner;

public class EmployeeController {
    void employeeDisplayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        IEmployeeService iEmpSer = new EmployeeService();
        int choiceOne = 0;
        do {
            System.out.println("Your option employees \n" +
                    "1. Display list employees. \n" +
                    "2. Add new employee. \n" +
                    "3. Delete employee. \n" +
                    "4. Edit employee. \n" +
                    "5. Return main menu");
            try {
                choiceOne = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            switch (choiceOne) {
                case 1:
                    iEmpSer.display();
                    break;
                case 2:
                    System.out.println("Nhập tên");
                    String employeeName = scanner.nextLine();
                    System.out.println("Nhập ngày sinh");
                    String employeeBirthday = scanner.nextLine();
                    System.out.println("Nhập giới tính");
                    String employeeGender = scanner.nextLine();
                    System.out.println("Nhập CMND");
                    String employeeIdentityNumb = scanner.nextLine();
                    System.out.println("Nhập SĐT");
                    String employeePhoneNumb = scanner.nextLine();
                    System.out.println("Nhập mail");
                    String employeeEmail = scanner.nextLine();
                    System.out.println("Nhập id");
                    String employeeId = scanner.nextLine();
                    System.out.println("Nhập trình độ");
                    String employeeAcademyLevel = scanner.nextLine();
                    System.out.println("Nhập chức vụ");
                    String employeePosion = scanner.nextLine();
                    System.out.println("Nhập lương");
                    String employeeSalary = scanner.nextLine();
                    Employee employee = new Employee(employeeName, employeeBirthday,
                            employeeGender, employeeIdentityNumb, employeePhoneNumb, employeeEmail,
                            employeeId, employeeAcademyLevel, employeePosion, employeeSalary);
                    iEmpSer.add(employee);
                    break;
                case 3:
                    System.out.println("Nhập id để kiểm tra");
                    String idToCheckEmpDelete = scanner.nextLine();
                    Employee employee1 = (Employee) iEmpSer.findID(idToCheckEmpDelete);
                    if (employee1 != null) {
                        iEmpSer.deleteEmployee(employee1);
                    } else {
                        try {
                            throw new NotFoundException("NotFoundExcepton");
                        } catch (NotFoundException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập id để kiểm tra");
                    String idToCheckEmpEdit = scanner.nextLine();
                    Employee employee2 = (Employee) iEmpSer.findID(idToCheckEmpEdit);
                    if (employee2 != null) {
                        int yourChoiceEmp = 0;
                        do {
                            System.out.println(
                                    "Your choice: \n" +
                                            "1. Cập nhật lại tên. \n" +
                                            "2. Cập nhật lại ngày sinh. \n" +
                                            "3. Cập nhật lại giới tính. \n" +
                                            "4. Cập nhật lại CMND. \n" +
                                            "5. Cập nhật lại SĐT. \n" +
                                            "6. Cập nhật lại Email. \n" +
                                            "7. Cập nhật lại trình độ. \n" +
                                            "8. Cập nhật lại chức vụ. \n" +
                                            "9. Cập nhật lại lương. \n" +
                                            "10. quay lại menu nhân viên");
                            try {
                                yourChoiceEmp = Integer.parseInt(scanner.nextLine());
                            } catch (NumberFormatException e) {
                                e.printStackTrace();
                            }
                            switch (yourChoiceEmp) {
                                case 1:
                                    System.out.println("Nhập tên");
                                    String employeeNewName = scanner.nextLine();
                                    employee2.setFullName(employeeNewName);
                                    break;
                                case 2:
                                    System.out.println("Nhập ngày sinh");
                                    String employeeNewBirthday = scanner.nextLine();
                                    employee2.setBirthday(employeeNewBirthday);
                                    break;
                                case 3:
                                    System.out.println("Nhập giới tính");
                                    String employeeNewGender = scanner.nextLine();
                                    employee2.setGender(employeeNewGender);
                                    break;
                                case 4:
                                    System.out.println("Nhập CMND");
                                    String employeeNewIdentityNumb = scanner.nextLine();
                                    employee2.setIdentityNUmb(employeeNewIdentityNumb);
                                    break;
                                case 5:
                                    System.out.println("Nhập SĐT");
                                    String employeeNewPhoneNumb = scanner.nextLine();
                                    employee2.setPhoneNumb(employeeNewPhoneNumb);
                                    break;
                                case 6:
                                    System.out.println("Nhập mail");
                                    String employeeNewEmail = scanner.nextLine();
                                    employee2.setEmail(employeeNewEmail);
                                    break;
                                case 7:
                                    System.out.println("Nhập trình độ");
                                    String employeeNewAcademyLevel = scanner.nextLine();
                                    employee2.setAcademyLevel(employeeNewAcademyLevel);
                                    break;
                                case 8:
                                    System.out.println("Nhập chức vụ");
                                    String employeeNewPosion = scanner.nextLine();
                                    employee2.setPosion(employeeNewPosion);
                                    break;
                                case 9:
                                    System.out.println("Nhập lương");
                                    String employeeNewSalary = scanner.nextLine();
                                    employee2.setSalary(employeeNewSalary);
                                    break;
                            }
                        } while (yourChoiceEmp != 10);
                        iEmpSer.editEmployee(employee2);
                    } else {
                        System.out.println("id nhân viên không tồn tại");
                    }
                    break;
            }
        } while (choiceOne != 5);
    }
}
