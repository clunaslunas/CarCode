/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decisionstructure;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class DecisionStructure {

    public static void main(String[] args) {
    final double TAX = .036;
    double hours, wage, totalPay, otPay, taxBill, payCheck;
    String input; 
    JOptionPane.showMessageDialog(null, "Hello, we will be calculating your total pay, and "
            + "tax responsibility, and if applicable your overtime pay");
    input = JOptionPane.showInputDialog("How many hours did you work this week?");
    hours = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("What is your hourly pay?");
    wage = Double.parseDouble(input);
    if (hours > 40){ 
        otPay = (hours - 40) * ((wage/2) + wage);
        System.out.println(otPay);
        payCheck = otPay + (wage * 40); 
        System.out.println(payCheck);
        taxBill = payCheck * TAX; 
        System.out.println(taxBill);
        payCheck = payCheck - (payCheck * TAX);
        System.out.println(payCheck);
        JOptionPane.showMessageDialog(null,"$" + taxBill + " will be taken out"
                + " of your total pay for taxes and your final paycheck will be "
                + "$" + payCheck);
    }
    else{
    payCheck = wage * hours; 
    System.out.println(payCheck);
    taxBill = Math.round(payCheck * TAX); 
    payCheck = payCheck - (payCheck * TAX);
    System.out.println(payCheck);
    JOptionPane.showMessageDialog(null, "$" + taxBill + "was subtracted"
            + " from your pay check. The total amount paid to you is "
             + "$" + payCheck);
    }
    }
    
}
