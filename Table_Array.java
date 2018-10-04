/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package table_array;

/**
 *
 * @author mikemarquez
 */
import java.util.Random;

public class Table_Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int bets = random.nextInt(10) + 1;
        
        //Crear array de dos dimensiones 
        int[][] numbers = new int[bets][6];
        //Recorrer array de dos dimensiones
        //Almacenando un valor de cada posición
        System.out.println("Apuestas: " + numbers.length);
        for (int i = 0; i < numbers.length; i++){
            for (int j = 0; j < numbers[i].length; j++ ){
                numbers[i][j] = random.nextInt(49) + 1;
            }
        }
        //Recorrer array de dos dimensiones
        //Accedienco a cada decisión
        for (int[] bet : numbers ){
            for (int number : bet) {
                System.out.println(number + "\t");
            }
            System.out.println();
        }
    }
    
}
