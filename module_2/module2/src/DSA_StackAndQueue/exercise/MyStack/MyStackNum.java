package DSA_StackAndQueue.exercise.MyStack;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MyStackNum {
    public static void main(String[] args) {
        Stack<Integer> array1 = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lenght of array");
        int length = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < length; i++) {
            System.out.println("Enter element " + i);
            int element = Integer.parseInt(scanner.nextLine());
            array1.push(element);
        }
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i));
        }
        int array[] = new int[array1.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = array1.pop();
        }
        System.out.println(Arrays.toString(array));
    }
}
