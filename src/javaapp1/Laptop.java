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
public class Laptop extends Product{
    public String processor;
    public String screenSize;
    
    Laptop(String name,float price,String processor,String screenSize){
        this.name=name;
        this.price=price;
        this.processor=processor;
        this.screenSize=screenSize;
    }
    
    @Override
    public float getPrice(int quantity) {
        if(quantity <= 5)return price*quantity;
        else return price*quantity -(2/10)*(price*quantity);
    }

    @Override
    public String toString() {
        return " Nume: "+name+ " Processor: "+processor+" Screen size: "+screenSize+" Price: "+price+"$\n";
    }

}
