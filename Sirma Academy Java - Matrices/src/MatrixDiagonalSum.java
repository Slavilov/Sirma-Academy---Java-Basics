
import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < Math.min(rows, cols); i++) {
            sum += matrix[i][i]; // main diagonal
            sum += matrix[i][cols - i - 1]; // secondary diagonal
        }

        // Avoid double-counting the center in odd-dimension matrix
        if (rows == cols && rows % 2 != 0) {
            sum -= matrix[rows / 2][cols / 2];
        }

        System.out.println(sum);
    }
}
