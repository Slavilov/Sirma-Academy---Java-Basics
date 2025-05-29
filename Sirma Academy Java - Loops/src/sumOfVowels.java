import java.util.Scanner;

public class sumOfVowels {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type in the word which we will calculate the vowels of!");
        String word = input.nextLine();

        System.out.println("The vowels values are: ");
        System.out.println("a = 1" +
                "e = 2" +
                "i = 3" +
                "o = 4" +
                "u = 5");

        letters(word);
    }
    static void letters(String text){
        int sum = 0;
        for(int i = 0; i < text.length(); i++){

            if(text.charAt(i) == 'a'){
                System.out.println("The current character of the word is: " +text.charAt(i));
                System.out.println("Which is a vowel so we add +1 value to the sum of the vowels" +text.charAt(i));

                sum = sum + 1;
            }
            else if(text.charAt(i) == 'e'){
                System.out.println("The current character of the word is: " +text.charAt(i));
                System.out.println("Which is a vowel so we add +2 value to the sum of the vowels" +text.charAt(i));

                sum = sum + 2;
            }
            else if(text.charAt(i) == 'i'){
                System.out.println("The current character of the word is: " +text.charAt(i));
                System.out.println("Which is a vowel so we add +3 value to the sum of the vowels" +text.charAt(i));

                sum = sum + 3;
            }
            else if(text.charAt(i) == 'o'){
                System.out.println("The current character of the word is: " +text.charAt(i));
                System.out.println("Which is a vowel so we add +4 value to the sum of the vowels" +text.charAt(i));

                sum = sum + 4;
            }
            else if(text.charAt(i) == 'u'){
                System.out.println("The current character of the word is: " +text.charAt(i));
                System.out.println("Which is a vowel so we add +5 value to the sum of the vowels" +text.charAt(i));

                sum = sum + 5;
            }
            else{
                System.out.println("The current character of the word is: " +text.charAt(i));
                System.out.println("Which is not a vowel so we do not add value to the sum of the vowels!");
            }
            System.out.println();

        }
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("The sum of all of the vowels in the word is: " +sum);
        System.out.println("--------------------------------------------------------------------------------------");
    }
}