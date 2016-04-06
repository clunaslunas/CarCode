/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squarefootage;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class SquareFootage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double input1 = 0, input2 = 0; 
        getMeasurements(input1, input2);
        System.out.println("Thank you come again");
        getMeasures();
        
    }
    public static double getMeasurements (double msr1, double msr2){
        Scanner scnr = new Scanner(System.in);
        System.out.println("We will be calculating square footage");
        System.out.print("Please enter your first measurement: ");
        msr1 = scnr.nextDouble();
        System.out.print("Please enter your second measurement: ");
        msr2 = scnr.nextDouble();
        System.out.println("The calculated square footage is: " + (msr1 * msr2) + 
                " square feet");
        return msr1 * msr2; 
    }
    public static double getMeasures (){
        double msr1, msr2; 
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter measurement 1: ");
        msr1 = scnr.nextDouble();
        System.out.println("Please enter measurement 2: ");
        msr2 = scnr.nextDouble();
        System.out.println("Total square footage equals: " + (msr1 * msr2));
        return msr1 * msr2; 
    }
    
}
