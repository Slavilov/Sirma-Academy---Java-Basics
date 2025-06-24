
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] size = scanner.nextLine().split(",\s+");
        int rows = Integer.parseInt(size[0]);
        int cols = Integer.parseInt(size[1]);

        int[][] matrix = new int[rows][cols];
        int sum = 0;

        for (int i = 0; i < rows; i++) {
            String[] elements = scanner.nextLine().split(",\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(elements[j]);
                sum += matrix[i][j];
            }
        }

        System.out.println(rows);
        System.out.println(cols);
        System.out.println(sum);
    }
}
