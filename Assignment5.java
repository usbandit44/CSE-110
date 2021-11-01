 /*-------------------------------------------------------------------------
// AUTHOR: Arvin Edouard
// FILENAME: Assignment5.java
// SPECIFICATION:  This program provides a menu and based on user input calls the method in class Geek
// YOUR Lab Letter and Name of the TA for your Closed lab
// FOR: CSE 110- Assignment 5 Monday Wedsnesday Friday 2:30 to 3:20
// TIME SPENT: 1 hour
//----------------------------------------------------------------------*/

import java.util.*;

public class Assignment5
{
   public static void main (String[] args)

   {
       Scanner console = new Scanner (System.in);

       String choice;
	   char command;

        // print the menu
		      printMenu();
		      Techie myTechie = new Techie("Albert Einstein");
		      do
		       {
		           // ask a user to choose a command
		           System.out.println("\nPlease enter a command or type ?");
		           choice = console.next().toLowerCase();
	                   command = choice.charAt(0);

		           switch (command)
		           {
		                 case 'a':// return name
		                      System.out.println(myTechie.getName());
		                      break;
		                 case 'b': //returns number of questions asked
		                      System.out.println(myTechie.getNumberOfQuestions());

		                      break;
		                 case 'c': //finds if a number is odd or even
							  System.out.print("Enter a number: ");
							  int num = console.nextInt();
							  if (myTechie.isOdd(num))
							  		System.out.println(num + " is odd");
							  else
							        System.out.println(num + " is not odd");
		                      break;
		                 case 'd': //reverse a string
							  System.out.print("Enter a String: ");
							  String input = console.next();
							  System.out.println(myTechie.reverse(input));
		                      break;
		                 case 'e': //finds the factorial
                                                          System.out.print("Enter an integer: ");
							  num = console.nextInt();
							  System.out.println(num + "! is: " + myTechie.factorial(num));
		                      break;
		                case 'f': //finds if it is alphabet
							  System.out.println("Enter a character: " );
							  input = console.next();
							  char letter = input.charAt(0);
							  if (myTechie.isAlpha(letter))
							     System.out.println("It is an alphabet");
							  else
							     System.out.println("It is NOT an alphabet");
		                      break;

		                 case 'g'://finds the smallest integer
		                        System.out.println("Enter 3 integers: ");
		                        int a = console.nextInt();
		                        int b = console.nextInt();
		                        int c = console.nextInt();
		                        System.out.println("The smallest integer is: " + myTechie.smallest(a, b, c));
		                        break;

		                 case 'h'://finds if number is prime
		                 		System.out.println("Enter an integer: ");
		                 		num = console.nextInt();
		                 		if (myTechie.isPrime(num))
		                 		    System.out.println(num + " is prime");
					         else
					            System.out.println(num + " is not prime");
					         break;
		                 case '?':
		                      printMenu();
		                      break;
		                 case 'q':
		                      break;

		                 default:
		                       System.out.println("Invalid input");

		            }

		        } while (command != 'q');

		    }  //end of the main method


		  public static void printMenu()
		   {
		    System.out.print("\nCommand Options\n"
		                   + "-----------------------------------\n"
		                   + "a: get name\n"
		                   + "b: number of questions asked\n"
		                   + "c: is Odd\n"
		                   + "d: reverse\n"
		                   + "e: factorial\n"
		                   + "f: is Alphabetic\n"
		                   + "g: smallest\n"
		                   + "h: Is prime\n"
		                   + "?: display the menu again\n"
		                   + "q: quit this program\n\n");
		    } // end of the printMenu method
}
