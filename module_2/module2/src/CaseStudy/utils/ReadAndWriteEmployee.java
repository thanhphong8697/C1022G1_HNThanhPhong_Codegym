package CaseStudy.utils;

import CaseStudy.models.Person.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteEmployee {
    private static final String FILE_EMPLOYEE = "src\\CaseStudy\\filecsv\\employee.csv";

    public static List<Employee> readEmploy() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(FILE_EMPLOYEE);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                String fullName = temp[0];
                String birthday = temp[1];
                String gender = temp[2];
                String identityNUmb = temp[3];
                String phoneNumb = temp[4];
                String email = temp[5];
                String employeeId = temp[6];
                String academyLevel = temp[7];
                String posion = temp[8];
                String salary = temp[9];
                employee = new Employee(fullName, birthday, gender, identityNUmb, phoneNumb, email, employeeId, academyLevel, posion, salary);
                employeeList.add(employee);
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
        return employeeList;
    }

    public static void writeEmployee(List<Employee> employee) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(FILE_EMPLOYEE);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Employee employee1 : employee) {
                bufferedWriter.write(employee1.formatCSVEmp());
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
