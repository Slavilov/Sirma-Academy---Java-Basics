import java.util.*;

public class randomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        List<String> wordList = new ArrayList<>(Arrays.asList(words));
        Collections.shuffle(wordList);

        for (String word : wordList) {
            System.out.println(word);
        }
    }
}
