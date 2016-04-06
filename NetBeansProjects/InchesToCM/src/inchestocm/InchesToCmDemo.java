/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inchestocm;
import java.util.*;
import java.text.DecimalFormat;
/**
 *
 * @author Carlos Luna
 */
public class InchesToCmDemo {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        DecimalFormat fmt = new DecimalFormat("#,###.00");
        double inches, cm; 
        String answr; 
        System.out.println("Are you converting inches to cm?");
        answr = s.next();
        double nums; 
        if (answr.equalsIgnoreCase("inches")){
            System.out.println("How many inches? ");
            nums = s.nextDouble();
            inches = InchesToCM.inchToCm(nums);
            System.out.println(nums + " inches equals " + 
                    fmt.format(inches) + " centimeters");
        }
        else{
            System.out.println("How many centimeters? ");
            nums = s.nextDouble();
            cm = InchesToCM.cmToInches(nums);
            System.out.println(nums + " centimeters equals " +
                    fmt.format(cm) + " inches" );
        }
    }    
}
