
import java.util.Scanner;

public class ExcelSumFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        scanner.nextLine();

        for (int i = 0; i < rows; i++) {
            String[] parts = scanner.nextLine().split("\s+");
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = Integer.parseInt(parts[j]);
            }
        }

        String range = scanner.nextLine();
        String[] cells = range.split(":");
        int startRow = Integer.parseInt(cells[0].substring(1)) - 1;
        int endRow = Integer.parseInt(cells[1].substring(1)) - 1;
        int startCol = cells[0].charAt(0) - 'A';
        int endCol = cells[1].charAt(0) - 'A';

        int sum = 0;
        for (int i = startRow; i <= endRow; i++)
            for (int j = startCol; j <= endCol; j++)
                sum += matrix[i][j];

        System.out.println(sum);
    }
}
