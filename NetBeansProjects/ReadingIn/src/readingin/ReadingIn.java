/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingin;
import java.util.*;
import java.io.*;
/**
 *
 * @author Carlos Luna
 */
public class ReadingIn {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter the name of the file: ");
        String fileName = scnr.nextLine();
        File file = new File(fileName);
        try (Scanner inputFile = new Scanner(file)) {
            String line = inputFile.nextLine();
            System.out.println("First name is: ");
            System.out.println(line);
        }
    }
    
}
