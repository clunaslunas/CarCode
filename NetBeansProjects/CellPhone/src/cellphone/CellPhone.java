/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellphone;

/**
 *
 * @author Carlos Luna
 * @Class CellPhone
 * Fields include manufact: String
 *                model: String
 *                retailPrice: double 
 */
public class CellPhone {
    private String manufact, model;
    private double retailPrice; 
    
    public CellPhone(String man, String mod, double price){
        manufact = man; 
        model = mod; 
        retailPrice = price; 
        
    }
    public void setManufact (String man){
        manufact = man; 
    }
    public void setModel (String mod){
        model = mod;
    }
    public void setPrice (double price){
        retailPrice = price; 
    }
    public String getManufact(){
        return manufact;
    }
    public String getModel (){
        return model;
    }
    public double getPrice (){
        return retailPrice; 
    }
}
