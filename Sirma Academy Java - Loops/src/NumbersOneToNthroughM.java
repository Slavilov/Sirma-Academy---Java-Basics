import java.util.Scanner;

public class NumbersOneToNthroughM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number N to whom we will count to through M!");
        int n = Integer.parseInt(input.nextLine());

        System.out.println("Enter a number M which will be the count through!");
        int m = Integer.parseInt(input.nextLine());

        System.out.println("The numbers from 1 to " +n+ " are: ");

        for (int i = 1; i <= n ; i = i +m) {
            System.out.println(i);
        }
    }
}