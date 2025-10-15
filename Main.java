public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 4, 4);
        Bike bike = new Bike("Yamaha", 2, true);

        Garage garage = new Garage();
        garage.addVehicle(car);
        garage.addVehicle(bike);
        garage.listVehicles();

        car.honk();
        bike.kickStart();
    }
}
