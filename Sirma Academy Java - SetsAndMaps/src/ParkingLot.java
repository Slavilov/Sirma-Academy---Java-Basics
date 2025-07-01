import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> cars = new ArrayList<>();
        String line = scanner.nextLine();

        while (!line.equals("END")) {
            String[] parts = line.split(", ");
            String direction = parts[0];
            String carNumber = parts[1];

            if (direction.equals("IN")) {
                boolean found = false;
                for (int i = 0; i < cars.size(); i++) {
                    if (cars.get(i).equals(carNumber)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    cars.add(carNumber);
                }
            } else if (direction.equals("OUT")) {
                for (int i = 0; i < cars.size(); i++) {
                    if (cars.get(i).equals(carNumber)) {
                        cars.remove(i);
                        break;
                    }
                }
            }

            line = scanner.nextLine();
        }

        if (cars.size() == 0) {
            System.out.println("Parking Lot is Empty");
        } else {
            for (int i = 0; i < cars.size(); i++) {
                System.out.println(cars.get(i));
            }
        }
    }
}
