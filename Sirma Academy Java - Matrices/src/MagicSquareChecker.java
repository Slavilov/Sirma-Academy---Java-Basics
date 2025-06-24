
import java.util.Scanner;

public class MagicSquareChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] matrix = new int[size][size];
        int targetSum = 0;
        boolean isMagic = true;

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                matrix[i][j] = scanner.nextInt();

        for (int j = 0; j < size; j++) targetSum += matrix[0][j];

        for (int i = 0; i < size; i++) {
            int rowSum = 0;
            for (int j = 0; j < size; j++) rowSum += matrix[i][j];
            if (rowSum != targetSum) isMagic = false;
        }

        for (int j = 0; j < size; j++) {
            int colSum = 0;
            for (int i = 0; i < size; i++) colSum += matrix[i][j];
            if (colSum != targetSum) isMagic = false;
        }

        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < size; i++) {
            diag1 += matrix[i][i];
            diag2 += matrix[i][size - 1 - i];
        }

        if (diag1 != targetSum || diag2 != targetSum) isMagic = false;

        System.out.println(isMagic ? "True" : "False");
    }
}
