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
public class Cubo {
    //Atributos de la clase
    int a, b, c;
    
    //Constructor sin argumentos
    Cubo(){}
    
    //Constructor con tres argumentos
    Cubo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    //Método para calcular el volumen
    int calcVol(){
        return a * b * c;
    }
}
