package ec.edu.ups.excepciones;

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
     public ValidacionDeFecha(String su_fecha_es_incorrecta){        
        super("La fecha no es correcta \n"+"Por favor Verificar");        
    }
    
}
    