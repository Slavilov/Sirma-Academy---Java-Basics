import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        multiplication();
    }
    static void multiplication(){

        for (int i = 0; i<=10; i++){
            for(int j = 0; j <= 10; j++){

                int sum = i*j;
                System.out.println(i+ " * " +j+ " = " +sum);
            }
        }
    }
}