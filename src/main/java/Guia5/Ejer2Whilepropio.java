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
public class Ejer2Whilepropio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
        int num;
        System.out.print("Introduzca un número: ");
        num=Entrada.entero();
        while(num!=0) // mientras num sea diferente de 0
        {
    if(num%2 == 0)    
        // mayor que cero: positivo 
        System.out.println("El número que digito es par");
    else
        // si no es positivo: es negativo
        System.out.println("El número que digito es impar");
        //Repetimos el proceso y volvemos a leer num
        System.out.println("Introduzca un número: ");
        num=Entrada.entero();
        }  
    }
    
}
