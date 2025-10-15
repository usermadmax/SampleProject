import java.util.List;

public class Mechanic {
    public void serviceVehicles(List<Vehicle> vehicles) {
        for (Vehicle v : vehicles) {
            System.out.println("Servicing " + v.getClass().getSimpleName());
            v.start();
            v.stop();
        }
    }
}
