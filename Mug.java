/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaassignment7;

import java.util.Scanner;
import javafx.scene.paint.Color;

/**
 *
 * @author Nehali Shah # 000770110
 */
public class Mug extends TimsProduct {
    /**
     * color of product
     */
    private Color color;
    
    /**
     * 
     * @param name of product
     * @param color of product
     * @param cost of product
     * @param price of product
     */
    private Mug(String name, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }
    /**
     * 
     * @return object of class after initializing it
     */
    public static Mug create() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter type of Mug (1=DARKGOLD, 2=BLACK): ");
            int colorOfMug = sc.nextInt();
            switch (colorOfMug) {
                case 1:
                    return new Mug("Mug, Color: DarkGold", Color.DARKGOLDENROD, 0.85, 1.50);
                case 2:
                    return new Mug("Mug, Color: Black", Color.BLACK, 0.85, 1.70);
                default:
                    System.out.println("Invalid Choice - please try again");
                    break;
            }
        } while (true);
    }
    
    /**
     * 
     * @return color of product 
     */
    public Color getColor() {
        return color;
    }
    /**
     * 
     * @return toString method of super class 
     */
    @Override
    public String toString() {
    return super.toString();
//return "Mug{" + "color=" + color + '}';
    }

}
