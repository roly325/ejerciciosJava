
package guia4clase78ejercicioteoria;

import java.util.Scanner;

/**

  Crea una aplicación que a través de una función nos convierta una cantidad
  * de euros introducida por teclado a otra moneda, estas pueden ser a dólares, 
  * yenes o libras. La función tendrá como parámetros, la cantidad de euros y 
  * la moneda a convertir que será una cadena, este no devolverá ningún valor 
  * y mostrará un mensaje indicando el cambio 
 */
public class Guia4clase78ejercicio3 {
     public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
       System.out.println("ingrese cantidad de euros");
       int euro=leer.nextInt();
        cambiodivisas(euro); 
               
     }
     
     
     
     
     
     
     
     
     
     
     
     
     
   public static void cambiodivisas (int euro){
     double libras, dolares, yanes,pesos;
   dolares=(euro*1.07);
   libras=(euro*0.87);
   yanes=(euro*140.99);
   pesos=(euro*412);
       System.out.println("sus euros en Dolares son $: "+dolares);
       System.out.println("sus euros en Libras son $: "+libras);
       System.out.println("sus euros en yanes son $: "+yanes);
       System.out.println("sus euros en pesos argentinos son $ :"+pesos);
   
   }  
}
