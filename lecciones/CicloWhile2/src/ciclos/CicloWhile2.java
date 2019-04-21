/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

    import java.util.Scanner;
/**
 *
 * @author USUARIO
 */
public class CicloWhile2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Por favor introduce el número de elementos a iterar");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in); //Creación del objeto Scanner para leer datos
        maxElementos = entradaEscaner.nextInt(); // Leemos el valor proporcionado por el usuario
        int contador = 0;
        
        while (contador <= maxElementos) {
            System.out.println("El contador introducido por el usuario es: " + contador);
            contador++;
        }
    }
    
}
