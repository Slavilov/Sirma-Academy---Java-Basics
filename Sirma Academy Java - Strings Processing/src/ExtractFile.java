import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        String file = path.substring(path.lastIndexOf("\") + 1);
        String fileName = file.substring(0, file.lastIndexOf('.'));
        String extension = file.substring(file.lastIndexOf('.') + 1);
        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + extension);
    }
}