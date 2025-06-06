import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arr1 = scanner.nextLine().split(",");
        String[] arr2 = scanner.nextLine().split(",");

        int sum = 0;
        boolean identical = true;

        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].trim().equals(arr2[i].trim())) {
                System.out.println("Arrays are not identical. Found difference at " + i + " index");
                identical = false;
                break;
            }
            sum += Integer.parseInt(arr1[i].trim());
        }

        if (identical) {
            System.out.println("Arrays are identical. Sum: " + sum);
        }
    }
}
