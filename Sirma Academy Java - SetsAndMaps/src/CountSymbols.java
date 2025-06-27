import java.util.*;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        Map<Character, Integer> counts = new TreeMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (counts.containsKey(ch)) {
                int currentCount = counts.get(ch);
                counts.put(ch, currentCount + 1);
            } else {
                counts.put(ch, 1);
            }
        }

        List<Character> keys = new ArrayList<>(counts.keySet());
        for (int i = 0; i < keys.size(); i++) {
            char key = keys.get(i);
            int value = counts.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
