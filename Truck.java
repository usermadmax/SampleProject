public class Truck extends Vehicle {
    private Engine engine;

    public Truck(String brand, int wheels, Engine engine) {
        super(brand, wheels);
        this.engine = engine;
    }

    public void loadCargo(int weight) {
        System.out.println("Loading " + weight + " kg cargo");
    }

    public void startTruck() {
        engine.startEngine();
        System.out.println("Truck started");
    }
}
