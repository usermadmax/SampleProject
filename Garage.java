import java.util.ArrayList;

public class Garage {
    private ArrayList<Vehicle> vehicles;

    public Garage() {
        vehicles = new ArrayList<>();
    }

    public void addVehicle(Vehicle v) {
        vehicles.add(v);
        System.out.println("Vehicle added: " + v.getClass().getSimpleName());
    }

    public void removeVehicle(Vehicle v) {
        vehicles.remove(v);
        System.out.println("Vehicle removed: " + v.getClass().getSimpleName());
    }

    public void listVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println(v.getClass().getSimpleName());
        }
    }
}
