public class Main {
    public static void main(String[] args) {
        System.out.println("1) First task:");

        TopWords.topWords();

        System.out.println("2) Second task:");
        Stack<Integer> stack = new Stack<>(10);
//        stack.pop();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.push(4);
        System.out.println(stack.pop());

        System.out.println("3) Third task:");
        Sales tracker = new Sales();

        tracker.addSale("Apple", 10);
        tracker.addSale("Banana", 15);
        tracker.addSale("Apple", 5);
        tracker.addSale("Orange", 20);
        tracker.addSale("Apple", 1);

        tracker.displaySales();
        System.out.println("Total Sales: " + tracker.calculateTotalSales());
        System.out.println("Most Popular Item: " + tracker.findMostPopularItem());
    }
}