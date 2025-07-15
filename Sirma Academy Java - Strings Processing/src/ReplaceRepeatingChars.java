import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        char prev = text.charAt(0);
        result.append(prev);
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i) != prev) {
                result.append(text.charAt(i));
                prev = text.charAt(i);
            }
        }
        System.out.println(result);
    }
}