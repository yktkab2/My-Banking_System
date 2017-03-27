/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

/**
 *
 * @author Yktkab2
 */
public class StatementLedger {
    private String reason;
    private double amount;
    private double dpwd_Amount;
    private String acct_Type;
    
    
    public StatementLedger()
    {
        acct_Type = " ";
        reason = " ";
        amount = 0.0;
        dpwd_Amount = 0.0;
    }
    
    
    public void addEntry(String entry_Type, String reason, double wddp_Amnt, double amount)
    {
        acct_Type = entry_Type;
        this.reason = reason;
        dpwd_Amount = wddp_Amnt;
        this.amount = amount;
    }
    
    
    public void displayEntry()
    {
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("Account Type: " + acct_Type);
        
        if (reason != null)
        {
            System.out.println("Reason: " + reason);
        }
        
        System.out.printf("Amount: $%.2f \n", dpwd_Amount);
        System.out.printf("Balance: $%.2f \n", amount);
        System.out.println("-----------------------------------------------------------------------");
    }
    
}
