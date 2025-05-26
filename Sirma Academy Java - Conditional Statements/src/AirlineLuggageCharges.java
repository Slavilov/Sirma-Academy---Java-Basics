import java.util.Objects;
import java.util.Scanner;

public class AirlineLuggageCharges {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the weight of your luggage as integer!");
        int weight = Integer.parseInt(scanner.nextLine());

        System.out.println("Please type in all the dimensions of the luggage, must be as integer!");
        int dimension = Integer.parseInt(scanner.nextLine());

        movieClassification(weight, dimension);
    }

    public static void movieClassification(int weight, int dimension) {
        int fee = 0;
        int dimensionExceeding = 0;
        boolean weightFlag = false;
        boolean sizeFlag = false;

        if(dimension > 158){
            dimensionExceeding = dimension - 158;
            sizeFlag = true;
        }

        if(weight > 50){
            fee = fee+100;
            weightFlag = true;
        }

        if(dimensionExceeding >= 1 && dimensionExceeding <= 20){
            fee = fee+50;
        }
        else if(dimensionExceeding >= 21 && dimensionExceeding <= 50){
            fee = fee+100;
        }
        else if(dimensionExceeding > 50){
            fee = fee+200;
        }

        if (weightFlag == true && sizeFlag == true){
            fee = fee+50;
        }

        if(weightFlag == true && sizeFlag == true){
            System.out.println("$"+fee+ " (Overweight + Oversize + Handling)");
        }
        else if(sizeFlag == true){
            System.out.println("$"+fee+ " (Oversize)");
        }
        else if(weightFlag == true){
            System.out.println("$"+fee+ " (Overweight)");
        }
    }
}
