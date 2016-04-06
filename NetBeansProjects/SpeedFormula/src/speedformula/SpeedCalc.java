/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedformula;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class SpeedCalc {
    
    public static void main(String[] args){
        double distance, time; 
        Scanner scnr = new Scanner(System.in);
        SpeedFormula speed = new SpeedFormula();
        System.out.print("Please enter the distance in miles: ");
        distance = scnr.nextDouble();
        System.out.print("Please enter time in hours: "); 
        time = scnr.nextDouble();
        speed.setDistance(distance);
        speed.setTime(time);
        System.out.print("The speed of the object traveling " + distance + " "
                + "miles" + " in " + time + " hours, equals: "
                + speed.getSpeed() + "MPH.");
    }
    
}
