public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        bye();
        System.out.println(summa(5,5));
        name();
    }
    public static void bye(){
        System.out.println("Bye!");
    }
    public static int summa(int c, int b){
        return c + b;
    }

    public static void name(){
        System.out.println("What is your name?");
    }
}