
public class SignOfInteger {
    public static void main(String[] args) {
        printSign(2);
        printSign(-5);
        printSign(0);
    }

    public static void printSign(int number) {
        if (number > 0) {
            System.out.println("The number " + number + " is positive.");
        } else if (number < 0) {
            System.out.println("The number " + number + " is negative.");
        } else {
            System.out.println("The number 0 is zero.");
        }
    }
}
