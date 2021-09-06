// Arvin Edouard
// Assignment1.java
// Arvin Edouard
// Helps a person decide if they are going to buy a car by calculating the total cost of owning that car after five years
//
// September 8, 2021

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
