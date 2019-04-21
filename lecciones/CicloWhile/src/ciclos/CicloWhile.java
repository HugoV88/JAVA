/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclos;

/**
 *
 * @author USUARIO
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador = 0;
        int limite = 10;
        
        while (contador <= limite) {
            if (contador % 2 == 0) {
                System.out.println("Contador de números pares: " + contador);
            } else {
                System.out.println("Contador de números impares: " + contador);
            }
            contador++;
        }
    }
    
}
