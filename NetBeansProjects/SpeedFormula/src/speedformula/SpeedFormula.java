/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package speedformula;

/**
 *
 * @author Carlos Luna
 */
public class SpeedFormula {

    /**
     * @param args the command line arguments
     */
    private double distance;
    private double time; 
    
    public void setDistance (double dis){
        distance = dis; 
    }
    public void setTime (double tim){
        time = tim; 
    }
    public double getDistance (){
        return distance; 
    }
    public double getTime(){
        return time; 
    }
    public double getSpeed(){
        return distance/time; 
    }
    
}
