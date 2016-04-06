/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

/**
 *
 * @author Carlos Luna
 */
public class Stock {
    private String symbol; 
    private double sharePrice;
    
    public Stock(String sym, double price){
        this.symbol = sym; 
        this.sharePrice = price; 
    }
    /*
        Copy constructor
    */
    public Stock(Stock obj2){
        symbol = obj2.symbol;
        sharePrice = obj2.sharePrice;
    }
    public String getSymbol(){
        return symbol; 
    }
    public double getPrice(){
        return sharePrice; 
    }
    @Override
    public String toString(){
        String strn = "Trading symbol: " + symbol + 
                    "\n Share price: " + sharePrice;
        return strn; 
    }
    public boolean equals(Stock obj2){
        boolean status; 
        if (symbol.equals(obj2.symbol) && sharePrice == obj2.sharePrice)
            status = true; 
        else
            status = false;
        return status;
    }
    public Stock copy(){
        Stock copyObj = new Stock(symbol, sharePrice);
        return copyObj;
    }
}
