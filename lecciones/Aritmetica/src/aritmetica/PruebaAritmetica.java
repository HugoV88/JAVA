/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetica;
/**
 *
 * @author USUARIO
 */
public class PruebaAritmetica {
    public static void main(String args[]) {
    //Creamos un objeto de la clase Aritmetica
    Aritmetica a = new Aritmetica();
    
    //Llamamos el método a usar y recibimos el valor devuelto
    int resultado = a.sumar(5, 3);
    
    System.out.println("Resultado: " + resultado);
    }
}
