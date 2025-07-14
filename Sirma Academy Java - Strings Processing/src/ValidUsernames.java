import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] usernames = scanner.nextLine().split(", ");
        for (String username : usernames) {
            if (username.matches("[A-Za-z0-9_-]{3,16}")) {
                System.out.println(username);
            }
        }
    }
}