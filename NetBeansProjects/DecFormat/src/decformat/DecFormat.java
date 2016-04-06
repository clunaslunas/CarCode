/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decformat;
import java.util.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class DecFormat {

    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("#0.00%");
        double num, num1, num2, calc;
        String input; 
        input = JOptionPane.showInputDialog("Please enter a number: ");
        num = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Please enter a number: ");
        num1 = Double.parseDouble(input);
        input = JOptionPane.showInputDialog("Please enter a number: ");
        num2 = Double.parseDouble(input);
        calc = ((num * num1)/num2) + (num * num2);
        JOptionPane.showMessageDialog(null, frm.format(calc));
    }
    
}
