import java.util.*;

public class Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> phonebook = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("search")) {
            String[] parts = input.split("-");
            String name = parts[0];
            String number = parts[1];

            phonebook.put(name, number);

            input = scanner.nextLine(); // read next line
        }

        input = scanner.nextLine();
        while (!input.equals("stop")) {
            String nameToSearch = input;

            if (phonebook.containsKey(nameToSearch)) {
                String phone = phonebook.get(nameToSearch);
                System.out.println(nameToSearch + " -> " + phone);
            } else {
                System.out.println("Contact " + nameToSearch + " not found.");
            }

            input = scanner.nextLine();
        }
    }
}
