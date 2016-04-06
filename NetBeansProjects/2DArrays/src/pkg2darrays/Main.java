/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2darrays;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int rows, cols;
        double total = 0.0;
        System.out.println("How many rows? ");
        rows = s.nextInt();
        System.out.println("How many columns? ");
        cols = s.nextInt();
        double[][] array = new double[rows][cols];
        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                System.out.println("Filling row " + (row + 1) + " and column "
                    + (col + 1)+ ":");
                array[row][col] = s.nextDouble();
            }            
        }
        for (int row = 0; row < rows; row++){
            System.out.println("__________________________________");
                for (int col = 0; col < cols; col++){
                    System.out.println("Row " + (row + 1) + " " +  
                            "Column " + (col + 1) + ":" + 
                            "\t " + array[row][col]);
                    total += array[row][col];                           
                }
            }
        for (int row = 0; row < array.length; row++){
            int tot = 0; 
            for (int col = 0; col < array[row].length; col++){
                tot += array[row][col];
                System.out.println("Total for row " + row + ": " + tot);
            }
        }
        System.out.println(total);
    }
    
}
