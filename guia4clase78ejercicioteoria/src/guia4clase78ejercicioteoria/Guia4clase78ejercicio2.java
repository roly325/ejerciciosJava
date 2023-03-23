
package guia4clase78ejercicioteoria;
import java.util.Scanner;

/**
 * Diseñe una función que pida el nombre y la edad de N personas e imprima 
 * los datos de las personas ingresadas por teclado e indique si son mayores 
 * o menores de edad. Después de cada persona, el programa debe preguntarle al
 * usuario si quiere seguir mostrando personas y frenar cuando el usuario 
 * ingrese la palabra “No”.
 */
public class Guia4clase78ejercicio2 {
   public static void main(String[] args) {
   nombreedad();
       
   }
   
   public static void nombreedad(){
       Scanner leer= new Scanner(System.in);
       System.out.println("ingrese cantidad de personas");
       int cantidad=leer.nextInt();

       String nombre[][]= new String[cantidad][2];
       for (int i=0;i<cantidad;i++){
           for (int j=0;j<2;j++){
               if(j==0){
               System.out.println("ingrese nombre n°"+(i+1));
               nombre[i][j]=leer.next();
               }
            else
               {
               System.out.println("ingrese edad");
               int edad=leer.nextInt();
               nombre[i][j]=Integer.toString (edad);
              }
           }  
       }
       //mostrar
        for (int i=0;i<cantidad;i++){
           for (int j=0;j<2;j++){
               if(j==0){
               System.out.print(nombre[i][j]); 
               }  
               else{
                int edad =Integer.parseInt(nombre[i][j]);
                  if(edad>18){
                      System.out.println(" es mayor de edad " + "tiene "+edad+" años" );
                      }
                  else{
                      System.out.println(" es menor de edad " + "tiene "+edad+" años");
                  }
               }
            }  
           if(i<(cantidad-1)){
            System.out.println("");
            System.out.println("desea seguir viendo la lista?");
            System.out.println("presione cualquier tecla para continuar");
            System.out.println("NO para finalizar");
            String opcion=leer.next();
            if(opcion.equalsIgnoreCase("NO")){
                i=cantidad;
                System.out.println("Finalizado");
            }
            else {
            i=i;
            }}
            
        }
    }
}   

   
   

