import java.util.Scanner;

public class NumbersOneToNthroughTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number from which we will count to through 2!");
        int n = Integer.parseInt(input.nextLine());

        System.out.println("The numbers from 1 to " +n+ " are: ");

        for (int i = 1; i <= n ; i = i +2) {
            System.out.println(i);
        }
    }
}