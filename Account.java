/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;
import java.util.ArrayList;
/**
 *
 * @author Yktkab2
 */
public class Account {
    private String cust_Name;
    private String acct_Number;
    private double cur_Amount;
    private ArrayList<StatementLedger> acct_Ledger;
    
    private int ledgerEntryCount;
    private final int MAX_ENTRIES = 100;
    
    
    public Account()
    {
        cust_Name = " ";
        acct_Number = " ";
        cur_Amount = 0.0;
        ledgerEntryCount = 0;
        
        ledger();
    }
    
    
    public Account(String name, String acct_no, double amnt)
    {
        cust_Name = name;
        acct_Number = acct_no;
        cur_Amount = amnt;
        ledgerEntryCount = 0;
        
        ledger();
    }
    
    
    private void ledger()
    {
        acct_Ledger = new ArrayList<StatementLedger>();
        acct_Ledger.add(new StatementLedger());
        acct_Ledger.get(ledgerEntryCount).addEntry("Deposit", "Initial Deposit", cur_Amount, cur_Amount);
        
        ledgerEntryCount +=1;
    }
    
    
    public void deposit(double dp_Amnt)
    {
        cur_Amount = cur_Amount + dp_Amnt;
        acct_Ledger.add(new StatementLedger());
        acct_Ledger.get(ledgerEntryCount).addEntry("Deposit", null, dp_Amnt, cur_Amount);
        
        ledgerEntryCount +=1;
    }
    
    
    public void withdraw(double wd_Amnt, String reason)
    {
        cur_Amount = cur_Amount - wd_Amnt;
        acct_Ledger.add(new StatementLedger());
        acct_Ledger.get(ledgerEntryCount).addEntry("Withdrawal", reason, wd_Amnt, cur_Amount);
        
        ledgerEntryCount +=1;
    }
    
    
    public void displayStatement()
    {
        System.out.println("Account Name: " + getCust_Name());
        System.out.println("Account Number: " + getAcct_Number());
        System.out.println("***********************************************************************");
        
        for(StatementLedger entry : acct_Ledger)
        {
            entry.displayEntry();
        }
        System.out.println("***********************************************************************");
        
    }
    
    
    public void setCust_Name(String name)
    {
        cust_Name = name;
    }
    
    public String getCust_Name()
    {
        return cust_Name;
    }
    
    public void setAcct_Number(String acct_no)
    {
        acct_Number = acct_no;
    }
    
    public String getAcct_Number()
    {
        return acct_Number;
    }
    
    public void setCur_Amount(double cur_amnt)
    {
        cur_Amount = cur_amnt;
    }
    
    public double getCur_Amount()
    {
        return cur_Amount;
    }
}
