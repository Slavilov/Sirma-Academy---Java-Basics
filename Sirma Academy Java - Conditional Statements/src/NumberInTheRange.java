import java.util.Objects;
import java.util.Scanner;

public class NumberInTheRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in a number in the ran ge -100 to +100! ");
        int number = Integer.parseInt(scanner.nextLine());

        if(number >= -100 && number <= 100){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
