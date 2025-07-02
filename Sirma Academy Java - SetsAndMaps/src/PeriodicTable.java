import java.util.*;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<String> elements = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String[] tokens = line.split(" ");

            for (int j = 0; j < tokens.length; j++) {
                String element = tokens[j];

                boolean exists = false;
                for (int k = 0; k < elements.size(); k++) {
                    if (elements.get(k).equals(element)) {
                        exists = true;
                        break;
                    }
                }

                if (!exists) {
                    elements.add(element);
                }
            }
        }

        for (int i = 0; i < elements.size() - 1; i++) {
            for (int j = i + 1; j < elements.size(); j++) {
                if (elements.get(j).compareTo(elements.get(i)) < 0) {
                    String temp = elements.get(i);
                    elements.set(i, elements.get(j));
                    elements.set(j, temp);
                }
            }
        }

        for (int i = 0; i < elements.size(); i++) {
            System.out.print(elements.get(i) + " ");
        }
    }
}
