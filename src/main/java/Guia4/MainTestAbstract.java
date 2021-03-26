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
public class MainTestAbstract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtendsAbstract prueba2 = new ExtendsAbstract();
        
        System.out.println("Su nombre es " + prueba2.Nombre("Roberto"));
        System.out.println("Su nombre es " + prueba2.Apellido("Guillen"));
        System.out.println("Usted tiene " + prueba2.edad(18) + " años");
        System.out.println("Su estatura es de " + prueba2.estatura(1.70) + " m");
        
    }
    
}
