/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dowhile;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author Carlos Luna
 */
public class DoWhile {

    /**
     * @param args the command line arguments
     * The do while is going to be a post test loop
     * it will begin the loop with out testing and check
     * in after its first iteration 
     */
    public static void main(String[] args) {
    double avg, avg1, avg2, average, num;
    
    String input; 
    DecimalFormat frmt = new DecimalFormat("#0.00");
    do{
        num = 0;
        input = JOptionPane.showInputDialog("Enter your first test score: ");
        avg = Double.parseDouble(input);
        num++;
        input = JOptionPane.showInputDialog("Enter your second test score: ");
        avg1 = Double.parseDouble(input);
        num++; 
        input = JOptionPane.showInputDialog("Enter your third test score: ");
        avg2 = Double.parseDouble(input);
        num++;
        average = (avg + avg1 + avg2)/num;
        JOptionPane.showMessageDialog(null,"Your average test score is: "
                + frmt.format(average));
        input = JOptionPane.showInputDialog("Would you like to try again? Yes "
                + " or No?");
    }
    while (input.equalsIgnoreCase("yes"));
    JOptionPane.showMessageDialog(null,"Thank you come again");
    }
    
}
