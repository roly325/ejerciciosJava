package guia3clase456ejercicio1;

import java.util.Scanner;

/**
* Crear un programa que pida una frase y si esa frase es igual a “eureka” el
* programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. 
* Nota: investigar la función equals() en Java.
*/
public class Guia3clase456ejercicio2 {
public static void main(String[] args) {
Scanner leer= new Scanner(System.in);
String frase;
    System.out.println("ingrese frase");
    frase=leer.nextLine();
    if (frase.equalsIgnoreCase("eureka"))
    {System.out.println("Correcto");
    }
    else
    {System.out.println("Incorrecto");
    }


}        
}
