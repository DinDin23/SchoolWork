public class Truck extends Vehicle{
    //Instance Variables
    private int towing;

    //Constructor
    public Truck(String type, int year, double price, int towing){
        super(type, year, price);
        this.towing = towing;
    }

    //Methods
    public boolean canTowBoat(){
        return towing >= 2000;
    }
    public String getInfo(){
        return getYear() + " " + getType() + ", " + towing + " lbs. towing, $" + getPrice();
    }
}
