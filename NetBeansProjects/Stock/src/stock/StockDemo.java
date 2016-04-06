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
public class StockDemo {
    public static void main(String[] args){
        Stock Target = new Stock("Trgt", 23.99);
        Stock Walmart = new Stock("Wlmrt", 15.99);
        Stock SafeWay;
        SafeWay = Target.copy();
        System.out.println(Target);
        System.out.println(Walmart);
        if(Target.equals(Walmart))
            System.out.println("Companies are the same");
        else
            System.out.println("Companies not the same, but " + SafeWay + " and " 
                    + Target + " are the same");
    }
}
