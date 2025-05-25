import java.util.Objects;
import java.util.Scanner;

public class MakeupShop {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Please type in your budget for renovation, it must be a real number between 1.00 and 10 000.00!");
        Double budget = Double.parseDouble(scanner.nextLine());

        System.out.print("Please type in the count of how much powders you want to buy as integer, it must be between the range of 0 and 1000!");
        int countOfPowders = Integer.parseInt(scanner.nextLine());

        System.out.print("Please type in the count of how much lipsticks you want to buy as integer, it must be between the range of 0 and 1000!");
        int countOfLipstick = Integer.parseInt(scanner.nextLine());

        System.out.print("Please type in the count of how much spirals you want to buy as integer, it must be between the range of 0 and 1000!");
        int countOfSpirals = Integer.parseInt(scanner.nextLine());

        System.out.print("Please type in the count of how much shadows you want to buy as integer, it must be between the range of 0 and 1000!");
        int countOfShadows = Integer.parseInt(scanner.nextLine());

        System.out.print("Please type in the count of how much correctors you want to buy as integer, it must be between the range of 0 and 1000!");
        int countOfCorrectors = Integer.parseInt(scanner.nextLine());

        int sumCountOfAll = countOfPowders + countOfLipstick + countOfSpirals + countOfShadows + countOfCorrectors;

        Double sumOfPowders = countOfPowders*2.60;
        Double sumOfLipstick = countOfLipstick*3.00;
        Double sumOfSpirals = countOfSpirals*4.10;
        Double sumOfShadows = countOfShadows*8.20;
        Double sumOfConcealer = countOfCorrectors*2.00;

        Double totalSum = (sumOfPowders+sumOfLipstick+sumOfSpirals+sumOfShadows+sumOfConcealer);
        double remainingSum = 0;

        if (sumCountOfAll >= 50){
            totalSum = totalSum - (totalSum*0.25);
        }

        totalSum = totalSum - (totalSum*0.10); //This is for the rent!

        if(totalSum >= budget){
            remainingSum = totalSum - budget;
            System.out.println("Yes! " +remainingSum+ "lv left.");
        }
        else{
            remainingSum = budget - totalSum;
            System.out.println("Not enough money! " +remainingSum+ " lv needed.");
        }
    }
}
