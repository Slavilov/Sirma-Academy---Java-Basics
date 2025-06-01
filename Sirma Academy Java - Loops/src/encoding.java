import java.util.Scanner;

public class encoding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            if (digit == 0) {
                System.out.println("ZERO");
            } else {
                char symbol = (char) (digit + 33);
                for (int i = 0; i < digit; i++) {
                    System.out.print(symbol);
                }
                System.out.println();
            }
        }
    }
}
