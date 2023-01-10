package StringAndRegex.Exercise.ValidateClassName;

public class ClassNameTest {
    private static ClassName className;
    private static final String[] str1 = new String[]{"C0318G", "M0318G", "P0323A"};

    public static void main(String[] args) {
        className = new ClassName();
        for (String className1 : str1) {
            boolean check = className.classNameCheck(className1);
            System.out.println("Class name is " + className1 + " check: " + check);
        }
    }
}
