import java.util.Scanner;
import java.util.regex.*;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\b[A-Z][a-z]+ [A-Z][a-z]+\b");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}