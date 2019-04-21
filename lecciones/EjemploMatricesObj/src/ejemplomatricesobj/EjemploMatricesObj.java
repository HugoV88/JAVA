/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatricesobj;

import persona.Persona;
/**
 *
 * @author USUARIO
 */
public class EjemploMatricesObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona("Daniel");
        Persona p2 = new Persona("Cesar");
        Persona p3 = new Persona("Orlando");
        Persona p4 = new Persona("Keith");
        Persona p5 = new Persona("Jesus");
        Persona p6 = new Persona("Antonio");
        
        Persona[][] pt = {{p1, p2}, {p3, p4}, {p5, p6}};
        
        for (int i = 0; i < pt.length; i++){
            for (int j = 0; j < pt[i].length; j++){
                System.out.println("Matriz [" + i + "][" + j + "] = " + pt[i][j]);
            }
        }
        System.out.println("En total hay " + Persona.contador + " personas");
    }
    
}
