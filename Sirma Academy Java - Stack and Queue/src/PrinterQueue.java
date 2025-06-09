import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("print")) {
                while (!queue.isEmpty()) {
                    System.out.println(queue.poll());
                }
                break;
            } else if (command.equals("cancel")) {
                if (queue.isEmpty()) {
                    System.out.println("Standby");
                } else {
                    System.out.println("Canceled " + queue.poll());
                }
            } else {
                queue.offer(command);
            }
        }
    }
}
