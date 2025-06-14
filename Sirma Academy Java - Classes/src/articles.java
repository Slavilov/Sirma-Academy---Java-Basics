import java.util.*;

class Article {
    private String title;
    private String content;
    private String author;

    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void edit(String newContent) {
        this.content = newContent;
    }

    public void changeAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void rename(String newTitle) {
        this.title = newTitle;
    }

    @Override
    public String toString() {
        return title + " - " + content + ": " + author;
    }
}

public class articles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] inputParts = scanner.nextLine().split(", ");
        Article article = new Article(inputParts[0], inputParts[1], inputParts[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(": ");
            String command = commandParts[0];
            String argument = commandParts[1];

            switch (command) {
                case "Edit":
                    article.edit(argument);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(argument);
                    break;
                case "Rename":
                    article.rename(argument);
                    break;
            }
        }

        System.out.println(article);
    }
}
