public class Engine {
    private int horsepower;

    public Engine(int horsepower) {
        this.horsepower = horsepower;
    }

    public void startEngine() {
        System.out.println("Engine starting with " + horsepower + " HP");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }
}
