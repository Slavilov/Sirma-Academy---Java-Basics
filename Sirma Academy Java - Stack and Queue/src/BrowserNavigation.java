import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserNavigation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();
        String currentURL = null;

        while (true) {
            String command = scanner.nextLine();

            if (command.equals("Home")) {
                break;
            }

            if (command.equals("back")) {
                if (history.isEmpty()) {
                    System.out.println("no previous URLs");
                } else {
                    currentURL = history.pop();
                    System.out.println(currentURL);
                }
            } else {
                if (currentURL != null) {
                    history.push(currentURL);
                }
                currentURL = command;
                System.out.println(currentURL);
            }
        }
    }
}
