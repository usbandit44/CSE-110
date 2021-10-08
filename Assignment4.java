// AUTHOR: Arvin Edouard
// FILENAME: Assignment4.java
// SPECIFICATION: completes certain task based off user selection and input
// FOR: CSE 110- Monday, Wednesday, and Friday 2:30-3:20
// TIME SPENT: 2 hours
/* A. 7 4 - since the loop increases n twice n goes from 0 to 2 to 4 the stops the loop. 0 plus 1 is 1, 1 plus 2 is 3, and finally 3 plus 4 is 7 stoping the loop making s 7
// B. Value of i is: 3 - The loop starts by dividing y by 2 making the new y .5 then adds .5 to x making the new x 1.5 and increases i to 1 since 1.5 isnt greater than 1.8 the loop repeats. Y becomes .25 x become 1.75 and i becomes 3. Y becomes .125 and x becomes 1.875 and i becomes 3. Since x is now larger than 1.8 the loop ends and i which is 3 is printed
// C.   ===== - The loop start at 0 and increases by 1 until i isn't less than 10. It will divide i by 2 and if the remainder is 0 it will print strips else it will print stars. so it prints stripes, stars, stripes, stars, stripes, stars, stripes, stars, stripes, stars, then stops because i isn't less than 10 anymore
        *****
        =====
        *****
        =====
        *****
        =====
        *****
        =====
        *****
    D. **** - In the loop i starts out as 0 and it will print the substring of plus from 0 to i and the substring of stars from i to 4 then creates a new line and i increases by one after every loop. so the loop prints 0 pluses and 4 stars creates a new line, 1 plus and 3 stars creates a new line, 2 pluses and 2 stars creates a new line, and 3 pluses and 1 star creates a new line. The loop then stops because i is no longer less than 4
       +***
       ++**
       +++*
*/
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        char option;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Commad Options\na: Is it odd\nb: Overlapping strings\nc: Reverse the string\nd: Sum between two integers\ne: Number of digits\nq: Quit");
        option = in.next().charAt(0); // creates the menu

        switch(option){
            case 'a':// option one 
                int num1;
                int num2;// creates the variables
                System.out.print("Enter a number: ");
                num1 = in.nextInt();
                System.out.print("Enter a number: ");
                num2 = in.nextInt();// gets user input for the 2 numbers
                int sum = (num1 + num2) % 2; // gets the ranimder of the 2 numbers added and divided by 2
                if(sum == 0){
                    System.out.println("The sum of " + num1 + " + " + num2 + " is even");
                }else{
                    System.out.println("The sum of " + num1 + " + " + num2 + " is odd");// decides if the sum is even or god
                }
                break;
            case 'b':
                String string1;
                String string2;// creates strings needed
                System.out.print("Enter first string ");
                string1 = in.next();
                System.out.print("Enter second string ");
                string2 = in.next(); // gets the strings from user
                int matches = 0;
                for(int i = 0; i < string1.length(); i++){ // takes the letter from the first string
                    int z = 0; // used to get letter from second string
                    Boolean match = false;
                    do{
                        if(string1.charAt(i) == string2.charAt(z)){ // compares string 1 letter to string 2 letter
                            matches++; // increases the matches if letters are equal
                            match = true; // existis the loop
                        }else {
                          if(z < string2.length() - 1){ 
                              z++; // goes to the next letter in string 2 if the isnt a match
                          }else{
                            match = true; //exists loop if there is no match for all letters
                        }
                        }
                    }while(!match); // keeps loop is the letters don't match
                    }
                if(matches == string1.length()){
                    System.out.println("String 2 overlaps with string 1");
                }else{
                    System.out.println("String 2 doesn’t overlap with string 1"); // states if strings overlap
                }
                break;
            case 'c':
                String reverseString;
                System.out.print("Enter a string: ");
                reverseString = in.next(); // gets string from user
                System.out.print("The string in reverse order is: ");
                for(int i = reverseString.length() - 1; i >= 0; i--){
                    System.out.print(reverseString.charAt(i)); // prints string from back to front
                }
                break;
            case 'd':
                int num3;
                int num4;
                int sum2 = 0; // creates variables
                System.out.print("Enter the first number: ");
                num3 = in.nextInt();
                System.out.print("Enter the second number: ");
                num4 = in.nextInt(); // gert input for user and sets the numbers
                int lowestValue = num3;
                int highestValue = num4;
                if(num3 > num4){
                    lowestValue = num4;
                    highestValue = num3;
                } // makes the lowest number the lowest value and the highest number the highest value
                for(int z = lowestValue + 1; z < highestValue; ++z){
                    sum2 = sum2 + z;
                } // gets the sum for the number inbetween 
                System.out.println("The sum between " + num3 + " and " + num4 + " is " + sum2); // prints the sum
                break;
            case 'e':
                int integer;
                int count2 = 0;
                System.out.print("Enter a integer");
                integer = in.nextInt(); // get number from user
                while(integer >= 10){ // get number of digits
                    integer = integer/10;
                    count2++; 
                }
                System.out.println("The number of digits is " + (count2 + 1)); // prints number of digits

        }

    }
    
}
