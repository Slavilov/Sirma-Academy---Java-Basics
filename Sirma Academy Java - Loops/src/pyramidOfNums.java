import java.util.Scanner;

public class pyramidOfNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;

        for (int i = 1; num <= n; i++) {
            for (int j = 0; j < i && num <= n; j++) {
                System.out.print(num++ + " ");
            }
            System.out.println();
        }
    }
}
