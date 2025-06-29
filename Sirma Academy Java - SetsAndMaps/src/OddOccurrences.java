import java.util.*;

public class OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().toLowerCase();
        String[] words = input.split(" ");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (counts.containsKey(word)) {
                int oldCount = counts.get(word);
                counts.put(word, oldCount + 1);
            } else {
                counts.put(word, 1);
            }
        }

        List<String> result = new ArrayList<>();
        List<String> keys = new ArrayList<>(counts.keySet());

        for (int i = 0; i < keys.size(); i++) {
            String word = keys.get(i);
            int count = counts.get(word);
            if (count % 2 != 0) {
                result.add(word);
            }
        }

        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
    }
}
