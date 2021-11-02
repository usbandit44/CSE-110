/*-------------------------------------------------------------------------
// AUTHOR: CSE110 solution
// FILENAME: Assignment7.java
// SPECIFICATION:  This program allows the user to create employees' objects and performs operations for each employee.
// FOR: CSE 110- homework #- days and time of your class
// TIME SPENT: how long it took you to complete the assignment
//----------------------------------------------------------------------*/


import java.util.*;
import java.text.*;

public class Assignment6
{
   public static void main(String[] args)
   {
     	 Scanner console = new Scanner(System.in);

     	 String choice;
	 	 char command;

     	// Create a new Employee object
     	System.out.print("Enter name of the employee? ");
	String name = console.next();
	System.out.print("Enter salary for " + name + "? ");
	double salary = console.nextDouble();
	System.out.print("Enter number of years for " + name +  "? ");
	int years = console.nextInt();

	Employee e1 = new Employee(name, salary, years);
	Employee e2 = new Employee("Bond:70000:20");

        // print the menu
		printMenu();

		do
		{
		           // ask a user to choose a command
		           System.out.println("\nPlease enter a command or type ?");
		           choice = console.next().toLowerCase();
	                   command = choice.charAt(0);

		           switch (command)
		            {
		                 case 'a': // write the code to print the info for each employee
		                       System.out.println(e1.toString());
							   System.out.println("");
							   System.out.println(e2.toString());
		                       break;

		                 case 'b': //write the code to raise employee's salary and call the toString to print the new salaries
		                      System.out.println("Enter the amount of raise: ");
		                      double raise = console.nextDouble();
							  e1.raiseSalary(raise);
							  e2.raiseSalary(raise);
							  System.out.println(e1.toString());
							  System.out.println(e2.toString());
		                     
				       break;
		                 case 'c': //no need to add anything for this option- increment the number of years by 1
		                      e1.setYears();
		                      e2.setYears();
		                      System.out.println("Year has been added.");
		                      break;

		                 case 'd': //find who is making more
                              		Employee who = e1.makesMore(e2);
                              		System.out.println(who.getName() + " is making more.");
		                      break;

		                  case 'e': //Write the code to print the number of employees
							  int employeeAmount = Employee.getNumEmployees();
							  System.out.println("There are " + employeeAmount + " employee");

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
	}// end main

     public static void printMenu()
    {
		    System.out.print("\nCommand Options\n"
		                   + "-----------------------------------\n"
		                   + "'a': prints info \n"
						   + "'b': raise salary\n"
						   + "'c': increment the years of experience\n"
 						   + "'d': who makes more\n"
 						   + "'e': number of employees\n"
						   + "'?': Displays the help menu\n"
						   + "'q': quits\n");

      } // end of the printMenu method


}