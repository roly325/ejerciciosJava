
package guia5clase9y11ejercicio1;

import java.util.Random;
import java.util.Scanner;

/**
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 
 * dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
public class Guia5clase9y11ejercicio3 {
    public static void main(String[] args) 
    {   Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño de vector");
        int tamaño=leer.nextInt();
        int vector[]=new int[tamaño];
        cargar(vector,tamaño);
        System.out.println("--------------------------------------------");
        mostrar(vector,tamaño);
        verificar(vector,tamaño);
    }
    
    
    
    //verificar de cuantos digitos son los numeros
    public static void verificar(int vector[],int tamaño)
    {   int uno=0,dos=0,tres=0,cuatro=0,cinco=0;
        for(int i=0;i<tamaño;i++)
        {int cont=1;
         int num=vector[i];   
         while(num/10>0)
         {cont++;
         num/=10;
         } 
         switch(cont) 
         { case 1: uno++; break;
         case 2: dos++; break;
         case 3: tres++;break;
         case 4: cuatro++;break;
         case 5: cinco++; break;
         }
        }
        System.out.println("el vector tiene "+uno+" numeros de un digito");
        System.out.println("el vector tiene "+dos+" numeros de dos digito");
        System.out.println("el vector tiene "+tres+" numeros de tres digito");
        System.out.println("el vector tiene "+cuatro+" numeros de cuatro digito");
        System.out.println("el vector tiene "+cinco+" numeros de cinco digito");
    }
    //mostrar vector
    public static void mostrar(int vector[],int tamaño)
    {   
        for (int i=0;i< tamaño;i++)
        {
            System.out.print(vector[i]+"||");   
        } 
    }
    //cargar vector
    public static void cargar(int vector[],int tamaño)     
    {  
        Random aleatorio= new Random();
        for(int i=0;i<tamaño;i++)
        { vector[i]=aleatorio.nextInt(11000);
        }
    }  
}


