import java.util.Scanner;
public class TypeMain {
    public static void main(String[] args) {

        //스캐너로 입력받기
        Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();

        //printType() 호출
        printType(str);

        //형변환 (String --> int)
        int n1 = Integer.valueOf(str);
        System.out.println("Type conversion to int...");
        printType(n1);

        //형변환 (int -->float)
        float f1 = Float.valueOf(n1); // 또는 이렇게 구현 ==> float f1 =(float)n1;
        System.out.println("Type conversion int to float...");
        printType(f1);

    }
    private static void printType(String x){
        System.out.println(x + " is a string");
    }
    private static void printType(int x){
        System.out.println(x + " is an int");
    }
    private static void printType(float x){
        System.out.println(x + " is a float");
    }
}
