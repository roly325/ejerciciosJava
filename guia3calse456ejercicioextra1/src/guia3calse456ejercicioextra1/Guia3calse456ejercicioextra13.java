
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 *Crear un programa que dibuje una escalera de números, donde cada línea de
 * números comience en uno y termine en el número de la línea. Solicitar la 
 * altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el
 * número 3:
 */
public class Guia3calse456ejercicioextra13 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño de escalera");
        int tamaño = leer.nextInt();
        
        for (int i=1; i  <= tamaño ;i++ )
        {for(int j=1; j<=i;j++ ){
            System.out.print(j);
        
        }
            System.out.println("");
        }
        
        
    }
}
