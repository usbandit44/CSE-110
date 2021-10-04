import java.util.Scanner;

public class test {

    public static void main(String[] args){
        String SENTINEL = "ENDOFDATA";
        Scanner keyboard = new Scanner(System.in);
        System.out.println( "Enter lines of data or " + SENTINEL + " to quit" );
int count = 0;
String input;
do{
    input = keyboard.nextLine();
    if(input.compareTo(SENTINEL) != 0){
        count++;
    }
} while(input.compareTo(SENTINEL) != 0);
System.out.println(count);
    }
}
