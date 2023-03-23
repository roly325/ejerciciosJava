
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
 * Realice un programa que calcule y visualice el valor máximo, el valor mínimo 
 * y el promedio de n números (n>0). El valor de n se solicitará al principio 
 * del programa y los números serán introducidos por el usuario. Realice dos 
 * versiones del programa, una usando el bucle “while” y otra con el bucle “do 
 * - while”.
 */
public class Guia3calse456ejercicioextra7 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese cantidad de numeros:");
        int cantidad=leer.nextInt();
        int cont=0,num,suma=0,mayor=0,menor= 2147483647;
        double promedio;
        while (cont<cantidad){
            System.out.println("ingrese un numero");
            num=leer.nextInt();
            suma=(suma+num);
            cont=(cont+1);
            if (num>mayor){
                mayor=num;
            }
             if(num<menor) 
               {
                menor=num;
                }
                 
        }
        promedio=(suma/cantidad);
        System.out.println("el promedio de todos los numero es: "+promedio);
        System.out.println("el numero mayor ingresado es:"+mayor);
        System.out.println("el numero menor ingresado es; "+menor);
        
    }
}
