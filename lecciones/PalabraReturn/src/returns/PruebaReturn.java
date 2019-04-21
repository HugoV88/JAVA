/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package returns;

/**
 *
 * @author USUARIO
 */
public class PruebaReturn {
    public static void main(String[] args ) {
        int resultado = suma(0, 0);
        System.out.println("La suma es: " + resultado);
    }
    
    public static int suma(int a, int b) {
        if (a == 0 && b == 0) {
            System.out.println("Puede proporcionar valores diferentes de cero");
            return 0;
        }
        return a + b;
    }
}
