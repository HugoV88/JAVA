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
    int a, b, c;
    
    Cubo(){}
    
    int volumen(int a, int b, int c) {
        return a * b * c;
    }
    
    Cubo(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    int volumen(){
        return a * b * c;
    }
    
    
}
