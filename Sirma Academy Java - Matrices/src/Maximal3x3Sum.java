
import java.util.Scanner;

public class Maximal3x3Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.nextInt();

        int maxSum = Integer.MIN_VALUE, bestRow = 0, bestCol = 0;

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                int sum = 0;
                for (int x = 0; x < 3; x++)
                    for (int y = 0; y < 3; y++)
                        sum += matrix[i + x][j + y];
                if (sum > maxSum) {
                    maxSum = sum;
                    bestRow = i;
                    bestCol = j;
                }
            }
        }

        System.out.println("Sum = " + maxSum);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(matrix[bestRow + i][bestCol + j] + " ");
            System.out.println();
        }
    }
}
