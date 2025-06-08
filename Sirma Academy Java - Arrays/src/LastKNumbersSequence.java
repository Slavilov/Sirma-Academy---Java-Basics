import java.util.Scanner;

public class LastKNumbersSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        long[] sequence = new long[n];

        sequence[0] = 1;
        for (int i = 1; i < n; i++) {
            long sum = 0;
            for (int j = Math.max(0, i - k); j < i; j++) {
                sum += sequence[j];
            }
            sequence[i] = sum;
        }

        for (long num : sequence) {
            System.out.print(num + " ");
        }
    }
}
