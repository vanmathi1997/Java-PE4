import java.util.regex.*;
public class RegularExpression {

    boolean result;
    public String findpresence(String input) {

        boolean matches = Pattern.matches(".*Harry.*",input); //returns true if substring is found in the input string

        if (matches) //checks true or false
        {
            result = true;
        } else {
            result = false;
        }

        return "Is Harry here ?" + result;

    }
}