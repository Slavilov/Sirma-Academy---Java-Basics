import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int S = scanner.nextInt();
        int X = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            stack.push(scanner.nextInt());
        }

        for (int i = 0; i < S && !stack.isEmpty(); i++) {
            stack.pop();
        }

        if (stack.contains(X)) {
            System.out.println("true");
        } else {
            int min = stack.isEmpty() ? 0 : stack.stream().min(Integer::compareTo).get();
            System.out.println(min);
        }
    }
}