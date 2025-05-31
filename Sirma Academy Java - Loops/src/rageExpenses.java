import java.util.Scanner;

public class rageExpenses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lostGames = sc.nextInt();
        double headsetPrice = sc.nextDouble();
        double mousePrice = sc.nextDouble();
        double keyboardPrice = sc.nextDouble();
        double displayPrice = sc.nextDouble();

        int headsetCount = lostGames / 2;
        int mouseCount = lostGames / 3;
        int keyboardCount = lostGames / 6;
        int displayCount = keyboardCount / 2;

        double totalCost = (headsetCount * headsetPrice) + (mouseCount * mousePrice) +
                (keyboardCount * keyboardPrice) + (displayCount * displayPrice);

        System.out.printf("Rage expenses: %.2f lv.%n", totalCost);
    }
}
