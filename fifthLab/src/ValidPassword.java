import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ValidPassword {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    public static boolean isValidPassword(String password) {
        boolean flag = false;
        try {
            String regex = "^(?=.*[A-Z])(?=.*\\d)(?=.*[A-z])(?!.*[\\W_]).{8,16}$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            flag = matcher.matches();
        } catch (PatternSyntaxException e) {
            System.out.println("Error with pattern syntax" + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        return flag;
    }
}
