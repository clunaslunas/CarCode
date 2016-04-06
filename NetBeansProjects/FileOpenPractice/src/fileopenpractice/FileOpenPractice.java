/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fileopenpractice;
import java.util.*;
import java.io.*;
import java.text.DecimalFormat;

/**
 *
 * @author Carlos Luna
 */
public class FileOpenPractice {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        String filename; 
        Scanner scnr = new Scanner(System.in);
        int nums; 
        double total, avg;
        filename = getFile();
        System.out.print("How many random numbers: ");
        nums = scnr.nextInt();
        total = calculate(filename);
        avg = total/nums;
        displayResults(total, avg);
        
        
    }
    public static String getFile(){
        String file; 
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please enter the file name: ");
        file = scnr.nextLine();
        return file; 
    }
    public static double calculate (String filename) throws IOException{
        File file = new File(filename);
        Scanner input = new Scanner(file);
        double random, total = 0.0, iterations = 0;
        while (input.hasNext()){
            random = input.nextDouble();
            total += random;
        }
        input.close();
        return total; 
    }
    public static void displayResults(double total, double average){
        DecimalFormat nums = new DecimalFormat("#,###.00");
        System.out.print("The grand total for the random \nnumbers will be: " + 
                nums.format(total) + " and \nthe average of random " +
                "\nnumbers is: " + nums.format(average));
    }
    
}
