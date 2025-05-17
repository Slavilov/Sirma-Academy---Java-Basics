import java.util.Scanner;

public class PrintingEachVariableOnOneLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Now you have to manually assign values to different data types in the following order, Integer, Double, String and Symbol!");
        System.out.println("Assign to integer type!");
        int integerNumber = scanner.nextInt();
        double doubleNumber = scanner.nextDouble();
        scanner.nextLine();
        String text = scanner.nextLine();
        char symbol = scanner.nextLine().charAt(0);

        System.out.println("Now Java will use magic and print all the variables on one line!");
        System.out.println(integerNumber + " " + doubleNumber + " " + text + " " + symbol);
    }
}