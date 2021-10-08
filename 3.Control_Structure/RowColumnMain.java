import java.util.Scanner;

public class RowColumnMain {
    public static void main(String[] args){
        final  Scanner scanner = new Scanner(System.in);
        final int row = scanner.nextInt();
        final int col = scanner.nextInt();
        int k =1;
        int [][] matrix = new int[row][col];

        System.out.println("Enter two numbers:");
        for (int i =0; i<row; i++){
            String comma = ",";
            for (int j =0; j<col; j++, k++) {
                if (j == col-1) comma = "";
                matrix[i][j] = k;
                System.out.print(matrix[i][j]+comma);
            }
            System.out.println();
        }

    }

}
