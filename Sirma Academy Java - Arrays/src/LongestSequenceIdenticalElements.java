import java.util.Scanner;

public class LongestSequenceIdenticalElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(",");
        int maxCount = 1, currentCount = 1;
        String maxElement = input[0], currentElement = input[0];

        for (int i = 1; i < input.length; i++) {
            if (input[i].trim().equals(currentElement)) {
                currentCount++;
            } else {
                currentElement = input[i].trim();
                currentCount = 1;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
                maxElement = currentElement;
            }
        }

        for (int i = 0; i < maxCount; i++) {
            System.out.print(maxElement + " ");
        }
    }
}
