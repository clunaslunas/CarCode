/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomdimension;
import java.util.*; 
/**
 *
 * @author Carlos Luna
 */
public class CarpetDemo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);        
        double length, width, cost; 
        System.out.println("Please enter length of room: ");
        length = s.nextDouble();
        System.out.println("Please enter the width of the room: ");
        width = s.nextDouble();
        RoomDimension dims = new RoomDimension(length, width);
        System.out.println("Please enter the cost per square footage: ");
        cost = s.nextDouble();         
        RoomCarpet room1 = new RoomCarpet(dims, cost);
        System.out.println(room1.toString());
    }
}
