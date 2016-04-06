package rectangle;


import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Carlos Luna
 */
public class WLDemo {
    public static void main(String[]args){
        Rectangle box = new Rectangle();
        Scanner scnr = new Scanner(System.in);
        double length, width;
        System.out.print("Enter your value for length: ");
        length = scnr.nextDouble();
        System.out.print("Enter your value for width: ");
        width = scnr.nextDouble();
        box.setWidth(width);
        box.setLength(length);
        System.out.print("The area of your rectangle is: " + box.getArea());
        
        
    }
}
