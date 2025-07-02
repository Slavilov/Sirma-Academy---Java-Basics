import java.util.*;

public class SetsOfElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lengths = scanner.nextLine().split(" ");
        int n = Integer.parseInt(lengths[0]);
        int m = Integer.parseInt(lengths[1]);

        List<Integer> firstList = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (!contains(firstList, num)) {
                firstList.add(num);
            }
        }

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (!contains(secondList, num)) {
                secondList.add(num);
            }
        }

        for (int i = 0; i < firstList.size(); i++) {
            int current = firstList.get(i);
            if (contains(secondList, current)) {
                System.out.print(current + " ");
            }
        }
    }

    public static boolean contains(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                return true;
            }
        }
        return false;
    }
}
