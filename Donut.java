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
public class Donut extends TimsProduct implements Consumable {
    /**
     *  description of product
     */
    private String description;
    /**
     * colrieCount of product
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
    private Donut(String name, String description, double cost, double price, int calories) {
        super(name, cost, price);
        this.calorieCount = calories;
        this.description = description;

    }
    
    /**
     * 
     * @return object of class after initializing it
     */
    public static Donut create() {
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter type of Donut (1=Glazed, 2=Kruller, 3=Chocolate): ");
            int typeOfDonut = sc.nextInt();
            switch (typeOfDonut) {
                case 1:
                    return new Donut("Donut, Type: Glazed", "Has a glaze of sugar  ", 0.25, 1.00, 290);
                case 2:
                    return new Donut("Donut, Type: Kruller", "Very sugrary donut ", 0.25, 1.10, 320);
                case 3:
                    return new Donut("Donut, Type: Chocolate", "Noithing better than Chocolate ", 0.25, 1.25, 310);
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
     * @return String  
     */
    @Override
    public String getConsumptionMethod() {
        return "Eat It";
    }
    /**
     * 
     * @return toString method of super class
     */
    @Override
    public String toString() {
    return super.toString();
//return "Donut{" + "description=" + description + ", calorieCount=" + calorieCount + '}';
    }

}
