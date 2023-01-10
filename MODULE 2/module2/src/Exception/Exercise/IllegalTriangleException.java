package Exception.Exercise;

import java.util.Scanner;

public class IllegalTriangleException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            IllegalTriangleException illegalTriangleException = new IllegalTriangleException();
            System.out.println("Enter side 1");
            double side1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter side 2");
            double side2 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter side 3");
            double side3 = Integer.parseInt(scanner.nextLine());
            try {
                checkedException(side1, side2, side3);
                flag = false;
            } catch (CheckIllegalTriangleException e) {
                System.out.println(e.getMessage());
                flag = true;
            } finally {
                System.out.println("End programing");
            }
        } while (flag == true);
    }

    public static void checkedException(double numb1, double numb2, double numb3) throws CheckIllegalTriangleException {
        double a = numb1 + numb2;
        double b = numb2 + numb3;
        double c = numb1 + numb3;
        if (numb1 > 0 && numb2 > 0 && numb3 > 0 && a > numb3 && b > numb1 && c > numb2) {
            System.out.println("The entered triangle sides are right");
        } else {
            throw new CheckIllegalTriangleException("Error : The entered triangle sides aren't right");
        }
    }
}
