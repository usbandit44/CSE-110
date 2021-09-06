
//Arvin Edouard
//Lab1.java
//This file will take three test scores and find the average
//For CSE 110- Lab1
//This took about 30 minutes to complete

import java.util.Scanner;



public class Lab1
{
	public static void main(String[] args)
	{
		double test1;
		double test2;
		double test3;
		final int TEST_AMOUNT = 3; // declares the tests and the amount of tests
		
		Scanner in = new Scanner(System.in); //creates a scanner object
		
		System.out.print("Enter the test score for test number one:"); // Get input for test score number 1
		test1 = in.nextDouble();
		
		System.out.print("Enter the test score for test number two:"); // Get input for test score number 2
		test2 = in.nextDouble();
		
		System.out.print("Enter the test score for test number three:"); // Get input for test score number 3
		test3 = in.nextDouble();
		
		double avg = ((test1 + test2 + test3)/ TEST_AMOUNT); // creates equation for average score
		
		System.out.println("Your average score is:" + avg); // prints the equation 
		
		
	}
}

