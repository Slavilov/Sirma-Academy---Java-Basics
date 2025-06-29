import java.util.*;

public class WordFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
