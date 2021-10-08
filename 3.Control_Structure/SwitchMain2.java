import java.util.Scanner;

enum Command {ADD, PRINT, QUIT, INVALID}
public class SwitchMain2 {
    public static void main(String[] args){
        final Scanner scanner = new Scanner(System.in);
        String[] arr = new String[3];
        String[] month = {"January", "February", "March","April","May","June","July","August","September","October","November","December"};
        int index =0;
        while(true){
            final Command myCommand = getCommand(scanner);
            if (myCommand == Command.QUIT){
                System.out.println("Bye");
                break;
            }
            switch(myCommand){
                case ADD :{
                    int k;
                    k =scanner.nextInt();
                    arr[index]= month[k-1];
                    index ++;
                    break;
                }
                case PRINT : {
                    System.out.print("[");
                    String comma=", ";
                    for (int i =0; i<3;i++){
                        if (i==2) comma="";
                        System.out.print(arr[i]+comma);
                    }
                    System.out.println("]");
                    break;
                }
                default: {
                    System.out.println("Invalid Command");
                }
            }

        }

    }
    private static final Command getCommand(final Scanner myScanner){
        String myCommand=myScanner.next();
        try {
            return Command.valueOf(myCommand.toUpperCase());
        }
        catch(IllegalArgumentException e){
            return Command.INVALID;
        }
    }

}
