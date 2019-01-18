public class Scooter extends Vehicle{
    //Instance Variable
    private int seatSize;

    public Scooter(String type, int year, double price, int seatSize){
        super(type, year, price);
        this.seatSize = seatSize;
    }

    public String getInfo(){
        return getYear() + " " + getType() + ", " + seatSize + " cm, $" + getPrice();
    }
}
