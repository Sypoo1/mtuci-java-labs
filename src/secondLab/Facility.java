package secondLab;


import java.util.Arrays;

public abstract class Facility  {
    private String name;
    private String adress;
    final private String foundationDate;
    final private String founder;
    private String owner;
    private String[] properties;
    private boolean open;

    public Facility(){
        this("name",
            "adress",
            "foundationDate",
            "founder",
            "owner",
            new String[] {},
            false
        );
    }
    public Facility(
            String name,
            String adress,
            String foundationDate,
            String founder,
            String owner,
            String[] properties,
            boolean open){
        this.name = name;
        this.adress = adress;
        this.foundationDate = foundationDate;
        this.founder = founder;
        this.open = open;
        this.properties = properties;
        this.owner = owner;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getAdress(){
        return adress;
    }
    public void setAdress(String adress){
        this.adress = adress;
    }
    public String getFoundationDate(){
        return foundationDate;
    }
    public String getFounder(){
        return founder;
    }
    public String getOwner(){
        return owner;
    }
    public void setOwner(String owner){
        this.owner = owner;
    }
    public String[] getProperties(){
        return Arrays.copyOf(properties, properties.length);
    }
    public void setProperties(String[] properties){
        this.properties = Arrays.copyOf(properties, properties.length);
    }
    public boolean isOpen(){
        return this.open;
    }
    public void setOpen(boolean open){
        this.open = open;
    }
    public abstract void makeMoney();
    public abstract void useProperty(String[] properties);

    public void getInfo(){
        System.out.printf("The facility %s was founded in %s by %s. Today it has %s and owner is %s. You can found it at %s. It is %s right now",
                name, foundationDate, founder, Arrays.toString(properties), owner, adress, isOpen() ? "open" : "closed" );
    }
    public void getSpecificInfo(){
        System.out.printf("Facility %s has ...", getName());
    }

}
