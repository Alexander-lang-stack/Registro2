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
public class Ejer1ClassInter implements Ejer1Interface{

    @Override
    public String Marca(String marca) {
        return marca;
    }

    @Override
    public String Modelo(String modelo) {
        return modelo;
    }

    @Override
    public int Precio(int precio) {
        return precio;
    }

    
}
