import java.util.Scanner;
import java.util.Arrays;
public class ArrayCopyMain {
    public static void main(String[] args){
        //입력으로부터 배열을 생성하시오
        final Scanner scanner = new Scanner(System.in);
        final int n1 = scanner.nextInt();
        int [] original = new int[n1];
        for(int i=0; i<n1; i++){
            original[i]= scanner.nextInt();
        }
        scanner.close();

        //shallow copy 수행 코드를 작성하시오

        int [] shallow = original;
        modifyArray(shallow, 1);
        System.out.println("Shallow Copy: " + Arrays.toString(original));

        //deep copy 수행 코드를 작성하시오
        int [] deep = new int[n1];
        System.arraycopy(original,0,deep,0,n1);
        modifyArray(deep, 2);
        System.out.println("Deep Copy: " + Arrays.toString(original));
    }
    public static void modifyArray(int[] array, int index){
        array[index] = 15;
    }
}
