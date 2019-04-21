/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre;
    private String apellido;
    private boolean estado;
    
    Persona(){}
    
    Persona(String nombre, String apellido, Boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public boolean isBorrado() {
        return estado;
    }
    
    public void setBorrado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", apellido = " + apellido + ", estado = " + estado + "}";
    }
}
