import java.util.Scanner;

public class numsEndingInN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i <= 1000; i += 10) {
            System.out.println(i);
        }
    }
}
