/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargametodos;

/**
 *
 * @author USUARIO
 */
public class SobrecargaMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Resultado 1: " + Operaciones.sumar(3, 2));

        System.out.println("Resultado 1: " + Operaciones.sumar(3.2, 2));

        System.out.println("Resultado 1: " + Operaciones.sumar(3.5, 2.3));

        System.out.println("Resultado 1: " + Operaciones.sumar(3, 2.2));
        
        System.out.println("Resultado 1: " + Operaciones.sumar(3, 1L));
        
        System.out.println("Resultado 1: " + Operaciones.sumar(3F, 'B'));
    }
    
}
