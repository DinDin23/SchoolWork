public abstract class Aircraft implements Vehicle{
    private double price;
    private String type;
    private int year;
    private int passengers;

    public Aircraft(double price, String type, int year, int passengers){
        this.price = price;
        this.type = type;
        this.year = year;
        this.passengers = passengers;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }
    public int getPassengers(){
        return passengers;
    }

    public String getInfo(){
        return year + " " + type + ", " + passengers + " passengers";
    }
}
