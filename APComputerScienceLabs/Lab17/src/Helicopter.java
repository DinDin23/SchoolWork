public class Helicopter extends Aircraft implements Leaseable{
    boolean canShootMissiles;

    public Helicopter(String type, int year, double price, int passengers, boolean canShootMissiles){
        super(price, type, year, passengers);
        this.canShootMissiles = canShootMissiles;
    }

    @Override
    public double getMonthlyPayment() {
        return getPrice() / 60;
    }

    @Override
    public double getPrice() {
        if(canShootMissiles)
            return super.getPrice() * 1.25;
        return super.getPrice();
    }

    @Override
    public String getInfo() {
        if(canShootMissiles)
            return getYear() + " " + getType() + ", " + getPassengers() + " passengers, $" + getPrice() + "\nShoots missiles";
        return getYear() + " " + getType() + ", " + getPassengers() + " passengers, $" + getPrice() + "\nDoes not shoot missiles";
    }
}
