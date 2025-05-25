import java.util.Scanner;

public class Holiday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine().toLowerCase();

        printHolidayPlan(budget, season);
    }

    public static void printHolidayPlan(double budget, String season) {
        String destination = "";
        String typeOfHoliday = "";
        double amountSpent = 0;

        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                amountSpent = budget * 0.30;
                typeOfHoliday = "Camp";
            } else {
                amountSpent = budget * 0.70;
                typeOfHoliday = "Hotel";
            }
        } else if (budget <= 1000) {
            destination = "Europe";
            if (season.equals("summer")) {
                amountSpent = budget * 0.40;
            } else {
                amountSpent = budget * 0.80;
            }
            typeOfHoliday = "Hotel";
        } else {
            destination = "Asia";
            amountSpent = budget * 0.90;
            typeOfHoliday = "Hotel";
        }

        System.out.printf("Somewhere in %s%n", destination);
        System.out.printf("%s - %.2f%n", typeOfHoliday, amountSpent);
    }
}
