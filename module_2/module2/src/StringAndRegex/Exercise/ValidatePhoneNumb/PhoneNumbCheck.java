package StringAndRegex.Exercise.ValidatePhoneNumb;

public class PhoneNumbCheck {
    private static PhoneNumb phoneNumb;
    private static final String[] str1 = new String[]{"84-0978489648","a8-22222222"};

    public static void main(String[] args) {
        phoneNumb = new PhoneNumb();
        for (String phoneNumb1 : str1){
            boolean check = phoneNumb.phoneNumbCheck(phoneNumb1);
            System.out.println("Phone number " + phoneNumb1 + " check " + check);
        }
    }
}
