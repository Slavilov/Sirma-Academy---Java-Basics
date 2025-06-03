import java.util.Scanner;

public class treePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i += 2) {
            printCenteredStars(n, i);
        }
        printCenteredStars(n, 1);
    }

    public static void printCenteredStars(int width, int stars) {
        int spaces = (width - stars) / 2;
        for (int j = 0; j < spaces; j++) System.out.print(" ");
        for (int j = 0; j < stars; j++) System.out.print("*");
        System.out.println();
    }
}
