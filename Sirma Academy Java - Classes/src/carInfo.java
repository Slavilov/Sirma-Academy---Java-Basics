import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Car {
    private String brand;
    private String model;
    private int horsepower;

    public Car(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public String carInfo() {
        return "The car is: " + brand + " " + model + " - " + horsepower + " HP.";
    }
}

public class carInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            String brand = parts[0];
            String model = parts[1];
            int horsepower = Integer.parseInt(parts[2]);
            cars.add(new Car(brand, model, horsepower));
        }

        for (Car car : cars) {
            System.out.println(car.carInfo());
        }
    }
}
