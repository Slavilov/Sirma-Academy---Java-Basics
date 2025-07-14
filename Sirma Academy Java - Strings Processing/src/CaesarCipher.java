import java.util.Scanner;

public class Exercise08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            result.append((char)(c + 3));
        }
        System.out.println(result);
    }
}