/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

/**
 *
 * @author erics
 */
public class ValidacionDeCelular extends Exception {
    public ValidacionDeCelular() {
        
        super("El celular es incorrecto");
        
    }
}
