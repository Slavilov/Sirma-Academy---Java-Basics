import java.util.Scanner;

public class DifferentDataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Now you have to manually assign values to different data types alright!");
        System.out.println("Assign to integer type!");
        int integerNumber = scanner.nextInt();

        System.out.println("Now you have to assign a double data type!");
        double doubleNumber = scanner.nextDouble();

        System.out.println("Now i want you to type in a text!");
        scanner.nextLine();
        String text = scanner.nextLine();

        System.out.println("Now i want you to read out a char!");
        char symbol = scanner.nextLine().charAt(0);

        System.out.println("Now i will print out each data type in the following order, Integer, Double, Text and Char being last!");
        System.out.println(integerNumber);
        System.out.println(doubleNumber);
        System.out.println(text);
        System.out.println(symbol);
    }
}