/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplostatic;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private int idPersona;
    private static int contadorPersona;
    
    Persona(String nombre){
        contadorPersona++;
        idPersona = contadorPersona;
        this.nombre = nombre;
    }
    
    public String toString(){
        return "Persona{idPersona: " + idPersona + ", nombre: " + nombre + "}";
    }
    
    public static int getContadorPersonas(){
        return contadorPersona;
    }
}
