/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;
import ec.edu.ups.controlador.ControladorPersona;
import ec.edu.ups.excepciones.Persona;
import ec.edu.ups.excepciones.ValidacionDeCedula;
import ec.edu.ups.excepciones.ValidacionDeNombres;
import ec.edu.ups.excepciones.ValidacionNombresIncompletos;
import java.util.Date;

/**
 *
 * @author erics
 */
public class PRUEBA {
    public static void main(String[] args) throws ValidacionDeNombres {
        ControladorPersona controladorPersona = new ControladorPersona();
        Persona p = new Persona("0105802609", "erick sebastian", "parra ulloa ", 19, new Date(), "0987571039", 252.0);
        /*
        try{
            p.setNombre("erick fernando");
        }catch(ValidacionNombresIncompletos ex){
            ex.printStackTrace();
        }catch(ValidacionDeNombres ex){
            ex.printStackTrace();
        }
        */
        controladorPersona.create(p);
    }
    
    
}
