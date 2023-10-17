public class Main {
    public static void main(String[] args) {
        Shop.getObjectCount();
        Shop shop1 = new Shop();
        Shop shop2 = new Shop();
        Shop.getObjectCount();
        Shop shop3 = new Shop();
        Shop.getObjectCount();

        String[] propForGoodShop = {"table", "window", "door"};
        Shop goodShop = new Shop("Goody", "Baker street", "2007",
            "Simon Baker", "Patrick Jane", propForGoodShop, true, "Good", 400,4);

        System.out.println(goodShop.getOwner());
        goodShop.getInfo();
        goodShop.getSpecificInfo();
        goodShop.setOpen(false);
        System.out.println(goodShop.isOpen());
    }
}
