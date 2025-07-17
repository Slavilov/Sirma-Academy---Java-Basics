import java.util.*;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        List<String> attacked = new ArrayList<>();
        List<String> destroyed = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            String message = scanner.nextLine();
            int key = 0;
            for (char c : message.toCharArray()) {
                if ("starSTAR".indexOf(c) != -1) key++;
            }
            StringBuilder decrypted = new StringBuilder();
            for (char c : message.toCharArray()) {
                decrypted.append((char)(c - key));
            }
            String text = decrypted.toString();
            if (text.matches(".*@\w+.*:\d+.*![AD]!.*->\d+.*")) {
                String name = text.split("@")[1].split(":")[0];
                String type = text.split("!")[1];
                if (type.equals("A")) attacked.add(name);
                else if (type.equals("D")) destroyed.add(name);
            }
        }

        Collections.sort(attacked);
        Collections.sort(destroyed);

        System.out.println("Attacked planets: " + attacked.size());
        for (String planet : attacked) {
            System.out.println("-> " + planet);
        }

        System.out.println("Destroyed planets: " + destroyed.size());
        for (String planet : destroyed) {
            System.out.println("-> " + planet);
        }
    }
}