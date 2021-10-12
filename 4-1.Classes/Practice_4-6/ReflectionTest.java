import java.util.Scanner;

public class ReflectionTest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String arg1 = sc.next();
        Double arg2 = sc.nextDouble();
        sc.close();

        String className = "Employee";
        Class [] cArgs = new Class[2];
        cArgs[0] = String.class;
        cArgs[1] = Double.class;

        Employee employee1 = null;
        try {
            employee1 = (Employee) Class.forName(className).getConstructor(cArgs).newInstance(arg1, arg2);
            //getConstructor 인자에 cArgs[0],cArgs[1] 이케 넣어도 돌아가네
            
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(employee1);
    }
}
