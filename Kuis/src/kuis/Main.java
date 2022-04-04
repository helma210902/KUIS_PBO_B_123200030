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
public class Main {

    /**
     * @param args the command line arguments
     */
    int jumlah=0;
    public static void main(String[] args) {
        Main cetak = new Main ();
        cetak.printAnimal (new Macan ());
        cetak.printAnimal (new Macan ());
        cetak.printAnimal (new Kambing());
        cetak.printAnimal (new Ayam ());
       
    }
     public void printAnimal (Animal animal) {
       System.out.print(animal.getName() + " adalah " + animal.getType() + " dengan bunyi ");
       if("Macan".equals(animal.getType()))
       {
           jumlah++;
           for(int i = 0; i < jumlah; i++)
           {
               animal.makeSound();
           }
       }
         else{
            animal.makeSound();
         }
         System.out.println("");
     }
}
