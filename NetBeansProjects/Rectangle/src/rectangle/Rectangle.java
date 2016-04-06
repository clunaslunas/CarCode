
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rectangle;

/**
 *
 * @author Carlos Luna
 */
public class Rectangle {
    /*
        These are my class fields that serve as access specifiers
        Private so it is only accessible by methods inside the class, but 
        nothing can access it outside the class 
    */
    
    private double length;
    private double width;
    /*  
        The setLength method stores a value in the
        length field 
        @param len the value to store in length
    */
    
    public void setLength (double len){
        length = len;
    }
    /*
    **The setWidth method stores a value in the width field 
    **@param wid the value to store width
    */
    public void setWidth (double wid){
        width = wid; 
    }
    public double getLength(){
        return length; 
    }
    public double getWidth(){
        return width; 
    }
    public double getArea (){
        return length * width;
    }
}

   