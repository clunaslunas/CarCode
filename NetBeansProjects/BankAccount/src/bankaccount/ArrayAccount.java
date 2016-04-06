/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class ArrayAccount {
    public static void main(String[] args){
        final int NUMS = 3; 
        BankAccount[] accounts = new BankAccount[NUMS];
        createAccounts(accounts);
        System.out.println("Balances for each account: ");
        for(int i = 0; i < accounts.length; i++){
             System.out.println("For account " + (i+ 1) + ":" 
                     + accounts[i].getBalance());
        }
    }
    public static void createAccounts(BankAccount[] array){
        Scanner s = new Scanner(System.in);
        double balance;
        for (int i = 0; i < array.length; i++){
            System.out.println("For account " + (i + 1) + ":");
            balance  = s.nextDouble();
            array[i] = new BankAccount(balance);
        }
    }
}
