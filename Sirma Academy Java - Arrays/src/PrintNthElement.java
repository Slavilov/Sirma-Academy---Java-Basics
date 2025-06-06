import java.util.Scanner;

public class PrintNthElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        int n = scanner.nextInt();

        for (int i = 0; i < input.length; i += n) {
            System.out.print(input[i].trim() + " ");
        }
    }
}
