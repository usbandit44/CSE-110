/* A.
*/
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        char option;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Commad Options\na: Is it odd\nb: Overlapping strings\nc: Reverse the string\nd: Sum between two integers\ne: Number of digits\nq: Quit");
        option = in.next().charAt(0);

        switch(option){
            case 'a':
                int num1;
                int num2;
                System.out.print("Enter a number: ");
                num1 = in.nextInt();
                System.out.print("Enter a number: ");
                num2 = in.nextInt();
                int sum = (num1 + num2) % 2;
                if(sum == 0){
                    System.out.println("The sum of " + num1 + " + " + num2 + " is even");
                }else{
                    System.out.println("The sum of " + num1 + " + " + num2 + " is odd");
                }
                break;
            case 'b':

        }

    }
    
}
