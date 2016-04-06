/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankaccount;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ReturnObject {
    public static void main (String[] args){
        BankAccount account; 
        account = getAccount();
        
        System.out.println("The balance is: " + account.getBalance());
    }
    public static BankAccount getAccount(){
        Scanner s = new Scanner(System.in);
        String input; 
        double balance; 
        System.out.println("What is the balalance?");
        balance = s.nextDouble();
        return new BankAccount(balance);
    }
}
