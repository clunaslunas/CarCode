/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraydemo;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     * This is an array demo 
     */
    public static void main(String[] args) {
        final int MAX_NUMS = 20;
        int[] nums = new int[MAX_NUMS];
        int num1; 
        Scanner scnr = new Scanner(System.in);
        Random rndm = new Random();
        num1 = rndm.nextInt(10);
        System.out.print("Please enter a number: ");
        nums[0] = scnr.nextInt();
        nums[1] = scnr.nextInt();
        nums[2] = scnr.nextInt();
        nums[3] = scnr.nextInt();
        nums[4] = scnr.nextInt();
        nums[5] = scnr.nextInt();
        nums[6] = scnr.nextInt();                
        nums[7] = scnr.nextInt();
        nums[8] = scnr.nextInt();
        nums[9] = scnr.nextInt();
        nums[10] = num1; 
        nums[11] = num1;
        nums[12] = num1;
        nums[13] = num1;
        nums[14] = num1;
        nums[15] = num1;
        nums[16] = num1;
        nums[17] = num1;
        nums[18] = num1;
        nums[19] = num1;     
        System.out.println(":" + nums[0]);
        System.out.println(":" + nums[1]);
        System.out.println(":" + nums[2]);
        System.out.println(":" + nums[3]);
        System.out.println(":" + nums[4]);
        System.out.println(":" + nums[5]);
        System.out.println(":" + nums[6]);
        System.out.println(":" + nums[7]);
        System.out.println(":" + nums[8]);
        System.out.println(":" + nums[9]);
        System.out.println(":" + nums[10]);
        System.out.println(":" + nums[11]);
        System.out.println(":" + nums[12]);
        System.out.println(":" + nums[13]);
        System.out.println(":" + nums[14]);
        System.out.println(":" + nums[15]);
        System.out.println(":" + nums[16]);
        System.out.println(":" + nums[17]);
        System.out.println(":" + nums[18]);
        System.out.println(":" + nums[19]);
    }
    
}
