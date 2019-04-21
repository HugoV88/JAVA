/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cubo;

/**
 *
 * @author USUARIO
 */
public class CuboPrueba {
    
    public static void main(String[] args) {
        int a = 3, b = 6, c = 2;

        Cubo cubito01 = new Cubo(a, b, c);

        System.out.println("El volumen del cubo con constructor lleno es de: " + cubito01.volumen());
        
        Cubo cubito02 = new Cubo();
        
        int resultado = cubito02.volumen(a, b, c);
        
        System.out.println("El volumen del cubo con constructor vacío es de: " + resultado);
    }
}
