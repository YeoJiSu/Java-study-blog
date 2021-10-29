import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterCountDistinctTest {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            data.add(sc.nextInt());
        }
        sc.close();

        //첫번째 줄에 10개의 정수 중 값이 10 미만인 데이터가 출력된다.
        System.out.println(data.stream().filter(t->t<10).collect(Collectors.toList()));
        //두번째 줄에 10개의 정수 중 값이 10 미만인 데이터의 수가 출력된다.
        System.out.println(data.stream().filter(t->t<10).count());
        //셋째 줄에 10개의 정수 중 값이 10 미만인 중복이 제거된 데이터가 출력된다.
        System.out.println(data.stream().distinct().filter(t->t<10).collect(Collectors.toList()));
        //넷째 줄에 10개의 정수 중 값이 10 이상인 데이터가 출력된다.
        System.out.println(data.stream().filter(t->t>=10).collect(Collectors.toList()));
        // 다섯째 줄에 10개의 정수 중 값이 10 이상인 데이터의 수가 출력된다.
        System.out.println(data.stream().filter(t->t>=10).count());
        // 여섯째 줄에 10개의 정수 중 값이 10 이상인 중복이 제거된 데이터가 출력된다.
        System.out.println(data.stream().distinct().filter(t->t>=10).collect(Collectors.toList()));
    }
}
