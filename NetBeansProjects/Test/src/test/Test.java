/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input, ansr; 
        int num1, num2, answr, sum, right, wrong, total1, total2 =0;
        
        do {
            ansr = "Y";
            right = 0;
            total1 = 0;
            Random rndm = new Random();
            num1 = rndm.nextInt(10);
            num2 = rndm.nextInt(10);
            input = JOptionPane.showInputDialog("What is " + num1 + " + " + num2 + 
                ": ");
            answr = Integer.parseInt(input);
            sum = num1 + num2; 
            if (answr == sum && ansr.equalsIgnoreCase("Y")){
            JOptionPane.showMessageDialog(null,"CORRECT!!! :)");
            right++;
            ansr = JOptionPane.showInputDialog("Would you like to go again? Y for"
                + " yes, N for No");
            System.out.print(right);
            }
            else{
                wrong = 0;
                total2 = 0; 
                JOptionPane.showMessageDialog(null, "INCORRECT :( the answer is:"
                                    + sum);
                wrong++;
                System.out.print(wrong);
                 
            }
        }
        while (ansr.equalsIgnoreCase("Y"));
        JOptionPane.showMessageDialog(null, "Thank you, you correctly answered"
                + " " + total1 + " and missed " + total2);
    }
}
