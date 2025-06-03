import java.util.Scanner;

public class pyramidWithIncreasingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            printPyramidRow(i);
        }
    }

    public static void printPyramidRow(int num) {
        for (int j = 1; j <= num; j++) {
            System.out.print(j);
        }
        for (int j = num - 1; j >= 1; j--) {
            System.out.print(j);
        }
        System.out.println();
    }
}
