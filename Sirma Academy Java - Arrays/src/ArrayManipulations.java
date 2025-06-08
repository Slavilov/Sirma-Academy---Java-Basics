import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();
        for (String num : scanner.nextLine().split(",")) {
            list.add(Integer.parseInt(num.trim()));
        }

        String[] commands = scanner.nextLine().split(",");
        for (String command : commands) {
            String[] parts = command.split(" ");
            switch (parts[0]) {
                case "Add":
                    list.add(Integer.parseInt(parts[1]));
                    break;
                case "Remove":
                    list.remove(Integer.valueOf(Integer.parseInt(parts[1])));
                    break;
                case "RemoveAt":
                    list.remove(Integer.parseInt(parts[1]));
                    break;
                case "Insert":
                    list.add(Integer.parseInt(parts[2]), Integer.parseInt(parts[1]));
                    break;
            }
        }

        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }
}
