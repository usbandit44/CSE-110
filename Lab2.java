// Arvin Edouard
// Lab2.java
// 
// CSE 110 - Lab #2
// 25 minutes

import java.util.Scanner;

public class Lab2 
{
    public static void main(String[] args)
    {
        String fName;
        String lName;
        String fullName;
        int nameLength;
        Scanner in = new Scanner(System.in);// declares all variables

        System.out.print("Enter the first name: ");
        fName = in.next();
        System.out.print("Enter the last name: ");
        lName = in.next();// creates the input for the string first and last name
        
        fullName = fName + " " + lName;// declares full name as first and last name
        System.out.println("The full name is: " + fullName.toUpperCase());// prints full name in all caps
        nameLength = fullName.length();// declares the name length
        System.out.println("The length of the full name is: " + nameLength);// prints name length

        String title1 = new String("cse110");
        String title2 = "cse110";
        if ( title1 == title2 )
        {
            System.out.println("String comparison using \"==\" sign works");
        }else{
            System.out.println("String comparison using \"==\" sign does NOT works");
        }
        if ( title1.equals(title2) )
        {
            System.out.println("String comparison using \"equals\" method works");
        }
        else
        {
            System.out.println("String comparison using \"equals\" method does not works");
        }

        
        

    }
}
