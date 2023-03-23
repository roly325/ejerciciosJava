
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 + Una obra social tiene tres clases de socios:
 * Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento
 * en todos los tipos de tratamientos.
 * Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
 * para los mismos tratamientos que los socios del tipo A.
 * Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
 * dichos tratamientos.
 * Solicite una letra (carácter) que representa la clase de un socio, y luego 
 * un valor real que represente el costo del tratamiento (previo al descuento) 
 * y determine el importe en efectivo a pagar por dicho socio.

 */
public class Guia3calse456ejercicioextra5 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    String letra = "";
    while(!letra.equalsIgnoreCase("F")){
        System.out.println("----------------------------");
        System.out.println("---  Elija su categoria  ---");
        System.out.println("---      Categoria A     ---");
        System.out.println("---      Categoria B     ---");
        System.out.println("---      Categoria C     ---");
        System.out.println("---                      ---");
        System.out.println("----------------------------");
        System.out.println("---  Ingrese una opcion  ---");
        letra = leer.next();
        while (!letra.equalsIgnoreCase("A")&&!letra.equalsIgnoreCase("B")&&!letra.equalsIgnoreCase("C"))
       {
          System.out.println("---  opcion incorrecta ---");
          System.out.println("   ingrese opcion valida  ");
          letra=leer.next();
        }  
        System.out.println("ingrese el monto de su tratamiento");
        int monto=leer.nextInt();
        while (monto<0)
       {
          System.out.println("monto incorrecto");
          System.out.println("ingrese monto total de su tratamiento");
          monto=leer.nextInt();
        }
        switch(letra.toUpperCase())
        {
          case "A":System.out.println(" Su categoria es -A- ");
                   System.out.println(" Usted tiene un descuento del 50%: ");
                   System.out.println("--------------------------------");
                   System.out.println("--total del tratamiento: $"+monto+"--");
                   System.out.println("--con el descuento monto a pagar: $"+(monto-((monto*50)/100)));
          break;   
          case "B":System.out.println(" Su categoria es -B- ");
                   System.out.println(" Usted tiene un descuento del 35%: ");
                   System.out.println("--------------------------------");
                   System.out.println("--total del tratamiento: $"+monto+"--");
                   System.out.println("--con el descuento monto a pagar: $"+(monto-((monto*35)/100)));
          break; 
          case "C":System.out.println(" Su categoria es -C- ");
                   System.out.println(" Usted no tiene ningun descuento disponible!");
                   System.out.println("--------------------------------");
                   System.out.println("--total del tratamiento: $"+monto+"--");
          break; 
        }
        System.out.println("   para finalizar presione F ");
        System.out.println("para continuar presione cualquier tecla");
         letra=leer.next();
        if(letra.equalsIgnoreCase("F")){
             System.out.println("finalizado");
        }
        else{
        letra="";
        }
    }
}
}