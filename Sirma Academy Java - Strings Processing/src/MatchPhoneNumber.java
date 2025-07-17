import java.util.Scanner;
import java.util.regex.*;

public class Exercise17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Pattern pattern = Pattern.compile("\+359([ -])2\1\d{3}\1\d{4}\b");
        Matcher matcher = pattern.matcher(input);
        boolean first = true;
        while (matcher.find()) {
            if (!first) System.out.print(", ");
            System.out.print(matcher.group());
            first = false;
        }
    }
}