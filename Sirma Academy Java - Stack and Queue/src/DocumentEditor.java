import java.util.ArrayDeque;
import java.util.Scanner;

public class DocumentEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayDeque<String> undoStack = new ArrayDeque<>();
        ArrayDeque<String> redoStack = new ArrayDeque<>();
        StringBuilder document = new StringBuilder();

        while (true) {
            String line = scanner.nextLine();
            if (line.equals("End")) break;

            if (line.startsWith("Insert(")) {
                String text = line.substring(line.indexOf('"') + 1, line.lastIndexOf('"'));
                undoStack.push(document.toString());
                document.append(text);
                redoStack.clear();
            } else if (line.equals("Undo()")) {
                if (!undoStack.isEmpty()) {
                    redoStack.push(document.toString());
                    document = new StringBuilder(undoStack.pop());
                }
            } else if (line.equals("Redo()")) {
                if (!redoStack.isEmpty()) {
                    undoStack.push(document.toString());
                    document = new StringBuilder(redoStack.pop());
                }
            }

            System.out.println(document);
        }
    }
}
