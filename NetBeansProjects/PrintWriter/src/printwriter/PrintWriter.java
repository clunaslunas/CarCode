/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printwriter;
import java.util.*;
import java.io.*;
/**
 *
 * @author Carlos Luna
 */
public class PrintWriter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name, fileName;
        int num;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("How many numbers?");
        num = scnr.nextInt();
        scnr.nextLine();
        System.out.print("Enter the file name: ");
        fileName = scnr.nextLine();
        
        PrintWriter outputFile = new PrintWriter(fileName);
    }
    
}
