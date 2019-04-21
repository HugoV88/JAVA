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
public class PersonaPrueba {
    public static void main(String[] args) {
        //Creación de un Objeto
        Persona p1 = new Persona();
        
        //Llamado a un método del onjeto creado
        System.out.println("Valores por default del objeto Persona");
        p1.desplegarNombre();
        
        //Modificando valores
        p1.nombre = "Hugo";
        p1.apellidoPaterno = "Vargas";
        p1.apellidoMaterno = "Celis";
        
        //Volvemos a llamar al método
        System.out.println("\nNuevos Valores del Objeto Persona 1:");
        p1.desplegarNombre();
        
        Persona p2 = new Persona();
        
        p2.nombre = "Mairelys";
        p2.apellidoPaterno = "Rondon";
        p2.apellidoMaterno = "Mota";
        
        System.out.println("\nValores del Objeto Persona 2: ");
        p2.desplegarNombre();
    }
    
}
