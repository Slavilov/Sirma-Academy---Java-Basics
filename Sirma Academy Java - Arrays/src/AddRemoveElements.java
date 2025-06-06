import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddRemoveElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] commands = scanner.nextLine().split(",");
        List<Integer> list = new ArrayList<>();
        int number = 1;

        for (String command : commands) {
            if (command.trim().equals("add")) {
                list.add(number);
            } else if (command.trim().equals("remove")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            }
            number++;
        }

        System.out.println(list.isEmpty() ? "Empty" : list.toString().replaceAll("[\\[\\],]", ""));
    }
}
