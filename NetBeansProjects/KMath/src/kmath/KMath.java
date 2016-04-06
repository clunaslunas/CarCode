/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kmath;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Luna
 */
public class KMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1, num2, answr, sum;
        String input; 
        Random rndm = new Random();
        num1 = rndm.nextInt(10);
        num2 = rndm.nextInt(10);
        input = JOptionPane.showInputDialog("What is " + num1 + " + " + num2 + 
                ": ");
        answr = Integer.parseInt(input);
        sum = num1 + num2; 
        if (answr == sum){
            JOptionPane.showMessageDialog(null,"CORRECT!!! ");
        }
        else
            JOptionPane.showMessageDialog(null, "WRONG!!!");
        System.exit(0);
    }
    
}
