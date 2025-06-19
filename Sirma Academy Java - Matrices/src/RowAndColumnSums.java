
import java.util.Scanner;

public class RowAndColumnSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = scanner.nextInt();

        System.out.print("Row Sums: ");
        for (int i = 0; i < rows; i++) {
            int sum = 0;
            for (int j = 0; j < cols; j++)
                sum += matrix[i][j];
            System.out.print(sum + (i < rows - 1 ? ", " : ""));
        }
        System.out.println();

        System.out.print("Column Sums: ");
        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++)
                sum += matrix[i][j];
            System.out.print(sum + (j < cols - 1 ? ", " : ""));
        }
        System.out.println();
    }
}
