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
public class Hat extends TimsProduct {
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
    private Hat(String name, Color color, double cost, double price) {
        super(name, cost, price);
        this.color = color;
    }
    /**
     * 
     * @return object of class after initializing it 
     */
    public static Hat create() {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter type of Hat (1=BLUE, 2=RED): ");
            int colorOfHat = sc.nextInt();
            switch (colorOfHat) {
                case 1:
                    return new Hat("Hat, Color: BLUE", Color.BLUE, 0.75, 1.00);
                case 2:
                    return new Hat("Hat, Color: RED", Color.RED, 0.75, 1.50);
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
// return "Hat{" + "color=" + color + '}';
    }

}
