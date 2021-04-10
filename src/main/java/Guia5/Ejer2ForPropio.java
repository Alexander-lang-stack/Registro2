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
public class Ejer2ForPropio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i, cantidad_de_numero_primos = 0;
         for ( i = 1; i <= 1000; i++)
         { 
            boolean Esprimo = true;
            if (i > 2)
                {
                    for (int j = 2; j < i; j++) // EN ESTE FOR TOMAMOS LOS NUMEROS DESDE EL "2" HASTA EL VALOR QUE PUEDE TOMAR "i" 
                    {                           // AUMENTAOS EL VALOR DE 1 EN 1
                        if (i % j == 0)         //EN ESTE "IF" NOSOTROS VALIDAMOS QUE EL NUMERO SEA PRIMMO, YA QUE SI AL DIVIDIR EL VALOR DE "i" ENTRE "j"
                        {                       //EL RESIDUO DE LA DIVISION NO ES CERO, ENTOCES ES PRIMO
                            Esprimo = false; // COMPROBAMOS SI EL NUMERO REALMENTE ES PRIMO
                            break;         
                        }
                    }
      if (Esprimo) 
                {
               //     System.out.println();
                    cantidad_de_numero_primos++;
                    if (i < 1000)                   
                        System.out.print(i + " , " );                
                    if (cantidad_de_numero_primos % 10 == 0)             
                        System.out.println();
 
                }
     
                }
            
            }
         System.out.println("\n\nHAY " + cantidad_de_numero_primos + " NUMERO PRIMOS ENTRE 1 Y 1000");
    }
