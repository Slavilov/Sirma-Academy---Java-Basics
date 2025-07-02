import java.util.*;

public class WarGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> first = new ArrayList<>();
        String[] firstInput = scanner.nextLine().split(" ");
        for (int i = 0; i < firstInput.length; i++) {
            int number = Integer.parseInt(firstInput[i]);
            if (!listContains(first, number)) {
                first.add(number);
            }
        }

        List<Integer> second = new ArrayList<>();
        String[] secondInput = scanner.nextLine().split(" ");
        for (int i = 0; i < secondInput.length; i++) {
            int number = Integer.parseInt(secondInput[i]);
            if (!listContains(second, number)) {
                second.add(number);
            }
        }

        for (int round = 0; round < 50; round++) {
            if (first.size() == 0 || second.size() == 0) {
                break;
            }

            int firstCard = first.get(0);
            int secondCard = second.get(0);

            first.remove(0);
            second.remove(0);

            if (firstCard > secondCard) {
                first.add(firstCard);
                first.add(secondCard);
            } else if (secondCard > firstCard) {
                second.add(firstCard);
                second.add(secondCard);
            }
        }

        if (first.size() > second.size()) {
            System.out.println("First player wins!");
        } else if (second.size() > first.size()) {
            System.out.println("Second player wins!");
        } else {
            System.out.println("Draw!");
        }
    }

    public static boolean listContains(List<Integer> list, int number) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == number) {
                return true;
            }
        }
        return false;
    }
}
