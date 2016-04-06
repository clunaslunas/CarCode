/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemoutprintf;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class SystemOutPrintF {

    public static void main(String[] args) {
    double x, y, z, product; 
    Scanner scnr = new Scanner(System.in);
    System.out.println("Enter an x, y, z value: ");
    System.out.println("Enter x: ");
    x = scnr.nextDouble();
    System.out.println(x);
    System.out.println("Enter y: ");
    y = scnr.nextDouble();
    System.out.println(y);
    System.out.println("Enter z: ");
    z = scnr.nextDouble();
    System.out.println(z);
    product = (x*y)/z;
    System.out.printf("The product equals %.2f\n", product);
    
    }
    
}
