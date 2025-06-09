import java.util.ArrayDeque;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] tokens = scanner.nextLine().split(" ");
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (String token : tokens) {
            stack.add(token);
        }

        int result = Integer.parseInt(stack.pollFirst());

        while (!stack.isEmpty()) {
            String operator = stack.pollFirst();
            int number = Integer.parseInt(stack.pollFirst());

            if (operator.equals("+")) {
                result += number;
            } else if (operator.equals("-")) {
                result -= number;
            }
        }

        System.out.println(result);
    }
}
