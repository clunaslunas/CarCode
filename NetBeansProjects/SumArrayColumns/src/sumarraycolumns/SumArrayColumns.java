/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumarraycolumns;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class SumArrayColumns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many rows?");
        int rows = s.nextInt();
        System.out.println("How many columns?");
        int columns = s.nextInt();
        double[][] array = new double[rows][columns];
        for (int row = 0; row < rows; row++){
            for(int col = 0; col < columns; col++){
                System.out.println("Row: " + (row + 1) + " Column: " + (col + 1));
                array[row][col] = s.nextDouble();
            }
        }        
        for (int col = 0; col < columns; col++){
            int total = 0;
            double avg = 0.0;
            for (int row = 0; row < rows; row++){
                total += array[row][col];
                
            }
            avg = total/rows; 
            System.out.println("The sum of column " + (col + 1) + " is "
                 + total + " The average of " + (col + 1) + " is " +  avg);
        }
    }
    
}
