import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from which we will count in reverse to 0, the number must be an integer!");
        int n = Integer.parseInt(input.nextLine());

        System.out.println("The numbers in reverse order:");
        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}