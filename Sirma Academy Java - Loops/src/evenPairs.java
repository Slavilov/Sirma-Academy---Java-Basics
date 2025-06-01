import java.util.Scanner;

public class evenPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstStart = sc.nextInt();
        int secondStart = sc.nextInt();
        int firstDiff = sc.nextInt();
        int secondDiff = sc.nextInt();

        for (int i = firstStart; i <= firstStart + firstDiff; i++) {
            for (int j = secondStart; j <= secondStart + secondDiff; j++) {
                if (isPrime(i) && isPrime(j)) {
                    System.out.println(i + "" + j);
                }
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
