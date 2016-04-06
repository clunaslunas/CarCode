/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datetokenizer;

/**
 *
 * @author Carlos Luna
 */
public class DateTest {
    public static void main(String[] args){
        String date = "11/09/1988";
        DateTokenizer dt = new DateTokenizer(date);
        System.out.println("Here is the date: " + date);
        System.out.println("The month: " + dt.getMonth());
        System.out.println("The day: " + dt.getDay());
        System.out.println("The Year: " + dt.getYear());
    }
}
