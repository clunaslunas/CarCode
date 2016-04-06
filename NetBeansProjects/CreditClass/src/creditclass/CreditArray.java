/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditclass;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class CreditArray {
    public static void createAccount(CreditClass[] array){
        double balance;         
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            System.out.println("For account " + (i + 1) + ":");
            balance = s.nextDouble(); 
            array[i] = new CreditClass(balance);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("How many accounts? ");
        int nums = s.nextInt();
        CreditClass[] credit = new CreditClass[nums];
        createAccount(credit);
        for (int i = 0; i < credit.length; i++){
            System.out.println("For account " + (i + 1) + " the balance is: " + 
                    credit[i].getBalance());
        }
        
    }
}
