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
       double premiumInterest = .035;
       String userName = fName + " " + lName;
       NumberFormat fmt = NumberFormat.getCurrencyInstance();
       int bankOption = 0; // the counter for the first set of choices
       int choice = 0;
       double depositAmount = 0;
       double withdrawAmount = 0;
       double transferAmount = 0;

       if(total > 5000){// decides what account they have
           System.out.println(userName + "'s Platinum Account balance: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C: " + fmt.format(checking) + ")");
           System.out.println("Bank Options:\n1. Deposit Money\n2. Withdraw Money\n3. Transfer Money\n4. Quit"); // creates the account and provides the user witht eh options
           System.out.print("Your Choice: ");
           bankOption = in.nextInt(); // has the user select their choice
           
            switch(bankOption){
                case 1:// deposit
                    System.out.println("Deposit Money Options:\n1. Deposit to Checking\n2. Deposit to Savings\n3. Cancel");
                    System.out.print("Your Choice: ");
                    choice = in.nextInt();
                    switch(choice){
                        case 1:// deposit
                            System.out.print("Amount to deposit to Checking: ");
                            depositAmount = in.nextDouble();
                            checking = checking + depositAmount;
                            total = checking + saving;
                            double platiumSavingInterest1 = saving * platiumInterest + saving;
                            double platiumCheckingInterest1 = checking * platiumInterest + checking;
                            System.out.println("You deposited " + fmt.format(depositAmount) + " into Checkings");
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest1) + ", C: " + fmt.format(platiumCheckingInterest1) + ")");
                            break;
                        case 2:
                            System.out.print("Amount to deposit to Saving: ");
                            depositAmount = in.nextDouble();
                            saving = saving + depositAmount;
                            total = checking + saving;
                            double platiumSavingInterest2 = saving * platiumInterest + saving;
                            double platiumCheckingInterest2 = checking * platiumInterest + checking;
                            System.out.println("You deposited " + fmt.format(depositAmount) + " into Savings");
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest2) + ", C: " + fmt.format(platiumCheckingInterest2) + ")");
                            break;
                        case 3:
                            double platiumSavingInterest3 = saving * platiumInterest + saving;
                            double platiumCheckingInterest3 = checking * platiumInterest + checking;
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest3) + ", C: " + fmt.format(platiumCheckingInterest3) + ")");
                            break;
                    }break;
                case 2:// withdraw option
                    System.out.println("Withdraw Money Options:\n1. Withdraw from Checkings\n2. Withdraw from Savings\n3. Cancel");
                    System.out.print("Your Choice: ");
                    choice = in.nextInt();
                    switch(choice){
                        case 1: // withdraw from checking
                            System.out.print("Amount to withdraw to Checking: ");
                            withdrawAmount = in.nextDouble();
                            checking = checking - withdrawAmount;
                            total = checking + saving;
                            double platiumSavingInterest1 = saving * platiumInterest + saving;
                            double platiumCheckingInterest1 = checking * platiumInterest + checking;
                            System.out.println("You withdrew " + fmt.format(depositAmount) + " from Checkings");
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest1) + ", C: " + fmt.format(platiumCheckingInterest1) + ")");
                            break;
                        case 2:
                            System.out.print("Amount to withdraw to Saving: ");
                            withdrawAmount = in.nextDouble();
                            saving = saving - withdrawAmount;
                            total = checking + saving;
                            double platiumSavingInterest2 = saving * platiumInterest + saving;
                            double platiumCheckingInterest2 = checking * platiumInterest + checking;
                            System.out.println("You withdrew " + fmt.format(depositAmount) + " from Savings");
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest2) + ", C: " + fmt.format(platiumCheckingInterest2) + ")");
                            break;
                        case 3:
                            double platiumSavingInterest3 = saving * platiumInterest + saving;
                            double platiumCheckingInterest3 = checking * platiumInterest + checking;
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest3) + ", C: " + fmt.format(platiumCheckingInterest3) + ")");
                            break;
                    }break;
                case 3:
                    System.out.println("Transfer Money Option:\n1. Transfer from Checking to Savings\n2. Transfer from Savings to Checkings\n3. Cancel");
                    System.out.print("Your Choice: ");
                    choice = in.nextInt();
                    switch(choice){
                         case 1:
                            System.out.print("Amount to transfer from Checking to Savings: ");
                            transferAmount = in.nextDouble();
                            checking = checking - transferAmount;
                            saving = saving + transferAmount;
                            total = saving + checking;
                            System.out.println("You transfered " + fmt.format(transferAmount) + " from checking to saving");
                            double platiumSavingInterest1 = saving * platiumInterest + saving;
                            double platiumCheckingInterest1 = checking * platiumInterest + checking;
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest1) + ", C: " + fmt.format(platiumCheckingInterest1) + ")");
                            break;
                        case 2:
                            System.out.print("Amount to transfer from Savings to Checkings: ");
                            transferAmount = in.nextDouble();
                            checking = checking + transferAmount;
                            saving = saving - transferAmount;
                            total = saving + checking;
                            System.out.println("You transfered " + fmt.format(transferAmount) + " from savings to checkings");
                            double platiumSavingInterest2 = saving * platiumInterest + saving;
                            double platiumCheckingInterest2 = checking * platiumInterest + checking;
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest2) + ", C: " + fmt.format(platiumCheckingInterest2) + ")");
                            break;
                        case 3:
                            System.out.println("Transfer Canceled");
                            double platiumSavingInterest3 = saving * platiumInterest + saving;
                            double platiumCheckingInterest3 = checking * platiumInterest + checking;
                            System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                            System.out.println("We have added interest to your account! (S: " + fmt.format(platiumSavingInterest3) + ", C: " + fmt.format(platiumCheckingInterest3) + ")");
                            break;
                    }break;
                case 4:
                    System.out.println("Bye");
                    break;


                }

            }else if(total >= 1000 && total <= 5000){
                System.out.println(userName + "'s Premium Account balance: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C: " + fmt.format(checking) + ")");
                System.out.println("Bank Options:\n1. Deposit Money\n2. Withdraw Money\n3. Transfer Money\n4. Quit"); // creates the account and provides the user witht eh options
                System.out.print("Your Choice: ");
                bankOption = in.nextInt(); // has the user select their choice
           
                switch(bankOption){
                    case 1:// deposit
                        System.out.println("Deposit Money Options:\n1. Deposit to Checking\n2. Deposit to Savings\n3. Cancel");
                        System.out.print("Your Choice: ");
                        choice = in.nextInt();
                        switch(choice){
                            case 1:// deposit
                                System.out.print("Amount to deposit to Checking: ");
                                depositAmount = in.nextDouble();
                                checking = checking + depositAmount;
                                total = checking + saving;
                                double premiumSavingInterest1 = saving * premiumInterest + saving;
                                double premiumCheckingInterest1 = checking * premiumInterest + checking;
                                System.out.println("You deposited " + fmt.format(depositAmount) + " into Checkings");
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest1) + ", C: " + fmt.format(premiumCheckingInterest1) + ")");
                                break;
                            case 2:
                                System.out.print("Amount to deposit to Saving: ");
                                depositAmount = in.nextDouble();
                                saving = saving + depositAmount;
                                total = checking + saving;
                                double premiumSavingInterest2 = saving * premiumInterest + saving;
                                double premiumCheckingInterest2 = checking * premiumInterest + checking;
                                System.out.println("You deposited " + fmt.format(depositAmount) + " into Savings");
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest2) + ", C: " + fmt.format(premiumCheckingInterest2) + ")");
                                break;
                            case 3:
                                double premiumSavingInterest3 = saving * premiumInterest + saving;
                                double premiumCheckingInterest3 = checking * premiumInterest + checking;
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest3) + ", C: " + fmt.format(premiumCheckingInterest3) + ")");
                                break;
                
                    }break;
                    case 2:// withdraw option
                        System.out.println("Withdraw Money Options:\n1. Withdraw from Checkings\n2. Withdraw from Savings\n3. Cancel");
                        System.out.print("Your Choice: ");
                        choice = in.nextInt();
                        switch(choice){
                            case 1: // withdraw from checking
                                System.out.print("Amount to withdraw to Checking: ");
                                withdrawAmount = in.nextDouble();
                                checking = checking - withdrawAmount;
                                total = checking + saving;
                                double premiumSavingInterest1 = saving * premiumInterest + saving;
                                double premiumCheckingInterest1 = checking * premiumInterest + checking;
                                System.out.println("You withdrew " + fmt.format(depositAmount) + " from Checkings");
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest1) + ", C: " + fmt.format(premiumCheckingInterest1) + ")");
                                break;
                            case 2:
                                System.out.print("Amount to withdraw to Saving: ");
                                withdrawAmount = in.nextDouble();
                                saving = saving - withdrawAmount;
                                total = checking + saving;
                                double premiumSavingInterest2 = saving * premiumInterest + saving;
                                double premiumCheckingInterest2 = checking * premiumInterest + checking;
                                System.out.println("You withdrew " + fmt.format(depositAmount) + " from Savings");
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest2) + ", C: " + fmt.format(premiumCheckingInterest2) + ")");
                                break;
                            case 3:
                                double premiumSavingInterest3 = saving * premiumInterest + saving;
                                double premiumCheckingInterest3 = checking * premiumInterest + checking;
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest3) + ", C: " + fmt.format(premiumCheckingInterest3) + ")");
                                break;
                        }break;
                    case 3:
                        System.out.println("Transfer Money Option:\n1. Transfer from Checking to Savings\n2. Transfer from Savings to Checkings\n3. Cancel");
                        System.out.print("Your Choice: ");
                        choice = in.nextInt();
                        switch(choice){
                            case 1:
                                System.out.print("Amount to transfer from Checking to Savings: ");
                                transferAmount = in.nextDouble();
                                checking = checking - transferAmount;
                                saving = saving + transferAmount;
                                total = saving + checking;
                                System.out.println("You transfered " + fmt.format(transferAmount) + " from checking to saving");
                                double premiumSavingInterest1 = saving * premiumInterest + saving;
                                double premiumCheckingInterest1 = checking * premiumInterest + checking;
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest1) + ", C: " + fmt.format(premiumCheckingInterest1) + ")");
                                break;
                            case 2:
                                System.out.print("Amount to transfer from Savings to Checkings: ");
                                transferAmount = in.nextDouble();
                                checking = checking + transferAmount;
                                saving = saving - transferAmount;
                                total = saving + checking;
                                System.out.println("You transfered " + fmt.format(transferAmount) + " from savings to checkings");
                                double premiumSavingInterest2 = saving * premiumInterest + saving;
                                double premiumCheckingInterest2 = checking * premiumInterest + checking;
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest2) + ", C: " + fmt.format(premiumCheckingInterest2) + ")");
                                break;
                            case 3:
                                System.out.println("Transfer Canceled");
                                double premiumSavingInterest3 = saving * premiumInterest + saving;
                                double premiumCheckingInterest3 = checking * premiumInterest + checking;
                                System.out.println("After this transaction your balance is: " + fmt.format(total) + "(S: " + fmt.format(saving) + ", C:" + fmt.format(checking) + ")");
                                System.out.println("We have added interest to your account! (S: " + fmt.format(premiumSavingInterest3) + ", C: " + fmt.format(premiumCheckingInterest3) + ")");
                                break;
                        }break;
                    case 4:
                        System.out.println("Bye");
                        break;
            }

       }

    }
}  
