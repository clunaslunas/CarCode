/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailitem;
import javax.swing.JOptionPane; 
import java.text.DecimalFormat;
/**
 *
 * @author Carlos Luna
 */
public class RetailTest {
    public static void main(String[] args){
        String input;
        DecimalFormat dollars = new DecimalFormat("#,###.00");
        int units, total = 1, item = 1; 
        double price; 
        RetailItem retail1 = new RetailItem();
        RetailItem retail2 = new RetailItem();
        RetailItem retail3 = new RetailItem();
        input = JOptionPane.showInputDialog("Please enter item #: " + item++ 
        + " description");
        retail1.setDescription(input);
        input = JOptionPane.showInputDialog("How many units are available: ");
        retail1.setUnits(input);
        input = JOptionPane.showInputDialog("What is the price per unit: ");
        retail1.setPrice(input);
        input = JOptionPane.showInputDialog("Please enter item #: " + item++ 
        + " description");
        retail2.setDescription(input);
        input = JOptionPane.showInputDialog("How many units are available: ");
        retail2.setUnits(input);
        input = JOptionPane.showInputDialog("What is the price per unit: ");
        retail2.setPrice(input);
        input = JOptionPane.showInputDialog("Please enter item #: " + item++ 
        + " description");
        retail3.setDescription(input);
        input = JOptionPane.showInputDialog("How many units are available: ");
        retail3.setUnits(input);
        input = JOptionPane.showInputDialog("What is the price per unit: ");
        retail3.setPrice(input);
        JOptionPane.showMessageDialog(null, "Item #" + total++ + ": \n" + 
                " Description: " + retail1.getDescription() + "\nUnits on hand: "
                + retail1.getUnits() + "\nPrice: " + 
                dollars.format(retail1.getPrice()) + "Item"
                + " #" + total++ + ": \n" + " Description: " + 
                retail2.getDescription() + "\nUnits on hand: "
                + retail2.getUnits() + "\nPrice: " + 
                dollars.format(retail2.getPrice()) + "Item #" + total++ + ": \n" + 
                " Description: " + retail3.getDescription() + "\nUnits on hand: "
                + retail3.getUnits() + "\nPrice: " + 
                dollars.format(retail3.getPrice()));
        
    }
    
}
