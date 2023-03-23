
package guia5clase9y11ejercicio1;

/**
 * Realice un programa que compruebe si una matriz dada es antisimétrica.
 * Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia
 * traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando 
 * sus filas por columnas (o viceversa).

 */
public class Guia5clase9y11ejercicio5 {
     public static void main(String[] args) {
         int[][] matriz = { {0, -2,4}, {2, 0, 2}, {-4, -2, 0} };
         mostrar(matriz);
         matriz=matrizAntisimetrica(matriz);
         System.out.println("-----------------");
         matriz=traspuesta(matriz);
         mostrar(matriz);
     }
     //transpuesta
     public static int[][] traspuesta(int[][]matriz)
     {int[][] matrizt=new int[3][3];
        for (int i=0;i<3;i++)
        {for(int j=0;j<3;j++)
        {
           matrizt[j][i]=matriz[i][j];      
        }
        }
        return matrizt;
     }
     
     
     //matrizantisimetrica
   public static int[][] matrizAntisimetrica(int[][] matrizSimetrica) {
        int n = matrizSimetrica.length;
        int[][] matrizAntisimetrica = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrizAntisimetrica[i][j] = -matrizSimetrica[j][i];
            }
            matrizAntisimetrica[i][i] = 0;
        }
        return matrizAntisimetrica;
    }
     //mostrar matriz
     public static void mostrar(int matriz[][])
     { System.out.println("--Matriz--");
       for(int i=0;i<3;i++)
       {  for(int j=0;j<3;j++)
          { System.out.print("["+matriz[i][j]+"]");
          }
           System.out.println("");
       }  
     }
}
