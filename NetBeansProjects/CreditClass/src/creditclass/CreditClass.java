/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creditclass;

/**
 *
 * @author Carlos Luna
 */
public class CreditClass {
    private double balance;
    
    public CreditClass(){  
        balance = 0.0;
    }
    public CreditClass(double start){
        balance = start;
    }
    public void setBalance(double b){
        balance = b; 
    }    
    public double payDown(double with){
        balance -= with; 
        return balance; 
    }
    public double chargeCard(double dep){
        balance += dep; 
        return balance; 
    }
    public double getBalance(){
        return balance; 
    }
}
