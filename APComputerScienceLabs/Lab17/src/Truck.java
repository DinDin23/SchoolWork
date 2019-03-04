public class Truck extends Automobile{
    double towing;

    public Truck(String type, int year, double MSRP, double towing){
        super(MSRP, type, year);
        this.towing = towing;
    }

    @Override
    public double getPrice() {
        if(towing >= 5000)
            return getMSRP() * 0.85;
        return getMSRP();
    }

    public String getInfo(){
        return getYear() + " " + getType() + ", " + towing + " lbs. towing, $" + getPrice();
    }
}
