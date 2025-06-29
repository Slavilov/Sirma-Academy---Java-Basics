import java.util.*;

public class Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] tokens = input.split(" ");

        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < tokens.length; i++) {
            int number = Integer.parseInt(tokens[i]);
            numbers.add(number);
        }

        for (int i = 0; i < numbers.size() - 1; i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (numbers.get(j) > numbers.get(i)) {
                    int temp = numbers.get(i);
                    numbers.set(i, numbers.get(j));
                    numbers.set(j, temp);
                }
            }
        }

        int limit = 3;
        if (numbers.size() < 3) {
            limit = numbers.size();
        }

        for (int i = 0; i < limit; i++) {
            System.out.print(numbers.get(i) + " ");
        }
    }
}
