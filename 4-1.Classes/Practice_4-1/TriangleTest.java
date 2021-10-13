import java.util.Scanner;

class Triangle{
    private final int base;
    private final int height;

    public Triangle(int base, int height){
        this.base = base;
        this.height = height;
    }
    public Double getArea(){
        Double area = base*height/(double)2;
        return area;
    }
    public String toString(){
        String format = String.format("Triangle [base=%d, height=%d, area=%.2f]",base, height,getArea());
        return format;
    }
}
public class TriangleTest {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        final int count = scanner.nextInt();
        Triangle[] triangles = new Triangle[count];
        for (int i = 0; i<triangles.length;i++){
            int base = scanner.nextInt();
            int height = scanner.nextInt();
            triangles[i] = new Triangle(base, height);
            System.out.println(triangles[i].toString());
        }
    }

}

