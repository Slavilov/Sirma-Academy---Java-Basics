import java.util.Objects;
import java.util.Scanner;

public class Grocery {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type in the product: ");
        String product = (scanner.nextLine()).toLowerCase();

        System.out.println("Please type in the city: ");
        String city = (scanner.nextLine()).toLowerCase();

        System.out.println("Please type in the quantity of the selected product that you want to buy: ");
        int quantity = Integer.parseInt(scanner.nextLine());


        groceryCalculator(product, city, quantity);
    }

    public static void groceryCalculator(String product, String city, int quantity) {
        double sum = 0;

        if(Objects.equals(city, "sofia")){
            switch(product) {
                case "tea":
                    sum = quantity*0.50;
                    break;
                case "water":
                    sum = quantity*0.80;
                    break;
                case "juice":
                    sum = quantity*1.20;
                    break;
                case "sweets":
                    sum = quantity*1.45;
                    break;
                case "chips":
                    sum = quantity*1.60;
                    break;
            }
        }
        else if(Objects.equals(city, "plovdiv")){
            switch(product) {
                case "tea":
                    sum = quantity*0.40;
                    break;
                case "water":
                    sum = quantity*0.70;
                    break;
                case "juice":
                    sum = quantity*1.15;
                    break;
                case "sweets":
                    sum = quantity*1.30;
                    break;
                case "chips":
                    sum = quantity*1.50;
                    break;
            }
        }
        else if(Objects.equals(city, "varna")){
            switch(product) {
                case "tea":
                    sum = quantity*0.45;
                    break;
                case "water":
                    sum = quantity*0.70;
                    break;
                case "juice":
                    sum = quantity*1.10;
                    break;
                case "sweets":
                    sum = quantity*1.35;
                    break;
                case "chips":
                    sum = quantity*1.55;
                    break;
            }
        }
        else{
            System.out.println("You have typed in the wrong city!");
            return;
        }

        System.out.println("The sum in " +city+ " is: " +sum);
    }
}
