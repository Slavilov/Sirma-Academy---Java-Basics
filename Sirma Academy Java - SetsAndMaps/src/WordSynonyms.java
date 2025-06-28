import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> synonyms = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!synonyms.containsKey(word)) {
                synonyms.put(word, new ArrayList<String>());
            }

            synonyms.get(word).add(synonym);
        }

        List<String> words = new ArrayList<>(synonyms.keySet());

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            List<String> wordSynonyms = synonyms.get(word);

            String result = word + " - ";
            for (int j = 0; j < wordSynonyms.size(); j++) {
                result += wordSynonyms.get(j);
                if (j < wordSynonyms.size() - 1) {
                    result += ", ";
                }
            }

            System.out.println(result);
        }
    }
}
