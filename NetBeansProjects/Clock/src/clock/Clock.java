/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author Carlos Luna
 */
public class Clock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    for (int hours = 1; hours <= 12; hours++){
        for (int mins = 0; mins <= 59; mins++){
            for (int secs = 0; secs <= 59; secs++){
                for (int mila = 0; mila <=59; mila++){
                    System.out.printf("%02d:%02d:%02d:%02d\n", hours, mins, secs, mila);
                }
            }
        }
    }
    }
    
}
