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
public class Aritmetica {
    //Atributos de la clase
    int a;
    int b;
    
    //Constructor vacío
    //Recordar que si agregamos un constructor distinto que vacío
    //ya no se crea este constructor y debemos crearlo si lo necesitamos
    Aritmetica(){}
    
    //Constructor con dos argumentos
    Aritmetica(int a, int b) {
        //Uso del operador this
        this.a = a;
        this.b = b;
    }
    
    //Estos métodos utilizan los atributos de la clase para operar
    int sumar() {
        return a + b;
    }
    
    int restar() {
        return a - b;
    }
    
    int multi() {
        return a*b;
    }
    
    int divi() {
        return a/b;
    }
}
