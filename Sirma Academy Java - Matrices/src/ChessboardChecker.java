
import java.util.Scanner;

public class ChessboardChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[][] board = new int[size][size];

        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++)
                board[i][j] = scanner.nextInt();

        boolean threatening = false;

        for (int row1 = 0; row1 < size; row1++) {
            for (int col1 = 0; col1 < size; col1++) {
                if (board[row1][col1] == 1) {
                    for (int row2 = 0; row2 < size; row2++) {
                        for (int col2 = 0; col2 < size; col2++) {
                            if ((row1 != row2 || col1 != col2) && board[row2][col2] == 1) {
                                if (row1 == row2 || col1 == col2 || Math.abs(row1 - row2) == Math.abs(col1 - col2)) {
                                    threatening = true;
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println(threatening ? "Yes" : "No");
    }
}
