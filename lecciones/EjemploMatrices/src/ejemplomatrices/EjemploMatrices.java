/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomatrices;

/**
 *
 * @author USUARIO
 */
public class EjemploMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[][] nombres = {{"juan", "maria", "jose"}, {"daniel", "cesar", "orlando"}};
        
        System.out.println("El largo del renglon es: " + nombres.length);
        System.out.println("El largo de la columna es " + nombres[0].length);
        
        for (int i = 0; i < nombres.length; i++){
            for (int j = 0; j < nombres[i].length; j++){
                System.out.println("Matriz [" + i + "][" + j + "] = " + nombres[i][j]);
            }
        }
        
    }
    
}
