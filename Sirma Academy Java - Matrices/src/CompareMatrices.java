
import java.util.Scanner;

public class CompareMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix1 = new int[rows][cols];

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = scanner.nextInt();

        int rows2 = scanner.nextInt();
        int cols2 = scanner.nextInt();

        if (rows != rows2 || cols != cols2) {
            System.out.println("not equal");
            return;
        }

        int[][] matrix2 = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++)
            for (int j = 0; j < cols2; j++)
                matrix2[i][j] = scanner.nextInt();

        boolean equal = true;
        for (int i = 0; i < rows && equal; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix1[i][j] != matrix2[i][j]) {
                    equal = false;
                    break;
                }
            }
        }

        System.out.println(equal ? "equal" : "not equal");
    }
}
