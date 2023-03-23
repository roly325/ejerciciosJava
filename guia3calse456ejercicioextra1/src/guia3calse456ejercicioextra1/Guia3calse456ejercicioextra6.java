
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
  + Leer la altura de N personas y determinar el promedio de estaturas
  * que se encuentran por debajo de 1.60 mts. y el promedio de estaturas
  * en general.
 */
public class Guia3calse456ejercicioextra6 {
     public static void main(String[] args) {
     Scanner leer= new Scanner(System.in);
         System.out.println("ingrese cantidad de personas");
         int cantidad=leer.nextInt();
         double promedio=0,suma=0,altura;
         int contador= 0;
         	for (int i = 0; i < cantidad; i++){
                    System.out.println("ingrese altura de la persona n° "+(i+1));
                    altura=leer.nextDouble();
                    suma=suma+altura;
                    if (altura<1.60){
                    contador=contador+1;
                    
                    }
                }  
                promedio=(suma/cantidad);
                System.out.println("hay "+contador+" personas por debajo del promedio 1.60mts. ");
                System.out.println("el promedio total de todas las persona es "+promedio+"mts");
    }
  }
     

