import java.util.Scanner;

public class Exercise09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int multiplier = Integer.parseInt(scanner.nextLine());

        StringBuilder result = new StringBuilder();
        int carry = 0;

        for (int i = number.length() - 1; i >= 0; i--) {
            int digit = number.charAt(i) - '0';
            int product = digit * multiplier + carry;
            carry = product / 10;
            result.insert(0, product % 10);
        }

        if (carry != 0) {
            result.insert(0, carry);
        }

        System.out.println(result.toString().replaceFirst("^0+(?!$)", ""));
    }
}