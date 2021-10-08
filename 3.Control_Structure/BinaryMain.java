import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class BinaryMain {
    public static void main(String args[]){
        final Scanner scanner = new Scanner(System.in);
        final int number = scanner.nextInt();
        int oct = number;
        scanner.close();
        ArrayList<Integer> result = new ArrayList<>();
        while (oct > 0){
            result.add(oct%2);
            oct /= 2;
        }
        Collections.reverse(result);

        // Integer.toBinaryString(number) -> 사실 이거쓰면 한방이긴 함.

        System.out.print("Number "+number+" in Binary Number: ");
        for (int i=0; i<result.size();i++){
            System.out.print(result.get(i));
        }
        System.out.println();
    }
}