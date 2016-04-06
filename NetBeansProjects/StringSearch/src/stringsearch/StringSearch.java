/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringsearch;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class StringSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String lookUp; 
        
        String[] people = {"Steve, Smith", "Rudie, Johnson", "John, Jimms", 
                            "Tim, Bucks"};
        System.out.println("Enter a three characters of name to search");
        lookUp = s.next();
        for(String person: people){
            if (person.startsWith(lookUp))
                System.out.println(person);
        }
    }
    
}
