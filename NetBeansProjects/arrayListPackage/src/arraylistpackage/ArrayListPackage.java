/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistpackage;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class ArrayListPackage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("How many names? ");
        int num = s.nextInt();
        ArrayList<String> list;
        list = new ArrayList<>(num);
        System.out.println("Ok, please enter name: ");
                
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
    
}
