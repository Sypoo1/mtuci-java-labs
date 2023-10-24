public class Main {
    public static void main(String[] args) {
        HashTable<String, Car> myHashMap = new HashTable<String, Car>();

        System.out.println(myHashMap.isEmpty());

        Car car1 = new Car("BMW", "M5 Competition", "2022");
        Car car2 = new Car("Porsche", "911 Turbo S", "2020");
        Car car3 = new Car("Tesla", "model S Plaid", "2023");
        Car car4 = new Car("Citroen", "DS 20", "1972");
        Car car5 = new Car("Chevrolet", "Impala", "1967");

        myHashMap.put("т777ор", car1);
        myHashMap.put("в911тм", car2);
        myHashMap.put("у100уу", car3);
        myHashMap.put("SJW 665", car4);
        myHashMap.put("KAZ 2Y5", car5);

        System.out.println(myHashMap);

        myHashMap.remove("у100уу");
        myHashMap.remove("в911тм");

        System.out.println(myHashMap);
        System.out.println(myHashMap.get("KAZ 2Y5"));
        System.out.println("");

        System.out.println(myHashMap);
        System.out.println("");
        myHashMap.put("в911тм", car2);
        System.out.println(myHashMap.get("в911тм"));
        myHashMap.put("в911тм", car3);
        System.out.println(myHashMap.get("в911тм"));
        System.out.println("");
        System.out.println(myHashMap);

        System.out.println(myHashMap.isEmpty());
        System.out.println(myHashMap.size());
    }
}