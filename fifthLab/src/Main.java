public class Main {
    public static void main(String[] args) {
        String text = "The price of the product is $19.99";
        NumberFinder.findNumbers(text);
        System.out.println(" ");

        String password = "qweQWE123.";
        System.out.println(password + " is " + (ValidPassword.isValidPassword(password) ? "valid" : "invalid") +" password");
        System.out.println(" ");

        String link = "First exmaple link: https://www.example.com and second example link: http://google.com";
        System.out.println(HyperLink.makeHyperLink(link));
        System.out.println(" ");

        String ip = "177.122.133.255";
        System.out.println(ip + " is " + (ValidIp.isValidIP(ip) ? "valid" : "invalid") +" ip");
        System.out.println(" ");

        text = "tr ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum viverra leo sem, sagittis tempor ligula rhoncus in. Phasellus diam augue, tristique et massa nec, aliquam vulputate libero. Fusce nec lacus.";
        Words.findWordsByLetter(text, "tr");
    }

}