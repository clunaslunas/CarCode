/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/**
 *
 * @author Carlos Luna
 */
public class Payroll {
    private String employeeName;
    private String employeeID;
    private double hours, pay; 
    
    public Payroll(){
    }
    public Payroll (String emp, String ID, double hrs, double p){
        this.hours = hrs;
        this.pay = p; 
        this.employeeName = emp; 
        this.employeeID = ID;
    }
    public void setEmployeeName(String emp){
        employeeName = emp; 
    }
    public void setEmployeeID(String ID){
        employeeID = ID;        
    }
    public void setHours(double hrs){
        hours = hrs; 
    }
    public void setHours(String hrs){
        hours = Double.parseDouble(hrs);
    }
    public void setPay(double p){
        pay = p; 
    }
    public void setPay(String p){
        pay = Double.parseDouble(p);
    }
    public String getEmployeeID(){
        return employeeID; 
    }
    public String getEmployeeName(){
        return employeeName; 
    }
    public double getHours(){
        return hours; 
    }
    public double getPay(){
        return pay; 
    }
    public double getTotal(){
        return pay * hours; 
    }
}
