import java.util.Objects;
import java.util.Scanner;

public class faceOfFigures {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);
        System.out.println("In this program i will need you to type in the type of a geometric figure and it's dimensions!");
        System.out.println("Keep in mind depending on the Geometric Figure the dimension might be two or more!");

        System.out.println("Now type in the geometric figure: ");
        String geometricFigure = myObj.nextLine();

        double faceOfFigure = 0;

        if(Objects.equals(geometricFigure, "Square")){
            System.out.println("Now there is going to be only one dimension because it is a square!");
            System.out.println("Now type in the  dimension as a double/float: ");
            Double dimension = Double.parseDouble(myObj.nextLine());

            faceOfFigure = dimension*dimension;
        }
        else if(Objects.equals(geometricFigure, "Rectangle")){
            System.out.println("Because the figure is rectangle i want you to type in two dimension!");
            System.out.println("Type in the length: ");
            double length = Double.parseDouble(myObj.nextLine());

            System.out.println("Type in the second width: ");
            double width = Double.parseDouble(myObj.nextLine());

            faceOfFigure = length*width;
        }
        else if(Objects.equals(geometricFigure, "Circle")){
            System.out.println("Because this is Circle, please type in the radius as float/double: ");
            double radius = Double.parseDouble(myObj.nextLine());
            faceOfFigure = Math.PI*(radius*radius);
        }
        else if(Objects.equals(geometricFigure, "Triangle")){
            System.out.println("Now! Because this is triangle you are going to type in the base and the height as double: ");
            System.out.println("Type in the base: ");
            double base = Double.parseDouble(myObj.nextLine());

            System.out.println("Type in the height: ");
            double height = Double.parseDouble(myObj.nextLine());

            faceOfFigure = (base*height)/2;
        }
        else{
            System.out.println("You have typed in a figure that isn't listed in our program!");
        }

        System.out.println("The Area of " +geometricFigure+ "is: " +faceOfFigure);
    }
}