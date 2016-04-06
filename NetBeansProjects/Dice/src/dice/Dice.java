/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dice;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class Dice {
    private int sides, value; 
    public Dice(int numSides){
        sides = numSides;
        roll();
    }
    public void roll(){
        Random rand = new Random();
        value = rand.nextInt(sides) + 1; 
    }
    public int getSides(){
        return sides; 
    }
    public int getValue(){
        return value; 
    }
    
}
