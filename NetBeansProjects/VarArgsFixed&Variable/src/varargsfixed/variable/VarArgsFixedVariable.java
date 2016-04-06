/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package varargsfixed.variable;
import java.util.*; 
/**
 *
 * @author Carlos Luna
 */
public class VarArgsFixedVariable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);        
        System.out.println("How many classes? ");
        int nums = s.nextInt();
        String[] classes = new String[nums];
        double[] grades = new double[nums];
        for (int i = 0; i < classes.length; i++){
            System.out.println("Class " + (i + 1) + ": ");
            classes[i] = s.next();
            for (double g : grades){
            
            System.out.println("Test " + (++tot) + " for " + classes[i] + ": ");
            g = s.nextDouble();
        }
        }                
        gradeAvg(classes, grades);
    }
    public static void gradeAvg(String[] c, double... g){
        double total = 0.0;
        for(double i : g){
            total += i; 
        }
        System.out.println("Your grade average is : " + total/g.length);
    }
    
}
