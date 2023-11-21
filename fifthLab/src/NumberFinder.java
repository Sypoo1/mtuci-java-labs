import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class NumberFinder{
    public static void findNumbers(String text) {
        try {
            String regex = "\\d+((.|,)\\d+)?";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);
            boolean flag = false;
            while (matcher.find()) {
                System.out.println(matcher.group());
                flag = true;
            }
            if (!flag){
                System.out.println("the text does not contain any digits");
            }
        } catch (PatternSyntaxException e) {
            System.out.println("Error with pattern syntax" + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}