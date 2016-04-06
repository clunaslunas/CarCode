/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returnreferenceobject;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ReturnReferenceObject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String customerName, input1, input2;
        Scanner scnr = new Scanner(System.in);
        System.out.print(" Enter first name: ");
        input1 = scnr.nextLine();
        System.out.print(" Enter last name: ");
        input2 = scnr.nextLine();
        customerName = fullName(input1, input2);
        System.out.print(customerName);
        
    }
    public static String fullName(String firstName, String lastName){
        String name; 
        name = firstName + " " + lastName; 
        return name; 
    }
    
}
