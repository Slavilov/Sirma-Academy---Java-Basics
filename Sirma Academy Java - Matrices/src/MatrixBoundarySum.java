
import java.util.Scanner;

public class MatrixBoundarySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.nextInt();

        for (int j = 0; j < cols; j++) {
            sum += matrix[0][j]; // top row
            sum += matrix[rows - 1][j]; // bottom row
        }

        for (int i = 1; i < rows - 1; i++) {
            sum += matrix[i][0]; // left column
            sum += matrix[i][cols - 1]; // right column
        }

        System.out.println(sum);
    }
}
