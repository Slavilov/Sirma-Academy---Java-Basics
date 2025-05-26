import java.util.Objects;
import java.util.Scanner;

public class MovieClassification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the age of the person!");
        int age = Integer.parseInt(scanner.nextLine());

        movieClassification(age);
    }

    public static void movieClassification(int age) {
        if(age < 13 && age > 0){
            System.out.println("U- rated movies!");
        } else if (age >= 13 && age <= 17) {
            System.out.println("U and PG-13 rated movies!");
        }
        else if(age >= 18){
            System.out.println("All movies!");
        }
    }
}
