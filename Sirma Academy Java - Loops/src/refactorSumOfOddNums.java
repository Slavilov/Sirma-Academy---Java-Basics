import java.util.Scanner;

public class refactorSumOfOddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1, count = 0; count < n; i += 2, count++) {
            System.out.println(i);
            sum += i;
        }

        System.out.println("Sum: " + sum);
    }
}
