/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia4;

/**
 *
 * @author kevin
 */
public class Ejer1MainInter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Ejer1ClassInter nuevo = new Ejer1ClassInter();
        System.out.println("La marca de carro es: " + nuevo.Marca("Toyota"));
        System.out.println("El modelo de caroo es: " + nuevo.Modelo("Corolla 2020"));
        System.out.println("El precio del carro es:  " + nuevo.Precio(22740));
    }
    
}
