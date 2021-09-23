import java.util.Scanner; // imports scanner class
import java.text.NumberFormat; // imports formater class

public class Assignment3 {
    public static void main(String[] args){
       double checking;
       double saving;
       String fName;
       String lName;
       Scanner in = new Scanner(System.in); // initializing variables

       System.out.println("Welcome to CSE 110 bank");
       System.out.print("What is your first name? ");
       fName = in.next();
       System.out.print("What is your last name? ");
       lName = in.next();
       System.out.print("Initial deposit into savings: ");
       saving = in.nextDouble();
       System.out.print("Initial deposit into checkings: ");
       checking = in.nextDouble(); // gets all the basic information for the account

       double total = checking + saving;
       double platiumInterest = .045;
       String userName = fName + lName;
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
       int bankOption = 0; // the counter for the first set of choices
       int choice = 0;
       double depositAmount = 0;

       if(total > 5000){
           System.out.println(userName + "'s Platinum Account balance: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C: " + fmt.format(checking) + ")");
           System.out.println("Bank Options:\n1. Deposit Money\n2. Withdraw Money\n3. Transfer Money\n4. Quit"); // creates the account and provides the user witht eh options
           System.out.print("Your Choice: ");
           bankOption = in.nextInt(); // has the user select their choice
           
            switch(bankOption){
                case 1:
                System.out.println("Deposit Money Options:\n1. Deposit to Checking\n2. Deposit to Savings\n3. Cancel");
                System.out.print("Your Choice: ");
                choice = in.nextInt();
                switch(choice){
                    case 1:
                    System.out.print("Amount to deposit to Checking: ");
                    depositAmount = in.nextDouble();
                    checking = checking + depositAmount;
                    total = checking + saving;
                    System.out.println("You deposited " + fmt.format(depositAmount) + " into Checkings");
                    System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                    double savingInterest = saving * platiumInterest + saving;
                    double checkingInterest = checking * platiumInterest + checking;
                    System.out.println("We have added interest to your account! (S: " + fmt.format(savingInterest) + ", C: " + fmt.format(checkingInterest) + ")");


                }

            }

       }

    }
}
