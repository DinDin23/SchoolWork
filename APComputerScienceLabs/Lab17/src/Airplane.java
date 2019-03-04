public class Airplane extends Aircraft{
    boolean hasFirstClass;

    public Airplane(String type, int year, double price, int passengers, boolean hasFirstClass){
        super(price, type, year, passengers);
        this.hasFirstClass = hasFirstClass;
    }

    @Override
    public double getPrice() {
        if(hasFirstClass)
            return super.getPrice() * 1.10;
        return super.getPrice();
    }

    @Override
    public String getInfo() {
        if(hasFirstClass)
            return getYear() + " " + getType() + ", " + getPassengers() + " passengers, $" + getPrice() + "\nFirst class available";
        return getYear() + " " + getType() + ", " + getPassengers() + " passengers, $" + getPrice() + "\nFirst class not available";
    }
}
