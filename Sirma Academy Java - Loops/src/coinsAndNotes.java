import java.util.Scanner;

public class coinsAndNotes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ones = sc.nextInt();
        int twos = sc.nextInt();
        int fives = sc.nextInt();
        int sum = sc.nextInt();

        for (int i = 0; i <= ones; i++) {
            for (int j = 0; j <= twos; j++) {
                for (int k = 0; k <= fives; k++) {
                    if (i + j * 2 + k * 5 == sum) {
                        System.out.println(i + " * 1 lv. + " + j + " * 2 lv. + " + k + " * 5 lv. = " + sum + " lv.");
                    }
                }
            }
        }
    }
}
