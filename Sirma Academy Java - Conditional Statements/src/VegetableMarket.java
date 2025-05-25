import java.util.Objects;
import java.util.Scanner;

public class VegetableMarket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type in the vegetable: ");
        String vegetable = (scanner.nextLine()).toLowerCase();

        System.out.println("Please type in the day of the week: ");
        String dayOfTheWeek = scanner.nextLine();

        System.out.println("Please type in the quantity of the selected vegetable that you want to buy: ");
        int quantity = Integer.parseInt(scanner.nextLine());


        vegetableMarketCalculation(vegetable, dayOfTheWeek, quantity);
    }

    public static void vegetableMarketCalculation(String vegetable, String dayOfTheWeek, int quantity) {
        double sum = 0;

        if(Objects.equals(dayOfTheWeek, "Monday") || Objects.equals(dayOfTheWeek, "Tuesday") || Objects.equals(dayOfTheWeek, "Wednesday") || Objects.equals(dayOfTheWeek, "Thursday") || Objects.equals(dayOfTheWeek, "Friday")){
            switch(vegetable) {
                case "tomato":
                    sum = quantity*2.50;
                    break;
                case "onion":
                    sum = quantity*1.20;
                    break;
                case "lettuce":
                    sum = quantity*0.85;
                    break;
                case "cucumber":
                    sum = quantity*1.45;
                    break;
                case "pepper":
                    sum = quantity*5.50;
                    break;
            }
        }
        else if(Objects.equals(dayOfTheWeek, "Saturday") || Objects.equals(dayOfTheWeek, "Sunday")){
            switch(vegetable) {
                case "tomato":
                    sum = quantity*2.80;
                    break;
                case "onion":
                    sum = quantity*1.30;
                    break;
                case "lettuce":
                    sum = quantity*0.85;
                    break;
                case "cucumber":
                    sum = quantity*1.75;
                    break;
                case "pepper":
                    sum = quantity*3.50;
                    break;
            }
        }
        else{
            System.out.println("You have typed in wrong day of the week!");
            return;
        }

        System.out.println("The sum in is: " +sum);
    }
}
