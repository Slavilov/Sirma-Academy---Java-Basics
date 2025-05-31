import java.util.Scanner;

public class padawanEquip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = sc.nextDouble();
        int students = sc.nextInt();
        double saberPrice = sc.nextDouble();
        double robePrice = sc.nextDouble();
        double beltPrice = sc.nextDouble();

        int sabersNeeded = (int) Math.ceil(students * 1.1);
        int freeBelts = students / 6;

        double totalCost = (sabersNeeded * saberPrice) + (students * robePrice) + ((students - freeBelts) * beltPrice);

        if (totalCost <= budget) {
            System.out.printf("The money is enough - it would cost %.2flv.%n", totalCost);
        } else {
            System.out.printf("George Lucas will need %.2flv more.%n", totalCost - budget);
        }
    }
}
