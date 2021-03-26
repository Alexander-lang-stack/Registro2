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
public class AbstractTest extends Operaciones {

    @Override
    public int suma(int a, int b) {
        return a + b; 
    }

    @Override
    public int resta(int a, int b) {
        return a - b; 
    }

    @Override
    public int division(int a, int b) {
        return a / b; 
    }

    @Override
    public int multiplicacion(int a, int b) {
        return a * b; 
    }
    
}
