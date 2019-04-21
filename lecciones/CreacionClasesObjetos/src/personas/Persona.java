/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personas;


/**
 *
 * @author USUARIO
 */
public class Persona {
    //Atributos de una clase
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    
    //Métodos de la clase
    //Lo utilizarán los objetos de esta clase
    public void desplegarNombre() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido Paterno: " + apellidoPaterno);
        System.out.println("Apellido Materno: " + apellidoMaterno);
    }
}
