import java.util.*;

public class UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> usernames = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();

            boolean exists = false;
            for (int j = 0; j < usernames.size(); j++) {
                if (usernames.get(j).equals(username)) {
                    exists = true;
                    break;
                }
            }

            if (!exists) {
                usernames.add(username);
            }
        }

        for (int i = 0; i < usernames.size(); i++) {
            System.out.println(usernames.get(i));
        }
    }
}
