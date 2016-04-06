/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalops;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Luna
 */
public class ConditionalOps {

    public static void main(String[] args) {
    int x, y;
    String input; 
    input = JOptionPane.showInputDialog("Enter x");
    x = Integer.parseInt(input);
    
    JOptionPane.showMessageDialog(null, y = x < 0 ? 10: 20);
    
    }
    
}
