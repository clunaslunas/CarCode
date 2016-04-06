/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifelseif;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class IfElseIf {

    public static void main(String[] args) {
        int grd;
        String input; 
        
        input = JOptionPane.showInputDialog("Please enter your grade: ");
        grd = Integer.parseInt(input);
        
        if (grd < 60)
            JOptionPane.showMessageDialog(null,"F... FAILED");
        else if ( grd < 70)
            JOptionPane.showMessageDialog(null, "D... ALMOST FAILED");
        else if (grd < 80)
            JOptionPane.showMessageDialog(null, "C... JUST BARELY PASSED");
        else if (grd < 90)
            JOptionPane.showMessageDialog(null, "B.... ALMOST AN A");
        else
            JOptionPane.showMessageDialog(null, "A... Bout time");
        System.exit(0);
        
        }
        
    }
    

