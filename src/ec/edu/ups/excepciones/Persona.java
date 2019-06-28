/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.excepciones;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author erics
 */
public class Persona {
    private String cedula;
    private String nombre;
    private String apellido;
    private int edad;
    private Date fecha;
    private String celular;
    private double salario;
    
    

    public Persona() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) throws ValidacionDeCedula {
        if (cedula.length() == 10) {
            int pos = Integer.parseInt(cedula.substring(2, 3));
            if (pos <= 6) {
                int[] Validacion = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                int cedu = Integer.parseInt(cedula.substring(9, 10));
                int a = 0;
                int d = 0;
                for (int i = 0; i < (cedula.length() - 1); i++) {
                    d = Integer.parseInt(cedula.substring(i, i + 1)) * Validacion[i];
                    a += ((d % 10) + (d / 10));
                }
                if ((a % 10 == 0) && (a % 10 == cedu)) {
                    this.cedula = cedula;
                } else if ((10 - (a % 10)) == cedu) {
                    this.cedula = cedula;
                } else {
                    throw new ValidacionDeCedula();
                }
            } else {
                throw new ValidacionDeCedula();
            }
        } else {
            throw new ValidacionDeCedula();
        }

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) throws ValidacionNombresIncompletos, ValidacionDeNombres {
        boolean si = true;
        for (int i = 0; i < nombre.length(); i++) {
            if ((nombre.charAt(i) < 60 || nombre.charAt(i) > 100 && nombre.charAt(i) < 97 || nombre.charAt(i) > 122) && nombre.charAt(i) != 32) {
                si = false;
               
            }
        }
        if(si){
            if(nombre.contains(" ")){
                
                this.nombre = nombre;
            }else{
                throw  new ValidacionNombresIncompletos();
            }
        }else{
            throw  new ValidacionDeNombres();
        }
        
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) throws ValidacionNombresIncompletos, ValidacionDeNombres {
        boolean si = true;
        for (int i = 0; i < apellido.length(); i++) {
            if ((apellido.charAt(i) < 60 || apellido.charAt(i) > 100 && apellido.charAt(i) < 97 || apellido.charAt(i) > 122) && apellido.charAt(i) != 32) {
                si = false;
               
            }
        }
        if(si){
            if(apellido.contains(" ")){
                
                this.apellido = apellido;
            }else{
                throw  new ValidacionNombresIncompletos();
            }
        }else{
            throw  new ValidacionDeNombres();
        }
    
    } 
    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws Exception {
          if(edad >= 19 && edad<=35){
            this.edad = edad;
        }else{
            throw new Exception("La edad debe estar comprendida entre 20 y 35 años");
        }
        
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Persona(String cedula, String nombre, String apellido, int edad, Date fecha, String celular, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.fecha = fecha;
        this.celular = celular;
        this.salario = salario;
    }

 
        
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular ) throws ValidacionDeCelular {
        if(celular.length() == 10){
            
            this.celular = celular;
            
        }else{
            
            throw new ValidacionDeCelular();
            
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws ValidacionSueldo {
        if(salario != 0){
            
            this.salario = salario;
            
        }else{
            
            throw new ValidacionSueldo();
            
        }
        
    }
    }
        
    

