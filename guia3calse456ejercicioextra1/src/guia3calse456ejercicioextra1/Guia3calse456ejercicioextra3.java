
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata
 * de una vocal. Caso contrario mostrar un mensaje. Nota: investigar la función
 * equals() de la clase String.
 */
public class Guia3calse456ejercicioextra3 {
     public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
         System.out.println("ingrese  una letra");
  
         String letra = leer.next();
          
        
         if (letra.equalsIgnoreCase("a")||letra.equalsIgnoreCase("e")||letra.equalsIgnoreCase("i")||letra.equalsIgnoreCase("o")||letra.equalsIgnoreCase("u") )
         {
         System.out.println("la letra ingresada " +letra+  " es una vocal");
         }
         else {System.out.println("la letra ingresada " +letra+ " no es vocal");}
     
     }   
}
