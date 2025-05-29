import java.util.Scanner;

public class LettersInAword {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in a word that we will print each letter of!");
        String word = input.nextLine();

        letters(word);
    }
    static void letters(String text){
        for(int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i));
        }
    }
}