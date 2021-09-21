// Arvin Edouard
// Lab4.java
// The program preforms 3 different arithmetic operations based on the users input
// CSE 110- Lab #4
// 1 hour 20 minutes

import java.util.Scanner;// imports the scanner class

public class Lab4 
{
   public static void main(String[] args)
    {
        int i = 0; 
        Scanner in = new Scanner(System.in);
        int problem1;
        int problem2;
        int problem3; // lines 13 through 17 declare all needed variables

        

        while(i < 4){ 
            System.out.println("\nPlease one option from the following menu:\n1) Calculate the sum of the integers from 1 to m\n2) Calculate the factoral of a given number\n3) Display the leftmost digit of a given number\n4) Quit");
            i = in.nextInt(); // gives the user the different otions and the input for the user to select their option
            switch(i){
                case 1: // the first case that calculates the sum of integers from 1 to m
                System.out.println("Enter a number: ");
                problem1 = in.nextInt();
                int sum = 0;
                for(int z = 1; z < problem1 + 1; ++z){
                    sum = sum + z;
                }
                System.out.println(sum);
                break;
                case 2: // The second case that calculates the factoral of a number
                System.out.println("Enter a number: ");
                problem2 = in.nextInt();
                int total = 1;
                for(int x = problem2; x > 0; --x){
                    total = x * total;
                }
                System.out.println(total);
                break;
                case 3: // the third case that finds the leftmost number
                System.out.println("Enter a number: ");
                problem3 = in.nextInt();
                while(problem3 >= 10){
                    problem3 = problem3/10;
                }
                System.out.println(problem3);
                break;
                case 4: // the fourth cases that closes the program
                System.out.println("Bye");
                break;
                default: // the default if they dont enter a valid number then they will be ask to enter again
                System.out.println("Please enter a valid number");
            }
        }

    }
}
