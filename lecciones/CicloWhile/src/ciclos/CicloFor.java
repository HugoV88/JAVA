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
public class CicloFor {
    public static void main(String[] args) {
        System.out.println("Por favor introduce el número de elementos a iterar");
        int maxElementos;
        Scanner entradaEscaner = new Scanner(System.in);
        maxElementos = entradaEscaner.nextInt();
        
        for (int contador = 1; contador <= maxElementos; contador++) {
            System.out.println("El contador es " + contador);
        }
    }
    
}
