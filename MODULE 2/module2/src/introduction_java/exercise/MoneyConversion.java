package introduction_java.exercise;

import java.util.Scanner;

public class MoneyConversion {
    public static void main(String[] args) {
        int rate = 23000;
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the money you want to convert");
        double number = Double.parseDouble(scanner.nextLine());
        double change = rate * number;
        System.out.println("The amount you can convert is" + change + "VNĐ");
    }
}
