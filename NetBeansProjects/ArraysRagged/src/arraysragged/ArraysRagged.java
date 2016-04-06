/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraysragged;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArraysRagged {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        System.out.println("How many rows? ");
        int rows = s.nextInt();    
        int columns; 
        int[][] ragged = new int[rows][];
        for (int row = 0; row < rows; row++){
            System.out.println("How many columns for row " + (row + 1));
            columns = s.nextInt();
            ragged[row] = new int[columns];
            for (int col = 0; col < columns; col++){
                System.out.println("Fill column " + (col + 1) + ": ");
                ragged[row][col] = s.nextInt();
            System.out.println("Row " + (row + 1) + " : " + "Column " + 
                    (col + 1) + " : ");
            }            
        }
        
    }
    
}
