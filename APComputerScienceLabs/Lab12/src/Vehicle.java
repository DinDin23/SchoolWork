public class Vehicle {
    //Instance Variables
    private String type;
    private int year;
    private double price;

    //Constructor
    public Vehicle(String type, int year, double price){
        this.type = type;
        this.year = year;
        this.price = price;
    }

    //Getters
    public String getType() {
        return type;
    }
    public  int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }

    //Methods
    public String getInfo(){
        return year + " " + type;
    }
}
