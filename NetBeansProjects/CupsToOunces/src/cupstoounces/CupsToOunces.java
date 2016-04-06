/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cupstoounces;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class CupsToOunces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cups, ounces;
        cups = getCup();
        ounces = cupToOunces(cups);
        displayResults(cups, ounces);
    }
    public static double getCup ( ){
        Scanner scnr = new Scanner(System.in);
        System.out.print("How many ounces are there: ");
        double ounces = scnr.nextDouble();
        double cup = ounces/8;
        return cup;
    }
    public static double cupToOunces (double cups){
        return cups * 8;
    }
    public static void displayResults (double cups, double ounces){
        System.out.print(cups + " Cups equals: " + ounces + " ounces");
    }
    
}
