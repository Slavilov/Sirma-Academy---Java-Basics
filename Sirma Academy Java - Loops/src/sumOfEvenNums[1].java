import java.util.Scanner;

public class sumOfEvenNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        int num = 2;

        while (count < n) {
            sum += num;
            num += 2;
            count++;
        }
        System.out.println(sum);
    }
}
