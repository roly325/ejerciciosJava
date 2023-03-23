
package guia4clase78ejercicioteoria;

import java.util.Scanner;

/**
 * Crea una aplicación que le pida dos números al usuario y este pueda elegir
 * entre sumar, restar, multiplicar y dividir. La aplicación debe tener una
 * función para cada operación matemática y deben devolver sus resultados para 
 * imprimirlos en el main. 
 */
public class Guia4clase78ejercicio1 {
     public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("ingrese dos numeros");
         int num1=leer.nextInt();
         int num2=leer.nextInt();
         int opcion=8;
         while(opcion!=0){
         System.out.println("--selecciona una opcion--");
         System.out.println("1.Sumar");
         System.out.println("2.Restar");
         System.out.println("3.Dividir");
         System.out.println("4.Multiplicar");
         System.out.println("0.Para finalizar");
         opcion=leer.nextInt();
        switch(opcion){ 
            case 1:System.out.println(suma(num1,num2));
            break;
            case 2:System.out.println( resta(num1,num2));
            break;
            case 3:System.out.println(dividir(num1,num2));
            break;
            case 4:System.out.println( multiplicar(num1,num2));
            break;
            case 0:
                System.out.println("finalizado");
            break;    
        }
      
        }   
     }
  
     public static int suma(int n1,int n2){
         return n1+n2;
     }
     public static int resta(int n1,int n2){
         return n1-n2;
     }
     public static int multiplicar(int n1,int n2){
         return n1*n2;
     }
     public static int dividir(int n1,int n2){
         return n1/n2;
     }
}

