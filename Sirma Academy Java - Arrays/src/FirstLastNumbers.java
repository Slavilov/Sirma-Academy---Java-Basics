import java.util.Scanner;

public class FirstLastNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        scanner.nextLine();
        String[] input = scanner.nextLine().split(",");

        for (int i = 0; i < k; i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();

        for (int i = input.length - k; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }
}
