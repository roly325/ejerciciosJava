
package guia5clase9y11ejercicioextras;

import java.util.Random;
import java.util.Scanner;

/**
 *Realizar un programa que llene una matriz de tamaño NxM con valores 
 * aleatorios y muestre la suma de sus elementos.
 */
public class Guia5clase9y11ejercicioextras5 {
      public static void main(String[] args) {
          Scanner leer=new Scanner(System.in);
          System.out.println("ingrese cantidad de filas de matriz");
          int filas=leer.nextInt();
          System.out.println("ingrese cantidad de columnas de matriz");
          int columnas=leer.nextInt();
          int[][] matriz= new int[filas][columnas];
          cargar(matriz);
          
          
          
      }
      //cargar matriz
      public static int[][]cargar(int[][] matriz)
      { Random aleatorio= new Random();
       int f = matriz.length;
        int c = matriz[0].length;
          for (int i=0;i<f;i++)
          { for(int j=0;j<0;j++)
             { 
                 matriz[i][j]=aleatorio.nextInt(10);
             }
          }
          
          
      return matriz;
      
      }
}
