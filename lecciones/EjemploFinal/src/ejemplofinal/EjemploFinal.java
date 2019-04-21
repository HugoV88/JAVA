/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofinal;

/**
 *
 * @author USUARIO
 */
public class EjemploFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Marca error la siguiente línea porque no se puede modificar la variable final
        // ClaseFinal.varPrimitivo = 15;
        
        System.out.println("Nombre Persona: " + ClaseFinal.persona.getNombre());
        
        ClaseFinal.persona.setNombre("Juan");
        
        System.out.println("Nombre Persona: " + ClaseFinal.persona.getNombre());
    }
    
}
