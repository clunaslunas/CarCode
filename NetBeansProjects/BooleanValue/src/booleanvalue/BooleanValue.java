/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booleanvalue;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class BooleanValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter a number within 0 and 100: ");
        int num = scnr.nextInt();
        isValid(num);
    }
    public static boolean isValid(int num){
        boolean status = false;
        if (num <= 50){
            status = true; 
            System.out.println("Value is with in range");
        }
        else
            System.out.println("Value is out of range");
        return status;
    }
    
}
