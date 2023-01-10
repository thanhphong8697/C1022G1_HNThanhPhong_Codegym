package introduction_java.exercise;

import java.util.Scanner;

public class ShowGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name");
        String str = scanner.nextLine();
        System.out.println(str);
        System.out.println("Hello " + str);
    }
}
