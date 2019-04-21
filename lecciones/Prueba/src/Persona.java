/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Persona {
    private static int contador;
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(String nombre, String apellido, int edad) {
        contador++;
        id = contador;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    @Override
    public String toString(){
        return "Persona{id: " + getId() + ", nombre: " + getNombre() + ", apellido: " + getApellido() + ", edad: " + getEdad() + "}"; 
    }
}
