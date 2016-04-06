/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo2;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArrayDemo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MAX = 10; 
        int[] nums = new int[MAX];
        Random rndm = new Random(5);
        int total1 = 0, total2 = 0,
                total3 = 0, total4 = 0, total5 = 0, total6 = 0;
        Scanner scnr = new Scanner(System.in);
        for(int index = 0; index < MAX; index++){
            int num = rndm.nextInt(10);
            nums[index] = num;
            System.out.println(num);   
        }
        for(int index = 0; index < MAX; index++)
            System.out.print(nums[index] + " ");                
    }
    
}
