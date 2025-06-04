import java.util.Scanner;

public class passGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();

        for (int d1 = 1; d1 <= n; d1++) {
            for (int d2 = 1; d2 <= n; d2++) {
                for (char ch1 = 'a'; ch1 < 'a' + l; ch1++) {
                    for (char ch2 = 'a'; ch2 < 'a' + l; ch2++) {
                        for (int d3 = Math.max(d1, d2) + 1; d3 <= n; d3++) {
                            System.out.printf("%d%d%c%c%d%n", d1, d2, ch1, ch2, d3);
                        }
                    }
                }
            }
        }
    }
}
