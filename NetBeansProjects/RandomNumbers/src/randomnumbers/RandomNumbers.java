/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomnumbers;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class RandomNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, sum, answr;
        Random rndm = new Random();
        Scanner scnr = new Scanner(System.in);
        num1 = rndm.nextInt(100);
        num2 = rndm.nextInt(100);
        System.out.println("What is the answer to the following numbers? ");
        System.out.print(num1 + " + " + num2 + " = ");
        sum = num1 + num2; 
        System.out.print( " ");
        answr = scnr.nextInt();
        if (answr == sum){
            System.out.println("Excellent");
        } 
        else {
            System.out.println("WRONG! ");
            System.out.println("Answer: " + sum);
        }
                
        
        
        
    }
    
}
