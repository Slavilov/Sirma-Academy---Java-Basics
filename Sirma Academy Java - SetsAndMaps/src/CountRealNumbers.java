import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tokens = scanner.nextLine().split(" ");
        Map<Double, Integer> counts = new LinkedHashMap<>();

        for (String token : tokens) {
            double number = Double.parseDouble(token);
            counts.put(number, counts.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Double, Integer> entry : counts.entrySet()) {
            System.out.printf("%.1f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}