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
public class PalabraReturnObject {
    public static void main(String[] args ) {
        Suma s = crearObjeto();
        int resultado = s.a + s.b;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public static Suma crearObjeto() {
        Suma s = new Suma(3, 4);
        return s;
    }
}
class Suma {
    int a, b;
    
    Suma(int a, int b) {
        this.a = a;
        this.b = b;
    }
}