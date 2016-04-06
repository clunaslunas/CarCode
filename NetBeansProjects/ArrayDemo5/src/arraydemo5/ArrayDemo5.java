/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo5;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArrayDemo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("How big of an array? ");
        int nums = scnr.nextInt();
        int[] numbers = new int[nums];
        fillArray(numbers);
        System.out.println("Displaying array: ");
        showArray(numbers);
    }
    public static void fillArray(int[] array){
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please fill the array: ");
        for (int index = 0; index < array.length; index++){
            System.out.print("Element " + (index + 1) + ": ");
            array[index] = scnr.nextInt();            
        }
    }
    public static void showArray(int[] array){
        for (int index = 0; index < array.length; index++){
            System.out.println(array[index]);
        }
    }
}
