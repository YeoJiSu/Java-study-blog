import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MatchTest {

    public static void main(String[] args) {

        List<Integer> data = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            data.add(sc.nextInt());

        }

        sc.close();
//첫번째 줄에 입력된 5개의 정수 중 10 미만의 값을 가지는 데이터가 하나 이상 존재하는지 여부
        System.out.println(data.stream().anyMatch(t->t<10));
//둘째 줄에 입력된 5개의 정수가 모두 10 미만의 값을 가지는지 여부
        System.out.println(data.stream().allMatch(t->t<10));
//셋째 줄에 입력된 5개의 정수가 모두 10 미만의 값을 가지지 않는지 여부
        System.out.println(data.stream().noneMatch(t->t<10));

    }

}
