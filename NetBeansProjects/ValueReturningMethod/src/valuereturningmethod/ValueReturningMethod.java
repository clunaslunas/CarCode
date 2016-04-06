/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package valuereturningmethod;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ValueReturningMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double input1, input2, product;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter two values to be multiplied: ");
        System.out.print("First value: ");
        input1 = scnr.nextDouble();
        System.out.print("Second value: ");
        input2 = scnr.nextDouble();
        product = calc(input1, input2);
        System.out.println("The product of " + input1 + " and " + input2 + " is"
                + ": " + product);
        
        
    }
    /*
        The calc method returns the products of two numbers taken from end user
        @param num1 is first number taken
        @param num2 is second number taken 
        @param results returns the product of num1 and num2 multiplied together
    */
    public static double calc (double num1, double num2){
        double results;
        results = num1 * num2; 
        return results;
    }
    
}
