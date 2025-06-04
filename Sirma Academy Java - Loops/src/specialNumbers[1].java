import java.util.Scanner;

public class specialNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int num = 1111; num <= 9999; num++) {
            if (isSpecial(num, n)) {
                System.out.print(num + " ");
            }
        }
    }

    public static boolean isSpecial(int num, int n) {
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0 || n % digit != 0) {
                return false;
            }
            temp /= 10;
        }
        return true;
    }
}
