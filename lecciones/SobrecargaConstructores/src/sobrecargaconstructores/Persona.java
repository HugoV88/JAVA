/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaconstructores;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private static int contador;
    private int idPersona;
    private String nombre;
    private int edad;
    
    private Persona(){
        idPersona = ++contador;
    }
    
    public Persona(String nombre, int edad){
        this();
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Persona{" + "idPersona: " + idPersona + ", nombre: " + nombre + ", edad: " + edad + "} ";
    }
    
}
