/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingsystem;

import java.awt.Button;
import javax.swing.JFrame;

/**
 *
 * @author Yktkab2
 */
public class BankingSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Bank bank = new Bank();
        //bank.displayMenu();
        int account = (int) (Math.random()*100000000);
        System.out.println(account);
        JFrame frame = new JFrame();
        Button button1 = new Button("click me");
        frame.add(button1);
        frame.set
        button1.setSize(10, 10);
        button1.setLocation(20,30);
        button1.
        //Button button2 = new Button("Don't click me");
        //button2.setLocation(40,50);
        //button2.setSize(20,20);
        //frame.add(button2);
        //frame.pack();
        frame.setVisible(true);
        
        
    }
    
}
