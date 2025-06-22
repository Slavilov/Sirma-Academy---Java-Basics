
import java.util.Scanner;

public class ExcelColumnToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String column = scanner.nextLine().toUpperCase();
        int result = 0;

        for (int i = 0; i < column.length(); i++) {
            result *= 26;
            result += column.charAt(i) - 'A' + 1;
        }

        System.out.println(result);
    }
}
