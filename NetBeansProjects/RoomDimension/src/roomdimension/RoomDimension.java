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
public class RoomDimension {
    private double length; 
    private double width;     
    
    public RoomDimension(double len, double w){
        this.length = len; 
        this.width = w; 
    }
    public double getArea(){
        return length * width; 
    }
    @Override
    public String toString(){
      String str = "Length: " + length + "\n Width: " + width; 
      return str; 
    }
}
