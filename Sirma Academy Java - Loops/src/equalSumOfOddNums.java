import java.util.Scanner;

public class equalSumOfOddNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        boolean found = false;

        for (int num = start; num <= end; num++) {
            String strNum = String.valueOf(num);
            int evenSum = 0, oddSum = 0;

            for (int i = 0; i < strNum.length(); i++) {
                int digit = Character.getNumericValue(strNum.charAt(i));
                if (i % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            }

            if (evenSum == oddSum) {
                System.out.println(num);
                found = true;
            }
        }

        if (!found) {
            System.out.println("None");
        }
    }
}
