import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        int sumEven = 0, sumOdd = 0;

        for (String s : input) {
            int num = Integer.parseInt(s.trim());
            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        System.out.println(sumEven - sumOdd);
    }
}
