
import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();

        switch (type) {
            case "int" -> {
                int a = Integer.parseInt(scanner.nextLine());
                int b = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(a, b));
            }
            case "char" -> {
                char a = scanner.nextLine().charAt(0);
                char b = scanner.nextLine().charAt(0);
                System.out.println(getMax(a, b));
            }
            case "string" -> {
                String a = scanner.nextLine();
                String b = scanner.nextLine();
                System.out.println(getMax(a, b));
            }
        }
    }

    public static int getMax(int a, int b) {
        return Math.max(a, b);
    }

    public static char getMax(char a, char b) {
        return (char) Math.max(a, b);
    }

    public static String getMax(String a, String b) {
        return a.compareTo(b) >= 0 ? a : b;
    }
}
