/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class ForLoop {

    /**
     * @param args the command line arguments
     * For loop performs a known number of iterations
     * It will execute as long as a particular condition exists 
     */
    public static void main(String[] args) {
        /*int num; 
        System.out.println("Even numbers to 1000");
        System.out.println("-----------------------");
        for (num = 0; num <= 1000; num += 2){
        System.out.println("\t\t" + num/4);*/
        int num, points = 0; 
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter numbers to accumulate enter -1 to "
                + "terminate");
        num = scnr.nextInt();
        while (num != -1){
            points += num;
            System.out.println("Enter -1 to end");
            num = scnr.nextInt();
             
        
        }
        System.out.println("Total is : " + points);
     }
        
    
}
