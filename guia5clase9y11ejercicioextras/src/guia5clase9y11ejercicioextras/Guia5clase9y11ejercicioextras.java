
package guia5clase9y11ejercicioextras;

import java.util.Scanner;

/**
 * Realizar un algoritmo que calcule la suma de todos los elementos de un vector
 * de tamaño N, con los valores ingresados por el usuario.
 */
public class Guia5clase9y11ejercicioextras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese tamaño de vector");
        int tamaño= leer.nextInt();
        int[] vector= new int[tamaño];
        int suma=0;
        for (int i=0;i<tamaño;i++)
        {
         System.out.println("ingrese un  n° en la posicion "+(i+1)+(" de su vector"));
         
          vector[i]=leer.nextInt();
          suma =(suma+vector[i]);
          
        }
        System.out.println("la suma de todos los valores ingresados en el vector es "+suma);
        
      
        
        
    }
    
}
