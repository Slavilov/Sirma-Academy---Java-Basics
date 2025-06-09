import java.util.ArrayDeque;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] parts = scanner.nextLine().split(" ");
            switch (parts[0]) {
                case "1":
                    stack.push(Integer.parseInt(parts[1]));
                    break;
                case "2":
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                    break;
                case "3":
                    if (!stack.isEmpty()) {
                        int max = stack.stream().max(Integer::compareTo).get();
                        System.out.println(max);
                    }
                    break;
            }
        }
    }
}
