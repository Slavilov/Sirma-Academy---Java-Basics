class Engine {
    private int power;
    private double fuel;

    public Engine(int power, double fuel) {
        this.power = power;
        this.fuel = fuel;
    }

    public int getPower() {
        return power;
    }

    public double getFuel() {
        return fuel;
    }

    public void consumeFuel(double amount) {
        this.fuel = Math.max(0, this.fuel - amount);
    }
}

class Vehicle {
    private String type;
    private String model;
    private Engine engine;

    public Vehicle(String type, String model, Engine engine) {
        this.type = type;
        this.model = model;
        this.engine = engine;
    }

    public void drive(double fuelLoss) {
        engine.consumeFuel(fuelLoss);
    }

    public double getFuel() {
        return engine.getFuel();
    }
}

public class vehicle {
    public static void main(String[] args) {
        Engine engine = new Engine(100, 200.0);
        Vehicle vehicle = new Vehicle("a", "b", engine);
        vehicle.drive(100);
        System.out.println(vehicle.getFuel());
    }
}
