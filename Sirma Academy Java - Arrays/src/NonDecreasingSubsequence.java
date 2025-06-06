import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NonDecreasingSubsequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        List<Integer> result = new ArrayList<>();

        int max = Integer.MIN_VALUE;
        for (String s : input) {
            int num = Integer.parseInt(s.trim());
            if (num >= max) {
                result.add(num);
                max = num;
            }
        }

        result.forEach(e -> System.out.print(e + " "));
    }
}
