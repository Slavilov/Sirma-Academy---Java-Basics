import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("In this program i will need you to type in two integers! ");

        int numberOne = Integer.parseInt(myObj.nextLine());
        int numberTwo = Integer.parseInt(myObj.nextLine());

        LargerNumber(numberOne, numberTwo);

    }
    public static void LargerNumber(int a, int b) {
        if (a>b){
            System.out.println("The larger number is: " +a);
        }
        else{
            System.out.println("The larger number is: " +b);
        }
    }
}