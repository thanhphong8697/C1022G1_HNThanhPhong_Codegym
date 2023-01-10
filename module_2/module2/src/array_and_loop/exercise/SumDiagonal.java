package array_and_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class SumDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array.");
        int line = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter length of element.");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] array = new int[line][column];
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Enter element of array[" + i + "][" + j + "]");
                array[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.println(Arrays.deepToString(array));
        int sum = 0;
        for (int i = 0; i < line; i++) {
            int j = i;
            sum += array[i][j];
        }
        System.out.println("Sum of diagonal is " + sum);
    }
}
