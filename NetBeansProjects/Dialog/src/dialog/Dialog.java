/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dialog;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Luna
 */
public class Dialog {

    public static void main(String[] args) {
        final double TAX = .2;
        double wage, taxTotal;  
        String name, strng; 
        name = JOptionPane.showInputDialog("What is your name? ");
        strng = JOptionPane.showInputDialog("Please enter your wage");
        wage = Double.parseDouble(strng);
        taxTotal = wage * TAX;
        JOptionPane.showMessageDialog(null,"Thank you, after calculations your"
                + " tax responsibility is $" + taxTotal);
        System.exit(0);
    }
    
}
