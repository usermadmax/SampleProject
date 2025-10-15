public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, int wheels, boolean hasCarrier) {
        super(brand, wheels);
        this.hasCarrier = hasCarrier;
    }

    public void kickStart() {
        System.out.println("Bike kick-started");
    }

    public void applyBrakes() {
        System.out.println("Brakes applied");
    }
}
