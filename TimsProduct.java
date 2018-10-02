/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment7;

/**
 *
 * @author Nehali Shah # 000770110
 */
public abstract class TimsProduct implements Commodity {
    
    /**
     * name variable store the value of name of product
     */
    private String name;
    /**
     * cost variable stores the cost of product
     */
    private double cost;
    /**
     * price variable stores the price of product
     */
    private double price;

    /**
     * 
     * @param name of product
     * @param cost of product
     * @param price of product
     */
    public TimsProduct(String name, double cost, double price) {

        this.name = name;
        this.cost = cost;
        this.price = price;

    }
    
    /**
     * 
     * @return name of product
     */
    public String getName() {
        return name;
    }
    
    /**
     * 
     * @return cost of product
     */
    @Override
    public double getProductionCost() {
        return cost;

    }
    /**
     * 
     * @return price of product
     */
    @Override
    public double getRetailPrice() {
        return price;
    }
    
    /**
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "TimsProduct{" + "Name = " + name + ", Cost = " + cost + ", Price = " + price + '}' + "\n";
    }

}
