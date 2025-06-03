import java.util.Scanner;

public class squareFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFrame(n);
    }

    public static void printFrame(int n) {
        printLine(n, "+", "-");
        for (int i = 1; i < n - 1; i++) {
            printLine(n, "|", "-");
        }
        printLine(n, "+", "-");
    }

    public static void printLine(int n, String border, String middle) {
        System.out.print(border + " ");
        for (int j = 1; j < n - 1; j++) {
            System.out.print(middle + " ");
        }
        System.out.println(border);
    }
}
