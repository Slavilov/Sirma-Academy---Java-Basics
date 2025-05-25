import java.util.Scanner;

public class AtSea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the days you are going to stay it must be between 0 and 365 and be an INTEGER!");
        int daysToStay = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter the type of room you want, it must be either single room, apartment or presidential.");
        String typeOfRoom = scanner.nextLine().toLowerCase();

        System.out.println("Enter your assessment, either being positive or negative!");
        String assessment = scanner.nextLine().toLowerCase();

        costOfVacation(daysToStay, typeOfRoom, assessment);
    }

    public static void costOfVacation(int daysToStay, String typeOfRoom, String assessment) {
        double totalPrice = 0;
        daysToStay = daysToStay - 1;

        if (typeOfRoom.equals("single room")) {
            totalPrice = daysToStay*25.00;

        } else if (typeOfRoom.equals("apartment")) {
            totalPrice = daysToStay*50.00;

            if (daysToStay < 10) {
                totalPrice = totalPrice - (totalPrice*0.30);

            } else if (daysToStay >= 10 && daysToStay <= 15) {
                totalPrice = totalPrice - (totalPrice*0.35);

            } else if (daysToStay > 15) {
                totalPrice = totalPrice - (totalPrice*0.50);
            }

        } else if (typeOfRoom.equals("presidential")) {
            totalPrice = daysToStay*100.00;

            if (daysToStay < 10) {
                totalPrice = totalPrice - (totalPrice*0.10);

            } else if (daysToStay >= 10 && daysToStay <= 15) {
                totalPrice = totalPrice - (totalPrice*0.15);

            } else if (daysToStay > 15) {
                totalPrice = totalPrice - (totalPrice*0.20);

            }
        }

        if (assessment.equals("positive")) {
            totalPrice = totalPrice + (totalPrice*0.25);

        } else {
            totalPrice = totalPrice - (totalPrice*0.10);

        }

        System.out.println("The total price is: " +totalPrice);
    }
}
