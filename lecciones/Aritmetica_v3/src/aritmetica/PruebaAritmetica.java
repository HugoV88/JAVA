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
        //Variables locales
        int operandoA = 6;
        int operandoB = 2;
        
        //Creamos un objeto de la clase aritmetica y le damos los argumentos
        Aritmetica obj1 = new Aritmetica(operandoA, operandoB);
        
        //Imprimir operandos
        System.out.println("Operando A = " + operandoA + " y Operando B = " + operandoB);
        
        //Resultado de la suma
        System.out.println("\n" + operandoA + " + " + operandoB + " = " + obj1.sumar());
        
        //Resultado de la resta
        System.out.println("\n" + operandoA + " - " + operandoB + " = " + obj1.restar());
        
        //Resultado de la multiplicación
        System.out.println("\n" + operandoA + " * " + operandoB + " = " + obj1.multi());
        
        //Resultado de la división
        System.out.println("\n" + operandoA + " / " + operandoB + " = " + obj1.divi());
        
        //Si se sale de este método y se trata de acceder a las variables, no
        //se podrán utilizar ya que las variables solo estan en este scope.
    }
}
