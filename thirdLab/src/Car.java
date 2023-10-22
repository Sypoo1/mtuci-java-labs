public class Car{
    private String brand;
    private String model;
    private String year;
    public Car(String brand, String model, String year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    public Car(){
        this.brand = null;
        this.model = null;
        this.year = null;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getYear() {
        return year;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(String year) {
        this.year = year;
    }
    @Override
    public String toString(){
        return brand + " " + model + " " + year;
    }
}