
import java.util.Scanner;

public class SnowflakesSimulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        char[][] grid = new char[r][c];

        for (int i = 0; i < r; i++)
            grid[i] = scanner.next().toCharArray();

        boolean changed;
        do {
            changed = false;
            for (int i = r - 2; i >= 0; i--) {
                for (int j = 0; j < c; j++) {
                    if (grid[i][j] == '*' && grid[i + 1][j] == '0') {
                        grid[i + 1][j] = '*';
                        grid[i][j] = '0';
                        changed = true;
                    }
                }
            }
            if (changed) {
                for (char[] row : grid) {
                    System.out.println(new String(row));
                }
                System.out.println("===");
            }
        } while (changed);

        for (char[] row : grid) {
            System.out.println(new String(row));
        }
    }
}
