package ec.edu.ups.excepciones;

import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author erics
 */
public class ValidacionDeFecha extends Exception {
     public ValidacionDeFecha(){        
        super("La fecha no es correcta \n"+"Por favor Verificar");        
    }
    
}
    