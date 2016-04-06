/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rolldice;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class RollDice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input; 
        Random rndm = new Random() ;
        int num1, num2; 
        num1 = rndm.nextInt(6);
        num2 = rndm.nextInt(6);
        input = "yes";
        while (input.equalsIgnoreCase("yes")){
            JOptionPane.showMessageDialog(null, "Rolling dice...");
            JOptionPane.showMessageDialog(null, "Dice 1: " + num1 + " Dice 2: "
                    + num2);
            input = JOptionPane.showInputDialog("Roll dice again?");
        }
            JOptionPane.showMessageDialog(null, "Thank you come again");
        
    }
    
}
