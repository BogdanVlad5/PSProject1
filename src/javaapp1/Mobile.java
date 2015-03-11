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
public class Mobile extends Product{
    public String memory;
    public String os;
    
    Mobile(String name,float price,String memory,String os){
        this.name=name;
        this.price=price;
        this.memory=memory;
        this.os=os;
    }
    
    @Override
    public float getPrice(int quantity) {
        if(quantity <= 5)return price*quantity;
        else return price*quantity -(1/10)*(price*quantity);
    }

    @Override
    public String toString() {
        return " Nume: "+name+ " Memory: "+memory+" OS: "+os+" Price: "+price+"$ \n";
    }

   
}
