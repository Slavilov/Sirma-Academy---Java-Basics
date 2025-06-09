import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] params = scanner.nextLine().split(" ");
        int n = Integer.parseInt(params[0]);
        int s = Integer.parseInt(params[1]);
        int x = Integer.parseInt(params[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i < n; i++) {
            queue.offer(numbers[i]);
        }

        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        if (queue.contains(x)) {
            System.out.println("true");
        } else {
            System.out.println(queue.stream().min(Integer::compareTo).orElse(0));
        }
    }
}
