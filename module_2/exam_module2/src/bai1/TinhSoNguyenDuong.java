package bai1;

import java.util.Scanner;

public class TinhSoNguyenDuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen duong");
        int numb = Integer.parseInt(scanner.nextLine());
        System.out.println(sum(numb));
    }

    public static int sum(int number) {
        int sum = 0;
        if (number < 5000) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    if (i % 2 == 0) {
                        sum += i;
                    }
                }
            }
        } else {
            System.out.println("Nhap so duoi 5000");
        }
        return sum;
    }
}
