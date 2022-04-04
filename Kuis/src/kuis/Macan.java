/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis;

/**
 *
 * @author LENOVO
 */
public class Macan implements Animal {

    @Override
    public String getName() {
        return "m1";
    }

    @Override
    public String getType() {
        return "Macan";
    }

    @Override
    public void makeSound() {
        System.out.print ("p");
    }
    
   
    
}
