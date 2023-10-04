import java.util.Arrays;

public class Main {
    private static String name = "name";
    private static String adress = "adress";
    private static String foundationDate = "2022";
    private static String founder = "founder";
    private static String owner = "owner";
    private static String[] properties = {"prop1", "prop2"};
    private static boolean open = false;
    public static void main(String[] args) {
        System.out.printf("The facility %s was founded in %s by %s. Today it has %s and owner is %s. You can found it at %s. It is %s right now", name, foundationDate, founder, Arrays.toString(properties), owner, adress, open);
    }

}