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
public class Javaapp1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product p1 = new Laptop("HP TouchSmart", (float) 20.00, "15", "Intel i7"); 
	Product p2 = new Mobile("HTC mini 2", (float) 100.00, "HTC" ,"Android");
	Product p3 = new Laptop("Dell XPS", (float) 50.00, "17", "Intel i7"); 
		
		Cart c = new Cart();
		c.addProduct(p1, 5);
		c.addProduct(p2, 1);
		c.addProduct(p3, 1);
		
		System.out.println(c.toString());

    }
    
}
