public class Car extends Vehicle{
    //Instance Variables
    private double mpg;

    //Constructor
    public Car(String type, int year, double price, double mpg){
        super(type, year, price);
        this.mpg = mpg;
    }

    //Methods
    public boolean greatGasMileage(){
        return mpg >= 36;
    }
    public String getInfo(){
        return getYear() + " " + getType() + ", " + mpg + " mpg, $" + getPrice();
    }
}
