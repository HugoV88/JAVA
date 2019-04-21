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
    //Creamos un objeto de la clase Aritmetica con el constructor vacío
    Aritmetica obj1 = new Aritmetica();
    
    //Llamamos el método a usar y recibimos el valor devuelto
    int resultado = obj1.sumar(5, 3);
    
    //Se imprime normalmente la suma
    System.out.println("Resultado de la suma directa obj1 desde la variable: " + resultado);
    
    //Si llamamos directamente al método sumar sin argumentos
    //el valor es cero, y que los atributos del objeto nunca se
    //inicializaron porque no se usó el constructor con argumentos,
    //sino el constructor vacío.
    System.out.println("Resultado de la suma atributos sin argumentos obj1: " + obj1.sumar());
    //Agregandole argumentos al método si nos regresará valor
    System.out.println("Resultado de la suma atributos con argumentos obj1: " + obj1.sumar(3,3));
    
    //Ahora creamos un objeto con el constructor con dos argumentos
    Aritmetica obj2 = new Aritmetica(3,1);
    
    //Imprimimos directamente el resultado
    //Al llamar directamente el método suma nos regresa el valor de la suma
    System.out.println("\nResultado de la suma con el constructor con argumentos: " + obj2.sumar());
    
    }
}
