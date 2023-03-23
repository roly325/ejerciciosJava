
package guia3clase456ejercicio1;

import java.util.Scanner;

/**
 * Realizar un programa que pida dos números enteros positivos por teclado y 
 * muestre por pantalla el siguiente menú
 */
public class Guia3clase456ejercicio6 {
public static void main(String[] args) {
Scanner leer= new Scanner(System.in);
int num1,num2,opcion=0;
    System.out.println("ingrese dos numeros positivos");
    num1=leer.nextInt();
    num2=leer.nextInt();
    while(opcion!=5){
        System.out.println("---------MENU---------");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Multiplicar");
        System.out.println("4.Dividir");
        System.out.println("5.Salir");
        System.out.println("Elija opcion");
        opcion=leer.nextInt();
        while(opcion<1||opcion>5){
            System.out.println("opcion incorrecta");
            System.out.println("ingrese opcion");
            opcion=leer.nextInt();
        }
        switch (opcion){
            case 1:System.out.println("la suma de: "+num1+"+"+num2+"="+(num1+num2));
            break;
            case 2:System.out.println("la resta de: "+num1+"-"+num2+"="+(num1-num2));
            break;
            case 3:System.out.println("la multplicacion de: "+num1+"*"+num2+"="+(num1*num2));
            break;
            case 4:System.out.println("la division de: "+num1+"/"+num2+"="+(num1/num2));
            break;
            case 5:System.out.println("finalizado");
        }     
    }
   
}    
}

