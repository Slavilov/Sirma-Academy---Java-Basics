import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class car {
    private String brand;
    private String model;
    private int horsepower;

    public car(String brand) {
        this.brand = brand;
        this.model = "unknown";
        this.horsepower = -1;
    }

    public car(String brand, String model, int horsepower) {
        this.brand = brand;
        this.model = model;
        this.horsepower = horsepower;
    }

    public String carInfo() {
        return "The car is: " + brand + " " + model + " - " + horsepower + " HP.";
    }
}

public class carConstructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<car> cars = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            if (parts.length == 1) {
                cars.add(new car(parts[0]));
            } else if (parts.length == 3) {
                String brand = parts[0];
                String model = parts[1];
                int horsepower = Integer.parseInt(parts[2]);
                cars.add(new car(brand, model, horsepower));
            }
        }

        for (car car : cars) {
            System.out.println(car.carInfo());
        }
    }
}
