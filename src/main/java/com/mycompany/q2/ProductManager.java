/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.q2;

/**
 *
 * @author faraz
 */
public class ProductManager {
    //Calculate final price
    public double calculateDiscount(double price, double discountPercent) {
    return price - (price * discountPercent / 100);
}
}
