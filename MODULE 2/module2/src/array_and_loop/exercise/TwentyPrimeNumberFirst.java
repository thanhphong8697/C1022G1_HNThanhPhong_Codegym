package array_and_loop.exercise;

import java.util.Scanner;

public class TwentyPrimeNumberFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of primes you want to find");
        int conditionToFindPrime = Integer.parseInt(scanner.nextLine());
        int countCheck = 0;
        int prime = 2;
        while (countCheck < conditionToFindPrime) {
            int count = 0;
            for (int i = 2; i <= prime; i++) {
                if (prime % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(prime + ", ");
                countCheck++;
            }
            prime++;
        }
    }
}
