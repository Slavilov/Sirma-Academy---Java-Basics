import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) break;
            StringBuilder reversed = new StringBuilder(input).reverse();
            System.out.println(input + " = " + reversed);
        }
    }
}