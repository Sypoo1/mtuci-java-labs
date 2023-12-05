import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Sales {
    private ConcurrentHashMap<String, AtomicInteger> salesMap;

    public Sales() {
        salesMap = new ConcurrentHashMap<>();
    }

    public void addSale(String item, int quantity) {
        salesMap.computeIfAbsent(item, k -> new AtomicInteger(0)).addAndGet(quantity);
    }

    public void displaySales() {
        for (String item : salesMap.keySet()) {
            System.out.println("Item: " + item + ", Quantity sold: " + salesMap.get(item));
        }
    }

    public double calculateTotalSales() {
        double totalSales = 0;
        for (AtomicInteger quantity : salesMap.values()) {
            totalSales += quantity.get();
        }
        return totalSales;
    }

    public String findMostPopularItem() {
        String mostPopularItem = "";
        int maxQuantity = 0;
        for (String item : salesMap.keySet()) {
            if (salesMap.get(item).get() > maxQuantity) {
                mostPopularItem = item;
                maxQuantity = salesMap.get(item).get();
            }
        }
        return mostPopularItem;
    }

}