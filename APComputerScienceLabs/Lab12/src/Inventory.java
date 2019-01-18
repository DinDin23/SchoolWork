import java.util.ArrayList;

public class Inventory {
    //Instance Variables
    private ArrayList<Vehicle> vehicles;

    //Constructor
    public Inventory(ArrayList<Vehicle> vehicles){
        this.vehicles = vehicles;
    }

    //Methods
    public void addVehicle(Vehicle v){vehicles.add(v);}
    public void listInventory(){
        for (Vehicle vehicle : vehicles)
            System.out.println(vehicle.getInfo());

    }
}
