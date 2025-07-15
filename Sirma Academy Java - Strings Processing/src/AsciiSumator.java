import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char start = scanner.nextLine().charAt(0);
        char end = scanner.nextLine().charAt(0);
        String text = scanner.nextLine();
        int sum = 0;

        for (char c : text.toCharArray()) {
            if (c > start && c < end) {
                sum += c;
            }
        }

        System.out.println(sum);
    }
}