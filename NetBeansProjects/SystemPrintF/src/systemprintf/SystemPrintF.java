/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemprintf;

import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class SystemPrintF {

    public static void main(String[] args) {
        double num = 12346579.98;
        String name1 = "joe",name2 = "frank", name3 = "jim", name4 = "bob";
        System.out.printf("%,20.2f\n", num);
        System.out.printf("%15s%15s\n", name1, name2); 
        System.out.printf("%15s%15s\n", name3, name4);
        
    }
    
}
