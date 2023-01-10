package array_and_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to delete");
        int check = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arr.length; i++) {
            if (check == arr[i]) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
