/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Student
 */
public class Cart {
    private HashMap<Product,Integer> products = new HashMap<Product, Integer>();
    
    public void addProduct(Product p,Integer q){
        products.put(p, q);
    }
    
    @Override
    public String toString(){
        String message="";
        float price = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
                message += " "+entry.getKey().toString();
                price += entry.getKey().getPrice(entry.getValue());
		}
        return message+" "+price+" $";
    }
    
}
