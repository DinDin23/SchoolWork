public class Car extends Automobile{
    double mpg;

    public Car(String type, int year, double MSRP, double mpg){
        super(MSRP, type, year);
        this.mpg = mpg;
    }

    @Override
    public double getPrice() {
        if(mpg >= 30)
            return getMSRP() * 0.9;
        return getMSRP();
    }

    public String getInfo(){
        return getYear() + " " + getType() + ", " + mpg + " mpg, $" + getPrice();
    }
}
