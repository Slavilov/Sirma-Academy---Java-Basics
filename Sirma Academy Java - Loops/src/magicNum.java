import java.util.Scanner;

public class magicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int magic = sc.nextInt();
        int count = 0;
        boolean found = false;

        for (int i = start; i <= end; i++) {
            for (int j = start; j <= end; j++) {
                count++;
                if (i + j == magic) {
                    System.out.println("Combination " + count + " - (" + i + " + " + j + " = " + magic + ")");
                    found = true;
                    return;
                }
            }
        }

        if (!found) {
            System.out.println(count + " combinations - neither equals " + magic);
        }
    }
}
