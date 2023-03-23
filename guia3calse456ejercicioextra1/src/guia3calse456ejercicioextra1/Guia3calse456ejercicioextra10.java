
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 Realice un programa para que el usuario adivine el resultado de una
 * multiplicación entre dos números generados aleatoriamente entre 0 y 10. 
 * El programa debe indicar al usuario si su respuesta es o no correcta. 
 * En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar
 * su respuesta nuevamente. Para realizar este ejercicio investigue como 
 * utilizar la función Math.random() de Java.
 */
public class Guia3calse456ejercicioextra10 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num1 = (int) (Math.random() * 11);
    int num2 = (int) (Math.random() * 11);
    
        System.out.println(" puedes adivinar la multplicacion de dos numeros ");
        System.out.println(num1+"*"+num2+"="+"X?");
        System.out.println("ingrese una respuesta");
        int respuesta=leer.nextInt();
        do{
            if (respuesta==(num1*num2))
            {System.out.println("felicidades adivinaste");}
            else{
               if(respuesta>(num1*num2)){
                   System.out.println("la respuesta es incorrrecta");
                   System.out.println("debe se un numero menor");
                   System.out.println("ingrese respuesta");
                   respuesta=leer.nextInt();
               }
               else{
                System.out.println("la respuesta es incorrrecta");
                   System.out.println("debe se un numero mayor");
                   System.out.println("ingrese respuesta");
                   respuesta=leer.nextInt();
               }
                
            }
            
        }while(respuesta!=(num1*num2));
        System.out.println("felicidades ganaste");
        
    }
    
}
