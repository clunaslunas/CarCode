/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemsolvingmethod;
import java.util.*;
import javax.swing.JOptionPane;
import java.io.*;
import java.text.DecimalFormat;
/**
 *
 * @author Carlos Luna
 */
public class ProblemSolvingMethod {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args)throws IOException  {
        final int NUM_DAYS = 21; 
        String fileName; 
        double totalSales, averageSales; 
        fileName = getFile();
        totalSales = getTotalSales(fileName);
        averageSales = totalSales / NUM_DAYS;
        displayResults(totalSales, averageSales);
        System.exit(0);
    }
    public static String getFile()throws IOException {
        String file;
        file = JOptionPane.showInputDialog("Please enter the \n file name: ");
        return file;
    }
    public static double getTotalSales (String fileName)throws IOException{
        double total = 0.0;
        double sale; 
        File file = new File(fileName);
        Scanner inputFile = new Scanner(file);
        
        while (inputFile.hasNext()){
            sale = inputFile.nextDouble();
            total += sale;
        }
        inputFile.close();
        return total;
    }
    public static void displayResults(double total, double avg){
        DecimalFormat dollar = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null,"The total sales for the period "
                + " is $" + dollar.format(total) + "\nThe Average daily sales "
                + "were $" + dollar.format(avg));
    }
    
}
