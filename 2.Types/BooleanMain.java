import java.util.Scanner;
public class BooleanMain {
    public static void main(String[] args) {
        // 숫자 두 개를 입력 받습니다.
        final Scanner scanner = new Scanner(System.in);
        final int n1 = scanner.nextInt();
        final int n2 = scanner.nextInt();
        scanner.close();

        // 첫 줄에 입력 받은 숫자들을 먼저 출력합니다.
        System.out.println("Number1 : "+n1+", Number2 : "+n2);
        // 두 번째 줄에는 첫 번째 입력한 숫자가 더 크면 true, 나머지는 false 를 반환합니다.
        System.out.println("Number1 > Number2 ? "+(n1>n2));
        // 세 번째 줄에는 두 번째 입력한 숫자가 더 크면 true, 나머지는 false 를 반환합니다.
        System.out.println("Number1 < Number2 ? "+(n1<n2));
        // 네 번째 줄에는 두 수가 같은 경우 true, 아니면 false 를 반환합니다.
        System.out.println("Number1 == Number2 ? "+(n1==n2));

    }
}
