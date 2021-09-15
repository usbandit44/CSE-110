// Arvin Edouard
// Assignment2.java
// The program takes and reads two strings and prefroms multiple task with them
// 3:35 Monday september 13, 2021
// 1 hour
/* Answers to part 1
1
a:System.out.println(myString.length());
b:System.out.println(myString.charAt(12));
c:System.out.println(myString.indexOf("Kansas"));
d:
int y = myString.indexOf(" ");
System.out.println(myString.substring(y + 1).indexOf(" ") + y);
e:System.out.println(myString.substring(6, 20));
2
a: true- 3 is equal to 6/2 so it print
b: true- 1 is not equal to 0 so the first part is true. || only requires one part of the statment to be true to print true
c: false- -3 isn't greater than 0 and && requires both parts of the statment to be true to print true
d: true- 9 is not greater than 6 and || only requires one part of the statment to be true to print true
*/

import java.util.Scanner;//  imports the scanner class

public class Assignment2 
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      String string1;
      String string2;// lines 21 through 23 declare all variables

      System.out.print("Enter a String: ");
      string1 = in.next();
      System.out.print("Enter another String: ");
      string2 = in.next(); // lines 25 through 28 creates input for strings

      if (string1.length() % 2 == 0)
      {
          System.out.println("First string is even");
      }else{
          System.out.println("First string is odd");
      }
      if (string2.length() % 2 == 0)
      {
          System.out.println("Second string is even");
      }else{
          System.out.println("Second string is odd");
      } // lines 30 through 41 check if the strings are even or add and prints the results

      if (string1.equals(string2)){
          System.out.println("The two strings are the same");
      }else{
          System.out.println("The two strings are different");
      }
    int x = string1.compareTo(string2);
    
    if(x == 0){
        System.out.println("The strings are lexically the same");
    }else if(x < 0){
        System.out.println("The second string is lexically larger");
    }else if(x > 0){
        System.out.println("The first string is lexicallt larger");
    } // Lines 50 through 63 check if the strings are lexically simular and if not which one is longer. It then prints a statment about the comparisison 

    String firstLetterS1 = string1.substring(0, 1);
    String secondLetterS1 = string2.substring(0, 1); // declares the first letter of each string
    System.out.println("The first character of the first string is" + " " + firstLetterS1.toUpperCase());
    System.out.println("The first character of the second string is" + " " + secondLetterS1.toUpperCase()); // prints the first letter in uppercase

    System.out.println("The concatenation of two string is" + " " + string2.toUpperCase() + string1.toUpperCase());
    System.out.println("The first string using lower case letters: " + string1.toLowerCase());
    System.out.println("The secaond string using lower case letters: " + string2.toLowerCase()); // adds the strings together and putes the letters in uppercase




   }

}