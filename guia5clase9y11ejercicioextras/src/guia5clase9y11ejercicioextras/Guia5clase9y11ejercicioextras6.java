
package guia5clase9y11ejercicioextras;

import java.util.Random;
import java.util.Scanner;

/**
 * Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y,
 * a medida que el usuario las va ingresando, construya una “sopa de letras
 * para niños” de tamaño de 20 x 20 caracteres. Las palabras se ubicarán todas
 * en orden horizontal en una fila que será seleccionada de manera aleatoria. 
 * Una vez concluida la ubicación de las palabras, rellene los espacios no 
 * utilizados con un número aleatorio del 0 al 9. Finalmente imprima por 
 * pantalla la sopa de letras creada.
 */
public class Guia5clase9y11ejercicioextras6 {
     public static void main(String[] args) {
        String sopa [][]=new String[20][20];
        sopa = cargarpalabra(sopa);
        sopa=completar(sopa);
        mostrar(sopa);
     }
     //mostrar sopa
     public static void mostrar(String[][] matriz)
     {  for(int i=0;i<20;i++)
        {for (int j=0;j<20;j++)
            {System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
     }
     
     
     //cargar con numeros
     public static String[][]completar(String[][] matriz)
     { Random aleatorio= new Random();
        for (int i=0;i<20;i++)
        {   for(int j=0;j<20;j++)
            { if (matriz[i][j]==null)
                matriz[i][j]=String.valueOf(aleatorio.nextInt(10));
                
            }
        }
         
     return matriz;
     }
     
     //cargar matriz
     public static String[][]cargarpalabra(String[][] matriz)
     {   Random aleatorio=new Random();
         Scanner leer= new Scanner(System.in);
         for (int i=0;i<5;i++)
         {
         System.out.println("ingrese palabra de 3 a 5 letras");
         String palabra=leer.next();
         
         while(palabra.length()<3 || palabra.length()>5)
         {System.out.println("palabra incorrecta");
             System.out.println("ingrese palabra de 3 a 5 letras");
             palabra=leer.next();
         }
         int fila=aleatorio.nextInt(20);
         int columna=aleatorio.nextInt(10);
         matriz[fila][columna]=palabra;
         }
         
     return matriz;
     }
}
