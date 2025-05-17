import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("In this simple forecast program i want you to type in the following variables Town as string and Degrees as Double and we will print them out!");

        System.out.println("Now i want you to type in the Town!");
        String town = scanner.nextLine();

        System.out.println("Type in the degrees in a double format!");
        double degrees = Double.parseDouble(scanner.nextLine());

        System.out.printf("Today in %s it is %f degrees!\n", town, degrees);

    }
}