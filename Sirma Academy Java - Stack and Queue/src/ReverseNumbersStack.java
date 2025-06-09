import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumbersStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] input = scanner.nextLine().split(" ");
        for (String num : input) {
            stack.push(Integer.parseInt(num));
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}
