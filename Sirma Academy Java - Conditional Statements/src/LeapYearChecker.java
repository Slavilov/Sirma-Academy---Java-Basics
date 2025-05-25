import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the year you want to be checked it must be an integer!");
        int year = Integer.parseInt(scanner.nextLine());

        leapYearChecker(year);
    }

    public static void leapYearChecker(int year) {
        if(year%4 == 0){
            if(year%100 == 0 && year%400 ==0){
                System.out.println("It's a leap year!");
            }
            else{
                System.out.println("It's not a leap year!");
            }
        }
        else{
            System.out.println("It's not a leap year!");
        }
    }
}
