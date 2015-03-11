/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp1;

/**
 *
 * @author Student
 */
public abstract class Product {
    public float price;
    public String name;
    
    public abstract float getPrice(int q);
    public abstract String toString();
}

