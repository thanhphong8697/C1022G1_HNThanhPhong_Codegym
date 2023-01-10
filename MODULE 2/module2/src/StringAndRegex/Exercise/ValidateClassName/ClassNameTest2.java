package StringAndRegex.Exercise.ValidateClassName;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameTest2 {
    private static final String CLASSNAME_REGEX2 = "^[CAP][0-9]{4}[GHIKLM]$";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your classname");
        String str = scanner.nextLine();
        System.out.println(str.matches(ClassNameTest2.CLASSNAME_REGEX2));
    }
}
