import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class Task {
    String name;
    int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }
}

public class TaskScheduler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(
                Comparator.comparingInt((Task t) -> -t.priority)
        );

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("end")) break;

            if (line.startsWith("Add")) {
                String[] parts = line.split(" ");
                String name = parts[1];
                int priority = Integer.parseInt(parts[2]);
                taskQueue.offer(new Task(name, priority));
            } else if (line.equals("getNextTask")) {
                Task next = taskQueue.poll();
                if (next != null) {
                    System.out.println(next.name + " - " + next.priority);
                }
            }
        }
    }
}
