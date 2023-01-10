import java.util.Arrays;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of primes you want to find");
        int conditionToFindPrime = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[conditionToFindPrime];
        int prime;
        int count = 0;
        for (int j = 2; j <= arr.length; j++){
        for (prime = 2; prime <= arr.length; prime++){
                for (int i = 2; i <= prime; i++) {
                    if (prime % i == 0) {
                        count++;
                    }
                }
            }
            if (count == 1) {
                arr[j]= prime;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
