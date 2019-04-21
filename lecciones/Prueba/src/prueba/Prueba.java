/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import persona.Persona;
/**
 *
 * @author USUARIO
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Hugo", "Vargas", 30);
        System.out.println(p1);
        
        Persona p2 = new Persona("Mairelys", "Rondon", 29);
        System.out.println(p2);
        
        
        Persona p3 = new Persona("Elsa", "Celis", 15);
        System.out.println(p3);
        
        
        System.out.println(Persona.getNPersonas());
        
        Persona[] pt = new Persona[3];
        
        pt[0] = p3;
        pt[1] = p2;
        pt[2] = p1;
        
        for (int i = 0; i <= pt.length - 1; i++) {
            System.out.println(pt[i]);
        }
    }
    
}
