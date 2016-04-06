/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclass;

/**
 *
 * @author Carlos Luna
 */
public class ArrayClass {
    private double[] sales; 
    
    public ArrayClass(double[] s){
        sales = new double[s.length];
        
        for (int i = 0; i < s.length; i++){
            sales[i] = s[i];
        }
    }
    public double getTotal(){
        double total = 0.0;    
        for (int i = 0; i < sales.length; i++){
               total += sales[i]; 
            }
        return total;
        }
    public double getAvg (){
       double avg = getTotal()/sales.length;
       return avg; 
    }
    public double getHighest(){
        double highest = sales[0];
        for (int i = 0; i < sales.length; i++){
            if (sales[i] > highest)
                highest = sales[i];
        }
        return highest;
    }
    public double getLowest(){
        double lowest = sales[0];
        for (int i = 0; i < sales.length; i++){
            if (sales[i] < lowest){
                lowest = sales[i];
            }
        }
        return lowest;
    }   
}
