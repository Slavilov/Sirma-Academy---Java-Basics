import java.util.Scanner;

public class uniqueCodes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstLimit = sc.nextInt();
        int secondLimit = sc.nextInt();
        int thirdLimit = sc.nextInt();

        for (int i = 2; i <= firstLimit; i += 2) {
            for (int j = 2; j <= secondLimit; j++) {
                if (!isPrime(j)) continue;
                for (int k = 2; k <= thirdLimit; k += 2) {
                    System.out.println(i + " " + j + " " + k);
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
