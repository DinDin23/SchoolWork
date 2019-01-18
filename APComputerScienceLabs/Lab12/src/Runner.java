import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        Vehicle infinitiJx35 = new Car("Infiniti JX35", 2013, 32500, 25.2);
        Vehicle audiA6 = new Car("Audi A6", 2017, 17850, 28.7);
        Vehicle F150 = new Truck("Ford F150", 2018, 27880, 7000);
        Vehicle Ram1500 = new Truck("Ram 1500", 2019, 22760, 7520);
        Vehicle TaoTao150 = new Scooter("TaoTao150", 2018, 679.95, 39);
        Vehicle SurgeCity = new Scooter("SurgeCity", 2015, 739.45, 31);
        System.out.println(infinitiJx35.getInfo());
        System.out.println(((Car) audiA6).greatGasMileage());
        System.out.println(((Truck) F150).canTowBoat());
        System.out.println(Ram1500.getInfo());
        ArrayList<Vehicle> vehicles =new ArrayList<>();
        vehicles.add(infinitiJx35);
        vehicles.add(audiA6);
        vehicles.add(F150);
        vehicles.add(Ram1500);
        vehicles.add(TaoTao150);
        vehicles.add(SurgeCity);
        Inventory inventory = new Inventory(vehicles);
        inventory.listInventory();
    }
}
