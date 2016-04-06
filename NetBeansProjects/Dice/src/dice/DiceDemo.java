/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;

/**
 *
 * @author Carlos Luna
 */
public class DiceDemo {
    public static void main(String[] args){
        final int DIE1_SIDES = 6; 
        final int DIE2_SIDES = 12;
        final int MAX_ROLLS = 6; 
        
        Dice die1 = new Dice(DIE1_SIDES);
        Dice die2 = new Dice(DIE2_SIDES);
        
        System.out.println("Rolling dice side: " + DIE1_SIDES + " and: " + DIE2_SIDES);
        System.out.print("Initial dice value: ");
        System.out.print(die1.getValue() + " " + die2.getValue());
        for (int i = 0; i < MAX_ROLLS; i++){
            die1.roll();
            die2.roll();
            System.out.println(die1.getValue() + " " + die2.getValue());
        }        
    }
}
