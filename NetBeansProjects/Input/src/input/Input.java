/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input;
import java.util.*;
import javax.swing.JOptionPane;


public class Input {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double side1, side2, area; 
        String input; 
        input = JOptionPane.showInputDialog("Please enter side 1");
        side1 = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, side1);
        input = JOptionPane.showInputDialog("Please enter side 2");
        side2 = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null, side2);
        area = side1 * side2; 
        JOptionPane.showMessageDialog(null, area);
        System.exit(0);
        
        
    }
    
}
    