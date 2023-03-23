
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
* cantidad de hijos. Escriba un programa que pida la cantidad de familias y 
* para cada familia la cantidad de hijos para averiguar la media de edad de los 
* hijos de todas las familias
 */
public class Guia3calse456ejercicioextra14 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de familias");
        int familia=leer.nextInt();
        for (int i=1; i<=familia;i++){
            System.out.println("ingrese cantidad de hijos familia n°: "+i);
             int cantidad=leer.nextInt();
             int suma=0;
             double promedio=0;
             for(int j=1; j<=cantidad;j++){
                 System.out.println("ingrese edades");
                 int edad=leer.nextInt();
                 suma=suma+edad;
                 promedio=suma/cantidad;
                 
             }
             System.out.println("el promedio de edad de los hijos de la familia n°"+i+"es"+promedio);
        
        
        }
                
        
        
        
        
    }
    
    
}
