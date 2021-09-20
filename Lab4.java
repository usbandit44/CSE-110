import java.util.Scanner;

public class Lab4 
{
   public static void main(String[] args)
    {
        int i = 0; // declares i as the counter
        Scanner in = new Scanner(System.in);
        int problem1;
        int problem2;
        int problem3;

        

        while(i < 4){
            System.out.println("\nPlease one option from the following menu:\n1) Calculate the sum of the integers from 1 to m\n2) Calculate the factoral of a given number\n3) Display the leftmost digit of a given number\n4) Quit");
            i = in.nextInt();
            switch(i){
                case 1:
                System.out.println("Enter a number: ");
                problem1 = in.nextInt();
                int sum = 0;
                for(int z = 1; z < problem1 + 1; ++z){
                    sum = sum + z;
                }
                System.out.println(sum);
                break;
                case 2:
                System.out.println("Enter a number: ");
                problem2 = in.nextInt();
                int total = 1;
                for(int x = problem2; x > 0; --x){
                    total = x * total;
                }
                System.out.println(total);
                break;
                case 3:
                System.out.println("Enter a number: ");
                problem3 = in.nextInt();
                while(problem3 >= 10){
                    problem3 = problem3/10;
                }
                System.out.println(problem3);
                break;
                case 4:
                System.out.println("Bye");
                break;
                default:
                System.out.println("Please enter a valid number");
            }
        }

    }
}
