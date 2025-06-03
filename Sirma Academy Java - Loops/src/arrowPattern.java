import java.util.Scanner;

public class arrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printCenteredStars(n, i);
        }

        for (int i = 0; i < n / 2; i++) {
            printCenteredStars(n, n / 2 + 1);
        }
    }

    public static void printCenteredStars(int width, int stars) {
        for (int j = 0; j < (width - stars) / 2; j++) System.out.print(" ");
        for (int j = 0; j < stars; j++) System.out.print("* ");
        System.out.println();
    }
}
