
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
+Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
* diferente a cada una. A continuación, realizar las instrucciones necesarias 
* para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
* tome el valor de B. Mostrar los valores iniciales y los valores finales de cada
* variable. Utilizar sólo una variable auxiliar.
 */
public class Guia3calse456ejercicioextra2 {
     public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
     int a=1,b=2,c=3,d=4,aux;
     
         System.out.println("variable a = "+a);
         System.out.println("variable b = "+b);
         System.out.println("variable c = "+c);
         System.out.println("variable d = "+d);
         System.out.println("---------------");
         System.out.println("var.modificadas");
         aux=a;
         a=d;
         d=b;
         b=c;
         c=aux;
         System.out.println("variable a = "+a);
         System.out.println("variable b = "+b);
         System.out.println("variable c = "+c);
         System.out.println("variable d = "+d);
         System.out.println("---------------");
     }
}
