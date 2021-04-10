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
public class EjerWhile1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num;
        System.out.print("Introduzca un número: ");
        num=Entrada.entero();
        while(num!=0) // mientras num sea diferente de 0
        {
    if(num>0)    
        // mayor que cero: positivo 
        System.out.println("Positivo");
    else
        // si no es positivo: es negativo
        System.out.println("Negativo");
        //Repetimos el proceso y volvemos a leer num
        System.out.println("Introduzca un número: ");
        num=Entrada.entero();
        }  
        // Al salir del mientras tenemos la certeza de que num es 0
    }
    
}
