import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParantheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("False");
                    return;
                }
                char last = stack.pop();
                if ((ch == ')' && last != '(') ||
                        (ch == '}' && last != '{') ||
                        (ch == ']' && last != '[')) {
                    System.out.println("False");
                    return;
                }
            }
        }

        System.out.println(stack.isEmpty() ? "True" : "False");
    }
}
