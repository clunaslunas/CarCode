/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;
import java.util.*;
/**
 *
 * @author Carlos Luna
 */
public class StockTrader {
    public static void main(String[] args){
        Stock trade = new Stock("XZY", 9.99);
        Scanner s = new Scanner(System.in);
        System.out.println("Current price for " + trade.getSymbol()
                + " is $" + trade.getPrice());
        System.out.println("How many shares would you like to purchase? ");
        int buy = s.nextInt();
        StockPurchase purchase = new StockPurchase(trade, buy);
        System.out.println("Cost will be " + purchase.getCost());
    }
}
