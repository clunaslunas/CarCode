/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlearea;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class CircleArea {

    public static void main(String[] args) {
        double area, radius;
        String strng;
        JOptionPane.showMessageDialog(null, "We are going to calculate the area of a"
                + " circle");
        strng = JOptionPane.showInputDialog("Please enter the radius");
        radius = Double.parseDouble(strng);
        area = radius * Math.PI; 
        JOptionPane.showMessageDialog(null, "The area total is: " + area + "m "
                + "squared" );
    }
    
}
