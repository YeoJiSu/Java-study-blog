import java.util.Locale;
import java.util.Scanner;

enum StringCommand {ADD, REMOVE, CLEAN, QUIT, INVALID};

public class StringSetManager {
    static int index = 0;
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        while(true) {
            final StringCommand command = getCommand(scanner);
            if (command == StringCommand.QUIT){
                System.out.println("BYE!"); break;
            }
            switch (command) {
                case ADD : {
                    final String str = getString(scanner);
                    add(stringSet, str);
                    break;
                }
                case REMOVE : {
                    final String str= getString(scanner);
                    remove (stringSet, str);
                    break;
                }
                case CLEAN: {
                    clear(stringSet);
                    break;
                }
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet);
        }
    }
    private static final StringCommand getCommand(final Scanner myScanner){
        String myCommand = myScanner.next();
        try {
            return StringCommand.valueOf(myCommand.toUpperCase());
        }
        catch(IllegalArgumentException e) {
            return StringCommand.INVALID;
        }
    }
    private static final String getString(final Scanner myScanner) {
        String str = myScanner.next();
        return str;
    }
    private static void add(String[] arr, String str ){
        if (index==0) {
            arr[0]=str;
            index=1;
        }
        else {
            int same=0;
            for (int i = 0; i < index; i++) {
                if ( arr[i].equals(str) ) {
                    same+=1;
                }
            }
            if (same ==0) {
                arr[index]=str;
                index+=1;
            }
        }
    }
    private static void remove(String[] arr, String str) {
        for (int i = 0; i<index; i++){
            if (arr[i].equals(str)) { //arr[i] ==str는  왜 안되지..? type 도 같은데 왜 출력이 false일까 흠..
                index-=1;
                for (int j=i;j<index;j++){
                    arr[j]=arr[j+1];
                }
            }
        }
    }
    private static void clear(String [] arr) {
        for (int i=0; i<index;i++){
            arr[i] ="";
        }
        index = 0;
    }
    private static void print(String [] arr) {
        System.out.print("Element Size: "+index +", Values = [");
        String comma = ", ";
        for (int i =0; i<index; i++){
            if (i== index-1){
                comma = "";
            }
            System.out.print(arr[i]+comma);
        }
        System.out.println("]");
    }
}
