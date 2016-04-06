/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retailitem;

/**
 *
 * @author Carlos Luna
 */
public class RetailItem {
    private String description;
    private int unitOnHand;
    private double price; 
    
    public RetailItem (){
        
    }
    public RetailItem(String d, int unit, double prc){
        this.description = d; 
        this.unitOnHand = unit; 
        this.price = prc; 
    }
    
    public void setDescription (String des){
        description = des; 
    }
    public void setUnits (int unit){
        unitOnHand = unit; 
    }
    public void setUnits (String str){
        unitOnHand = Integer.parseInt(str);
    }
    public void setPrice (double prc){
        price = prc; 
    }
    public void setPrice (String str){
        price = Double.parseDouble(str);
    }
    public String getDescription(){
        return description; 
    }
    public int getUnits (){
        return unitOnHand; 
    }
    public double getPrice (){
        return price; 
    }
    
}
