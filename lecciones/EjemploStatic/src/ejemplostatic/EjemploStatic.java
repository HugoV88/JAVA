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
public class EjemploStatic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Juan");
        System.out.println("Persona p1: " + p1);
        
        Persona p2 = new Persona("Karen");
        System.out.println("Persona p2: " + p2);
        
        System.out.println("Número de personas: " + Persona.getContadorPersonas());
    }
    
}
