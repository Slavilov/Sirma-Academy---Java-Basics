import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        StringBuilder result = new StringBuilder();
        for (String s : strings) {
            result.append(s.repeat(s.length()));
        }
        System.out.println(result);
    }
}