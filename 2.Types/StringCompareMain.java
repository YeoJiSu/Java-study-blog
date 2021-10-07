import java.util.Locale;
import java.util.Scanner;
public class StringCompareMain {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        final String str1 = scanner.nextLine();
        final String str2 = scanner.nextLine();
        boolean result1 = str1.equals(str2);
        boolean result2 = str1.equalsIgnoreCase(str2);
        boolean result3 = str1.equals(str2.toLowerCase());
        boolean result4 = str2.toLowerCase().equals(str1.replace("easy", "fun"));

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
