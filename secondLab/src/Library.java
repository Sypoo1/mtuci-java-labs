public class Library extends Facility{
    private int bookCount;
    private int computerCount;
    private boolean quiet;

    public Library(){
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
    public Library(String name,
                   String adress,
                   String foundationDate,
                   String founder,
                   String owner,
                   String[] properties,
                   boolean open,
                   int bookCount,
                   int computerCount,
                   boolean quiet){
        super(name, adress, foundationDate, founder, owner, properties, open);
        this.bookCount = bookCount;
        this.computerCount = computerCount;
        this.quiet = quiet;
    }

    public int getBookCount(){
        return bookCount;
    }
    public void setBookCount(int bookCount){
        this.bookCount = bookCount;
    }
    public int getComputerCount(){
        return computerCount;
    }
    public void setComputerCount(int computerCount){
        this.computerCount = computerCount;
    }
    public boolean isQuiet(){
        return quiet;
    }
    public void setQuiet(boolean quiet){
        this.quiet = quiet;
    }

    public void rentBook(){
        System.out.println("rent a book");
    }
    public void turnComputersOn(){
        if (isQuiet() && isOpen()){
            System.out.printf("Turn on %s computers", computerCount);
        }
    }

    @Override
    public void makeMoney() {
        for (int i = 0; i < bookCount; i++){
            rentBook();
        }
    }

    @Override
    public void useProperty(String[] properties) {
        turnComputersOn();
        for(String property : properties){
            System.out.println("use " + property);
        }
    }
    @Override
    public void getSpecificInfo(){
        System.out.printf("Library %s has %s books %s computers and there is %s",
                getName(), bookCount, computerCount, isQuiet() ? "quiet" : "not quiet");
    }
}
