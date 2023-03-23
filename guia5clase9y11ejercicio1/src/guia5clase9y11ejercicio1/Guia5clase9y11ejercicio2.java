
package guia5clase9y11ejercicio1;

import java.util.Random;
import java.util.Scanner;

/**
 * Realizar un algoritmo que llene un vector de tamaño N con valores
 * aleatorios y le pida al usuario un número a buscar en el vector.
 * El programa mostrará dónde se encuentra el numero y si se encuentra repetido
 */
public class Guia5clase9y11ejercicio2 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        System.out.println("ingrese tamaño de vector");
         int n=leer.nextInt();
         int vector[]=new int[n];
        cargar(vector,n);
        System.out.println("ingrese numero a buscar");
        int buscar=leer.nextInt();
        mostrar(vector,n);
       buscarnum(buscar,n,vector); 
        
    }
    
    
    
    //mostrar el vector
    public static void mostrar(int vector[],int n){
    for(int i=0;i<n;i++){
        System.out.print(vector[i]+"||");
    }
    }
    
    //buscar numero pedido por el usuario
    public static void buscarnum(int buscar,int n,int vector[]){
      boolean encontrado=false;
       int cont=0;
     for (int i=0;i<n;i++){
     if(vector[i]==buscar){
         System.out.println("el numero"+buscar+" esta en la posicion "+i);
          encontrado=true;
          cont++;
           }   
        }
        System.out.println("");
        if(cont==0){ 
         System.out.println("el numero"+buscar+ "no se encuentra en el vector"); 
         }  
       
    }
    
    //cargar vrctor con numeros aleatorios del 0 a 99
    public static void cargar(int vector[],int n){
    Random random = new Random();
    for(int i=0;i<n;i++){
    vector[i]= random.nextInt(100);
    }
    }
}
