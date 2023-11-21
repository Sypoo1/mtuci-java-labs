import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
public class HyperLink {
    public static String makeHyperLink(String link){
        try {
            String regex = "\\b(https?|ftp|file)://[\\w-+&@#/%?=~|!:,.;]*[\\w-+&@#/%=~|]";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(link);
            return matcher.replaceAll("<a href=\"$0\">$0</a>");
        } catch (PatternSyntaxException e) {
            System.out.println("Error with pattern syntax" + e.getMessage());
        } catch (Exception e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        return link;

    }
}
