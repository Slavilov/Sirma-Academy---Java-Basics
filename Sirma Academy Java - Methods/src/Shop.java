
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.printf("%.2f", calculateTotal(product, quantity));
    }

    public static double calculateTotal(String product, int quantity) {
        double price = switch (product) {
            case "coffee" -> 1.5;
            case "water" -> 1.0;
            case "coke" -> 1.4;
            case "snacks" -> 2.0;
            default -> 0;
        };
        return price * quantity;
    }
}
