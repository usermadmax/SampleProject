public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int wheels, int doors) {
        super(brand, wheels);
        this.doors = doors;
    }

    public void honk() {
        System.out.println("Car honks!");
    }

    public void openDoor(int doorNumber) {
        System.out.println("Opening door " + doorNumber);
    }
}
