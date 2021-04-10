/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia5;

/**
 *
 * @author kevin
 */
public class Ejer1ifpropio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        System.out.println("Introduzca un número");
        a = Entrada.entero();
        if((a%2) == 0)
           System.out.println("El número que digitó es par");
        else
           System.out.println("El número que digitó es impar"); 
    }
    
}
