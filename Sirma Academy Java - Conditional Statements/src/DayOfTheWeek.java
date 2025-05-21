import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("In this program i will need you to type a number from 1 to 7 as an integer!");

        int number = Integer.parseInt(myObj.nextLine());

        daysOfWeek(number);

    }
    public static void daysOfWeek(int number) {
        if (number == 1) {
            System.out.println("Monday");
        } else if (number == 2) {
            System.out.println("Tuesday");
        } else if (number == 3) {
            System.out.println("Wednesday");
        } else if (number == 4) {
            System.out.println("Thursday");
        } else if (number == 5) {
            System.out.println("Friday");
        } else if (number == 6) {
            System.out.println("Saturday");
        } else if (number == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid number! Please enter a number from 1 to 7.");
        }

    }
}