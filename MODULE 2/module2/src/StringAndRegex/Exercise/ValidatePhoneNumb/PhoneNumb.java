package StringAndRegex.Exercise.ValidatePhoneNumb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumb {
    private static final String PHONENUMB_REGEX = "^[0-9]{2}[-][0][0-9]{9}$";
    public boolean phoneNumbCheck(String regex){
        Pattern pattern = Pattern.compile(PHONENUMB_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
