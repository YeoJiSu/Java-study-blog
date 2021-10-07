import java.util.Scanner;
public class MathMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a begin number: ");
        int begin = scanner.nextInt();
        System.out.print("Enter an end number: ");
        int end = scanner.nextInt();

        long sum = getSumBetween(begin, end);
        System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);

        long product = getProductBetween(begin, end);
        System.out.printf("Product between %d and %d : %,d%n", begin, end, product);
    }
    public static long getSumBetween(int n1, int n2){
        long n3 = 0;
        for (int i = n1; i<=n2 ; i++){
            n3+=i;
        }
        return n3;
    }
    public static long getProductBetween(int n1, int n2){
        long n3=1;
        for (int i = n1; i<=n2 ; i++){
            n3*=i;
        }
        return n3;
    }
}
