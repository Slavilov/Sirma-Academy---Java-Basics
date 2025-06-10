import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Robot {
    String name;
    int processTime;
    int workLeft = 0;

    public Robot(String name, int processTime) {
        this.name = name;
        this.processTime = processTime;
    }

    public boolean isFree() {
        return workLeft == 0;
    }

    public void assign() {
        this.workLeft = processTime;
    }

    public void tick() {
        if (workLeft > 0) workLeft--;
    }
}

public class FactoryRobots {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] robotInputs = scanner.nextLine().split("\\|");
        List<Robot> robots = new ArrayList<>();
        for (String r : robotInputs) {
            String[] parts = r.split("-");
            robots.add(new Robot(parts[0], Integer.parseInt(parts[1])));
        }

        LocalTime currentTime = LocalTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("H:mm:ss"));
        ArrayDeque<String> products = new ArrayDeque<>();

        while (true) {
            String product = scanner.nextLine();
            if (product.equals("End")) break;
            products.offer(product);
        }

        while (!products.isEmpty()) {
            currentTime = currentTime.plusSeconds(1);
            String product = products.poll();
            boolean assigned = false;

            for (Robot robot : robots) {
                robot.tick();
                if (!assigned && robot.isFree()) {
                    robot.assign();
                    System.out.println(robot.name + " - " + product + " [" + currentTime + "]");
                    assigned = true;
                }
            }

            if (!assigned) {
                products.offer(product);
            }
        }
    }
}
