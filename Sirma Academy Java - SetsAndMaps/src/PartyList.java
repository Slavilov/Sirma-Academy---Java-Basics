import java.util.*;

public class PartyList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> vip = new ArrayList<>();
        List<String> regular = new ArrayList<>();

        String guest = scanner.nextLine();

        while (!guest.equals("PARTY")) {
            char firstChar = guest.charAt(0);

            if (firstChar >= '0' && firstChar <= '9') {
                if (!listContains(vip, guest)) {
                    vip.add(guest);
                }
            } else {
                if (!listContains(regular, guest)) {
                    regular.add(guest);
                }
            }

            guest = scanner.nextLine();
        }

        guest = scanner.nextLine();
        while (!guest.equals("END")) {
            removeFromList(vip, guest);
            removeFromList(regular, guest);
            guest = scanner.nextLine();
        }

        System.out.println(vip.size() + regular.size());

        for (int i = 0; i < vip.size(); i++) {
            System.out.println(vip.get(i));
        }

        for (int i = 0; i < regular.size(); i++) {
            System.out.println(regular.get(i));
        }
    }

    public static boolean listContains(List<String> list, String value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static void removeFromList(List<String> list, String value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                list.remove(i);
                break;
            }
        }
    }
}
