/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparingstringobjects;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class ComparingStringObjects {

    public static void main(String[] args) {
    String input;
    input = JOptionPane.showInputDialog("Please enter a word");
    
    if (input.equalsIgnoreCase("FOO")){
        JOptionPane.showMessageDialog(null, "Well, you got it good job");
    }
    else {
        JOptionPane.showMessageDialog(null, "Nope");
    }
    System.exit(0);
    }    
}
