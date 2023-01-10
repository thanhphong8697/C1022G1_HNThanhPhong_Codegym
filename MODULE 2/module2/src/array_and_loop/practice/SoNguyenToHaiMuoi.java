package array_and_loop.practice;

public class SoNguyenToHaiMuoi {
    public static void main(String[] args) {
        int countSNT = 0;
        int prime = 2;
        while (prime < 100) {
            int count = 0;
            for (int i = 1; i <= prime; i++) {

                if (prime % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(prime);
            }
            prime++;
        }
    }
}


