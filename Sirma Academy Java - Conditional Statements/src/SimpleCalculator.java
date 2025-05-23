import java.util.Objects;
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in two numbers, they must be float or double! ");

        System.out.println("Type in the first number: ");
        double numOne = Double.parseDouble(scanner.nextLine());

        System.out.println("Type in the second number: ");
        double numTwo = Double.parseDouble(scanner.nextLine());

        System.out.println("Now type in the mathematical operation that you want to proceed to execute!");
        String operation = scanner.nextLine();

        calculator(numOne, numTwo, operation);

    }
    public static void calculator(double numOne, double numTwo, String operation){
        double sum = 0;
        if (Objects.equals(operation, "add")){
            sum = numOne + numTwo;
        }
        else if (Objects.equals(operation, "subtract")) {
            sum = numOne - numTwo;
        }
        else if(Objects.equals(operation, "divide")){
            sum = (double) numOne /numTwo;

        } else if (Objects.equals(operation, "multiply")) {
            sum = numOne*numTwo;
        }
        System.out.println("The result of the math operation " +operation+ " is: " +sum);
    }
}
