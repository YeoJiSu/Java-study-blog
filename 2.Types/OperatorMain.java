import java.util.Scanner;
public class OperatorMain {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        final int dividend = scanner.nextInt();
        final int divisor = scanner.nextInt();

        float result1 = dividend / (float) divisor;
        System.out.print(dividend+" / "+divisor+" = ");
        System.out.printf("%.3f%n", result1);
        int n1 = dividend / divisor;
        int n2 = dividend % divisor;
        System.out.println( dividend + " = "+ n1  + " x "+ divisor + " + "+ n2);

    }
}
