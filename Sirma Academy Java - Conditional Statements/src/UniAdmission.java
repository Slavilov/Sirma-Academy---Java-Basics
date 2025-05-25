import java.util.Scanner;

public class UniAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please type in the score of the student!");
        int score = Integer.parseInt(scanner.nextLine());

        System.out.println("Please type in the number of the extracurricular activities!");
        int numOfActivities = Integer.parseInt(scanner.nextLine());

        daysInAmonth(score, numOfActivities);
    }

    public static void daysInAmonth(int score, int numOfActivities) {
        if(score >= 90){
            System.out.println("Admitted!");
        }
        else if (score>=80 && score<=89) {
            if (numOfActivities>=2){
                System.out.println("Admitted");
            }
            else{
                System.out.println("Not admitted");
            }
        }
        else if(score < 80){
            System.out.println("Not admitted!");
        }
    }
}
