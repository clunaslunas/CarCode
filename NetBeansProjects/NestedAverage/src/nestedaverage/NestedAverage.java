/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nestedaverage;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class NestedAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numStudents, numTest;
    double score, total, average;
    Scanner scnr = new Scanner(System.in);
    System.out.println("How many students are there? ");
    numStudents = scnr.nextInt();
    System.out.println("How many tests per student? ");
    numTest = scnr.nextInt();
    
    for(int student = 1; student <= numStudents; student++){
        total = 0; 
        System.out.println("Student number: " +  student);
        System.out.println("*******************************");
        for(int test = 1; test <= numTest; test++){
            System.out.println("Enter score for test " + test);
            score = scnr.nextDouble();
            total += score; 
        } 
        average = total/numTest; 
        System.out.printf("The average for student %d is %.1f.\n\n", student, 
                average);
    }
    }
    
}
