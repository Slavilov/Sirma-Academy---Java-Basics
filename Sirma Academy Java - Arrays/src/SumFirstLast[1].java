import java.util.Scanner;

public class SumFirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i].trim());
        }

        int sum = numbers[0] + numbers[numbers.length - 1];
        System.out.println(sum);
    }
}
