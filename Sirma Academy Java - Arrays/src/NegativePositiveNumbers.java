import java.util.LinkedList;
import java.util.Scanner;

public class NegativePositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        LinkedList<Integer> result = new LinkedList<>();

        for (String s : input) {
            int num = Integer.parseInt(s.trim());
            if (num < 0) {
                result.addFirst(num);
            } else {
                result.addLast(num);
            }
        }

        result.forEach(System.out::println);
    }
}
