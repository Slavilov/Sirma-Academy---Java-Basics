import java.util.Scanner;

public class Speed {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("Now i will want you to type in an integer and depending on the size of the integer output a message!");
        System.out.println("Now please type in the number!");

        int number = Integer.parseInt(myObj.nextLine());

        speedDetermenation(number);

    }
    public static void speedDetermenation(int number) {
        if (number <= 10 && number >= 0) {
            System.out.println("The speed is slow!");
        }
        else if(number >= 10 && number < 60){
            System.out.println("The speed is average!");
        }
        else if(number >= 60 && number < 120){
            System.out.println("The speed is fast!");
        }
        else if(number >= 120 && number < 160){
            System.out.println("The speed is super-fast!");
        }
        else if(number > 160){
            System.out.println("The speed is turbo-fast");
        }
        else{
            System.out.println("The speed is negative!");
        }
    }
}