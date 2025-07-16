import java.util.*;

public class Exercise13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] morseCode = scanner.nextLine().split(" ");
        Map<String, String> morseMap = new HashMap<>();
        String[] letters = {
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
            "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
            "U", "V", "W", "X", "Y", "Z"
        };
        String[] codes = {
            ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-",
            "..-", "...-", ".--", "-..-", "-.--", "--.."
        };

        for (int i = 0; i < letters.length; i++) {
            morseMap.put(codes[i], letters[i]);
        }

        StringBuilder result = new StringBuilder();
        for (String code : morseCode) {
            if (code.equals("|")) result.append(" ");
            else result.append(morseMap.getOrDefault(code, ""));
        }

        System.out.println(result);
    }
}