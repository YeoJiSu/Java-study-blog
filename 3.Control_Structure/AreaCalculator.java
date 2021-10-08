import java.util.Locale;
import java.util.Scanner;
enum Shape{TRIANGLE, RECTANGLE, CIRCLE,QUIT,INVALID};
public class AreaCalculator {
    public static void main(String [] args) {
        final Scanner scanner = new Scanner(System.in);
        while(true){
            final Shape myShape = getShape(scanner);
            if (myShape == Shape.QUIT){
                System.out.println("Bye");
                break;
            }
            switch(myShape){
                case TRIANGLE:{
                    triangle(scanner);
                    break;
                }
                case RECTANGLE:{
                    rectangle(scanner);
                    break;
                }
                case CIRCLE:{
                    circle(scanner);
                    break;
                }
                default: {
                    System.out.println("Invalid");
                    break;
                }
            }
        }

    }
    private static final Shape getShape(Scanner myScanner){
        String shape = myScanner.next();
        try {
            return Shape.valueOf(shape.toUpperCase());
        }
        catch(IllegalArgumentException e){
            return Shape.INVALID;
        }
    }
    private static void triangle(Scanner myScanner){
        double base = myScanner.nextDouble();
        double height = myScanner.nextDouble();
        double area = base*height/2;
        System.out.printf("Area of Triangle: %.2f%n",area);
    }
    private static void rectangle(Scanner myScanner){
        double width = myScanner.nextDouble();
        double height = myScanner.nextDouble();
        double area = width*height;
        System.out.printf("Area of Rectangle: %.2f%n", area);
    }
    private static void circle(Scanner myScanner){
        double radius = myScanner.nextDouble();
        double area = radius*radius*Math.PI;
        System.out.printf("Area of Circle: %.2f%n",area);
    }
}
