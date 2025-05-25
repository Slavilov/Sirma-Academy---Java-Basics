import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in your percentage grade as integer between 0 and 100%!");
        int gradePercentage = Integer.parseInt(scanner.nextLine());

        gradeCalculator(gradePercentage);
    }

    public static void gradeCalculator(int gradePercentage) {
        if(gradePercentage >= 0 && gradePercentage <= 59){
            System.out.println("Your grade is F");
        } else if (gradePercentage >= 60 && gradePercentage <= 69) {
            System.out.println("Your grade is D");
        }
        else if (gradePercentage >= 70 && gradePercentage <= 79){
            System.out.println("Your grade is C");
        }
        else if (gradePercentage >= 80 && gradePercentage <= 89){
            System.out.println("Your grade is B");
        }
        else if(gradePercentage >= 90 && gradePercentage <= 100){
            System.out.println("Your grade is A");
        }
    }
}
