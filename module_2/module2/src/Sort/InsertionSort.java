package Sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    private static void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int currentElement = array[i];
            int j = i - 1;
            System.out.println(Arrays.toString(array));
            for (; j >= 0 && array[j] > currentElement; j--) {
                array[j + 1] = array[j];
                System.out.println(Arrays.toString(array));
            }
            array[j + 1] = currentElement;
            System.out.println(Arrays.toString(array));
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array.");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        sort(array);
    }
}
