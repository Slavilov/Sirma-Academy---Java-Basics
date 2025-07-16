import java.util.*;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String content = scanner.nextLine();

        System.out.println("<h1>");
        System.out.println("    " + title);
        System.out.println("</h1>");

        System.out.println("<article>");
        System.out.println("    " + content);
        System.out.println("</article>");

        while (true) {
            String comment = scanner.nextLine();
            if (comment.equals("end of comments")) break;
            System.out.println("<div>");
            System.out.println("    " + comment);
            System.out.println("</div>");
        }
    }
}