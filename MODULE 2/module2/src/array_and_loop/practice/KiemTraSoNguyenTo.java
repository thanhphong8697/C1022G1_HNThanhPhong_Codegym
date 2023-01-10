package array_and_loop.practice;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số để kiểm tra số nguyên tố");
        int soNguyenTo = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int i = 2; i <= soNguyenTo; i++) {
            if (soNguyenTo < 2) {
                System.out.println(soNguyenTo + " không phải là số nt");
                break;
            }
            if (soNguyenTo % i == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(soNguyenTo + " là snt");
        } else {
            System.out.println(soNguyenTo + " khong phải là snt");
        }
    }
}
