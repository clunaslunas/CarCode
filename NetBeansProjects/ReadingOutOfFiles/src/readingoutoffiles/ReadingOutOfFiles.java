/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readingoutoffiles;
import java.util.*;
import java.io.*;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
/**
 *
 * @author Carlos Luna
 */
public class ReadingOutOfFiles {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException {
        String filename;
        final int YEARS = 11;
        double totalSales, averageSales;
        filename = getFile();
        totalSales = getTotal(filename);
        averageSales = totalSales/YEARS;
        displayResults(totalSales, averageSales);
        
    }
    public static String getFile()throws IOException{
        Scanner scnr = new Scanner(System.in);
        String file;
        System.out.println("Please enter the file name");
        file = scnr.nextLine();
        return file;
    }
    public static double getTotal (String fileName)throws IOException{
        double sales, total = 0.0; 
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()){
            sales = inputFile.nextDouble();
            total += sales; 
        }
        inputFile.close();
        return total; 
    }
    public static void displayResults(double total, double avg){
        DecimalFormat dollars = new DecimalFormat("#,###.00");
        System.out.println("The total sales for the fiesta are: " + 
                dollars.format(total) + " and the average sales are: "
                + dollars.format(avg));
    }
    
}
