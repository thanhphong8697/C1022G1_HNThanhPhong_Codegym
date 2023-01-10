package array_and_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class CountSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array.");
        int line = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter length of element.");
        int column = Integer.parseInt(scanner.nextLine());
        int array[][] = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter element of array [" + i + "][" + j + "]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        System.out.println("Enter column you wanna count sum.");
        int sumColumn = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < line; i++) {
            sum += array[i][sumColumn];
        }
        System.out.println("Sum of column your choice is " + sum);
    }
}
