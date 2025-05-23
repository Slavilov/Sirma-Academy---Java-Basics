import java.util.Scanner;

public class AddressByAgeAndGender {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter male or female - m/f -> as a single character: ");
        char gender = scanner.next().charAt(0);

        if(age < 0) {
            System.out.println("There cannot be a person younger than 0 years!");
            System.out.println("Please restart the program again!");
            return;
        }

        addressByAgeAndGender(age, gender);
    }

    public static void addressByAgeAndGender(int age, char gender) {
        if(gender == 'm' && age >= 16){
            System.out.println("Mr.");
        }
        else if(gender == 'm' && age < 16){
            System.out.println("Master");
        }
        else if(gender == 'f' && age >= 16){
            System.out.println("Ms.");
        }
        else if(gender == 'f' && age < 16){
            System.out.println("Miss");
        }
    }
}
