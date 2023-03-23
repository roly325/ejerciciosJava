
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 * Escriba un programa que lea números enteros. Si el número es múltiplo de
 * cinco debe detener la lectura y mostrar la cantidad de números leídos, la 
 * cantidad de números pares y la cantidad de números impares. Al igual que en 
 * el ejercicio anterior los números negativos no deben sumarse. Nota: recordar
 * el uso de la sentencia break.
 */
public class Guia3calse456ejercicioextra8 {
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    int num,contador=0,pares=0,impares=0,negativo=0;
        do{
        System.out.println("ingrese un numero");
        num=leer.nextInt();
           if (num < 0) { // verificar si el número es negativo
                negativo++;
             continue; // saltar a la siguiente iteración
            }
        
        contador++;
        if(num%2==0){
            pares++;
        }
        else {
          impares++;
        }
        if (num % 5 == 0) { // verificar si el número es múltiplo de 5
                break; // salir del ciclo
            }
        
        }while(true);
        System.out.println("cantidad de numeros leidos"+contador);
        System.out.println("cantidad de numeros pares"+pares);
        System.out.println("cantidad de numeros impares"+impares);
        System.out.println("cantidad de numeros negativos"+negativo);
        
    }
}
