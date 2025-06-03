import java.util.Scanner;

public class halfRombusOfAsteriks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printAsterisks(i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printAsterisks(i);
        }
    }

    public static void printAsterisks(int count) {
        for (int j = 0; j < count; j++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
