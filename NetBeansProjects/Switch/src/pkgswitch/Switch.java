/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgswitch;
import javax.swing.JOptionPane; 
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int month;
        String input; 
        input = JOptionPane.showInputDialog("Please enter a number corresponding"
                + " with a month");
        month = Integer.parseInt(input);
        switch (month){
            case 1:
                JOptionPane.showMessageDialog(null,"January");
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"February");
                break;
            case 3:
                JOptionPane.showMessageDialog(null,"March");
                break;
            case 4:
                JOptionPane.showMessageDialog(null,"April");
                break;
            case 5:
                JOptionPane.showMessageDialog(null,"May");
                break;
            case 6:
                JOptionPane.showMessageDialog(null,"June");
                break;
            case 7:
                JOptionPane.showMessageDialog(null,"July");
                break;
            case 8:
                JOptionPane.showMessageDialog(null,"August");
                break;
            case 9:
                JOptionPane.showMessageDialog(null,"September");
                break;
            case 10:
                JOptionPane.showMessageDialog(null,"October");
                break;
            case 11:
                JOptionPane.showMessageDialog(null,"November");
                break;
            case 12:
                JOptionPane.showMessageDialog(null,"December");
                break;
            default: 
                JOptionPane.showMessageDialog(null,"Invalid month number");
                break;
        }
    }
    
}
