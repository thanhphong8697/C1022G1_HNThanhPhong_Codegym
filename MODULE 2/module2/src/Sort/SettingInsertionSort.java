package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class SettingInsertionSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array.");
        int size = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter element " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int currentElement = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > currentElement; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentElement;
        }
    }
}
