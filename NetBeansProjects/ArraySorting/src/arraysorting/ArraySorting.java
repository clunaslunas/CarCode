/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysorting;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArraySorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many elements? ");
        int num = s.nextInt();
        int[] array = new int[num];
        System.out.println("Fill in the array");
        for(int i = 0; i < array.length; i++){
            System.out.println("Element " + (i + 1));
            array[i] = s.nextInt();
        } 
        selectionSort(array);
    }
    public static void selectionSort(int[] arr){
        int startScan, index, minIndex, minValue;         
        for (startScan = 0; startScan < (arr.length -1); startScan++){
            minIndex = startScan; 
            minValue = arr[startScan];
            for(index = startScan + 1; index < arr.length; index++){
                if (arr[index] < minValue){
                    minValue = arr[index];
                    minIndex = index; 
                }
            }
            arr[minIndex] = arr[startScan];
            arr[startScan] = minValue;  
            System.out.println(arr[startScan] + ",");            
        }
    }
    
}
