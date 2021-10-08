import java.util.Scanner;
enum Command {ADD, LIST, SUM, MAX, MIN, QUIT, INVALID};
public class ArrayEnum {
    public static void main(String[] args){
        int index = 0;
        int[] values = new int[100];
        final Scanner scanner = new Scanner(System.in);
        while (true){
            final Command command = getCommand(scanner);
            if (command == Command.QUIT){
                System.out.println("Bye!");
                break;
            }
            switch (command) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index]= newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case SUM:
                    System.out.println(getSum(values,index));
                    break;
                case MAX:
                    System.out.println(getMax(values, index));
                    break;
                case MIN:
                    System.out.println(getMin(values,index));
                    break;
                case INVALID:
                    System.out.println("Invalid Command");
            }
        }
        scanner.close();
    }
    private static final Command getCommand(final Scanner myScanner){
        final String value = myScanner.next();
        Command command;
        try{
            command= Command.valueOf(value.toUpperCase());
        }
        catch (IllegalArgumentException e) {command = Command.INVALID;}
        return command;
    }

    private static final int getValue(final Scanner myScanner){
        final int value = myScanner.nextInt();
        return value;
    }
    private static void printList(int [] arr, int index){
        for (int i =0; i<index;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    private static int getSum(int [] arr, int index){
        int sum = 0;
        for (int i = 0; i< index; i++){
            sum+=arr[i];
        }
        return sum;
    }
    private static int getMax(int [] arr, int index){
        int max = arr[0];
        for (int i = 0; i<index; i++){
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    private static int getMin(int [] arr, int index){
        int min = arr[0];
        for (int i = 0; i < index ; i++){
            if (arr[i]<min) min = arr[i];
        }
        return min;
    }
}
