import java.util.Objects;
import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the age of the customer!");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Please type in if they have a membership or not!");
        String membership = scanner.nextLine();

        membership(age, membership);
    }

    public static void membership(int age, String membership) {
        if(age < 18 && age > 0){
            System.out.println("10% discount");
        }
        else if (age >= 18 && age <= 64) {
            if (Objects.equals(membership, "Yes")){
                System.out.println("20% discount");
            }
            else{
                System.out.println("10% discount");
            }
        }
        else if(age >= 65){
            System.out.println("30% discount");
        }
    }
}
