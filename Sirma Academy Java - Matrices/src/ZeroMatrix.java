
import java.util.*;

public class ZeroMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (zeroRows[i] || zeroCols[j])
                    matrix[i][j] = 0;

        for (int[] row : matrix) {
            for (int cell : row)
                System.out.print(cell + " ");
            System.out.println();
        }
    }
}
