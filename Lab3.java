// Arvin Edouard
// Lab3.java
// This program gathers 3 grade scores within a certain peramiter and calculates the weighted total grade. Based on the weighted total the programs tell you if you pass of fail the class
// CSE 110- Lab 3
// 1 hour
import java.util.Scanner;

public class Lab3 
{
    public static void main(String[] args)
    {
        double homework = 0;
        double midterm = 0;
        double finalExam = 0;
        int i = 0;
        Scanner in = new Scanner(System.in);

        while(i < 3){
            if(i == 0){
                System.out.print("Enter your homework grade ");
                homework = in.nextDouble();
                if(homework < 0 || homework > 100){
                    System.out.print("Invalid input. Homework should be [0, 100] ");
                }else{
                    ++i;
                }
            }
            if(i == 1){
                System.out.print("Enter your Midterm grade ");
                midterm = in.nextDouble();
                if(midterm < 0 || midterm > 100){
                    System.out.print("Invalid input. Midterm should be [0, 100] ");
                }else{
                    ++i;
                }
            }
            if(i == 2){
                System.out.print("Enter your Final exam grade ");
                finalExam = in.nextDouble();
                if(finalExam < 0 || finalExam > 200){
                    System.out.print("Invalid input. Final exam should be [0, 200]");
                }else{
                    ++i;
                }
            }
        }
        double weightedTotal = (finalExam / 200) * 50 + (midterm * .25) + (homework * .25);
        System.out.printf("Student's Weighted Total is: " + "%.2f\n", weightedTotal);
       
        if( weightedTotal >= 50){
            System.out.println("Student PASSED the class");
        }else{
            System.out.println("Student FAILED the class");
        }
      
    }
}
