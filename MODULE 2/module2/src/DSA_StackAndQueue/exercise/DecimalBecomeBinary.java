package DSA_StackAndQueue.exercise;

import java.util.Scanner;
import java.util.Stack;

public class DecimalBecomeBinary {
    public static void main(String[] args) {
        Stack<Integer> element = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your element wanna change");
        int number = Integer.parseInt(scanner.nextLine());
        int surPlus = 0;
        while (number > 0) {
            surPlus = number % 2;
            element.push(surPlus);
            number = number / 2;
        }
        while (!element.empty()) {
            System.out.println(element.pop());
        }
    }
}
