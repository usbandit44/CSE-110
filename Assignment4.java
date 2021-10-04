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
                int matches = 0;
                String string1;
                String string2;
                System.out.print("Enter first string ");
                string1 = in.next();
                System.out.print("Enter second string ");
                string2 = in.next();
                for(int i = 0; i > string1.length(); i++){
                    int z = 0;
                    Boolean match = false;
                    do{
                        if(string1.charAt(i) == string2.charAt(z)){
                            matches++;
                            match = true;
                            
                        }else if(string1.charAt(i) != string2.charAt(z)){
                            z++;
                            match = false;
                        }
                    }while(match = false);
                    
                    
                    }
                System.out.println(matches);
                break;
            case 'c':
                String reverseString = "";
                System.out.print("Enter a string: ");
                reverseString = in.next();
                System.out.print("The string in reverse order is: ");
                for(int i = reverseString.length() - 1; i >= 0; i--){
                    System.out.print(reverseString.charAt(i));
                }
                break;
            case 'd':
                int num3;
                int num4;
                int sum2 = 0;
                System.out.print("Enter the first number: ");
                num3 = in.nextInt();
                System.out.print("Enter the second number: ");
                num4 = in.nextInt();
                int lowestValue = num3;
                int highestValue = num4;
                if(num3 > num4){
                    lowestValue = num4;
                    highestValue = num3;
                }
                for(int z = lowestValue + 1; z < highestValue; ++z){
                    sum2 = sum2 + z;
                }
                System.out.println("The sum between " + num3 + " and " + num4 + " is " + sum2);
                break;
            case 'e':
                int integer;
                int count2 = 0;
                System.out.print("Enter a integer");
                integer = in.nextInt();
                while(integer >= 10){
                    integer = integer/10;
                    count2++;
                }
                System.out.println("The number of digits is " + (count2 + 1));

        }

    }
    
}
