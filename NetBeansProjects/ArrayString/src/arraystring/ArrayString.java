/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraystring;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArrayString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many names? ");
        int nums = s.nextInt();       
        String[] names = new String[nums];
        System.out.println("Enter the names: ");
        for (int i = 0; i < names.length; i++){
            names[i] = s.next();
        }
        for (int i = 0; i < names.length; i++){
            System.out.println("Name " + (i + 1) + ":" + names[i]);
            /*System.out.println(names[0].toUppCase());*/
        }
    }
    
}
