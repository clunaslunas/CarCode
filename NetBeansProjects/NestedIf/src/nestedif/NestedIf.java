/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedif;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class NestedIf {

    public static void main(String[] args) {
        float income, years;
        String input; 
        input = JOptionPane.showInputDialog("How many years have you been at "
                + "your current job? ");
        years = Float.parseFloat(input);
        if (years >= 2){
            input = JOptionPane.showInputDialog("What is your yearly income? ");
            income = Float.parseFloat(input);
            if (income >= 30000){
                JOptionPane.showMessageDialog(null, "Congratulations, now accept our"
                        + " special loan so we can have all your money");
            }
            else{
                JOptionPane.showMessageDialog(null, "Sorry you are too broke now "
                        + "LEAVE!");
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "You must hold your curent "
                    + "position for at least two years, kindly fuck off");
        }
        System.exit(0);
        }

    }
    

