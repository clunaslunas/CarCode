/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo4;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArrayDemo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array; 
        int num;
        System.out.print("Array Size: ");
        num = scnr.nextInt();
        array = new int[num];
        System.out.println("Fill the array");
        for (int index = 0; index < num; index++){            
            array[index] = scnr.nextInt();
        }
        System.out.println("Results: ");
        for (int index = 0; index < num; index++){            
            System.out.println(array[index]);
        }
    }
    
}
