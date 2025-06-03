import java.util.Scanner;

public class sunglasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printSunglasses(n);
    }

    public static void printSunglasses(int n) {
        printRow(n, "*", " ", "*");
        for (int i = 1; i < n - 1; i++) {
            if (i == (n - 1) / 2) {
                printRow(n, "/", "|", "/");
            } else {
                printRow(n, "/", " ", "/");
            }
        }
        printRow(n, "*", " ", "*");
    }

    public static void printRow(int n, String frame, String middle, String bridge) {
        System.out.print(frame.repeat(2 * n));
        System.out.print(bridge.repeat(n));
        System.out.println(frame.repeat(2 * n));
    }
}
