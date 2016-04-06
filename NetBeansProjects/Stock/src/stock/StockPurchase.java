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
public class StockPurchase {
    private Stock stock; 
    private int shares; 
    
    public StockPurchase(Stock stockObj, int numShares){
        stock = new Stock(stockObj);
        shares = numShares;
    }
    public Stock getStock(){
        return new Stock(stock);
    }
    public int getShares(){
        return shares; 
    }
    public double getCost(){
        return shares * stock.getPrice();
    }
}
