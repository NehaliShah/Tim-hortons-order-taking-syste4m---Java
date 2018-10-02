/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment7;

import java.util.Scanner;

/**
 *
 * @author Nehali Shah # 000770110
 */
public class Coffee extends TimsProduct implements Consumable {
    /**
     * description of product
     */
    private String description;
    /**
     * caloriCount of product
     */
    private int calorieCount;
    
    
    /**
     * 
     * @param name of product
     * @param description of product
     * @param cost of product
     * @param price of product
     * @param calories of product
     */
    private Coffee(String name, String description, double cost, double price, int calories) {
        super(name, cost, price);
        this.calorieCount = calories;
        this.description = description;

    }
    
    /**
     * 
     * @return object of this class after initialing
     */
    public static Coffee create() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter type of Coffee (1=Regular, 2=DoubleDouble, 3=TripleTriple): ");
            int typeOfCoffee = sc.nextInt();
            switch (typeOfCoffee) {
                case 1:
                    return new Coffee("Coffee, Type: Regular", " 1 cream 1 sugar  ", 0.5, 1.00, 290);
                case 2:
                    return new Coffee("Coffee, Type: DoubleDouble", " 2 cream 2 sugar ", 0.5, 1.10, 320);
                case 3:
                    return new Coffee("Coffee, Type: TripleTriple", " 3 cream 3 sugar ", 0.5, 1.25, 350);
                default:
                    System.out.println("Invalid Choice - please try again");
                    break;
            }
        } while (true);
    }
    
    /**
     * 
     * @return description of product
     */
    public String getDescription() {
        return description;
    }
    
    
    /**
     * 
     * @return calorieCount of product
     */
    @Override
    public int getCalorieCount() {
        return calorieCount;
    }
    /**
     * 
     * @return String of product 
     */
    @Override
    public String getConsumptionMethod() {
        return "Drink It";
    }
    
    /**
     * 
     * @return toString of super class
     */
    @Override
    public String toString() {
    return super.toString();
//return "Coffee{" + "description=" + description + ", calorieCount=" + calorieCount + '}';
    }

}
