import java.util.Scanner;

public class DaysPerMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the month it must be an integer from 1 to 12!");
        int month = Integer.parseInt(scanner.nextLine());

        daysInAmonth(month);
    }

    public static void daysInAmonth(int month) {
        if(month == 2){
            System.out.println("That month is February, so there are only 28 days in the month!");
        } else if (month%2==0) {
            System.out.println("There are 30 days in the month that you have typed!");
        }
        else{
            System.out.println("There are 31 days in the month that you have typed!");
        }
    }
}
