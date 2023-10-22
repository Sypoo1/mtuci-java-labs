public class Cafe extends Facility{
    private int waitersCount;
    private int coffeePrice;
    private boolean tastyFood;
    public Cafe(){
        this("name",
            "adress",
            "foundationDate",
            "founder",
            "owner",
            new String[] {},
            false,
            0,
            0,
            false);
    }
    public Cafe(String name,
                String adress,
                String foundationDate,
                String founder,
                String owner,
                String[] properties,
                boolean open,
                int waitersCount,
                int coffeePrice,
                boolean tastyFood){
        super(name, adress, foundationDate, founder, owner, properties, open);
        this.waitersCount = waitersCount;
        this.coffeePrice = coffeePrice;
        this.tastyFood = tastyFood;
    }
    public int getWaitersCount(){
        return waitersCount;
    }
    public void setWaitersCount(int waitersCount){
        this.waitersCount = waitersCount;
    }
    public int getCoffeePrice(){
        return coffeePrice;
    }
    public void setCoffeePrice(int coffeePrice){
        this.coffeePrice = coffeePrice;
    }
    public boolean isTastyFood(){
        return tastyFood;
    }
    public void setTastyFood(boolean tastyFood){
        this.tastyFood = tastyFood;
    }
    public void serve(){
        for (int i = 0; i < waitersCount; i++) {
            System.out.println("serve the table");
        }
    }
    public void sellCupOfCoffee(){
        System.out.printf("sell one cup of coffee for %s", coffeePrice);
    }
    @Override
    public void makeMoney() {
        serve();
        sellCupOfCoffee();
    }

    @Override
    public void useProperty(String[] properties) {
        for(String property : properties){
            System.out.println("use " + property);
        }
    }

    @Override
    public void getSpecificInfo(){
        System.out.printf("Cafe %s has %s waiters coffee costs %s and there is %s food",
                getName(), waitersCount, coffeePrice, isTastyFood() ? "tasty" : "not tasty");
    }
}
