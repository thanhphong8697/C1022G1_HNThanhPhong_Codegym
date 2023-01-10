package array_and_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number you wanna to insert");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter a index you wanna to insert");
        int index = Integer.parseInt(scanner.nextLine());
        arr = Arrays.copyOf(arr,arr.length+1);
        for (int i = arr.length-1; i > index; i--){
            arr[i] = arr[i-1];
        }
        arr[index] = number;
        System.out.print(Arrays.toString(arr));
    }
}
