
package guia3calse456ejercicioextra1;

import java.util.Scanner;

/**
* Simular la división usando solamente restas. Dados dos números enteros mayores 
* que uno, realizar un algoritmo que calcule el cociente y el residuo usando 
* sólo restas. Método: Restar el dividendo del divisor hasta obtener un 
* resultado menor que el divisor, este resultado es el residuo, y el número de 
* restas realizadas es el cociente.
 */
public class Guia3calse456ejercicioextra9 {
    public static void main(String[] args) {
        Scanner leer =  new Scanner(System.in);
        System.out.println("     ingrese dos numeros enteros    ");
        System.out.println("los numeros tienen que ser mayor a 1");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        while (num1<=1){
            System.out.println("el primer numero debe ser mayor a 1");
            System.out.println("     ingrese otro numero    ");
            num1=leer.nextInt();
        }
        while(num2<=1){
        System.out.println("el segundo numero debe ser mayor a 1");
            System.out.println("     ingrese otro numero    ");
            num2=leer.nextInt();
        }
        int contador=0;
        while(num1>num2){
            System.out.println("dividendo: "+num1+ " divisor: "+num2 );
            System.out.println(num1+"-"+num2+"="+(num1-num2));
            num1=num1-num2;
            contador++;
        }
        System.out.println("el cociente es: "+contador);
        System.out.println("el residuo es: "+ num1);
    }
}
