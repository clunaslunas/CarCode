/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicaloperators;
import java.util.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Luna
 */
public class LogicalOperators {

    public static void main(String[] args) {
    float nums1, nums2; 
    String input;
    
    input = JOptionPane.showInputDialog("Please enter number 1");
    nums1 = Float.parseFloat(input);
    input = JOptionPane.showInputDialog("Please enter number 2");
    nums2 = Float.parseFloat(input);
    /*if (nums1 > 10 && nums2 > 1)*/
    /*if (nums1 > 10 || nums2 > 1*/
    if (!(nums1 > 5) && nums2 <10){
        JOptionPane.showMessageDialog(null, "You hit the sweetspot");
    }
    else{
        JOptionPane.showMessageDialog(null, "You are out of range :(");
    }
    System.exit(0);
    }
    
}
