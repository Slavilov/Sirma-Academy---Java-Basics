import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Now we are going to check if a number is Even or Odd!");
        System.out.println("I will need you to type in a number - integer and check out if it's Even or Odd!");
        System.out.println("Now please type in the number!");

        int number = Integer.parseInt(myObj.nextLine());

        evenOrOdd(number);

    }
    public static void evenOrOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("The number is even!");
        }
        else{
            System.out.println("The number is odd!");
        }
    }
}