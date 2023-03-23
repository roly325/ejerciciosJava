
package guia4clase78ejercicioteoria;

import java.util.Scanner;

/**
* Crea un procedimiento EsMultiplo que reciba los dos números pasados por el
* usuario, validando que el primer número múltiplo del segundo e imprima si
* el primer número es múltiplo del segundo, sino informe que no lo son.
 */
public class Guia4clase78ejercicioteoriaprocedimiento {
     public static void main(String[] args) {
  
     procedimiento();
         
     }
    
     
     
  
     public static void procedimiento(){
        Scanner leer = new Scanner(System.in);
         System.out.println("ingrese un numero");
         int num1=leer.nextInt();
         System.out.println("ingrese  otro numero");
         int num2=leer.nextInt();
         if (num1%num2==0){
             System.out.println("el numero "+num1+" es multiplo de "+num2);
         }
         else{
             System.out.println("el numero "+num1+" No es multiplo de "+num2);
         }
     
     }
     
     
     
     
}

