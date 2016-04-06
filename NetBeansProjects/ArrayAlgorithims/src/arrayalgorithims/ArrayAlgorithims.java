/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayalgorithims;
import java.util.*;
import java.text.DecimalFormat; 
/**
 *
 * @author Carlos Luna
 */
public class ArrayAlgorithims {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("#,###.00");
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int num = scnr.nextInt();
        int[] array = new int[num];
        System.out.println("Fill Array: ");
        for (int index = 0; index < num; index++){
            array[index] = scnr.nextInt();
        }
        System.out.println("The sum of the array is " + arraySum(array) + "." +
                " The average of the array is " + 
                dec.format(averageArray(array)) + "." +" The highest value in the array is "
                + highestArray(array) + "." + " The lowest value in the array is " 
                + lowestArray(array) + "."
                );
    }
    public static int arraySum (int[] arr){
        int total = 0;
        for (int index = 0; index < arr.length; index++){
            total += arr[index];
        }
        return total;
    }
    public static double averageArray (int[] arr){
        double average = 0, total = 0; 
        for (int index = 0; index < arr.length; index++){
            total += arr[index];
            average = total/arr.length;
        }
        return average; 
    }
    public static int lowestArray (int[] arr){
        int lowest = arr[0];
        for (int index = 0; index < arr.length; index++){
            if (arr[index] < lowest)
                lowest = arr[index];
        }
        return lowest; 
    }
    public static int highestArray (int[] arr){
        int highest = arr[0];
        for (int index = 0; index < arr.length; index++){
            if (arr[index] > highest)
                highest = arr[index];                
        }
        return highest; 
    }
    
}
