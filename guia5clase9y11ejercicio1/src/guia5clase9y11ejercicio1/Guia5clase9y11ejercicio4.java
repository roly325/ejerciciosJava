
package guia5clase9y11ejercicio1;

import java.util.Random;

/**
 * Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
 * se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Guia5clase9y11ejercicio4 {
     public static void main(String[] args) {
         int matriz[][]=new int[4][4];
         Random aleatorio= new Random();
         for (int i=0;i<4;i++)   
         {for(int j=0;j<4;j++)
         {matriz[i][j]=aleatorio.nextInt(10);
         }
         }
          for (int i=0;i<4;i++)   
         {for(int j=0;j<4;j++)
         {
             System.out.print("["+matriz[i][j]+"]");
         }
             System.out.println("");
         }
         
          int matrizTra[][]=new int[4][4];
         
         for (int i = 0; i < 4; i++) {
             for (int j = 0; j < 4; j++) {
                 matrizTra[j][i] = matriz[i][j];
             }
         }
         System.out.println("--------------------------------------------");
               for (int i=0;i<4;i++)   
         {for(int j=0;j<4;j++)
         {
             System.out.print("["+matrizTra[i][j]+"]");
         }
             System.out.println("");
         }
         
         
     }
}
