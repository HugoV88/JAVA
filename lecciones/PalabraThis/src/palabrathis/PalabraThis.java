/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrathis;

/**
 *
 * @author USUARIO
 */
public class PalabraThis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p = new Persona("Juan");
    }
    
}

class Persona {
    String nombre;
    
    Persona(String nombre){
        this.nombre = nombre;
    
        Imprimir i = new Imprimir();
        i.imprimir(this);
    }
    
}

class Imprimir {
    public void imprimir(Object o) {
        System.out.println("Imprimir el parámetro o: " + o);
        System.out.println("Imprimir el objecto actual con this: " + this);
    }
}
