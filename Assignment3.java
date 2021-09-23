import java.util.Scanner; // imports scanner class
import java.text.NumberFormat; // imports formater class

public class Assignment3 {
    public static void main(String[] args){
       double initialChecking;
       double initialSaving;
       String fName;
       String lName;
       Scanner in = new Scanner(System.in);

       System.out.print("What is your first name? ");
       fName = in.next();
       System.out.print("What is your last name? ");
       lName = in.next();
       System.out.print("Initial deposit into savings: ");
       initialSaving = in.nextDouble();
       System.out.print("Initial deposit into checkings: ");
       initialChecking = in.nextDouble();

       double initialTotal = initialChecking + initialSaving;
       String userName = fName + lName;
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
       int i = 0;

       if(initialTotal > 5000){
           System.out.println(userName + "'s Platinum Account balance: " + fmt.format(initialTotal) + "(S: $" + fmt.format(initialSaving) + ", C: $" + fmt.format(initialChecking) + ")");

       }

    }
}
