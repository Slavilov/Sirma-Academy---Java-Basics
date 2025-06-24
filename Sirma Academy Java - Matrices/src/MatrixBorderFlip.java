
import java.util.Scanner;

public class MatrixBorderFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.nextInt();

        int[] border = new int[2 * (rows + cols - 2)];
        int index = 0;

        for (int j = 0; j < cols; j++) border[index++] = matrix[0][j];
        for (int i = 1; i < rows - 1; i++) border[index++] = matrix[i][cols - 1];
        for (int j = cols - 1; j >= 0; j--) border[index++] = matrix[rows - 1][j];
        for (int i = rows - 2; i > 0; i--) border[index++] = matrix[i][0];

        int[] rotated = new int[border.length];
        for (int i = 0; i < border.length; i++)
            rotated[(i + 1) % border.length] = border[i];

        index = 0;
        for (int j = 0; j < cols; j++) matrix[0][j] = rotated[index++];
        for (int i = 1; i < rows - 1; i++) matrix[i][cols - 1] = rotated[index++];
        for (int j = cols - 1; j >= 0; j--) matrix[rows - 1][j] = rotated[index++];
        for (int i = rows - 2; i > 0; i--) matrix[i][0] = rotated[index++];

        for (int[] row : matrix) {
            for (int cell : row) System.out.print(cell + " ");
            System.out.println();
        }
    }
}
