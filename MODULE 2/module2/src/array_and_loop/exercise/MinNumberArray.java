package array_and_loop.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class MinNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenght of array");
        int lenght = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[lenght];
        for (int index = 0; index < arr.length; index++){
            System.out.println("Enter element of array");
            arr[index] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Min number into array is " + min);
    }
}
