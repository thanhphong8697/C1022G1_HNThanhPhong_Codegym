package array_and_loop.exercise;

import java.util.Arrays;

public class JoinArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2};
        int length1 = arr1.length;
        int arr2[] = {3, 4};
        arr1 = Arrays.copyOf(arr1, arr1.length + arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            arr1[length1 + i] = arr2[i];
        }
        System.out.print(Arrays.toString(arr1));
    }
}
