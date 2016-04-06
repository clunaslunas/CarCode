/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roomdimension;
/**
 *
 * @author Carlos Luna
 */
public class RoomCarpet {
    private RoomDimension size; 
    private double cost;     
    
    public RoomCarpet(RoomDimension dim, double cos){
        this.size = dim; 
        this.cost = cos;         
    }
    public double getCost(){
        return  size.getArea() * cost; 
    }
    @Override
    public String toString(){
        
        String str = "The Square footage is: " + size.getArea() + " sq ft." + 
                "\n the cost per square foot is: " + cost + "\n Total price: " +
                getCost();
        return str; 
    }
}
