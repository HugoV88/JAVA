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
public class Operaciones {
    public static int sumar(int a, int b){
        return a + b;
    }
    
    public static double sumar(double a, double b){
        return a + b;
    }
    
    public static double sumar(double a, int b) {
        return a + b;
    }
    
    public static double sumar(int a, double b) {
        return a + b;
    }
}
