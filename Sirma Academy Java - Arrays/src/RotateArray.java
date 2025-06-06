import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split(",");
        int rotations = scanner.nextInt();

        int n = elements.length;
        rotations = rotations % n;

        String[] rotated = new String[n];
        for (int i = 0; i < n; i++) {
            rotated[(i + rotations) % n] = elements[i];
        }

        System.out.println(String.join(" ", rotated));
    }
}
