/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectreferencemethod;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ObjectReferenceMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number = 900;
        System.out.println("The current value of num is " + number);
        numMethod(number);
        System.out.println("Changed back so now: " + number);
        System.out.println("Now lets count characters in a string");
        String name = "JimJimmyBobJimtod";
        stringMethod(name);
        String newName = "Revietta"; 
        System.out.println("The value of newName is: " + newName);
        changeString(newName);             
    }
    public static void numMethod (int num){ 
        System.out.println("Changing the value: ");
        num = 99;
        System.out.println("So now the value is: " + num);
    }
    public static void stringMethod(String str){
        System.out.println(str + " is " + str.length() + " characters long.");
    }
    public static void changeString(String strng){
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a value: ");
        strng = scnr.nextLine();
        System.out.println("So now the string has been changed to: " + strng);
        stringMethod(strng);
    }
    
}
