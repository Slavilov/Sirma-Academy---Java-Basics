import java.util.Scanner;

public class leftArrowPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printArrowRow(i, n);
        }
        for (int i = n - 1; i >= 1; i--) {
            printArrowRow(i, n);
        }
    }

    public static void printArrowRow(int stars, int n) {
        for (int j = 0; j < n - stars; j++) System.out.print(" ");
        for (int j = 0; j < stars; j++) System.out.print("*");
        System.out.println();
    }
}
