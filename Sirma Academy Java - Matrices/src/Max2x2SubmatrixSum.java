
import java.util.Scanner;

public class Max2x2SubmatrixSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(",\s+");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            String[] line = scanner.nextLine().split(",\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(line[j]);
            }
        }

        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0, bestCol = 0;

        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                int sum = matrix[i][j] + matrix[i][j+1] +
                          matrix[i+1][j] + matrix[i+1][j+1];
                if (sum > maxSum) {
                    maxSum = sum;
                    bestRow = i;
                    bestCol = j;
                }
            }
        }

        System.out.println(matrix[bestRow][bestCol] + " " + matrix[bestRow][bestCol+1]);
        System.out.println(matrix[bestRow+1][bestCol] + " " + matrix[bestRow+1][bestCol+1]);
        System.out.println(maxSum);
    }
}
