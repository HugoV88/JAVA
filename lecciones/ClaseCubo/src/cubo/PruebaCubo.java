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
public class PruebaCubo {
    public static void main(String[] args) {
        //Variables locales
        int a = 3;
        int b = 2;
        int c = 6;
        
        //Creamos el objeto de la clase cubo para probar
        Cubo cubo = new Cubo(a, b, c);
        
        //Imprimir operandos
        System.out.println("Calcular el volumen de un cubo con el ancho = " + a + ", altura = " + b + " y profundidad = " + c);
        System.out.println("El volumen es: " + cubo.calcVol());
    }
    
}
