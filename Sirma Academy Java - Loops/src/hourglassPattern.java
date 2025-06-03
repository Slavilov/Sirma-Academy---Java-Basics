import java.util.Scanner;

public class hourglassPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            printHourglassRow(n, i);
        }
        for (int i = n - 2; i >= 0; i--) {
            printHourglassRow(n, i);
        }
    }

    public static void printHourglassRow(int n, int spaces) {
        for (int j = 0; j < spaces; j++) System.out.print(" ");
        for (int j = 0; j < n - 2 * spaces; j++) System.out.print("#");
        System.out.println();
    }
}
