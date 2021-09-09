// Name: Arvin Edouard
// Title: Assignment1.java
// Author: Arvin Edouard
// Discription: Helps a person decide if they are going to buy a car by calculating the total cost of owning that car after five years
// Time spent: 45 minutes
// Date: September 8, 2021
/* Answers to part A
//a 6: it prints a as 6 then then sets it as 7 for the following line
//b 7: since the previous line set a as 7 it will print 7 then set a back to 6
//c 7: addding one to the int a and since a = 6 the result is 7
//d 3: % produces the remaindor of the problem as an int so it show 3 since the remaindor is 3
//e 3: when both numbers are in the problem are int it results in just the whole number and drops the remaindor
//f 28: the are no parenthesis so the program will do division first which will result in 0 since it will drop the remaindor. Then you add the d and b (18 and 10) to the 0 which results in 28
//g 0: there are parenthesis on the d+a and the d+b so you caluculate those first. That results in 24 and 28. After that you do 24/28 which results in 0 since you drop the remaindor
//h 6.0: 6*6 are in parathensis so you calculate that first. Then you get the squareroot of 36 which is 6. Sqrt returns numbers as doubles so 6 turns into 6.0
//i 36.0: you calculate a to the power of 2 which is 36. Pow returns the number as a double so it results in 36.0
//j 10: It finds the larger number between a and b and b is the higher number being 10
*/

import java.util.Scanner; // allows the scanner class to be used

public class Assignment1 
{
    public static void main(String[] args)
    {
        int newCarPrice;
        int milesPerYear;
        double gasPrice;
        double milesPerGallon;
        int resaleValue; 
        final int YEARS_OWNED = 5; // declares all values

        Scanner in = new Scanner(System.in);// creates scanner object

        System.out.print("Enter price of new car ");
        newCarPrice = in.nextInt();
        System.out.print("Enter estimated miles driven per year ");
        milesPerYear = in.nextInt();
        System.out.print("Enter estimated gas price ");
        gasPrice = in.nextDouble();
        System.out.print("Enter miles per gallon ");
        milesPerGallon = in.nextDouble();
        System.out.print("Enter estimated reslae value ");
        resaleValue = in.nextInt(); //Lines 22 to 31 creates the line for the user o read and the inputs

        double costOfGas = milesPerYear / milesPerGallon * gasPrice * YEARS_OWNED;// calculates the cost of gas
        double totalCost = newCarPrice + costOfGas - resaleValue;// calculates the total cost after 5 years

        System.out.print("Total cost of car after 5 years: $");
        System.out.printf("%.2f", totalCost);// formates the total coat to show only 2 decimal points


    }
}
