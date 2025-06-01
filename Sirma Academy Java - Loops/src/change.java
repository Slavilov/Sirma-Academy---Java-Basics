import java.util.Scanner;

public class change {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double change = sc.nextDouble();
        int cents = (int) Math.round(change * 100);
        int count = 0;
        int[] coins = {200, 100, 50, 20, 10, 5, 2, 1};

        for (int coin : coins) {
            while (cents >= coin) {
                cents -= coin;
                count++;
            }
        }

        System.out.println(count);
    }
}
