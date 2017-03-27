/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;
import java.util.Scanner;
/**
 *
 * @author Yktkab2
 */
public class Bank {
    private final int EXITPROGRAM = 9;
    private Account checkingAccount;
    private Account savingsAccount;
    private Scanner console;
    
    
    public Bank()
    {
        checkingAccount = new Account("Yusuf Checking ", " 0558594447 ", 10000000000.00);
        savingsAccount = new Account("Yusuf Savings ", " 0558594448 ", 5000000.00);
        console = new Scanner(System.in);
    }
    
    public void displayMenu()
    {
        int response = 0;
        while (response!=EXITPROGRAM)
        {
            System.out.println("1: Deposit Into Checking Account ");
            System.out.println("2: Withdraw From Checking Account ");
            System.out.println("3: Deposit Into Savings Account ");
            System.out.println("4: Withdraw From Savings Account ");
            System.out.println("5: View Checking Account Transactions ");
            System.out.println("6: View Savings Account Transactions ");
            System.out.println("9: Exit ");
            System.out.println("Enter a selection from the menu: ");
            response = console.nextInt();
            executeMenuSelection(response);
        }
    }
    
    private void executeMenuSelection(int response)
    {
        double dp_Amount = 0.0;
        double wd_Amount = 0.0;
        String reason = " ";
        
        switch(response)
        {
            case 1:
                System.out.println("How much would you like to deposit into your Checking Account? ");
                System.out.println("Amount must be greater than zero: ");
                dp_Amount = console.nextDouble();
                
                while(dp_Amount<0.0)
                {
                    System.out.println("Amount must be greater than zero: ");
                    dp_Amount = console.nextDouble();
                }
                checkingAccount.deposit(dp_Amount);
                break;
                
            case 2:
                System.out.println("How much would you like to withdraw from your Checking Account? ");
                System.out.println("Amount must be greater than zero: ");
                wd_Amount = console.nextDouble();
                
                while(wd_Amount<0.0)
                {
                    System.out.println("Amount must be greater than zero: ");
                    wd_Amount = console.nextDouble();
                }
                
                String clearEOL = console.nextLine();
                System.out.println("Please enter a reason for withdrawal:");
                reason = console.nextLine();
                checkingAccount.withdraw(wd_Amount, reason);
                break;
                
            case 3:
                System.out.println("How much would you like to deposit into your Savings Account? ");
                System.out.println("Amount must be greater than zero: ");
                dp_Amount = console.nextDouble();
                
                while(dp_Amount<0.0)
                {
                    System.out.println("Amount must be greater than zero: ");
                    dp_Amount = console.nextDouble();
                }
                savingsAccount.deposit(dp_Amount);
                break;
                
            case 4:
                System.out.println("How much would you like to withdraw from your Savings Account? ");
                System.out.println("Amount must be greater than zero: ");
                wd_Amount = console.nextDouble();
                
                while(wd_Amount<0.0)
                {
                    System.out.println("Amount must be greater than zero: ");
                    wd_Amount = console.nextDouble();
                }
                
                clearEOL = console.nextLine();
                System.out.println("Please enter a reason for withdrawal:");
                reason = console.nextLine();
                savingsAccount.withdraw(wd_Amount, reason);
                break;
                
            case 5:
                checkingAccount.displayStatement();
                break;
                
            case 6:
                savingsAccount.displayStatement();
                break;
                
            case 9:
                break;
                
            default:
                System.out.println("Invalid Entry");
                break;
        }
    }
}
