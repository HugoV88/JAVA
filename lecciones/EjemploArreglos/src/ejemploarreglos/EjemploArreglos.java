/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarreglos;

import com.gm.dominio.arreglos.Persona;
/**
 *
 * @author USUARIO
 */
public class EjemploArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] edades;
        
        edades = new int[3];
        
        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
        
        //Imprimimos los índices
        System.out.println("El índice cero del arreglo edades es: " + edades[0]);
        System.out.println("El índice uno del arreglo edades es: " + edades[1]);
        System.out.println("El índice dos del arreglo edades es: " + edades[2]);
        
        Persona[] p1;
        
        p1 = new Persona[3];
        
        p1[0] = new Persona("Juan");
        p1[1] = new Persona("María");
        p1[2] = new Persona("Miguel");
        
        System.out.println("\n");
        System.out.println("El índice cero del arreglo p1 es: " + p1[0]);
        System.out.println("El índice uno del arreglo p1 es: " + p1[1]);
        System.out.println("El índice dos del arreglo p1 es: " + p1[2]);
        System.out.println("\n");
      
        String[] s1 = {"Juan", "Maria", "Miguel"};
        
        for (int i = 0; i < s1.length; i++) {
            System.out.println("El índice " + i + " del arreglo s1 es: " + s1[i]);
        }
    }
    
}
