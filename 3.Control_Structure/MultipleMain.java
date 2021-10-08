import java.util.Scanner;

public class MultipleMain {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        final int num = scanner.nextInt();
        String str;
        if (num % 2 == 0 && num % 3 ==0){
            str=" is a multiple of 2 and 3";
        } else if (num%2 == 0){
            str=" is a multiple of 2";
        }else if (num%3 ==0){
            str=" is a multiple of 3";
        }else {
            str=" is not a multiple of 2 and 3";
        }
        System.out.println(num+str);

    }
}
