
package guia5clase9y11ejercicioextras;

import java.util.Scanner;

/**
* Escriba un programa que averigüe si dos vectores de N enteros son iguales
* (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre
* los elementos)
 */
public class Guia5clase9y11ejercicioextras2 {
     public static void main(String[] args) {
         Scanner leer=new Scanner(System.in);
         int[] vector1=new int[5];
         int[] vector2={1,2,3,4,5};
         for(int i=0;i<5;i++)
         {System.out.println("ingrese un valor en posicion n°"+(i+1)+"de su vector");
         vector1[i]=leer.nextInt();
         }
        compara(vector1,vector2); 
     }
     
     public static void compara(int [] vector,int[] vector2 )
     {
         for(int i=0;i<5;i++)
         {  if(vector[i]!=vector2[i])
          {  System.out.println("los numero no coinciden");
             System.exit(0);
          }   
         }System.out.println("--todos los numeros del vector son iguales--");
     }
}
