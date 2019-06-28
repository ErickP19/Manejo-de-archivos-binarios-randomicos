/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.controlador;

import ec.edu.ups.excepciones.Persona;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.Format;
import java.text.SimpleDateFormat;

/**
 *
 * @author erics
 */
public class ControladorPersona {
    
     private BaseDatos miBaseDatos;

    public ControladorPersona() {
        miBaseDatos = new BaseDatos();
    }

    public void create(Persona persona) {
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(persona.getFecha());
        String sql = "INSERT INTO \"Persona\" VALUES('" + persona.getCedula() + "',"
                + "'" + persona.getNombre() + "',"
                + "'"+ persona.getApellido() + "',"
                +  persona.getEdad() + ",'"               
                +persona.getCelular() + "','" 
                +fecha + "'," 
                + persona.getSalario() + ");";
        System.out.println(sql);
        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    /*
    public void delete(String cedula){
        String sql = "DELETE FROM \"PERSONA\" WHERE \"PER_CEDULA\" = '" + cedula + "';";
        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void update(Persona persona){
        Format formato = new SimpleDateFormat("yyyy-MM-dd");
        String fecha = formato.format(persona.getFecha());
        String sql = "UPDATE \"PERSONA\" SET \"PER_NOMBRES\" = '" + persona.getNombre() + "',"
                + "\"PER_APELLIDOS\" = '" + persona.getApellido() + "',"
                + "\"PER_EDAD\" = " + persona.getEdad() + ","
                + "\"PER_FECHA_NACIMIENTO\" = '" + fecha + "',"
                + "\"PER_CELULAR\" = '" + persona.getCelular() + "',"
                + "\"PER_SALARIO\" = " + persona.getSalario()
                + "WHERE \"PER_CEDULA\" = '" + persona.getCedula() + "';";
        System.out.println(sql);
        miBaseDatos.conectar();
        try {
            Statement sta = miBaseDatos.getConexionBD().createStatement();
            sta.execute(sql);
            miBaseDatos.desconectar();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
*/
}
