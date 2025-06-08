import java.util.Arrays;
import java.util.Scanner;

public class SmallestTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(","))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        System.out.println(numbers[0] + " " + numbers[1]);
    }
}
