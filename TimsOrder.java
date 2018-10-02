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
public class TimsOrder {
    /**
     * size of product
     */
    private int size;
    /**
     * name of product
     */
    private String name;
    /**
     * object of class
     */
    public static TimsOrder timsOrder;
    /**
     * array object of TimsProduct class
     */
    public static TimsProduct[] timsProductArray;
    
    /**
     * 
     * @param name of product
     * @param size of product
     */
    private TimsOrder(String name, int size) {
        this.name = name;
        this.size = size;

    }
    
    
    /**
     * 
     * @return object of TimsOrder
     */
    public static TimsOrder create() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your Name: ");
        String customerName = sc.nextLine();

        System.out.println("Enter the Number of items for your order: ");
        int numOfItems = sc.nextInt();

        timsOrder = new TimsOrder(customerName, numOfItems);
        timsProductArray = new TimsProduct[numOfItems];

        for (int i = 0; i < numOfItems; i++) {
            System.out.println("Enter type of products ( 1=Coffee, 2=Donut, 3=Mug, 4=Hat ): ");
            int order = sc.nextInt();

            switch (order) {
                case 1:
                    timsProductArray[i]= Coffee.create();
                    //timsProductArray[i] = (c.getName(), c.getProductionCost(), c.getRetailPrice());
                    break;
                case 2:
                    timsProductArray[i] = Donut.create();
                    //timsProductArray[i] = new Donut(d.getName(), d.getProductionCost(), d.getRetailPrice());
                    break;
                case 3:
                    timsProductArray[i] = Mug.create();
                    //timsProductArray[i] = new TimsProduct(m.getName(), m.getProductionCost(), m.getRetailPrice());
                    break;
                case 4:
                    timsProductArray[i]= Hat.create();
                    //timsProductArray[i] = new TimsProduct(h.getName(), h.getProductionCost(), h.getRetailPrice());
                    break;
                default:
                    System.out.println("Invalid Products - please try again");
                    break;
            }
        }
        return timsOrder;
    }
    
    /**
     * 
     * @return total amount that customer purchase
     */
    public double getAmountDue() {

        double amount = 0.0;
        for (int i = 0; i < timsProductArray.length; i++) {
            amount = amount + timsProductArray[i].getRetailPrice();
        }
        return amount;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString() {
        String allProducts = "";
        for (int i = 0; i < timsProductArray.length; i++) {
            allProducts += timsProductArray[i].toString();
        }

        return "TimsOrder " + "for : " + name + "\n" + allProducts;
    }

}
