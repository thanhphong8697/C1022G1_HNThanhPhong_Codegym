import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int heigth, k = 0;
        heigth = 6;
        for (int i = heigth; i >= 2; --i) {
            for (int weigth = 1; weigth <= heigth - i; ++weigth) {
                System.out.print("  ");
            }
            for (int j = i; j <= 2 * i - 2; ++j) {
                System.out.print("* ");
            }
            for (int j = 0; j < i - 1; ++j) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 2; i <= heigth; ++i, k = 0) {
            for (int weigth = 1; weigth <= heigth - i; ++weigth) {
                System.out.print("  ");
            }
            while (k != 2 * i - 2) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
        }
    }
}
