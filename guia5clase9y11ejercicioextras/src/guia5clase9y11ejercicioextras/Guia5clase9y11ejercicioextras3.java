
package guia5clase9y11ejercicioextras;

import java.util.Random;
import java.util.Scanner;

/**
 Crear una función rellene un vector con números aleatorios, pasándole un
 * arreglo por parámetro. Después haremos otra función o procedimiento que 
 * imprima el vector.
 */
public class Guia5clase9y11ejercicioextras3 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese tamaño de matriz");
        int tamaño=leer.nextInt();
        int[][]matriz= new int[tamaño][tamaño]; 
        matriz=cargar(matriz);
       mostrar(matriz);
    }
    public static void mostrar(int[][]matriz)
    { int t=matriz.length;
    for (int i=0;i<t;i++)
    {for(int j=0;j<t;j++)
    {System.out.print("{"+matriz[i][j]+"]");
    }
        System.out.println("");
    }
    
    }
    
    public static int[][] cargar(int[][] matriz)      
    { Random aleatorio=new Random();
    int tamaño=matriz.length;
    for(int i=0;i<tamaño;i++)
    { for(int j=0;j<tamaño;j++)
    { matriz[i][j]=aleatorio.nextInt(10);
    }
    }    
    return matriz;
    }
    
}
