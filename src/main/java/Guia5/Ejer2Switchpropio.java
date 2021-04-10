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
public class Ejer2Switchpropio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b, calculadora= 0;
       int suma, resta ;
       double division, multiplicacion;
       
       System.out.println("Dijite un número");
       a = Entrada.entero();
       System.out.println("Dijite un número");
       b = Entrada.entero();
       System.out.println("Dijite un número");
       System.out.println("1 = La suma de ambos números");
       System.out.println("2 = La resta de el primer número menos el segundo");
       System.out.println("3 = La multiplicación de ambos números");
       System.out.println("4 = La división del primer número entre el segundo");
       calculadora = Entrada.entero();
		switch(calculadora) {
			case 1:
                            suma = a  + b;
                            System.out.println("La suma de los dos números que digito es: " +suma);
                            break;
			case 2:
                            resta = a - b;
                            System.out.println("La resta de el primer número menos el primero es : " + resta);
                            break;
			case 3:
                            multiplicacion = a * b ;
                            System.out.println("La multiplicación de ambos números es: " + multiplicacion);
                            break;
			case 4:
                            division = a/b;
                            System.out.println("La división de el primer número entre el segundo es: " + division);
                            break;
			default:
				System.out.println("ERROR");
		}
	}
}
    
