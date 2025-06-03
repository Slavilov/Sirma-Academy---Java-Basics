import java.util.Scanner;

public class housePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int roofHeight = (n + 1) / 2;
        int baseHeight = n / 2;

        for (int i = 0; i < roofHeight; i++) {
            printCenteredStars(n, 1 + 2 * i);
        }

        for (int i = 0; i < baseHeight; i++) {
            System.out.print("|");
            for (int j = 0; j < n - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("|");
        }
    }

    public static void printCenteredStars(int width, int stars) {
        for (int j = 0; j < (width - stars) / 2; j++) System.out.print(" ");
        for (int j = 0; j < stars; j++) System.out.print("*");
        System.out.println();
    }
}
