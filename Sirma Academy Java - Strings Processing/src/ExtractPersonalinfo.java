import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lines = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < lines; i++) {
            String line = scanner.nextLine();
            int startName = line.indexOf("@") + 1;
            int endName = line.indexOf("|");
            int startAge = line.indexOf("#") + 1;
            int endAge = line.indexOf("*");
            String name = line.substring(startName, endName);
            String age = line.substring(startAge, endAge);
            System.out.println(name + " is " + age + " years old.");
        }
    }
}