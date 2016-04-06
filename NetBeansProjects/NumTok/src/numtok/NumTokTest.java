/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numtok;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class NumTokTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter 3 digits seperated by space, dash or "
                + " period");
        String numbers = s.nextLine();        
        NumTok aver1 = new NumTok(numbers);
        System.out.println("The average of the values is: " + aver1.getAvg());
        
    }
}
