/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabranull;

/**
 *
 * @author USUARIO
 */
public class PalabraNull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Juan");
        Persona p2 = p1;
        p1 = null;
        
        System.out.println("El nombre de la persona p2 es: " + p2.obtenerNombre());
        
        if (p1 != null) {
            System.out.println("El nombre de la persona p1 es: " + p1.obtenerNombre());
        }
    }
    
}
class Persona {
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
    }
    
    public String obtenerNombre() {
        return this.nombre;
    }
}
