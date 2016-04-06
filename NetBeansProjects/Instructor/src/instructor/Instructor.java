/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instructor;

/**
 *
 * @author Carlos Luna
 */
public class Instructor {
    private String lastName; 
    private String firstName; 
    private String officeNumber; 
    
    public Instructor (String lname, String fname, String office){
        this.lastName = lname; 
        this.firstName = fname; 
        this.officeNumber = office; 
    }
    public Instructor(Instructor obj){
        lastName = obj.lastName;
        firstName = obj.firstName;
        officeNumber = obj.officeNumber;
        
    }    
    public void set(String lname ,String fname, String office){
        lastName = lname;
        firstName = fname; 
        officeNumber = office; 
    }
    @Override
    public String toString(){
        String teach = "Last name: " + lastName + " First name : " + firstName +
                        " at office number: " + officeNumber; 
        return teach; 
    }
}
