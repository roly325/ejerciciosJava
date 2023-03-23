
package guia4clase78ejercicioteoria;

import java.util.Scanner;

/**
Escribir un programa que procese una secuencia de caracteres ingresada por
* teclado y terminada en punto, y luego codifique la palabra o frase ingresada
* de la siguiente manera: cada vocal se reemplaza por el carácter que se indica 
* en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas)
* se mantienen sin cambios.
 */
public class Guia4clase78ejercicioteoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase");
        String frase= leer.nextLine();
        frase=frase.toUpperCase();
        String retorno=cambio(frase);
        System.out.println("-------------");
        System.out.println(frase);
        System.out.println("-------------");
        System.out.println(retorno);
    }
    public static String cambio(String frase)
           
    {String nuevaFrase = "";
    for (int i=0;i < frase.length();i++){
        if(frase.charAt(i)=='A'){
        nuevaFrase +="@";
        }else if(frase.charAt(i)=='E'){
        nuevaFrase +="#";
        }
         else if(frase.charAt(i)=='I'){
        nuevaFrase +="$";
        }
         else if(frase.charAt(i)=='O'){
        nuevaFrase +="%";
        }
         else if(frase.charAt(i)=='U'){
        nuevaFrase +="*";
        }
         else{
         nuevaFrase += frase.charAt(i);
         }
      
    }
        return nuevaFrase;
            
    
    }
    
    
    
    
    
     
 }  
  




