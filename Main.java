import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4, 4);
        Bike bike = new Bike("Yamaha", 2, true);
        Engine engine = new Engine(500);
        Truck truck = new Truck("Volvo", 6, engine);
        ElectricCar eCar = new ElectricCar("Tesla", 4, 4, 100);

        Garage garage = new Garage();
        garage.addVehicle(car);
        garage.addVehicle(bike);
        garage.addVehicle(truck);
        garage.addVehicle(eCar);

        ArrayList<Vehicle> vehicleList = new ArrayList<>();
        vehicleList.add(car);
        vehicleList.add(bike);
        vehicleList.add(truck);
        vehicleList.add(eCar);

        Mechanic mechanic = new Mechanic();
        mechanic.serviceVehicles(vehicleList);

        eCar.recharge();
        car.honk();
        bike.kickStart();
        truck.startTruck();
    }
}
