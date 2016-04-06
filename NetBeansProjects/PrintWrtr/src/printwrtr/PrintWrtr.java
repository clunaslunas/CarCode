/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printwrtr;
import java.util.*;
import java.io.*;
/**
 *
 * @author Carlos Luna
 */
public class PrintWrtr {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String name, fileName; 
        int num;
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter how many names");
        num = scnr.nextInt();
        scnr.nextLine();
        
        System.out.print("Enter file name: ");
        fileName = scnr.nextLine();
        try (PrintWriter output = new PrintWriter(fileName)) {
            for (int i = 1; i <= num; i++){
                System.out.println("Enter name number " + i );
                name = scnr.next();
                output.println(name);
                System.out.println("Done");
            }
        }
    }
    
}
