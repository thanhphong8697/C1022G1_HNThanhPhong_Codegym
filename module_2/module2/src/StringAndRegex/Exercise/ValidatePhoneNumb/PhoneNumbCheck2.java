package StringAndRegex.Exercise.ValidatePhoneNumb;

import java.util.Scanner;

public class PhoneNumbCheck2 {
    private static final String PHONENUMB_REGEX2 = "^[0-9]{2}[-][0][0-9]{9}$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your phone number");
        String str = scanner.nextLine();
        System.out.println(str.matches(PhoneNumbCheck2.PHONENUMB_REGEX2));
    }
}
