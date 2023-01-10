package SearchingAlgorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SearchByRecursion {
    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (value == array[mid]) {
                return mid;
            } else if (array[mid] > value) {
                return binarySearch(array, left, mid - 1, value);
            } else {
                return binarySearch(array, mid + 1, right, value);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter element number :" + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Enter value to find: ");
        int value = Integer.parseInt(scanner.nextLine());
        Arrays.sort(array);
        System.out.println("Index of value to find is : " + binarySearch(array, 0, array.length, value));

    }
}
