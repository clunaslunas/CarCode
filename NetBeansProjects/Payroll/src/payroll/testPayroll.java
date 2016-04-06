/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;
import java.text.DecimalFormat; 
import javax.swing.JOptionPane;
/**
 *
 * @author Carlos Luna
 */
public class testPayroll {
    public static void main(String[] args){
        String input; 
        double pay, hours; 
        DecimalFormat dollars = new DecimalFormat("#,###.00");
        Payroll employee1 = new Payroll();
        Payroll employee2 = new Payroll();
        input = JOptionPane.showInputDialog("Please enter employee name: ");
        employee1.setEmployeeName(input);
        input = JOptionPane.showInputDialog("Please enter employee ID: ");
        employee1.setEmployeeID(input);
        input = JOptionPane.showInputDialog("What is your hourly pay? ");
        employee1.setPay(input);
        input = JOptionPane.showInputDialog("What hours did you work this week?");
        employee1.setHours(input);
        input = JOptionPane.showInputDialog("Please enter employee name: ");
        employee2.setEmployeeName(input);
        input = JOptionPane.showInputDialog("Please enter employee ID: ");
        employee2.setEmployeeID(input);
        input = JOptionPane.showInputDialog("What is your hourly pay? ");
        employee2.setPay(input);
        input = JOptionPane.showInputDialog("What hours did you work this week?");
        employee2.setHours(input);
        JOptionPane.showMessageDialog(null, "The weekly wages for " + 
        employee1.getEmployeeName() + " ID number: " + employee1.getEmployeeID()
         + " is $" + dollars.format(employee1.getTotal()));
        JOptionPane.showMessageDialog(null, "The weekly wages for " + 
        employee2.getEmployeeName() + " ID number: " + employee2.getEmployeeID()
         + " is $" + dollars.format(employee2.getTotal()));
    }
}
