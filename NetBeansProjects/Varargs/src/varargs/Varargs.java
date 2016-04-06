/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargs;
import java.util.*; 
/**
 *
 * @author Carlos Luna
 */
public class Varargs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How big of an array? ");
        int nums = s.nextInt();        
        int[] adds = new int[nums];
        System.out.println("Please fill the array: ");
        for(int i = 0; i < adds.length; i++){
            System.out.println("Element " + (i + 1));
            adds[i] = s.nextInt();
        }
        System.out.println("The total is " + sum(adds) + " and the average " + 
                " is " + sum(adds)/adds.length);
        
        
    }
    public static int sum (int... numbers){
        int total = 0;
        for (int val: numbers)
            total += val;        
        return total;         
    }
    
}
