/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobrecargaconstructores;

/**
 *
 * @author USUARIO
 */
public class SobrecargaConstructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado e1 = new Empleado("María", 25, 15000);
        System.out.println("Imprimir objeto e1:");
        System.out.println(e1);
        
        Empleado e2 = new Empleado("Juan", 30, 20000);
        System.out.println("Imprimir objeto: e2");
        System.out.println(e2);
    }    
}
