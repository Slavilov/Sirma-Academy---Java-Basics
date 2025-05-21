import java.util.Scanner;

public class CheckForAnExcellentRating {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("In this program i will need you to type in a double/float number! ");

        double number = Double.parseDouble(myObj.nextLine());

        if(number >= 5.50){
            System.out.println("Excellent!");
        }
        else {
            System.out.println("You should try harder!");
        }
    }
}