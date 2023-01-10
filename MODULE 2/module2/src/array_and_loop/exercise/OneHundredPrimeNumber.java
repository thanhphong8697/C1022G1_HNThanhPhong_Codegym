package array_and_loop.exercise;

public class OneHundredPrimeNumber {
    public static void main(String[] args) {
        int prime = 2;
        while (prime < 100) {
            int count = 0;
            for (int i = 2; i <= prime; i++) {
                if (prime % i == 0) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(prime + ", ");
            }
            prime++;
        }
    }
}
