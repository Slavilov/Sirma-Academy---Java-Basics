import java.util.Scanner;

public class rhombusFromAsteriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printRow(n, i);
        }
    }

    public static void printRow(int n, int stars) {
        for (int j = 0; j < n - stars; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < stars; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
