package StringAndRegex.Exercise.ValidateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    private static final String CLASSNAME_REGEX = "^[CAP][0-9]{4}[GHIKLM]$";

    public ClassName() {
    }

    public boolean classNameCheck(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
