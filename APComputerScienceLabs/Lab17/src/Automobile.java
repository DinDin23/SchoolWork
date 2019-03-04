public abstract class Automobile implements Vehicle{
    private double MSRP;
    private String type;
    private int year;

    public Automobile(double MSRP, String type, int year){
        this.MSRP = MSRP;
        this.type = type;
        this.year = year;
    }

    public double getMSRP() {
        return MSRP;
    }

    public String getType() {
        return type;
    }

    public int getYear() {
        return year;
    }

    public String getInfo(){
        return year + " " + type;
    }
}
