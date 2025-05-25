import java.util.Scanner;

public class MovieTicketPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the age of person who will use/own this ticekt!!");
        int age = Integer.parseInt(scanner.nextLine());

        ticketPrice(age);
    }

    public static void ticketPrice(int age) {
        if(age >= 0 && age <= 12){
            System.out.println("Your ticket price is $5!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Your ticket price is $8!");
        }
        else if (age >= 20){
            System.out.println("Your ticket price is $10!");
        }
        else{
            System.out.println("You have typed in an incorrect age!");
        }
    }
}
