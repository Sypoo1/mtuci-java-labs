import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Words {
    public static void findWordsByLetter(String text, String letter){
        try {
            String regex = "\\b" + letter + "\\w*";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            System.out.println("Words starts with " + letter + ":");
            while (matcher.find()){
                System.out.println(matcher.group());

            }
        } catch (PatternSyntaxException e) {
            System.out.println("Error with pattern syntax" + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }

    }
}
