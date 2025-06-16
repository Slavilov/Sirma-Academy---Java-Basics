
public class PrintingTriangle {
    public static void main(String[] args) {
        printTriangle(3);
        printTriangle(4);
    }

    public static void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            printLine(i);
        }
        for (int i = n - 1; i >= 1; i--) {
            printLine(i);
        }
    }

    private static void printLine(int length) {
        for (int i = 1; i <= length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}