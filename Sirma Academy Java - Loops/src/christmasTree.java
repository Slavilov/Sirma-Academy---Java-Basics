import java.util.Scanner;

public class christmasTree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printTreeRow(n, i);
        }
        printTreeRow(n, 0);
    }

    public static void printTreeRow(int width, int stars) {
        for (int j = 0; j < width - stars; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < stars; j++) {
            System.out.print("*");
        }
        System.out.print(" | ");
        for (int j = 0; j < stars; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
