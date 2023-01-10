package array_and_loop.exercise;

import java.util.Scanner;

public class CountChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scanner.nextLine();
        System.out.println("Enter a char");
        char charstring = scanner.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == charstring) {
                count++;
            }
        }
        System.out.println("Char display " + count + " times.");

    }
}
