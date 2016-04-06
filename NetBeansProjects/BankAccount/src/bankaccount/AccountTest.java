/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;
import javax.swing.JOptionPane; 
import java.text.DecimalFormat; 
/**
 *
 * @author Carlos Luna
 */
public class AccountTest {
    public static void main(String[] args){
    String input; 
    DecimalFormat dollars = new DecimalFormat("#,###.00");
    /*
    *Input begining balance and input deposit
    */
    
    input = JOptionPane.showInputDialog("What is your begining balance? ");
    BankAccount account = new BankAccount(input);
    input = JOptionPane.showInputDialog("How much did you deposit this week?");
    account.deposit(input);
    JOptionPane.showMessageDialog(null, "Your pay has been deposited \n"
                + "Your current balance is: " + dollars.format(account.getBalance()));
    input = JOptionPane.showInputDialog("How much would you like to withdraw?");
    account.withdraw(input);
    JOptionPane.showMessageDialog(null, "Your current balance is: " +
            dollars.format(account.getBalance()));
    System.exit(0);
    }    
}
