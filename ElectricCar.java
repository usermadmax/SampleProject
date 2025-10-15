public class ElectricCar extends Car implements Rechargeable {
    private int batteryCapacity;

    public ElectricCar(String brand, int wheels, int doors, int batteryCapacity) {
        super(brand, wheels, doors);
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public void recharge() {
        System.out.println("Recharging ElectricCar with capacity: " + batteryCapacity);
    }
}
