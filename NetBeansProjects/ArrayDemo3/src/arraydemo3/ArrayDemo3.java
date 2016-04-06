/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo3;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArrayDemo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array = new int[3];
        int MAX = 3; 
        for (int index = 0;index < MAX; index++){            
            array[index] = scnr.nextInt();
        }
        for (int index = 0; index < MAX; index++){
            System.out.print(array[index] + ", ");
        }
    }
    
}
