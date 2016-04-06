  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loopsfiles;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class LoopsFiles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double TEMP = 102.5;
        double temp;
        String input, answer;
        answer = JOptionPane.showInputDialog("Ready to begin? Yes or No?");
        if (answer.equalsIgnoreCase("yes")){
        input = JOptionPane.showInputDialog("Please enter the temperature of"
                + " substance");
        temp = Double.parseDouble(input);
        
        while (temp > TEMP && answer.equalsIgnoreCase("yes")){
            JOptionPane.showMessageDialog(null,"Temperature too high turn down"
                    + " heat and wait 5 minutes");
            answer = JOptionPane.showInputDialog("Would you like to try again? "
                    + " Yes or No?");
            input = JOptionPane.showInputDialog("Please enter the temperature of"
                + " substance");
            temp = Double.parseDouble(input);
            
            
        }
        JOptionPane.showMessageDialog(null,"Thank you check back in 15 minutes");
        }
        else
        JOptionPane.showMessageDialog(null,"Thank you check back in 15 minutes");
    }
    
}
