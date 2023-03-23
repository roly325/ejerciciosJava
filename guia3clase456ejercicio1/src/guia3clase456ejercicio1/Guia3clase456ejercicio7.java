
package guia3clase456ejercicio1;

import java.util.Scanner;

/**
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
* tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben 
* llegar con un formato fijo: tienen que ser de un máximo de 5 caracteres de 
* largo, el primer carácter tiene que ser X y el último tiene que ser una O.
 */
public class Guia3clase456ejercicio7 {
public static void main(String[] args) {
Scanner leer= new Scanner(System.in);
String cadena;
int correcto=0,incorrecto=0;
    System.out.println("ingrese cadena. o para finalizar(&&&&&)");
    cadena=leer.nextLine();
    while (!cadena.equals("&&&&&")){
     if (cadena.substring(0, 1).equalsIgnoreCase("X") && cadena.substring(4,5).equalsIgnoreCase("O")  ){
     correcto=correcto+1;
    }
     else {
         incorrecto=incorrecto+1;
     } 
        System.out.println("ingrese cadena. o para finalizar(&&&&&)");
        cadena=leer.nextLine();
     }
    System.out.println("ingresos correctos"+correcto);
    System.out.println("ingresos incorrectos"+incorrecto);
}

}
