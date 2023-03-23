
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 * Por ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular 
 * su equivalente: 1 día, 2 horas.
 */
public class Guia3calse456ejercicioextra1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
      int tiempo,horas,dias;
        System.out.println("ingrese tiempo en minutos");
        tiempo=leer.nextInt();
        dias=(tiempo/1440);
        horas=(tiempo%1440)/60;
        System.out.println("el equivalente es "+dias+ " dias " + horas +" horas " );
        
        
    }
    
}
