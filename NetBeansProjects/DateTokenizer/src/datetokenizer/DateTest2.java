/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetokenizer;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class DateTest2 {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the date in the format mm/dd/yyyy");
        String date = s.nextLine();
        DateTokenizer dt = new DateTokenizer(date);
        System.out.println("The day is: " + dt.getDay());
        System.out.println("The month is: " + dt.getMonth());
        System.out.println("The year is: " + dt.getYear());
    }
}
