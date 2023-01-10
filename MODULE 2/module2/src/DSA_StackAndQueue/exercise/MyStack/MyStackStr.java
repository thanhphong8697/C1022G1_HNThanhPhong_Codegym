package DSA_StackAndQueue.exercise.MyStack;

import java.util.Scanner;
import java.util.Stack;

public class MyStackStr {
    public static void main(String[] args) {
        Stack<String> element = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string.");
        String yourStr = scanner.nextLine();
        for (int i = 0; i < yourStr.length(); i++) {
            element.push(yourStr.charAt(i) + "");
        }
        for (int i = 0; i < yourStr.length(); i++) {
            System.out.print(element.pop());
        }

    }
}
