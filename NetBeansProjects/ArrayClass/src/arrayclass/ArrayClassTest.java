/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayclass;
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author Carlos Luna
 */
public class ArrayClassTest {
    public static void main (String[] args){
        DecimalFormat dols = new DecimalFormat("#,###.00");
        Scanner scnr = new Scanner (System.in);
        final int WEEK = 7;
        double[] array = new double[WEEK];
        getValues(array);
        ArrayClass sales1 = new ArrayClass(array);        
        System.out.println("The average is " + dols.format(sales1.getAvg()) +
                "The highest value is " + dols.format(sales1.getHighest())
                + "The lowest value is " + dols.format(sales1.getLowest()) + 
                " and the total is " + dols.format(sales1.getTotal()));
    }
    public static void getValues(double[] arr){
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++){
            System.out.println("Fill element " + (i + 1));            
            arr[i] = s.nextDouble();
        }
    }
    
}
