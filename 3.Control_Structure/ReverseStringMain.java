import java.util.Scanner;
public class ReverseStringMain {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        String reverse="";
        for (int i=str.length()-1; i>=0; i--){
            reverse+=str.charAt(i);
        }
        System.out.println(reverse);
    }
}
