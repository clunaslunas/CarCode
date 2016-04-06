/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cellphone;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class CellPhoneTest {
    public static void main(String[] args){
    String man, model;
    double price; 
    
    Scanner scnr = new Scanner(System.in);
    System.out.print("Please enter the manufacturer: ");
    man = scnr.nextLine();
    System.out.print("Please enter model numbber Alpha, num, num: ");
    model = scnr.nextLine();
    System.out.print("Please enter the price of the phone: ");
    price = scnr.nextDouble();
    CellPhone test = new CellPhone(man, model, price);
    System.out.println("The manufacturer is: " + test.getManufact());
    System.out.println("The model number is: " + test.getModel());
    System.out.println("The price is: $" + test.getPrice());
    }
    
}
