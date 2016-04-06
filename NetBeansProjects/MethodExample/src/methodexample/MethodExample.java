/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodexample;
import java.util.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class MethodExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double income;
    int num1;
    String input;
    
    input = JOptionPane.showInputDialog("What is your annual income");
    income = Double.parseDouble(input);
    input = JOptionPane.showInputDialog("Rating of 1 to 10, 10 being good "
            + "and 1 being bad, how would you rate your credit? ");
    num1 = Integer.parseInt(input);
    if (income >= 20000 && num1 >= 7){
        qualify();
    }
    else 
        noQualify();
    }
    /*
    *Qualifying method
    */
    public static void qualify(){
        JOptionPane.showMessageDialog(null, "Congratulations, you have qualified!");
    }
    /*
    *Non qualifying method
    */
    public static void noQualify(){
        JOptionPane.showMessageDialog(null, "Terribly sorry chap");
    }
    
}
