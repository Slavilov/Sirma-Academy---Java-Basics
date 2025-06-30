import java.util.*;

public class ParkingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String command = parts[0];
            String username = parts[1];

            if (command.equals("Register")) {
                String license = parts[2];

                if (parking.containsKey(username)) {
                    String currentPlate = parking.get(username);
                    System.out.println("ERROR: already registered with plate number " + currentPlate);
                } else {
                    parking.put(username, license);
                    System.out.println(username + " registered " + license + " successfully.");
                }

            } else if (command.equals("Unregister")) {
                if (!parking.containsKey(username)) {
                    System.out.println("ERROR: user " + username + " not found.");
                } else {
                    parking.remove(username);
                    System.out.println(username + " unregistered successfully.");
                }
            }
        }

        List<String> keys = new ArrayList<>(parking.keySet());

        for (int i = 0; i < keys.size(); i++) {
            String user = keys.get(i);
            String plate = parking.get(user);
            System.out.println(user + " => " + plate);
        }
    }
}
