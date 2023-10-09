import java.util.Arrays;

public class Shop extends Facility{
    private String type;
    private int itemCount;
    private int cashierCount;

    private static int objectCount = 0;

    public Shop(){
        this("name",
                "adress",
                "foundationDate",
                "founder",
                "owner",
                new String[] {},
                false,
                "type",
                0,
                0);
    }
    public Shop(String name,
                String adress,
                String foundationDate,
                String founder,
                String owner,
                String[] properties,
                boolean open,
                String type,
                int itemCount,
                int cashierCount){
        super(name, adress, foundationDate, founder, owner, properties,open);
        this.type = type;
        this.itemCount = itemCount;
        this.cashierCount = cashierCount;
        objectCount ++;
    }

    public String getType(){
        return type;
    }
    public void setType(String  type){
        this.type = type;
    }
    public int getItemCount(){
        return itemCount;
    }
    public void setItemCount(int itemCount){
        this.itemCount = itemCount;
    }
    public int getCashierCount(){
        return cashierCount;
    }
    public void setCashierCount(int cashierCount){
        this.cashierCount = cashierCount;
    }
    public void overloading(int i, int j){
        System.out.println(i*j);
    }
    public void overloading(){
        System.out.println(Arrays.toString(getProperties()) + " these properties in " + type + " type of shop. ");
    }
    public int overloading(int batch){
        return (itemCount * batch / cashierCount);
    }

    public void sellItem(){
        System.out.println("sell item");
    }

    public int iterationCount(){
        return (itemCount / cashierCount) % 2 == 0 ? itemCount / cashierCount : itemCount / cashierCount + 1;
    }
    @Override
    public void makeMoney() {
        System.out.println("need " + iterationCount() + " iterations to sell all items. ");
        for (int i = 0; i < itemCount; i++){
            sellItem();
        }
    }
    @Override
    public void useProperty(String[] properties) {
        overloading();
        makeMoney();
    }
    @Override
    public void getSpecificInfo(){
        System.out.printf("%s shop %s has %s cashiers and %s items. ",
                type, getName(), cashierCount, itemCount);
    }
    public static void getObjectCount(){
        System.out.println("Shop class has " + objectCount + " objects. ");
    }
}
