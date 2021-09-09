/* Name: Arvin Edouard
// Title: Expressions.java
// Author: Modified from an example in Lewis & Loftus book
// Description: Example of using fundamental data types
// Time spent: 10 minutes
// Date: 7/26/2021
*/
public class Expression
{  public static void main(String[] args)
  {
      int a = 6;
      int b = 10;
      int c = 5;
      int d = 18;
      System.out.println((a + b)/ c);
     // 3: 6 and 10 are added and is divided by 5 with quotient 3-an integer division
      System.out.println(a + b / c);
     // 8: 10 is divided by 5 with quotient then 2 is added to 6
      System.out.println(a++); 
      //a 6: it prints a as 6 then then sets it as 7 for the following line
      System.out.println(a--); 
      //b 7: since the previous line set a as 7 it will print 7 then set a back to 6

      System.out.println(a + 1); 
      //c 7: addding one to the int a and since a = 6 the result is 7
      System.out.println(d % c); 
      //d 3: % produces the remaindor of the problem as an int so it show 3 since the remaindor is 3

      System.out.println(d / c);
      //e 3: when both numbers are in the problem are int it results in just the whole number and drops the remaindor
      System.out.println(d + a / d + b);
      //f 28: the are no parenthesis so the program will do division first which will result in 0 since it will drop the remaindor. Then you add the d and b (18 and 10) to the 0 which results in 28

      System.out.println((d + a) / (d + b));
      //g 0: there are parenthesis on the d+a and the d+b so you caluculate those first. That results in 24 and 28. After that you do 24/28 which results in 0 since you drop the remaindor
      System.out.println(Math.sqrt(a*a));
      //h 6.0: 6*6 are in parathensis so you calculate that first. Then you get the squareroot of 36 which is 6. Sqrt returns numbers as doubles so 6 turns into 6.0

      System.out.println(Math.pow(a, 2));
      //i 36.0: you calculate a to the power of 2 which is 36. Pow returns the number as a double so it results in 36.0
      System.out.println(Math.max(a, b)); 
      //j 10: It finds the larger number between a and b and b is the higher number being 10
  }
}