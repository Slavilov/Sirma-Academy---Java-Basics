import java.util.Scanner;

public class AlarmAfter15mins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter hour (0-23): ");
        int hour = scanner.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = scanner.nextInt();

        printTimeAfter15Minutes(hour, minutes);
    }

    public static void printTimeAfter15Minutes(int hour, int minutes) {
        minutes += 15;

        if (minutes >= 60) {
            hour += 1;
            minutes -= 60;
        }

        if (hour == 24) {
            hour = 0;
        }

        System.out.printf("%d:%02d\n", hour, minutes);
    }
}
