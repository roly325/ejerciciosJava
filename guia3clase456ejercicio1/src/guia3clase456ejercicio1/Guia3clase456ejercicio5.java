
package guia3clase456ejercicio1;

import java.util.Scanner;

/** 
 * Escriba un programa en el cual se ingrese un valor límite positivo, y a
 * continuación solicite números al usuario hasta que la suma de los números
 * introducidos supere el límite inicial.
 */
public class Guia3clase456ejercicio5 {
public static void main(String[] args) {
Scanner leer= new Scanner(System.in);
int limite,suma=0,num;
    System.out.println("ingrese limite");
    limite=leer.nextInt();
    while(suma<limite)
    {System.out.println("ingrese numero");
    num=leer.nextInt();
    suma=(suma+num);
    }
    System.out.println("El limite "+limite+" fue superado "+suma);
}  
}
