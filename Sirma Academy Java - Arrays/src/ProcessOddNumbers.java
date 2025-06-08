import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ProcessOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < input.length; i += 2) {
            result.add(Integer.parseInt(input[i].trim()) * 2);
        }

        Collections.reverse(result);
        result.forEach(e -> System.out.print(e + " "));
    }
}
