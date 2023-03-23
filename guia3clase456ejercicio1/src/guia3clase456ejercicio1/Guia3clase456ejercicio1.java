
package guia3clase456ejercicio1;

import java.util.Scanner;

/**
 * Crear un programa que dado un número determine si es par o impar.
 */
public class Guia3clase456ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("ingrese un numero");
        num=leer.nextInt();
        if(num%2==0)
        {System.out.println("el numero es par");
        }
        else{
            System.out.println("el numero es impar");
        }
    }
    
}
